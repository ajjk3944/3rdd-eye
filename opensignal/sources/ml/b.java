package ml;

import android.os.Bundle;
import android.view.View;
import br.l;
import cg.j;
import kotlin.Metadata;
import ml.c;
import zl.e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lml/b;", "Lml/c;", "VM", "Lzl/e;", "VS", "Landroidx/fragment/app/b;", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b<VM extends c, VS extends e> extends androidx.fragment.app.b {
    @Override // androidx.fragment.app.b
    public final void H() {
        g0().f16872b.i(t());
        this.f1410c0 = true;
    }

    @Override // androidx.fragment.app.b
    public void S(View view, Bundle bundle) {
        l.e(view, "view");
        g0().f16872b.d(t(), new a(new j(7, this)));
        g0().getClass();
    }

    public abstract zl.a g0();

    public abstract void h0(e eVar);
}
