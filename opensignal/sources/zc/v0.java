package zc;

import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27242a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27243b;

    public /* synthetic */ v0(w0 w0Var) {
        this.f27243b = w0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f27242a) {
            case 0:
                return new j4(((w0) this.f27243b).H);
            default:
                i1 i1Var = (i1) this.f27243b;
                i1Var.f26968d.w();
                m0 m0Var = i1Var.f26968d.D;
                p3.Q(m0Var);
                m0Var.s1();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public v0(i1 i1Var, zzbg zzbgVar, String str) {
        this.f27243b = i1Var;
    }
}
