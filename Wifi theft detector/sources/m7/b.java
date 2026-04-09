package m7;

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
    public k7.a f23453a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23454a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f23454a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23454a[UnityAdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(k7.a aVar) {
        this.f23453a = aVar;
    }

    @Override // e7.c
    public void d(Context context, String str, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f23453a.a(), new m7.a(str, new d(aVar, fVar)));
    }

    @Override // e7.c
    public void e(Context context, UnityAdFormat unityAdFormat, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        d(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f23454a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED : AdFormat.BANNER;
    }
}
