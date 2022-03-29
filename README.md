# This repository shows issues with the camunda sub process instance management

The following table demonstrates for the given example, how many instances can be created with how many process
variables via in and out mapping.

Values that are ~~marked~~ via strike through produce the issue.

| FIELD1 | Vars | 0     | 1         | 5         | 10        | 25         | 50         | 100        | 200         | 500         | 1000        |
|--------|------|-------|-----------|-----------|-----------|------------|------------|------------|-------------|-------------|-------------|
| Inst   |      |       |           |           |           |            |            |            |             |             |             |
| 10     |      | 0     | 10        | 50        | 100       | 250        | 500        | 1000       | 2000        | 5000        | 10000       |
| 50     |      | 0     | 50        | 250       | 500       | 1250       | 2500       | 5000       | 10000       | 25000       | 50000       |
| 100    |      | 0     | 100       | 500       | 1000      | 2500       | 5000       | 10000      | 20000       | 50000       | ~~100000~~  |
| 250    |      | 0     | 250       | 1250      | 2500      | 6250       | 12500      | 25000      | 50000       | ~~125000~~  | ~~250000~~  |
| 500    |      | 0     | 500       | 2500      | 5000      | 12500      | 25000      | 50000      | ~~100000~~  | ~~250000~~  | ~~500000~~  |
| 1000   |      | 0     | 1000      | 5000      | 10000     | 25000      | 50000      | ~~100000~~ | ~~200000~~  | ~~500000~~  | ~~1000000~~ |
| 2500   |      | 0     | 2500      | 12500     | 25000     | ~~62500~~  | ~~125000~~ | ~~250000~~ | ~~500000~~  | ~~1250000~~ | ~~2500000~~ |
| 5000   |      | 0     | 5000      | ~~25000~~ | ~~50000~~ | ~~125000~~ | ~~250000~~ | ~~500000~~ | ~~1000000~~ | ~~2500000~~ | ~~5000000~~ |
| 10000  |      | ~~0~~ | ~~10000~~ | ~~25000~~ | ~~50000~~ | ~~125000~~ | ~~250000~~ | ~~500000~~ | ~~1000000~~ | ~~2500000~~ | ~~5000000~~ |