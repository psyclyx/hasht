# hasht

`hasht` is a reader tag for `tap>`, inspired by `weavejester/hashp`.

## Usage

To use it, simply require `hasht.core`, and add `#t` in front of any form
you want to `tap>`.

```
(require 'hasht.core)
(add-tap (partial prn :tapped))

{:numbers #t [1 2 3]} ;; prints :tapped [1 2 3]
```

## License

Copyright © 2024 Alice Burns

Released under the MIT license.