package androidx.lifecycle;

import d2.AbstractC5283b;
import d2.C5282a;
import d2.C5286e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    private static final C5286e f31622a = new C5286e();

    public static final Ii.N a(N n10) {
        C5282a c5282aA;
        AbstractC6492s.i(n10, "<this>");
        synchronized (f31622a) {
            c5282aA = (C5282a) n10.V("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c5282aA == null) {
                c5282aA = AbstractC5283b.a();
                n10.T("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c5282aA);
            }
        }
        return c5282aA;
    }
}
