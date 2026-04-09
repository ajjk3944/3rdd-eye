package f1;

import android.os.Bundle;
import androidx.lifecycle.c0;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements g, a6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23624a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f23625b;

    /* renamed from: c, reason: collision with root package name */
    public y4.a f23626c;

    public j(h hVar) {
        this.f23624a = hVar;
        Object objC = hVar.c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objC instanceof Bundle ? (Bundle) objC : null;
        if (bundle != null && this.f23626c == null) {
            y4.a aVar = new y4.a(new c6.a(this, new a6.e(0, this)));
            this.f23626c = aVar;
            aVar.q(bundle);
        }
        hVar.d("androidx.savedstate.SavedStateRegistry", new a6.e(9, this));
    }

    @Override // f1.g
    public final boolean a(Object obj) {
        return this.f23624a.a(obj);
    }

    @Override // f1.g
    public final Map b() {
        return this.f23624a.b();
    }

    @Override // f1.g
    public final Object c(String str) {
        return this.f23624a.c(str);
    }

    @Override // f1.g
    public final f d(String str, mk.a aVar) {
        return this.f23624a.d(str, aVar);
    }

    @Override // a6.f
    public final yb.i g() {
        y4.a aVar = this.f23626c;
        if (aVar == null) {
            y4.a aVar2 = new y4.a(new c6.a(this, new a6.e(0, this)));
            this.f23626c = aVar2;
            aVar2.q(null);
            aVar = aVar2;
        }
        return (yb.i) aVar.f37324b;
    }

    @Override // androidx.lifecycle.a0
    public final c0 j() {
        c0 c0Var = this.f23625b;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, false);
        this.f23625b = c0Var2;
        return c0Var2;
    }
}
