package n7;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.p0;
import java.util.LinkedHashMap;
import l7.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f17388a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f17389b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17392e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f17393f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17394g;

    /* renamed from: c, reason: collision with root package name */
    public final cg.e f17390c = new cg.e();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f17391d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f17395h = true;

    public b(e eVar, p0 p0Var) {
        this.f17388a = eVar;
        this.f17389b = p0Var;
    }

    public final void a() {
        e eVar = this.f17388a;
        if (eVar.h().e1() != n.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f17392e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f17389b.c();
        eVar.h().V0(new a(0, this));
        this.f17392e = true;
    }
}
