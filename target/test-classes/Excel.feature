Feature:
@ex
  Scenario Outline:
    Given I readthe Excel file "<filename>" from "<directory>"

    Examples:
      | filename  | directory |
      | dvla.xlsx | testdata  |