package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C4022u;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.v;
import androidx.loader.app.a;
import e2.AbstractC5414b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o.W;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f31712c = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4017o f31713a;

    /* renamed from: b, reason: collision with root package name */
    private final c f31714b;

    public static class a extends C4022u implements AbstractC5414b.a {

        /* renamed from: l, reason: collision with root package name */
        private final int f31715l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f31716m;

        /* renamed from: n, reason: collision with root package name */
        private final AbstractC5414b f31717n;

        /* renamed from: o, reason: collision with root package name */
        private InterfaceC4017o f31718o;

        /* renamed from: p, reason: collision with root package name */
        private C1113b f31719p;

        /* renamed from: q, reason: collision with root package name */
        private AbstractC5414b f31720q;

        a(int i10, Bundle bundle, AbstractC5414b abstractC5414b, AbstractC5414b abstractC5414b2) {
            this.f31715l = i10;
            this.f31716m = bundle;
            this.f31717n = abstractC5414b;
            this.f31720q = abstractC5414b2;
            abstractC5414b.r(i10, this);
        }

        @Override // e2.AbstractC5414b.a
        public void a(AbstractC5414b abstractC5414b, Object obj) {
            if (b.f31712c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f31712c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.AbstractC4020s
        protected void j() {
            if (b.f31712c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f31717n.u();
        }

        @Override // androidx.lifecycle.AbstractC4020s
        protected void k() {
            if (b.f31712c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f31717n.v();
        }

        @Override // androidx.lifecycle.AbstractC4020s
        public void m(v vVar) {
            super.m(vVar);
            this.f31718o = null;
            this.f31719p = null;
        }

        @Override // androidx.lifecycle.C4022u, androidx.lifecycle.AbstractC4020s
        public void n(Object obj) {
            super.n(obj);
            AbstractC5414b abstractC5414b = this.f31720q;
            if (abstractC5414b != null) {
                abstractC5414b.s();
                this.f31720q = null;
            }
        }

        AbstractC5414b o(boolean z10) {
            if (b.f31712c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f31717n.b();
            this.f31717n.a();
            C1113b c1113b = this.f31719p;
            if (c1113b != null) {
                m(c1113b);
                if (z10) {
                    c1113b.d();
                }
            }
            this.f31717n.w(this);
            if ((c1113b == null || c1113b.c()) && !z10) {
                return this.f31717n;
            }
            this.f31717n.s();
            return this.f31720q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f31715l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f31716m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f31717n);
            this.f31717n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f31719p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f31719p);
                this.f31719p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        AbstractC5414b q() {
            return this.f31717n;
        }

        void r() {
            InterfaceC4017o interfaceC4017o = this.f31718o;
            C1113b c1113b = this.f31719p;
            if (interfaceC4017o == null || c1113b == null) {
                return;
            }
            super.m(c1113b);
            h(interfaceC4017o, c1113b);
        }

        AbstractC5414b s(InterfaceC4017o interfaceC4017o, a.InterfaceC1112a interfaceC1112a) {
            C1113b c1113b = new C1113b(this.f31717n, interfaceC1112a);
            h(interfaceC4017o, c1113b);
            v vVar = this.f31719p;
            if (vVar != null) {
                m(vVar);
            }
            this.f31718o = interfaceC4017o;
            this.f31719p = c1113b;
            return this.f31717n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f31715l);
            sb2.append(" : ");
            E1.b.a(this.f31717n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C1113b implements v {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5414b f31721a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC1112a f31722b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f31723c = false;

        C1113b(AbstractC5414b abstractC5414b, a.InterfaceC1112a interfaceC1112a) {
            this.f31721a = abstractC5414b;
            this.f31722b = interfaceC1112a;
        }

        @Override // androidx.lifecycle.v
        public void a(Object obj) {
            if (b.f31712c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f31721a + ": " + this.f31721a.d(obj));
            }
            this.f31722b.F(this.f31721a, obj);
            this.f31723c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f31723c);
        }

        boolean c() {
            return this.f31723c;
        }

        void d() {
            if (this.f31723c) {
                if (b.f31712c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f31721a);
                }
                this.f31722b.p(this.f31721a);
            }
        }

        public String toString() {
            return this.f31722b.toString();
        }
    }

    static class c extends N {

        /* renamed from: d, reason: collision with root package name */
        private static final P.c f31724d = new a();

        /* renamed from: b, reason: collision with root package name */
        private W f31725b = new W();

        /* renamed from: c, reason: collision with root package name */
        private boolean f31726c = false;

        static class a implements P.c {
            a() {
            }

            @Override // androidx.lifecycle.P.c
            public N a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c Z(Q q10) {
            return (c) new P(q10, f31724d).a(c.class);
        }

        @Override // androidx.lifecycle.N
        protected void W() {
            super.W();
            int iP = this.f31725b.p();
            for (int i10 = 0; i10 < iP; i10++) {
                ((a) this.f31725b.q(i10)).o(true);
            }
            this.f31725b.c();
        }

        public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f31725b.p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f31725b.p(); i10++) {
                    a aVar = (a) this.f31725b.q(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f31725b.k(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void Y() {
            this.f31726c = false;
        }

        a a0(int i10) {
            return (a) this.f31725b.f(i10);
        }

        boolean b0() {
            return this.f31726c;
        }

        void c0() {
            int iP = this.f31725b.p();
            for (int i10 = 0; i10 < iP; i10++) {
                ((a) this.f31725b.q(i10)).r();
            }
        }

        void d0(int i10, a aVar) {
            this.f31725b.l(i10, aVar);
        }

        void e0(int i10) {
            this.f31725b.m(i10);
        }

        void f0() {
            this.f31726c = true;
        }
    }

    b(InterfaceC4017o interfaceC4017o, Q q10) {
        this.f31713a = interfaceC4017o;
        this.f31714b = c.Z(q10);
    }

    private AbstractC5414b f(int i10, Bundle bundle, a.InterfaceC1112a interfaceC1112a, AbstractC5414b abstractC5414b) {
        try {
            this.f31714b.f0();
            AbstractC5414b abstractC5414bN = interfaceC1112a.n(i10, bundle);
            if (abstractC5414bN == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (abstractC5414bN.getClass().isMemberClass() && !Modifier.isStatic(abstractC5414bN.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + abstractC5414bN);
            }
            a aVar = new a(i10, bundle, abstractC5414bN, abstractC5414b);
            if (f31712c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f31714b.d0(i10, aVar);
            this.f31714b.Y();
            return aVar.s(this.f31713a, interfaceC1112a);
        } catch (Throwable th2) {
            this.f31714b.Y();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public void a(int i10) {
        if (this.f31714b.b0()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f31712c) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i10);
        }
        a aVarA0 = this.f31714b.a0(i10);
        if (aVarA0 != null) {
            aVarA0.o(true);
            this.f31714b.e0(i10);
        }
    }

    @Override // androidx.loader.app.a
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f31714b.X(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public AbstractC5414b d(int i10, Bundle bundle, a.InterfaceC1112a interfaceC1112a) {
        if (this.f31714b.b0()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarA0 = this.f31714b.a0(i10);
        if (f31712c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarA0 == null) {
            return f(i10, bundle, interfaceC1112a, null);
        }
        if (f31712c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarA0);
        }
        return aVarA0.s(this.f31713a, interfaceC1112a);
    }

    @Override // androidx.loader.app.a
    public void e() {
        this.f31714b.c0();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        E1.b.a(this.f31713a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
