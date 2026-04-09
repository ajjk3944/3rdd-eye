package n;

import android.view.MenuInflater;
import android.view.View;
import rr.e1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17070a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17071d;

    /* renamed from: g, reason: collision with root package name */
    public Object f17072g;

    public /* synthetic */ a() {
    }

    public Integer a(a aVar) {
        br.l.e(aVar, "visibility");
        nq.f fVar = e1.f21687a;
        if (this == aVar) {
            return 0;
        }
        nq.f fVar2 = e1.f21687a;
        Integer num = (Integer) fVar2.get(this);
        Integer num2 = (Integer) fVar2.get(aVar);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.f17072g;
    }

    public abstract o.m e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void l(View view);

    public abstract void m(int i10);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i10);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z10);

    public String toString() {
        switch (this.f17070a) {
            case 1:
                return d();
            default:
                return super.toString();
        }
    }

    public a(String str, boolean z10) {
        this.f17072g = str;
        this.f17071d = z10;
    }

    public a k() {
        return this;
    }
}
