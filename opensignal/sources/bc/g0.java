package bc;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g0 extends androidx.fragment.app.b implements f {

    /* renamed from: x0, reason: collision with root package name */
    public static final WeakHashMap f2607x0 = new WeakHashMap();

    /* renamed from: w0, reason: collision with root package name */
    public final f0 f2608w0 = new f0();

    @Override // androidx.fragment.app.b
    public final void A(int i10, int i11, Intent intent) {
        super.A(i10, i11, intent);
        Iterator it = ((Map) this.f2608w0.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.b
    public final void D(Bundle bundle) {
        super.D(bundle);
        this.f2608w0.x(bundle);
    }

    @Override // androidx.fragment.app.b
    public final void G() {
        this.f1410c0 = true;
        f0 f0Var = this.f2608w0;
        f0Var.f2602d = 5;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.b
    public final void O() {
        this.f1410c0 = true;
        f0 f0Var = this.f2608w0;
        f0Var.f2602d = 3;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).e();
        }
    }

    @Override // androidx.fragment.app.b
    public final void P(Bundle bundle) {
        this.f2608w0.y(bundle);
    }

    @Override // androidx.fragment.app.b
    public final void Q() {
        this.f1410c0 = true;
        f0 f0Var = this.f2608w0;
        f0Var.f2602d = 2;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.b
    public final void R() {
        this.f1410c0 = true;
        f0 f0Var = this.f2608w0;
        f0Var.f2602d = 4;
        Iterator it = ((Map) f0Var.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).h();
        }
    }

    @Override // bc.f
    public final void b(String str, e eVar) {
        this.f2608w0.w(str, eVar);
    }

    @Override // bc.f
    public final e c(Class cls, String str) {
        return (e) cls.cast(((Map) this.f2608w0.f2603g).get(str));
    }

    @Override // androidx.fragment.app.b
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f2608w0.f2603g).values().iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }
}
