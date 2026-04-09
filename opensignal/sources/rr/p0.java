package rr;

/* loaded from: classes.dex */
public final class p0 implements bt.d, o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f21710d = new p0(0);

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f21711g = new p0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21712a;

    public /* synthetic */ p0(int i10) {
        this.f21712a = i10;
    }

    @Override // bt.d
    public ht.x getType() {
        switch (this.f21712a) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f21712a) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
