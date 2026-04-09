package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class al1 extends zu1 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ xe4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ u62 e;
    public final /* synthetic */ bu1 f;

    public al1(bu1 bu1Var, Context context, xe4 xe4Var, String str, u62 u62Var) {
        this.b = context;
        this.c = xe4Var;
        this.d = str;
        this.e = u62Var;
        Objects.requireNonNull(bu1Var);
        this.f = bu1Var;
    }

    @Override // defpackage.zu1
    public final Object a() {
        bu1.F(this.b, "banner");
        return new r93();
    }

    @Override // defpackage.zu1
    public final /* synthetic */ Object b() {
        return ((g32) this.f.g).w(this.b, this.c, this.d, this.e, 1);
    }

    @Override // defpackage.zu1
    public final Object c(ek2 ek2Var) {
        return ek2Var.T1(new oi0(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
