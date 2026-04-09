package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements ck.g, j2 {

    /* renamed from: b, reason: collision with root package name */
    public static final pf.u f34767b = new pf.u(17);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e f34768c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f34769d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f34770e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f34771f = new e(4);
    public static final e g = new e(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34772a;

    public /* synthetic */ e(int i4) {
        this.f34772a = i4;
    }

    @Override // u0.j2
    public boolean a(Object obj, Object obj2) {
        switch (this.f34772a) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return nk.k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f34772a) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
