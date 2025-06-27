# How to write a commit message

Any commit needs a helpful message. Mind the following guidelines when committing to any of CoMaps repositories at Codeberg.

1. Separate subject from body with a blank line.
2. Limit the subject line to **72 characters**.
3. Prefix the subject line with a **subsystem name** in square brackets:

   - [android]
   - [ios]
   - [qt]
   - [styles]
   - [search]
   - [generator]
   - [strings]
   - [platform]
   - [transit]
   - [routing]
   - [bookmarks]
   - [3party]
   - [docs]
   - ...
   - See `git log --oneline|egrep -o '\[[0-9a-z]*\]'|sort|uniq -c|sort -nr|less` for ideas.

4. Start a sentence with a capital letter.
5. Do not put "cd-xx", "closes #xxx" in the subject line.
6. Use the imperative mood in the subject line.

   - A properly formed Git commit subject line should always be able to complete
     the following sentence: "If applied, this commit will _/your subject line here/_".

7. Wrap the body to **72 characters** or so.
8. Use the body to explain **what and why** vs. how.
9. Link Codeberg issues on the last lines:

    - [See tutorial](https://forgejo.org/docs/latest/user/linked-references/).

10. Use your real name and real email address.

    - See also [Developer's Certificate of Origin](DCO.md)

A template:

```
    [subsystem] Summarize in 72 characters or less

    More detailed explanatory text, if necessary.
    Wrap it to 72 characters or so.
    In some contexts, the first line is treated as the subject of the
    commit, and the rest of the text as the body.

    Explain the problem that this commit is solving. Focus on why you
    are making this change as opposed to how (the code explains that).
    Are there side effects or other unintuitive consequences of this
    change? Here's the place to explain them.

    Fixes: #123
    Closes: #456
    Needed for: #859
    See also: #343, #789
```

Based on [Tarantool Guidelines](https://www.tarantool.io/en/doc/latest/dev_guide/developer_guidelines/#how-to-write-a-commit-message).
