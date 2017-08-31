# Cban

Clojure by anyother name.

>What's in a name? that which we call a rose<br>
By any other name would smell as sweet;<br>
_Romeo and Juliet (William Shakespeare)_

A library to enable people to write code in their native written langauge.
Cban generates cljc files with def and defmacro forms that provide
aliases for `clojure.core` special forms, macros and functions.

See also [lein-cban](https://github.com/timothypratley/lein-cban)
which is the plugin used to generate the translations.
You can use that plugin to create your own translations of any namespace.


## Usage

Update the csv files in `resources/translations`

`lein cban` to generate the clojure code which appears in `out`


## License

Copyright © 2017 Timothy Pratley

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
