package e7;

import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e implements c {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20984a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f20984a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20984a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20984a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e7.b f20985a;

        /* renamed from: b, reason: collision with root package name */
        public f f20986b;

        public b(e7.b bVar, f fVar) {
            this.f20985a = bVar;
            this.f20986b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map mapC = this.f20986b.c();
            if (mapC.size() > 0) {
                this.f20985a.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f20986b.b() == null) {
                this.f20985a.onSignalsCollected("");
            } else {
                this.f20985a.onSignalsCollectionFailed(this.f20986b.b());
            }
        }
    }

    @Override // e7.c
    public void a(Context context, boolean z10, e7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        e(context, UnityAdFormat.INTERSTITIAL, aVar, fVar);
        aVar.a();
        e(context, UnityAdFormat.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            e(context, UnityAdFormat.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // e7.c
    public void b(Context context, List list, e7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UnityAdFormat unityAdFormat = (UnityAdFormat) it.next();
            aVar.a();
            e(context, unityAdFormat, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // e7.c
    public void c(Context context, String str, UnityAdFormat unityAdFormat, e7.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, str, unityAdFormat, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    public String f(UnityAdFormat unityAdFormat) {
        int i10 = a.f20984a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal" : "gmaScarBiddingBannerSignal";
    }
}
