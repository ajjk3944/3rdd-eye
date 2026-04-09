package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum w1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.f1276g),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    w1(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
