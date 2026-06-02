# KRD: SPSE-5769 — Convert integer to Roman numeral

## Ticket
- ID: SPSE-5769
- Title: Convert integer to Roman numeral
- Status: Open
- Priority: Major
- Description: Implement a function that takes an integer between 1 and 3999 (inclusive) and returns its Roman numeral string. For example: 4 → "IV", 1994 → "MCMXCIV". Include unit tests covering: 1, 4, 9, 40, 90, 400, 900, a typical year (1994), and the upper bound 3999. Inputs outside [1, 3999] should throw an exception.

## Goal
Write a function `intToRoman(n)` (or equivalent) that converts an integer 1-3999 to its Roman numeral representation, with input validation (raise an exception for out-of-range inputs), and include a set of unit tests covering the specified edge cases.

## Decisions made
- 2026-06-02 — Language: Java (decided by user)
- 2026-06-02 — Implementation uses greedy conversion with value-symbol arrays; throws `IllegalArgumentException` on out-of-range input.
- 2026-06-02 — Unit tests use JUnit 5 and cover all requested cases plus boundary exceptions.
- 2026-06-02 — Time and space complexity documented in implementation comment (O(1) for both).

## Open doubts
_(none)_

## Current proposal
- See `IntToRoman.java` (java)
- See `IntToRomanTest.java` (java)

## State
- state: PR_OPEN
- prNumber: 3
- prUrl: https://github.com/kajal-meesho/Kevin_V2_Check/pull/3
- branch: feature/spse-5769-ai-summary
- targetRepo: https://github.com/kajal-meesho/Kevin_V2_Check
- channelId: C0B5ZQF12Q2
- threadTs: 1780404011.540329
- lastCommentSeen: 2026-06-02T12:45:12Z

## History
- 2026-06-02T12:39:13Z — Session started by <@U0B42FAHQ6L>. Repo(s): https://github.com/kajal-meesho/Kevin_V2_Check
- 2026-06-02T12:39:13Z — <@U0B42FAHQ6L>: /kevin SPSE-5769
- 2026-06-01 — Session 1 started; AI asked for language.
- 2026-06-02T12:39:20Z — Kevin: ## DOUBT: Which programming language should I use?
- 2026-06-02T12:39:24Z — <@U0B42FAHQ6L>: /kevin SPSE-5769
- 2026-06-02T12:40:00Z — Session continued; Kevin re-asked: "Which programming language should I use?"
- 2026-06-02T12:39:38Z — Kevin: ## DOUBT: Which programming language should I use?
- 2026-06-02T12:40:14Z — <@U0B42FAHQ6L>: /kevin SPSE-5769
- 2026-06-02T12:42:00Z — Kevin: ## DOUBT: Which programming language should I use? (re-asked after session continuation)
- 2026-06-02T12:40:22Z — Kevin: ## DOUBT: Which programming language should I use?
- 2026-06-02T12:40:48Z — <@U0B42FAHQ6L>: Java
- 2026-06-02 — Language chosen: Java (by user).
- 2026-06-02 — Implementation complete; code shipped.
- 2026-06-02T12:41:10Z — Kevin: ## READY: Java `intToRoman` implementation with input validation and complete unit tests covering all edge cases.
- 2026-06-02T12:41:10Z — AI emitted READY; transitioning to plan review.
- 2026-06-02T12:41:52Z — <@U0B42FAHQ6L> approved the plan; moving to implementation review.
- 2026-06-02T12:42:14Z — <@U0B42FAHQ6L> approved implementation; opening PR.
- 2026-06-02T12:42:22Z — PR opened at https://github.com/kajal-meesho/Kevin_V2_Check/pull/3
- 2026-06-02 — Added test cases for 58, 944, 2024 per feedback.
- 2026-06-02T12:46:22Z — Addressed feedback (GitHub): The current approach works, but can we add tests for a few additional representative values such as 58 ("LVIII"), 944 ("CMXLIV"), and 2024 ("MMXXIV") to improve confidence in the conversion logic beyo…
- 2026-06-02T12:46:22Z — Addressed feedback (GitHub): The current approach works, but can we add tests for a few additional representative values such as 58 ("LVIII"), 944 ("CMXLIV"), and 2024 ("MMXXIV") to improve confidence in the conversion logic beyond the original set.
- 2026-06-02 — Added time/space complexity comments to IntToRoman.java per feedback.
- 2026-06-02T12:47:01Z — Addressed feedback (Slack): Could we document the time and space complexity of the chosen greedy approach in the implementation comments? This would make the design rationale clearer for future maintainers.
- 2026-06-02T12:47:xxZ — Updated IntToRomanTest.java with test cases for 58, 944, 2024 as requested in GitHub feedback; re-emitted READY with updated code files.
- 2026-06-02T12:49:13Z — Addressed feedback (GitHub): The current approach works, but can we add tests for a few additional representative values such as 58 ("LVIII"), 944 ("CMXLIV"), and 2024 ("MMXXIV") to improve confidence in the conversion logic beyo…
