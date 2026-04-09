package ba;

import b9.C1992A;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class m extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i, b bVar) {
        super(str, true);
        this.f18203e = fVar;
        this.f18204f = i;
    }

    @Override // X9.a
    public final long a() {
        this.f18203e.f18153l.getClass();
        synchronized (this.f18203e) {
            this.f18203e.f18167z.remove(Integer.valueOf(this.f18204f));
            C1992A c1992a = C1992A.f18074a;
        }
        return -1L;
    }
}
