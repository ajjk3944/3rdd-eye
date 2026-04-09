package zc;

import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26905c;

    public /* synthetic */ d1(i1 i1Var, Object obj, int i10) {
        this.f26903a = i10;
        this.f26905c = obj;
        this.f26904b = i1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26903a) {
            case 0:
                i1 i1Var = (i1) this.f26904b;
                i1Var.f26968d.w();
                l lVar = i1Var.f26968d.f27099g;
                p3.Q(lVar);
                return lVar.n2((String) this.f26905c);
            case 1:
                i1 i1Var2 = (i1) this.f26904b;
                i1Var2.f26968d.w();
                return new zzao(i1Var2.f26968d.m0(((zzr) this.f26905c).f5426a));
            default:
                zzr zzrVar = (zzr) this.f26905c;
                String str = zzrVar.f5426a;
                cc.s.h(str);
                p3 p3Var = (p3) this.f26904b;
                o1 o1VarA = p3Var.a(str);
                n1 n1Var = n1.ANALYTICS_STORAGE;
                if (o1VarA.i(n1Var) && o1.c(100, zzrVar.O).i(n1Var)) {
                    return p3Var.Y(zzrVar).E();
                }
                p3Var.x().K.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public d1(p3 p3Var, zzr zzrVar) {
        this.f26903a = 2;
        this.f26905c = zzrVar;
        Objects.requireNonNull(p3Var);
        this.f26904b = p3Var;
    }
}
