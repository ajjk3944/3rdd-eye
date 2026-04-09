package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v94 extends zt0 {
    public final /* synthetic */ int p;
    public final Object q;

    public v94(String str, int i) {
        this.p = i;
        switch (i) {
            case 1:
                this.q = Logger.getLogger(str);
                break;
            default:
                this.q = str;
                break;
        }
    }

    @Override // defpackage.zt0
    public final void C(String str) {
        switch (this.p) {
            case 0:
                new StringBuilder(String.valueOf(str).length() + String.valueOf((String) this.q).length() + 1);
                break;
            default:
                ((Logger) this.q).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
