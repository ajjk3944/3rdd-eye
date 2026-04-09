package kotlinx.coroutines.internal;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes4.dex */
public class y extends kotlinx.coroutines.a implements d9.c {

    /* renamed from: d, reason: collision with root package name */
    public final c9.c f22567d;

    public y(kotlin.coroutines.d dVar, c9.c cVar) {
        super(dVar, true, true);
        this.f22567d = cVar;
    }

    @Override // kotlinx.coroutines.y1
    public void H(Object obj) {
        j.c(IntrinsicsKt__IntrinsicsJvmKt.c(this.f22567d), kotlinx.coroutines.f0.a(obj, this.f22567d), null, 2, null);
    }

    @Override // kotlinx.coroutines.a
    public void Q0(Object obj) {
        c9.c cVar = this.f22567d;
        cVar.resumeWith(kotlinx.coroutines.f0.a(obj, cVar));
    }

    @Override // d9.c
    public final d9.c getCallerFrame() {
        c9.c cVar = this.f22567d;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // kotlinx.coroutines.y1
    public final boolean o0() {
        return true;
    }
}
