package statistics.matcher;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        this.matcher = null;
    }

    public Matcher build() {
        return this.matcher;
    }

    public QueryBuilder and(Matcher... matchers) {
        update(new And(matchers));
        return this;
    }

    public QueryBuilder not(Matcher... matchers) {
        update(new Not(matchers));
        return this;
    }

    public QueryBuilder or(Matcher... matchers) {
        update(new Or(matchers));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        update(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        update(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder playsIn(String team) {
        update(new PlaysIn(team));
        return this;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }

    public void update(Matcher new_matcher) {
        if (matcher == null) {
            this.matcher = new_matcher;
        } else {
            this.matcher = new And(matcher, new_matcher);
        }

    }
}
