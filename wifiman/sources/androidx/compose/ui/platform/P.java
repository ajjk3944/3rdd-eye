package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class P implements q1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f29273a;

    /* renamed from: b, reason: collision with root package name */
    private ActionMode f29274b;

    /* renamed from: c, reason: collision with root package name */
    private final G0.c f29275c = new G0.c(new a(), null, null, null, null, null, 62, null);

    /* renamed from: d, reason: collision with root package name */
    private s1 f29276d = s1.Hidden;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final void a() {
            P.this.f29274b = null;
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public P(View view) {
        this.f29273a = view;
    }

    @Override // androidx.compose.ui.platform.q1
    public s1 a() {
        return this.f29276d;
    }

    @Override // androidx.compose.ui.platform.q1
    public void b(C6533i c6533i, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC6824a interfaceC6824a4) {
        this.f29275c.l(c6533i);
        this.f29275c.h(interfaceC6824a);
        this.f29275c.i(interfaceC6824a3);
        this.f29275c.j(interfaceC6824a2);
        this.f29275c.k(interfaceC6824a4);
        ActionMode actionMode = this.f29274b;
        if (actionMode == null) {
            this.f29276d = s1.Shown;
            this.f29274b = r1.f29584a.b(this.f29273a, new G0.a(this.f29275c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.q1
    public void c() {
        this.f29276d = s1.Hidden;
        ActionMode actionMode = this.f29274b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f29274b = null;
    }
}
