package b7;

import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f2056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2057c;

    public /* synthetic */ t(int i4, long j, String str) {
        this.f2055a = i4;
        this.f2056b = j;
        this.f2057c = str;
    }

    @Override // mk.c
    public final Object invoke(Object obj) throws Exception {
        d6.c cVarS;
        int i4 = this.f2055a;
        yj.u uVar = yj.u.f37649a;
        long j = this.f2056b;
        Object obj2 = this.f2057c;
        switch (i4) {
            case 0:
                String str = (String) obj2;
                d6.a aVar = (d6.a) obj;
                nk.k.e(aVar, "_connection");
                cVarS = aVar.S("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cVarS.a(1, j);
                    cVarS.q(2, str);
                    cVarS.P();
                    int iQ = m1.q(aVar);
                    cVarS.close();
                    return Integer.valueOf(iQ);
                } finally {
                }
            case 1:
                String str2 = (String) obj2;
                d6.a aVar2 = (d6.a) obj;
                nk.k.e(aVar2, "_connection");
                cVarS = aVar2.S("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cVarS.a(1, j);
                    cVarS.q(2, str2);
                    cVarS.P();
                    return uVar;
                } finally {
                }
            default:
                j0.s sVar = (j0.s) obj2;
                long jB = d3.i.b(((d3.i) ((a0.e) obj).d()).f21959a, j);
                int i10 = j0.s.f26957t;
                sVar.g(jB);
                sVar.f26960c.invoke();
                return uVar;
        }
    }

    public /* synthetic */ t(j0.s sVar, long j) {
        this.f2055a = 2;
        this.f2057c = sVar;
        this.f2056b = j;
    }
}
