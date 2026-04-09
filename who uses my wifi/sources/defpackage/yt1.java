package defpackage;

import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yt1 implements ca4 {
    public final /* synthetic */ int a;
    public final t83 b;

    public /* synthetic */ yt1(t83 t83Var, int i) {
        this.a = i;
        this.b = t83Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                String str = (String) this.b.g;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return dx1.AD_LOADER;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return dx1.INTERSTITIAL;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return dx1.REWARD_BASED_VIDEO_AD;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return dx1.BANNER;
                        }
                        break;
                }
                return dx1.AD_INITIATER_UNSPECIFIED;
            case 1:
                String lowerCase = ((String) this.b.g).toLowerCase(Locale.ROOT);
                i41.M(lowerCase);
                return lowerCase;
            case 2:
                t83 t83Var = this.b;
                t83Var.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(((String) t83Var.g).toLowerCase(Locale.ROOT));
                return hashSet;
            case 3:
                return (String) this.b.h;
            default:
                return (ad2) this.b.i;
        }
    }
}
