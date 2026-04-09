package R3;

import S3.p;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class g extends S3.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3.f f3412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, c3.f fVar, c3.f fVar2, Object obj2, int i) {
        super(fVar);
        this.f3411b = i;
        this.f3414e = obj;
        this.f3412c = fVar2;
        this.f3413d = obj2;
    }

    @Override // S3.k
    public final void a() {
        switch (this.f3411b) {
            case 0:
                c3.f fVar = this.f3412c;
                k kVar = (k) this.f3414e;
                String str = (String) this.f3413d;
                try {
                    kVar.f3421a.f3510m.z0(kVar.f3422b, k.a(kVar, str), new j(kVar, fVar, str));
                    return;
                } catch (RemoteException e6) {
                    k.f3419e.e(e6, "requestUpdateInfo(%s)", str);
                    fVar.a(new RuntimeException(e6));
                    return;
                }
            case 1:
                c3.f fVar2 = this.f3412c;
                k kVar2 = (k) this.f3414e;
                try {
                    kVar2.f3421a.f3510m.c3(kVar2.f3422b, k.b(), new i(kVar2, new B2.a("OnCompleteUpdateCallback"), fVar2));
                    return;
                } catch (RemoteException e7) {
                    k.f3419e.e(e7, "completeUpdate(%s)", (String) this.f3413d);
                    fVar2.a(new RuntimeException(e7));
                    return;
                }
            default:
                synchronized (((p) this.f3414e).f3504f) {
                    try {
                        p pVar = (p) this.f3414e;
                        c3.f fVar3 = this.f3412c;
                        pVar.f3503e.add(fVar3);
                        fVar3.f5902a.a(new V2.h(pVar, 10, fVar3));
                        if (((p) this.f3414e).f3508k.getAndIncrement() > 0) {
                            ((p) this.f3414e).f3500b.f("Already connected to the service.", new Object[0]);
                        }
                        p.b((p) this.f3414e, (S3.k) this.f3413d);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, c3.f fVar, String str, c3.f fVar2) {
        super(fVar);
        this.f3411b = 0;
        this.f3414e = kVar;
        this.f3413d = str;
        this.f3412c = fVar2;
    }
}
