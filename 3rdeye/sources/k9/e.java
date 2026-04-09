package K9;

import b9.C1992A;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class e extends m implements l<Throwable, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f3759g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3760h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Object obj) {
        super(1);
        this.f3759g = dVar;
        this.f3760h = obj;
    }

    @Override // p9.l
    public final C1992A invoke(Throwable th) {
        this.f3759g.c(this.f3760h);
        return C1992A.f18074a;
    }
}
