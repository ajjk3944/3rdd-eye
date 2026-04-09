package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sm1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ xe4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ bu1 e;

    public sm1(bu1 bu1Var, Context context, xe4 xe4Var, String str) {
        this.b = context;
        this.c = xe4Var;
        this.d = str;
        Objects.requireNonNull(bu1Var);
        this.e = bu1Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.b, "search");
        return new r93();
    }

    @Override // defpackage.zu1
    public final /* synthetic */ Object b() {
        return ((g32) this.e.g).w(this.b, this.c, this.d, null, 3);
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.b1(new oi0(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
