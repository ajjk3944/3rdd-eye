package androidx.datastore.preferences.protobuf;

/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public enum s0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC1730h.f15603c),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    s0(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
