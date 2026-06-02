# KRD: SPSE-5764 — Reverse a string utility

## Ticket
- ID: SPSE-5764
- Title: Reverse a string utility
- Status: Open
- Priority: Major
- Description: Write a small reusable function that takes a string and returns it reversed. e.g., reverse("hello") → "olleh". Standalone helper, no external dependencies. Pick reasonable defaults.

## Goal
Implement a clean, standalone `reverse(s)` function that returns the reverse of input string `s`.
Should handle edge cases (empty string, single character, whitespace, etc.) reasonably.

## Decisions made
- 2026-10-08 — Language: Java (decided by @user)
- 2026-10-08 — Unicode handling: code-point aware (surrogate pairs preserved)
- 2026-10-08 — Null handling: throw `IllegalArgumentException` with message "input must not be null"
- 2026-10-08 — isPalindrome and reverseWords added
- 2026-10-08 — reverseWords reverses word order (splits on `\s+`, trims, joins with single space)

## Open doubts
_(none)_

## Current proposal
- See `StringReverser.java` (java)
- See `StringReverserTest.java` (java)

## History
- 2026-06-02T08:08:30Z — Session started by <@U0B42FAHQ6L>. Repo(s): https://github.com/kajal-meesho/Kevin_V2_Check
- 2026-06-02T08:08:31Z — <@U0B42FAHQ6L>: /kevin SPSE-5764
- 2026-10-08 — Session 1 started; AI asked for language preference.
- 2026-06-02T08:08:37Z — Kevin: ## DOUBT: Which programming language should I use for the reverse string utility?
- 2026-06-02T08:08:44Z — <@U0B42FAHQ6L>: Java
- 2026-10-08 — User chose Java.
- 2026-10-08 — Kevin asked for Unicode and null-handling decisions.
- 2026-06-02T08:09:02Z — Kevin: ## DOUBT: Should the Java implemention be code-point aware or simple char reversal, and how should null input be handled?
- 2026-06-02T08:10:37Z — <@U0B42FAHQ6L>: Code-point aware (handle emoji/Unicode correctly). On null input, throw IllegalArgumentException with message "input must not be null". Finalise and emit READY.
- 2026-06-02T08:09:??Z — User: code-point aware; throw IllegalArgumentException on null with message "input must not be null". Finalise and emit READY.
- 2026-10-08 — Implemented code-point‑aware reversal and added demo main; null throws `IllegalArgumentException`.
- 2026-06-02T08:10:52Z — Kevin: ## READY: Java `StringReverser.reverse()` with Unicode codepoint awareness and `IllegalArgumentException` on null input.
- 2026-06-02T08:10:58Z — PR opened: https://github.com/kajal-meesho/Kevin_V2_Check/pull/2
- 2026-06-02T09:33:43Z — <@U0B42FAHQ6L>: /kevin SPSE-5764
- 2026-06-02T08:09:02Z — Kevin: ## DOUBT: Should the Java implementation be code-point aware or simple char reversal, and how should null input be handled?
- 2026-10-08 — Session 2 started; Kevin asked for next steps (extend, refactor, or stop).
- 2026-06-02T09:34:07Z — Kevin: ## DOUBT: What would you like to do next with the StringReverser utility?
- 2026-06-02T09:34:29Z — <@U0B42FAHQ6L>: Extend (add features like isPalindrome
- 2026-06-02T09:34:15Z — <@U0B42FAHQ6L>: Extend (add features like isPalindrome
- 2026-06-02T09:34:20Z — Kevin: ## DOUBT: Should I add only isPalindrome, or both isPalindrome and reverseWords?
- 2026-06-02T09:34:51Z — Kevin: ## DOUBT: Should I add only isPalindrome, or both isPalindrome and reverseWords?
- 2026-06-02T09:35:07Z — <@U0B42FAHQ6L>: Both isPalindrome and reverseWords
- 2026-10-08 — User chose both isPalindrome and reverseWords; implemented and shipped with tests.
- 2026-06-02T09:35:57Z — Kevin: ## READY: Java `StringReverser` extended with `isPalindrome()` and `reverseWords()`, plus JUnit 5 tests.
