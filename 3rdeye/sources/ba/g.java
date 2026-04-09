package ba;

import kotlin.jvm.internal.w;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class g extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f18188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, f fVar, w wVar) {
        super(str, true);
        this.f18187e = fVar;
        this.f18188f = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X9.a
    public final long a() {
        f fVar = this.f18187e;
        fVar.f18144b.a(fVar, (t) this.f18188f.f43660b);
        return -1L;
    }
}
