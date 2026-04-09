package sr;

/* loaded from: classes.dex */
public enum d {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(0 == true ? 1 : 0, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final String renderName;

    d(String str) {
        this.renderName = str == null ? xu.l.b0(name()) : str;
    }

    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ d(String str, int i10, br.g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
