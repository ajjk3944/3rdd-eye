package S9;

/* compiled from: WriteMode.kt */
/* loaded from: classes3.dex */
public enum T {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public final char begin;
    public final char end;

    T(char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }
}
