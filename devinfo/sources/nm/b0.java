package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b0 extends nk.l implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f30002b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f30003c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30004a;

    static {
        int i4 = 2;
        f30002b = new b0(i4, 0);
        f30003c = new b0(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i4, int i10) {
        super(i4);
        this.f30004a = i10;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30004a) {
            case 0:
                o1.c cVar = (o1.c) obj;
                o1.c cVar2 = (o1.c) obj2;
                nk.k.e(cVar, "draggingItem");
                nk.k.e(cVar2, "item");
                float f10 = cVar.f30367b;
                float f11 = cVar.f30369d;
                float fE = o1.b.e(cVar2.b());
                return Boolean.valueOf(fE >= f10 && fE < f11);
            default:
                o1.c cVar3 = (o1.c) obj;
                o1.c cVar4 = (o1.c) obj2;
                nk.k.e(cVar3, "draggingItem");
                nk.k.e(cVar4, "item");
                float f12 = cVar3.f30366a;
                float f13 = cVar3.f30368c;
                float fD = o1.b.d(cVar4.b());
                return Boolean.valueOf(fD >= f12 && fD < f13);
        }
    }
}
