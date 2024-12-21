package NotePackage;

public class PoliteTimedMemo extends TimedMemo

{
    String DEFAULT_GREETING = "Dear";
    String DEFAULT_CLOSING = "Yours truly ";

    //DEFAULT CONSTRUCTOR
     PoliteTimedMemo(){
        super();
    }

    //OVERLOADED CONSTRUCTOR

     PoliteTimedMemo (String name, String body, String from, String to )
    {
        super(name, body, from, to);

    }

    public String toString(){
       return (DEFAULT_GREETING) +
               "\nName : " + this.name +
               "\nThis note is from : " + this.from +
               "\nThis note is for : " + this.to +
                "\n Body of the note is: " + this.body +
                "\nTimeStamp : " + this.today +
                "\n" + (DEFAULT_CLOSING) +
                "\n" + (FOOTER);
    }

    public static class Builder {
        private String name;
        private String body;
        private String from;
        private String to;

        public Builder() {
            // Default constructor, no additional code needed
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public PoliteTimedMemo build() {
            return new PoliteTimedMemo(this);
        }
    }

        private PoliteTimedMemo(Builder builder) {
            super(builder.name, builder.body, builder.from, builder.to);
        }

    }


