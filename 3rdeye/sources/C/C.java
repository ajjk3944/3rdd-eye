package C;

/* compiled from: DynamicRange.java */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    public static final C f615c = new C(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C f616d = new C(1, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final C f617e = new C(3, 10);

    /* renamed from: f, reason: collision with root package name */
    public static final C f618f = new C(4, 10);

    /* renamed from: g, reason: collision with root package name */
    public static final C f619g = new C(5, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C f620h = new C(6, 10);
    public static final C i = new C(6, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int f621a;

    /* renamed from: b, reason: collision with root package name */
    public final int f622b;

    public C(int i10, int i11) {
        this.f621a = i10;
        this.f622b = i11;
    }

    public final boolean a() {
        return b() && this.f621a != 1 && this.f622b == 10;
    }

    public final boolean b() {
        int i10 = this.f621a;
        return (i10 == 0 || i10 == 2 || this.f622b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            if (this.f621a == c10.f621a && this.f622b == c10.f622b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f621a ^ 1000003) * 1000003) ^ this.f622b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f621a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return B4.i.j(sb, this.f622b, "}");
    }
}
