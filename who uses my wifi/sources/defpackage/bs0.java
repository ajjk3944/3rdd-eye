package defpackage;

import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bs0 extends ue0 {
    public final /* synthetic */ int l;
    public final HashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(int i) {
        super("SVCB/HTTPS Parameters", 3);
        this.l = i;
        switch (i) {
            case 1:
                super("Type", 2);
                g("TYPE");
                this.i = 65535;
                this.m = new HashMap();
                break;
            default:
                g("key");
                this.i = 65535;
                this.m = new HashMap();
                break;
        }
    }

    @Override // defpackage.ue0
    public void d(int i) {
        switch (this.l) {
            case 1:
                k31.a(i);
                break;
            default:
                super.d(i);
                break;
        }
    }

    public final void h(int i, String str, Supplier supplier) {
        switch (this.l) {
            case 0:
                b(str, i);
                this.m.put(Integer.valueOf(i), supplier);
                break;
            default:
                b(str, i);
                this.m.put(Integer.valueOf(i), supplier);
                break;
        }
    }
}
