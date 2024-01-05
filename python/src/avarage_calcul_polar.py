import polars as pl
import timeit


def average():
    df = pl.read_csv("../../measurements.txt", has_header=False, separator=";")
    print(df.group_by("column_1").agg(
        min=pl.min("column_2"),
        mean=pl.mean("column_2"),
        max=pl.max("column_2")).sort(by="column_1"))


if __name__ == "__main__":
    exec_time = timeit.timeit(average, number=1)
    print(exec_time)
