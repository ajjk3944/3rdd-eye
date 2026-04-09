package I;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC2948o {

    /* renamed from: a, reason: collision with root package name */
    public static final Y0 f8108a = new Y0();

    private Y0() {
    }

    @Override // I.InterfaceC2948o
    public int a(int i10, int i11) {
        if (i11 == 10) {
            return 32;
        }
        if (i11 == 13) {
            return 65279;
        }
        return i11;
    }

    public String toString() {
        return "SingleLineCodepointTransformation";
    }
}
