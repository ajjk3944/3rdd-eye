package C0;

import android.os.RemoteException;
import c5.C0410g;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.lefan.signal.MyApplication;
import j2.EnumC2546b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2828l;
import q2.C2834o;
import q2.T;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1133a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f1134b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1135c;

    public z(MyApplication myApplication, EnumC2546b enumC2546b) {
        if (j2.u.f21365a == null) {
            synchronized (j2.u.class) {
                try {
                    if (j2.u.f21365a == null) {
                        C2834o c2834o = q2.r.f23260g.f23262b;
                        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
                        c2834o.getClass();
                        j2.u.f21365a = (T) new C2828l(c2834o, myApplication, binderC0569Jc).d(myApplication, false);
                    }
                } finally {
                }
            }
        }
        this.f1133a = j2.u.f21365a;
        this.f1135c = myApplication.getApplicationContext();
        this.f1134b = enumC2546b;
    }

    public H0.j a() {
        p pVar = (p) this.f1133a;
        pVar.a();
        if (((AtomicBoolean) this.f1134b).compareAndSet(false, true)) {
            return (H0.j) ((C0410g) this.f1135c).getValue();
        }
        String strB = b();
        pVar.getClass();
        pVar.a();
        pVar.b();
        return pVar.g().i().d(strB);
    }

    public abstract String b();

    public void c(H0.j jVar) {
        q5.i.e(jVar, "statement");
        if (jVar == ((H0.j) ((C0410g) this.f1135c).getValue())) {
            ((AtomicBoolean) this.f1134b).set(false);
        }
    }

    public void d() {
        try {
            ((T) this.f1133a).P(((EnumC2546b) this.f1134b).f21332a);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    public z(p pVar) {
        q5.i.e(pVar, "database");
        this.f1133a = pVar;
        this.f1134b = new AtomicBoolean(false);
        this.f1135c = new C0410g(new y(0, this));
    }
}
