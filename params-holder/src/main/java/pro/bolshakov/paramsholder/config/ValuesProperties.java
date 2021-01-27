package pro.bolshakov.paramsholder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "values")
public class ValuesProperties {

    private Source source;
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "ValuesProperties{" +
                "source=" + source +
                ", test='" + test + '\'' +
                '}';
    }

    public static class Source{

        private String profileFile;
        private String dbProfileFile;
        private String applicationFile;
        private String multiPropertyEnvValue;

        public String getProfileFile() {
            return profileFile;
        }

        public void setProfileFile(String profileFile) {
            this.profileFile = profileFile;
        }

        public String getDbProfileFile() {
            return dbProfileFile;
        }

        public void setDbProfileFile(String dbProfileFile) {
            this.dbProfileFile = dbProfileFile;
        }

        public String getApplicationFile() {
            return applicationFile;
        }

        public void setApplicationFile(String applicationFile) {
            this.applicationFile = applicationFile;
        }

        public String getMultiPropertyEnvValue() {
            return multiPropertyEnvValue;
        }

        public void setMultiPropertyEnvValue(String multiPropertyEnvValue) {
            this.multiPropertyEnvValue = multiPropertyEnvValue;
        }

        @Override
        public String toString() {
            return "Source{" +
                    "profileFile='" + profileFile + '\'' +
                    ", dbProfileFile='" + dbProfileFile + '\'' +
                    ", applicationFile='" + applicationFile + '\'' +
                    ", multiPropertyEnvValue='" + multiPropertyEnvValue + '\'' +
                    '}';
        }
    }

}
