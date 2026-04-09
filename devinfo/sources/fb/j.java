package fb;

import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.mi;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23938a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23939b;

    public /* synthetic */ j(i iVar, int i4) {
        this.f23938a = i4;
        this.f23939b = iVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f23938a) {
            case 0:
                String str = this.f23939b.f23935a;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return mi.AD_LOADER;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return mi.INTERSTITIAL;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return mi.REWARD_BASED_VIDEO_AD;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return mi.BANNER;
                        }
                        break;
                }
                return mi.AD_INITIATER_UNSPECIFIED;
            case 1:
                String lowerCase = this.f23939b.f23935a.toLowerCase(Locale.ROOT);
                al0.z(lowerCase);
                return lowerCase;
            case 2:
                i iVar = this.f23939b;
                iVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(iVar.f23935a.toLowerCase(Locale.ROOT));
                return hashSet;
            case 3:
                return this.f23939b.f23936b;
            default:
                return this.f23939b.f23937c;
        }
    }
}
