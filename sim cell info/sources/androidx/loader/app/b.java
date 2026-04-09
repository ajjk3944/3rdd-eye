package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k.h;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f1846c = false;

    /* renamed from: a, reason: collision with root package name */
    private final g f1847a;

    /* renamed from: b, reason: collision with root package name */
    private final C0014b f1848b;

    public static class a<D> extends l<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f1849k;

        /* renamed from: l, reason: collision with root package name */
        private final Bundle f1850l;

        /* renamed from: m, reason: collision with root package name */
        private final f0.a<D> f1851m;

        /* renamed from: n, reason: collision with root package name */
        private g f1852n;

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f1846c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f1846c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.f1852n = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void g(D d2) {
            super.g(d2);
        }

        f0.a<D> h(boolean z2) {
            if (b.f1846c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1849k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1850l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1851m);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void j() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1849k);
            sb.append(" : ");
            z.a.a(this.f1851m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0014b extends p {

        /* renamed from: e, reason: collision with root package name */
        private static final q.a f1853e = new a();

        /* renamed from: c, reason: collision with root package name */
        private h<a> f1854c = new h<>();

        /* renamed from: d, reason: collision with root package name */
        private boolean f1855d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new C0014b();
            }
        }

        C0014b() {
        }

        static C0014b e(r rVar) {
            return (C0014b) new q(rVar, f1853e).a(C0014b.class);
        }

        @Override // androidx.lifecycle.p
        protected void c() {
            super.c();
            int iJ = this.f1854c.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                this.f1854c.k(i2).h(true);
            }
            this.f1854c.b();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1854c.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f1854c.j(); i2++) {
                    a aVarK = this.f1854c.k(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1854c.g(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarK.toString());
                    aVarK.i(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            int iJ = this.f1854c.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                this.f1854c.k(i2).j();
            }
        }
    }

    b(g gVar, r rVar) {
        this.f1847a = gVar;
        this.f1848b = C0014b.e(rVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1848b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f1848b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        z.a.a(this.f1847a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
