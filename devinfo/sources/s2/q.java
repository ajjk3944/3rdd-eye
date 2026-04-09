package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final long f33419a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33420b = 0;

    static {
        d3.o[] oVarArr = d3.n.f21970b;
        f33419a = d3.n.f21971c;
    }

    public static final p a(p pVar, int i4, int i10, long j, c3.q qVar, r rVar, c3.i iVar, int i11, int i12, c3.s sVar) {
        long j8;
        int i13 = i4;
        int i14 = i10;
        long j9 = j;
        c3.q qVar2 = qVar;
        r rVar2 = rVar;
        c3.i iVar2 = iVar;
        int i15 = i11;
        int i16 = i12;
        c3.s sVar2 = sVar;
        if (i13 == 0 || i13 == pVar.f33411a) {
            d3.o[] oVarArr = d3.n.f21970b;
            if ((j9 & 1095216660480L) == 0) {
                j8 = 0;
            } else {
                j8 = 0;
                if (d3.n.a(j9, pVar.f33413c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(pVar.f33414d)) && ((i14 == 0 || i14 == pVar.f33412b) && ((rVar2 == null || rVar2.equals(pVar.f33415e)) && ((iVar2 == null || iVar2.equals(pVar.f33416f)) && ((i15 == 0 || i15 == pVar.g) && ((i16 == 0 || i16 == pVar.f33417h) && (sVar2 == null || sVar2.equals(pVar.f33418i)))))))) {
                return pVar;
            }
        } else {
            j8 = 0;
        }
        d3.o[] oVarArr2 = d3.n.f21970b;
        if ((j9 & 1095216660480L) == j8) {
            j9 = pVar.f33413c;
        }
        if (qVar2 == null) {
            qVar2 = pVar.f33414d;
        }
        if (i13 == 0) {
            i13 = pVar.f33411a;
        }
        if (i14 == 0) {
            i14 = pVar.f33412b;
        }
        r rVar3 = pVar.f33415e;
        if (rVar3 != null && rVar2 == null) {
            rVar2 = rVar3;
        }
        if (iVar2 == null) {
            iVar2 = pVar.f33416f;
        }
        if (i15 == 0) {
            i15 = pVar.g;
        }
        if (i16 == 0) {
            i16 = pVar.f33417h;
        }
        if (sVar2 == null) {
            sVar2 = pVar.f33418i;
        }
        return new p(i13, i14, j9, qVar2, rVar2, iVar2, i15, i16, sVar2);
    }
}
