package ot;

/* loaded from: classes.dex */
public final class w extends n {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19846c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f19847d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i10) {
        StringBuilder sbU = h0.b.u("must have at least ", i10, " value parameter");
        sbU.append(i10 > 1 ? "s" : "");
        super(sbU.toString(), 1);
        this.f19847d = i10;
    }

    @Override // ot.e
    public final boolean a(cs.g gVar) {
        switch (this.f19846c) {
            case 0:
                if (gVar.Y().size() >= this.f19847d) {
                }
                break;
            default:
                if (gVar.Y().size() == this.f19847d) {
                }
                break;
        }
        return false;
    }

    public w() {
        super("must have exactly 2 value parameters", 1);
        this.f19847d = 2;
    }
}
