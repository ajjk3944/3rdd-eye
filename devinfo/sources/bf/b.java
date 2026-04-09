package bf;

import android.content.Context;
import androidx.lifecycle.f1;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import de.q;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements de.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2151b;

    public /* synthetic */ b(q qVar, int i4) {
        this.f2150a = i4;
        this.f2151b = qVar;
    }

    @Override // de.d
    public final Object c(f1 f1Var) {
        switch (this.f2150a) {
            case 0:
                return new e((Context) f1Var.a(Context.class), ((wd.f) f1Var.a(wd.f.class)).c(), f1Var.K(f.class), f1Var.j(jf.b.class), (Executor) f1Var.l(this.f2151b));
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f2151b, f1Var);
        }
    }
}
