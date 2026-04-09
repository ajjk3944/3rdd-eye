package K9;

import K9.d;
import b9.C1992A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class c extends m implements l<Throwable, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f3754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d.a f3755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d.a aVar) {
        super(1);
        this.f3754g = dVar;
        this.f3755h = aVar;
    }

    @Override // p9.l
    public final C1992A invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.i;
        this.f3755h.getClass();
        d dVar = this.f3754g;
        atomicReferenceFieldUpdater.set(dVar, null);
        dVar.c(null);
        return C1992A.f18074a;
    }
}
