package r7;

import L0.O;
import O6.InterfaceC1478d;
import android.view.View;
import c9.C2096q;
import x9.C5786d;

/* compiled from: TransientView.kt */
/* loaded from: classes.dex */
public final class t implements r {

    /* renamed from: b, reason: collision with root package name */
    public int f45826b;

    /* compiled from: _Sequences.kt */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<Object, Boolean> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f45827g = new a(1);

        @Override // p9.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof InterfaceC1478d);
        }
    }

    public static void a(View view) {
        view.invalidate();
        C5786d.a aVar = new C5786d.a(x9.l.F(new C2096q(new O(view, null)), a.f45827g));
        while (aVar.hasNext()) {
            ((InterfaceC1478d) aVar.next()).c();
        }
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        int i = this.f45826b + 1;
        this.f45826b = i;
        if (i == 1) {
            a(view);
        }
    }

    @Override // r7.r
    public final boolean g() {
        return this.f45826b != 0;
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        int i = this.f45826b;
        if (i > 0) {
            int i10 = i - 1;
            this.f45826b = i10;
            if (i10 == 0) {
                a(view);
            }
        }
    }
}
