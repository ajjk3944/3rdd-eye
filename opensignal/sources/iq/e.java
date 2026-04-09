package iq;

import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.j;
import br.l;
import br.n;
import java.util.List;
import java.util.WeakHashMap;
import u3.a0;
import u3.h1;
import u3.i0;
import u3.u0;

/* loaded from: classes.dex */
public final class e extends j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12926g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f12927r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(FrameLayout frameLayout, ar.a aVar) {
        super(0);
        this.f12926g = frameLayout;
        this.f12927r = (n) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [ar.a, br.n] */
    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(u0 u0Var) {
        WeakHashMap weakHashMap = i0.f23177a;
        h1 h1VarA = a0.a(this.f12926g);
        if (h1VarA != null && h1VarA.f23176a.p(8)) {
            this.f12927r.c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final h1 f(h1 h1Var, List list) {
        l.e(h1Var, "insets");
        l.e(list, "runningAnimations");
        return h1Var;
    }
}
