package e2;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5414b {

    /* renamed from: a, reason: collision with root package name */
    int f46144a;

    /* renamed from: b, reason: collision with root package name */
    a f46145b;

    /* renamed from: c, reason: collision with root package name */
    Context f46146c;

    /* renamed from: d, reason: collision with root package name */
    boolean f46147d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f46148e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f46149f = true;

    /* renamed from: g, reason: collision with root package name */
    boolean f46150g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f46151h = false;

    /* renamed from: e2.b$a */
    public interface a {
        void a(AbstractC5414b abstractC5414b, Object obj);
    }

    public AbstractC5414b(Context context) {
        this.f46146c = context.getApplicationContext();
    }

    public void a() {
        this.f46148e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f46151h = false;
    }

    public String d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        E1.b.a(obj, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void e() {
    }

    public void f(Object obj) {
        a aVar = this.f46145b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f46144a);
        printWriter.print(" mListener=");
        printWriter.println(this.f46145b);
        if (this.f46147d || this.f46150g || this.f46151h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f46147d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f46150g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f46151h);
        }
        if (this.f46148e || this.f46149f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f46148e);
            printWriter.print(" mReset=");
            printWriter.println(this.f46149f);
        }
    }

    public void h() {
        n();
    }

    public Context i() {
        return this.f46146c;
    }

    public boolean j() {
        return this.f46148e;
    }

    protected void k() {
    }

    protected abstract boolean l();

    public void m() {
        if (this.f46147d) {
            h();
        } else {
            this.f46150g = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected abstract void p();

    protected abstract void q();

    public void r(int i10, a aVar) {
        if (this.f46145b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f46145b = aVar;
        this.f46144a = i10;
    }

    public void s() {
        o();
        this.f46149f = true;
        this.f46147d = false;
        this.f46148e = false;
        this.f46150g = false;
        this.f46151h = false;
    }

    public void t() {
        if (this.f46151h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        E1.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f46144a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f46147d = true;
        this.f46149f = false;
        this.f46148e = false;
        p();
    }

    public void v() {
        this.f46147d = false;
        q();
    }

    public void w(a aVar) {
        a aVar2 = this.f46145b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f46145b = null;
    }
}
