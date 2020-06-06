package tech.hugobp;

public class Routes {

    public static class Resources {

        public static final String PARAM_ID = "id";

        public static final String RELATIVE_BY_ID = "/{" + PARAM_ID + "}";

        public static class Cards {
            public static final String BASEPATH = "/cards";
        }

        public static class Dashboards {
            public static final String BASEPATH = "/dashboards";
        }

        public static class Rails {
            public static final String BASEPATH = "/rails";
        }
    }

}
