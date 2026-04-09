package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zs0 {
    public final at0 a;
    public final ga0 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final us0 c = new us0();
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public zs0(at0 at0Var, ga0 ga0Var) {
        this.a = at0Var;
        this.b = ga0Var;
    }

    public final void a() {
        at0 at0Var = this.a;
        if (at0Var.e().c != u50.g) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.a();
        at0Var.e().a(new vg(2, this));
        this.e = true;
    }
}
