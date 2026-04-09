package ot;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final m f19814d = new m("must be a member function", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final m f19815e = new m("must be a member or an extension function", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(str, 0);
        this.f19816c = i10;
    }

    @Override // ot.e
    public final boolean a(cs.g gVar) {
        switch (this.f19816c) {
            case 0:
                return gVar.G != null;
            default:
                return (gVar.G == null && gVar.F == null) ? false : true;
        }
    }
}
