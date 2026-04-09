package l1;

import androidx.appcompat.app.z;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r.l;
import r0.c;

/* loaded from: classes.dex */
public class b extends l1.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f23054a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23055b;

    public static class a extends e0 {

        /* renamed from: f, reason: collision with root package name */
        public static final f0.b f23056f = new C0433a();

        /* renamed from: d, reason: collision with root package name */
        public l f23057d = new l();

        /* renamed from: e, reason: collision with root package name */
        public boolean f23058e = false;

        /* renamed from: l1.b$a$a, reason: collision with other inner class name */
        public static class C0433a implements f0.b {
            @Override // androidx.lifecycle.f0.b
            public e0 a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.f0.b
            public /* synthetic */ e0 b(Class cls, k1.a aVar) {
                return g0.b(this, cls, aVar);
            }
        }

        public static a g(i0 i0Var) {
            return (a) new f0(i0Var, f23056f).a(a.class);
        }

        @Override // androidx.lifecycle.e0
        public void d() {
            super.d();
            if (this.f23057d.i() <= 0) {
                this.f23057d.b();
            } else {
                z.a(this.f23057d.j(0));
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f23057d.i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f23057d.i() <= 0) {
                    return;
                }
                z.a(this.f23057d.j(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f23057d.g(0));
                printWriter.print(": ");
                throw null;
            }
        }

        public void h() {
            if (this.f23057d.i() <= 0) {
                return;
            }
            z.a(this.f23057d.j(0));
            throw null;
        }
    }

    public b(n nVar, i0 i0Var) {
        this.f23054a = nVar;
        this.f23055b = a.g(i0Var);
    }

    @Override // l1.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f23055b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // l1.a
    public void c() {
        this.f23055b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.a(this.f23054a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
