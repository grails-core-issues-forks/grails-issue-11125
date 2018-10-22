package issue11125

import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class FooIntegrationSpec extends Specification {

    void 'test foo'() {
        given:
            def foo = new Foo(name: 'bar')

        when:
            foo.save()

        then:
            !foo.hasErrors()
            foo.id != null
    }
}
