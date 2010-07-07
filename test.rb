
require 'java'

$CLASSPATH << "target/classes/"

java_import 'retoo.App'

a = App.new
puts a
puts a.test
