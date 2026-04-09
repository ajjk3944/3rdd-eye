package I;

import o0.b;

/* compiled from: Futures.java */
/* loaded from: classes.dex */
public final class k implements c<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f2363b;

    public k(b.a aVar) {
        this.f2363b = aVar;
    }

    @Override // I.c
    public final void onFailure(Throwable th) {
        this.f2363b.d(th);
    }

    @Override // I.c
    public final void onSuccess(Object obj) {
        b.a aVar = this.f2363b;
        try {
            aVar.b(obj);
        } catch (Throwable th) {
            aVar.d(th);
        }
    }
}
