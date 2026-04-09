package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public int f34829a;

    /* renamed from: b, reason: collision with root package name */
    public int f34830b;

    /* renamed from: c, reason: collision with root package name */
    public int f34831c;

    /* renamed from: d, reason: collision with root package name */
    public int f34832d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f34833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f34834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ck.c cVar) {
        super(2, cVar);
        this.f34834f = jVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        i iVar = new i(this.f34834f, cVar);
        iVar.f34833e = obj;
        return iVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        uk.h hVar;
        int i4;
        int i10;
        int i11;
        String strR;
        int i12;
        int i13;
        String str;
        j jVar = this.f34834f;
        x.a0 a0Var = jVar.f34836a;
        x.t tVar = jVar.f34838c;
        int i14 = this.f34832d;
        if (i14 == 0) {
            ci.b.D(obj);
            hVar = (uk.h) this.f34833e;
            i4 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.f34831c;
            i10 = this.f34830b;
            i11 = this.f34829a;
            hVar = (uk.h) this.f34833e;
            ci.b.D(obj);
        }
        if (i11 >= Math.min(jVar.f34839d + 10, tVar.f36945b)) {
            return yj.u.f37649a;
        }
        int i15 = i11 + 1;
        int iB = tVar.b(i11);
        switch (iB) {
            case 0:
                strR = "up";
                break;
            case 1:
                Object objF = a0Var.f(i10);
                i10++;
                strR = "down " + objF;
                break;
            case 2:
                strR = "remove " + tVar.b(i15) + ' ' + tVar.b(i11 + 2);
                i15 = i11 + 3;
                break;
            case 3:
                strR = "move " + tVar.b(i15) + ' ' + tVar.b(i11 + 2) + ' ' + tVar.b(i11 + 3);
                i15 = i11 + 4;
                break;
            case 4:
                strR = "clear";
                break;
            case 5:
                i12 = i11 + 2;
                int iB2 = tVar.b(i15);
                i13 = i10 + 1;
                str = "insertBottomUp " + iB2 + ' ' + a0Var.f(i10);
                int i16 = i12;
                strR = str;
                i15 = i16;
                i10 = i13;
                break;
            case 6:
                i12 = i11 + 2;
                int iB3 = tVar.b(i15);
                i13 = i10 + 1;
                str = "insertTopDown " + iB3 + ' ' + a0Var.f(i10);
                int i162 = i12;
                strR = str;
                i15 = i162;
                i10 = i13;
                break;
            case 7:
                Object objF2 = a0Var.f(i10);
                nk.k.c(objF2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                nk.x.d(2, objF2);
                i10 += 2;
                strR = "apply " + ((mk.e) objF2);
                break;
            case 8:
                strR = "reuse " + jVar.f34837b.f(i4);
                i4++;
                break;
            case 9:
                strR = "recompose pending";
                break;
            default:
                strR = je.u.r(iB, "unknown op: ");
                break;
        }
        this.f34833e = hVar;
        this.f34829a = i15;
        this.f34830b = i10;
        this.f34831c = i4;
        this.f34832d = 1;
        hVar.a(this, i11 + ": " + strR);
        return dk.a.f22275a;
    }
}
