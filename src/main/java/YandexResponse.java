import java.util.List;

public class YandexResponse {
    private List<Translation> translations;

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    public List<Translation> getTranslations() {
        return translations;
    }
}
