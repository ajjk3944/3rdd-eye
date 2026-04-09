package i7;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import e7.c;
import e7.d;
import e7.e;
import e7.f;

/* loaded from: classes3.dex */
public class b extends e implements c {

    /* renamed from: a, reason: collision with root package name */
    public g7.a f21633a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21634a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f21634a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21634a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21634a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(g7.a aVar) {
        this.f21633a = aVar;
    }

    @Override // e7.c
    public void d(Context context, String str, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f21633a.a(), new i7.a(str, new d(aVar, fVar)));
    }

    @Override // e7.c
    public void e(Context context, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f21634a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AdFormat.UNKNOWN : AdFormat.REWARDED : AdFormat.INTERSTITIAL : AdFormat.BANNER;
    }
}
