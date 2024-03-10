# hasht

`hasht` is a reader tag for `tap>`, inspired by `weavejester/hashp`.

## Installation

### Leiningen/Boot
`[org.clojars.psyclyx/hasht "0.1.0"]`

### deps.edn
`{org.clojars.psyclyx/hasht {:mvn/version "0.1.0"}}`

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