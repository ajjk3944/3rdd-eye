package androidx.compose.ui.layout;

import E0.P;
import E0.m0;
import Yg.J;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f29067a = a.f29069a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f29068b = Y0.c.b(0, 0, 0, 0, 15, null);

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29069a = new a();

        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    public static final t.a a(P p10) {
        return new i(p10);
    }

    public static final t.a b(m0 m0Var) {
        return new s(m0Var);
    }
}
