package pro.bolshakov.paramsholder.config;

public class ParamHolder {
    private String applicationFile;
    private String profileFile;
    private String multiPropertyEnvValue;

    public void setApplicationFile(String applicationFile) {
        this.applicationFile = applicationFile;
    }

    public void setProfileFile(String profileFile) {
        this.profileFile = profileFile;
    }

    public void setMultiPropertyEnvValue(String multiPropertyEnvValue) {
        this.multiPropertyEnvValue = multiPropertyEnvValue;
    }

    @Override
    public String toString() {
        return "ParamHolder{" +
                "applicationFile='" + applicationFile + '\'' +
                ", profileFile='" + profileFile + '\'' +
                ", multiPropertyEnvValue='" + multiPropertyEnvValue + '\'' +
                '}';
    }
}
