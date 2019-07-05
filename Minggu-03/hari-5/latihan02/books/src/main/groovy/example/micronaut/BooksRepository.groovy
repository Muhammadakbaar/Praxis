package example.micronaut

interface BooksRepository {
    List<Book> findAll()
}

books/src/main/groovy/example/micronaut/Book.groovy

package example.micronaut

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

@CompileStatic
@TupleConstructor
class Book {
    String isbn
    String name
}