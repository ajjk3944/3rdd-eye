package androidx.fragment.app;

import F1.InterfaceC2779w;
import F1.InterfaceC2784z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.C4018p;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import c.AbstractActivityC4155j;
import c.C4138G;
import c.InterfaceC4141J;
import e.InterfaceC5407b;
import f.AbstractC5488e;
import f.InterfaceC5489f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q2.C7416d;
import q2.InterfaceC7418f;
import s1.AbstractC7874b;
import t1.InterfaceC8022b;
import t1.InterfaceC8023c;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3999j extends AbstractActivityC4155j implements AbstractC7874b.d {

    /* renamed from: y, reason: collision with root package name */
    boolean f31451y;

    /* renamed from: z, reason: collision with root package name */
    boolean f31452z;

    /* renamed from: w, reason: collision with root package name */
    final C4002m f31449w = C4002m.b(new a());

    /* renamed from: x, reason: collision with root package name */
    final C4018p f31450x = new C4018p(this);

    /* renamed from: A, reason: collision with root package name */
    boolean f31448A = true;

    /* renamed from: androidx.fragment.app.j$a */
    class a extends o implements InterfaceC8022b, InterfaceC8023c, s1.o, s1.p, S, InterfaceC4141J, InterfaceC5489f, InterfaceC7418f, A, InterfaceC2779w {
        public a() {
            super(AbstractActivityC3999j.this);
        }

        @Override // t1.InterfaceC8023c
        public void D(E1.a aVar) {
            AbstractActivityC3999j.this.D(aVar);
        }

        @Override // t1.InterfaceC8023c
        public void E(E1.a aVar) {
            AbstractActivityC3999j.this.E(aVar);
        }

        @Override // s1.p
        public void G(E1.a aVar) {
            AbstractActivityC3999j.this.G(aVar);
        }

        @Override // s1.o
        public void L(E1.a aVar) {
            AbstractActivityC3999j.this.L(aVar);
        }

        @Override // F1.InterfaceC2779w
        public void N(InterfaceC2784z interfaceC2784z) {
            AbstractActivityC3999j.this.N(interfaceC2784z);
        }

        @Override // androidx.lifecycle.InterfaceC4017o
        public AbstractC4013k O() {
            return AbstractActivityC3999j.this.f31450x;
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            AbstractActivityC3999j.this.E0(fragment);
        }

        @Override // c.InterfaceC4141J
        public C4138G b() {
            return AbstractActivityC3999j.this.b();
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public View d(int i10) {
            return AbstractActivityC3999j.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC4001l
        public boolean e() {
            Window window = AbstractActivityC3999j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.o
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC3999j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // s1.o
        public void j(E1.a aVar) {
            AbstractActivityC3999j.this.j(aVar);
        }

        @Override // f.InterfaceC5489f
        public AbstractC5488e l() {
            return AbstractActivityC3999j.this.l();
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater m() {
            return AbstractActivityC3999j.this.getLayoutInflater().cloneInContext(AbstractActivityC3999j.this);
        }

        @Override // androidx.lifecycle.S
        public Q o() {
            return AbstractActivityC3999j.this.o();
        }

        @Override // androidx.fragment.app.o
        public void p() {
            q();
        }

        public void q() {
            AbstractActivityC3999j.this.invalidateOptionsMenu();
        }

        @Override // F1.InterfaceC2779w
        public void r(InterfaceC2784z interfaceC2784z) {
            AbstractActivityC3999j.this.r(interfaceC2784z);
        }

        @Override // androidx.fragment.app.o
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC3999j k() {
            return AbstractActivityC3999j.this;
        }

        @Override // q2.InterfaceC7418f
        public C7416d t() {
            return AbstractActivityC3999j.this.t();
        }

        @Override // t1.InterfaceC8022b
        public void u(E1.a aVar) {
            AbstractActivityC3999j.this.u(aVar);
        }

        @Override // s1.p
        public void x(E1.a aVar) {
            AbstractActivityC3999j.this.x(aVar);
        }

        @Override // t1.InterfaceC8022b
        public void z(E1.a aVar) {
            AbstractActivityC3999j.this.z(aVar);
        }
    }

    public AbstractActivityC3999j() {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(Intent intent) {
        this.f31449w.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(Context context) {
        this.f31449w.a(null);
    }

    private static boolean D0(w wVar, AbstractC4013k.b bVar) {
        boolean zD0 = false;
        for (Fragment fragment : wVar.q0()) {
            if (fragment != null) {
                if (fragment.B() != null) {
                    zD0 |= D0(fragment.r(), bVar);
                }
                I i10 = fragment.f31252k1;
                if (i10 != null && i10.O().b().isAtLeast(AbstractC4013k.b.STARTED)) {
                    fragment.f31252k1.i(bVar);
                    zD0 = true;
                }
                if (fragment.f31250j1.b().isAtLeast(AbstractC4013k.b.STARTED)) {
                    fragment.f31250j1.m(bVar);
                    zD0 = true;
                }
            }
        }
        return zD0;
    }

    private void x0() {
        t().h("android:support:lifecycle", new C7416d.c() { // from class: androidx.fragment.app.f
            @Override // q2.C7416d.c
            public final Bundle a() {
                return this.f31444a.y0();
            }
        });
        z(new E1.a() { // from class: androidx.fragment.app.g
            @Override // E1.a
            public final void accept(Object obj) {
                this.f31445a.z0((Configuration) obj);
            }
        });
        i0(new E1.a() { // from class: androidx.fragment.app.h
            @Override // E1.a
            public final void accept(Object obj) {
                this.f31446a.A0((Intent) obj);
            }
        });
        h0(new InterfaceC5407b() { // from class: androidx.fragment.app.i
            @Override // e.InterfaceC5407b
            public final void a(Context context) {
                this.f31447a.B0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle y0() {
        C0();
        this.f31450x.h(AbstractC4013k.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(Configuration configuration) {
        this.f31449w.m();
    }

    void C0() {
        while (D0(v0(), AbstractC4013k.b.CREATED)) {
        }
    }

    public void E0(Fragment fragment) {
    }

    protected void F0() {
        this.f31450x.h(AbstractC4013k.a.ON_RESUME);
        this.f31449w.h();
    }

    @Override // s1.AbstractC7874b.d
    public final void a(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (P(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f31451y);
            printWriter.print(" mResumed=");
            printWriter.print(this.f31452z);
            printWriter.print(" mStopped=");
            printWriter.print(this.f31448A);
            if (getApplication() != null) {
                androidx.loader.app.a.c(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.f31449w.l().U(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f31449w.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31450x.h(AbstractC4013k.a.ON_CREATE);
        this.f31449w.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewU0 = u0(view, str, context, attributeSet);
        return viewU0 == null ? super.onCreateView(view, str, context, attributeSet) : viewU0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f31449w.f();
        this.f31450x.h(AbstractC4013k.a.ON_DESTROY);
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f31449w.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f31452z = false;
        this.f31449w.g();
        this.f31450x.h(AbstractC4013k.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        F0();
    }

    @Override // c.AbstractActivityC4155j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f31449w.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f31449w.m();
        super.onResume();
        this.f31452z = true;
        this.f31449w.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f31449w.m();
        super.onStart();
        this.f31448A = false;
        if (!this.f31451y) {
            this.f31451y = true;
            this.f31449w.c();
        }
        this.f31449w.k();
        this.f31450x.h(AbstractC4013k.a.ON_START);
        this.f31449w.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f31449w.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f31448A = true;
        C0();
        this.f31449w.j();
        this.f31450x.h(AbstractC4013k.a.ON_STOP);
    }

    final View u0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f31449w.n(view, str, context, attributeSet);
    }

    public w v0() {
        return this.f31449w.l();
    }

    public androidx.loader.app.a w0() {
        return androidx.loader.app.a.c(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewU0 = u0(null, str, context, attributeSet);
        return viewU0 == null ? super.onCreateView(str, context, attributeSet) : viewU0;
    }
}
