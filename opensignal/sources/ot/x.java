package ot;

/* loaded from: classes.dex */
public final class x extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final x f19848d = new x("must have no value parameters", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final x f19849e = new x("must have a single value parameter", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(String str, int i10) {
        super(str, 1);
        this.f19850c = i10;
    }

    @Override // ot.e
    public final boolean a(cs.g gVar) {
        switch (this.f19850c) {
            case 0:
                return gVar.Y().isEmpty();
            default:
                return gVar.Y().size() == 1;
        }
    }
}
