import pandas as pd
import timeit


def average():
    df = pd.read_table("../../measurements.txt", header=None, sep=";")
    print(df.groupby(0).agg(["min", "mean", "max"]).sort_values(by=0))


if __name__ == '__main__':
    execution_time = timeit.timeit(average, number=1)
    print(f"Execution time: {execution_time} seconds")
