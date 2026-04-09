package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ga0 implements rx {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ga0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.rx
    public final Object a() {
        switch (this.f) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.g;
                mainActivity.a0 = true;
                mainActivity.runOnUiThread(new na0(true, mainActivity, 0));
                return z31.a;
            case 1:
                return g82.i((r61) this.g);
            default:
                at0 at0Var = (at0) this.g;
                at0Var.e().a(new un0(0, at0Var));
                return z31.a;
        }
    }
}
