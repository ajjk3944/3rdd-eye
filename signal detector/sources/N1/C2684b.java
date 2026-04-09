package n1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import l1.InterfaceC2639e;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2684b extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2639e f22172a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22173b;

    /* renamed from: c, reason: collision with root package name */
    public z f22174c;

    public C2684b(InterfaceC2639e interfaceC2639e, t tVar, ReferenceQueue referenceQueue) {
        super(tVar, referenceQueue);
        H1.g.c(interfaceC2639e, "Argument must not be null");
        this.f22172a = interfaceC2639e;
        boolean z6 = tVar.f22287a;
        this.f22174c = null;
        this.f22173b = z6;
    }
}
