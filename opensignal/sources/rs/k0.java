package rs;

/* loaded from: classes.dex */
public enum k0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(e.f21745a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    k0(Object obj) {
        this.defaultDefault = obj;
    }
}
