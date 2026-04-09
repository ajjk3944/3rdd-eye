package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fn1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ xe4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ s62 e;
    public final /* synthetic */ bu1 f;

    public fn1(bu1 bu1Var, Context context, xe4 xe4Var, String str, s62 s62Var) {
        this.b = context;
        this.c = xe4Var;
        this.d = str;
        this.e = s62Var;
        Objects.requireNonNull(bu1Var);
        this.f = bu1Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.b, "interstitial");
        return new r93();
    }

    @Override // defpackage.zu1
    public final /* synthetic */ Object b() {
        return ((g32) this.f.g).w(this.b, this.c, this.d, this.e, 2);
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.E2(new oi0(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
