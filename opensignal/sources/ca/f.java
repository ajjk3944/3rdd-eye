package ca;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3464a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f3465b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3466c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3467d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3468e;

    public f(c cVar, e eVar, long j, long j7, long j10, long j11, long j12, int i10) {
        this.f3467d = eVar;
        this.f3465b = i10;
        this.f3466c = new a(cVar, j, j7, j10, j11, j12);
    }

    public static int c(l lVar, long j, n nVar) {
        if (j == lVar.getPosition()) {
            return 0;
        }
        nVar.f3485a = j;
        return 1;
    }

    public static int d(u5.l lVar, long j, n nVar) {
        if (j == lVar.getPosition()) {
            return 0;
        }
        nVar.f3485a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return c(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(ca.l r28, ca.n r29) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.a(ca.l, ca.n):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d2, code lost:
    
        return d(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(u5.l r28, ca.n r29) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.b(u5.l, ca.n):int");
    }

    public final void e(long j) {
        switch (this.f3464a) {
            case 0:
                b bVar = (b) this.f3468e;
                if (bVar == null || bVar.f3452a != j) {
                    a aVar = (a) this.f3466c;
                    this.f3468e = new b(j, aVar.f3446a.b(j), aVar.f3448c, aVar.f3449d, aVar.f3450e, aVar.f3451f, 0);
                    break;
                }
                break;
            default:
                b bVar2 = (b) this.f3468e;
                if (bVar2 == null || bVar2.f3452a != j) {
                    u5.c cVar = (u5.c) this.f3466c;
                    this.f3468e = new b(j, cVar.f23269a.b(j), cVar.f23271c, cVar.f23272d, cVar.f23273e, cVar.f23274f, 1);
                    break;
                }
                break;
        }
    }

    public f(u5.d dVar, u5.f fVar, long j, long j7, long j10, long j11, long j12, int i10) {
        this.f3467d = fVar;
        this.f3465b = i10;
        this.f3466c = new u5.c(dVar, j, j7, j10, j11, j12);
    }
}
