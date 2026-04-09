package p1;

import A9.M;
import b9.C1992A;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import o0.b;
import p9.l;

/* compiled from: CoroutineAdapter.kt */
/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5440a extends m implements l<Throwable, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b.a<Object> f45012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ M f45013h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5440a(b.a aVar, M m10) {
        super(1);
        this.f45012g = aVar;
        this.f45013h = m10;
    }

    @Override // p9.l
    public final C1992A invoke(Throwable th) {
        Throwable th2 = th;
        b.a<Object> aVar = this.f45012g;
        if (th2 == null) {
            aVar.b(this.f45013h.G());
        } else if (th2 instanceof CancellationException) {
            aVar.c();
        } else {
            aVar.d(th2);
        }
        return C1992A.f18074a;
    }
}
