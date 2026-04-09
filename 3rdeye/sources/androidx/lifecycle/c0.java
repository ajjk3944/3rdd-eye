package androidx.lifecycle;

import A9.C0575f;
import f9.C4351i;
import f9.InterfaceC4350h;
import k1.C5207a;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final T1.B f16134a = new T1.B();

    public static final C5207a a(b0 b0Var) {
        C5207a c5207a;
        synchronized (f16134a) {
            c5207a = (C5207a) b0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c5207a == null) {
                InterfaceC4350h interfaceC4350hR0 = C4351i.f37871b;
                try {
                    I9.c cVar = A9.U.f211a;
                    interfaceC4350hR0 = F9.q.f1782a.R0();
                } catch (b9.k | IllegalStateException unused) {
                }
                C5207a c5207a2 = new C5207a(interfaceC4350hR0.plus(C0575f.a()));
                b0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c5207a2);
                c5207a = c5207a2;
            }
        }
        return c5207a;
    }
}
