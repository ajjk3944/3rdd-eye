package j3;

import android.content.Context;
import android.view.ViewGroup;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import kotlin.jvm.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f21741a = new d();

    public static final class a implements j3.b {

        /* renamed from: a, reason: collision with root package name */
        public MBBidNewInterstitialHandler f21742a;

        @Override // j3.b
        public void a(Context context, String placementId, String adUnitId) {
            p.e(context, "context");
            p.e(placementId, "placementId");
            p.e(adUnitId, "adUnitId");
            this.f21742a = new MBBidNewInterstitialHandler(context, placementId, adUnitId);
        }

        @Override // j3.b
        public void b(NewInterstitialWithCodeListener listener) {
            p.e(listener, "listener");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f21742a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setInterstitialVideoListener(listener);
            }
        }

        @Override // j3.b
        public void loadFromBid(String bidToken) {
            p.e(bidToken, "bidToken");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f21742a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.loadFromBid(bidToken);
            }
        }

        @Override // j3.b
        public void playVideoMute(int i10) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f21742a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // j3.b
        public void setExtraInfo(JSONObject jsonObject) {
            p.e(jsonObject, "jsonObject");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f21742a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jsonObject);
            }
        }

        @Override // j3.b
        public void showFromBid() {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f21742a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.showFromBid();
            }
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public MBNewInterstitialHandler f21743a;

        @Override // j3.f
        public void a(Context context, String placementId, String adUnitId) {
            p.e(context, "context");
            p.e(placementId, "placementId");
            p.e(adUnitId, "adUnitId");
            this.f21743a = new MBNewInterstitialHandler(context, placementId, adUnitId);
        }

        @Override // j3.f
        public void b(NewInterstitialWithCodeListener listener) {
            p.e(listener, "listener");
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f21743a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.setInterstitialVideoListener(listener);
            }
        }

        @Override // j3.f
        public void load() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f21743a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.load();
            }
        }

        @Override // j3.f
        public void playVideoMute(int i10) {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f21743a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // j3.f
        public void show() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f21743a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.show();
            }
        }
    }

    public static final class c implements j3.c {

        /* renamed from: a, reason: collision with root package name */
        public MBBidRewardVideoHandler f21744a;

        @Override // j3.c
        public void a(Context context, String placementId, String adUnitId) {
            p.e(context, "context");
            p.e(placementId, "placementId");
            p.e(adUnitId, "adUnitId");
            this.f21744a = new MBBidRewardVideoHandler(context, placementId, adUnitId);
        }

        @Override // j3.c
        public void b(RewardVideoWithCodeListener listener) {
            p.e(listener, "listener");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f21744a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setRewardVideoListener(listener);
            }
        }

        @Override // j3.c
        public void loadFromBid(String bidToken) {
            p.e(bidToken, "bidToken");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f21744a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.loadFromBid(bidToken);
            }
        }

        @Override // j3.c
        public void playVideoMute(int i10) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f21744a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // j3.c
        public void setExtraInfo(JSONObject jsonObject) {
            p.e(jsonObject, "jsonObject");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f21744a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setExtraInfo(jsonObject);
            }
        }

        @Override // j3.c
        public void showFromBid() {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f21744a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.showFromBid();
            }
        }
    }

    /* renamed from: j3.d$d, reason: collision with other inner class name */
    public static final class C0419d implements g {

        /* renamed from: a, reason: collision with root package name */
        public MBRewardVideoHandler f21745a;

        @Override // j3.g
        public void a(Context context, String placementId, String adUnitId) {
            p.e(context, "context");
            p.e(placementId, "placementId");
            p.e(adUnitId, "adUnitId");
            this.f21745a = new MBRewardVideoHandler(context, placementId, adUnitId);
        }

        @Override // j3.g
        public void b(RewardVideoWithCodeListener listener) {
            p.e(listener, "listener");
            MBRewardVideoHandler mBRewardVideoHandler = this.f21745a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.setRewardVideoListener(listener);
            }
        }

        @Override // j3.g
        public void load() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f21745a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.load();
            }
        }

        @Override // j3.g
        public void playVideoMute(int i10) {
            MBRewardVideoHandler mBRewardVideoHandler = this.f21745a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // j3.g
        public void show() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f21745a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.show();
            }
        }
    }

    public static final class e implements i {

        /* renamed from: a, reason: collision with root package name */
        public MBSplashHandler f21746a;

        @Override // j3.i
        public void a() {
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoad();
            }
        }

        @Override // j3.i
        public void b(ViewGroup group, String bidToken) {
            p.e(group, "group");
            p.e(bidToken, "bidToken");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group, bidToken);
            }
        }

        @Override // j3.i
        public void c(String token) {
            p.e(token, "token");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoadByToken(token);
            }
        }

        @Override // j3.i
        public void d(String placementId, String adUnitId) {
            p.e(placementId, "placementId");
            p.e(adUnitId, "adUnitId");
            this.f21746a = new MBSplashHandler(placementId, adUnitId, true, 5);
        }

        @Override // j3.i
        public void e(MBSplashLoadWithCodeListener listener) {
            p.e(listener, "listener");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashLoadListener(listener);
            }
        }

        @Override // j3.i
        public void f(MBSplashShowListener listener) {
            p.e(listener, "listener");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashShowListener(listener);
            }
        }

        @Override // j3.i
        public void g(ViewGroup group) {
            p.e(group, "group");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(group);
            }
        }

        @Override // j3.i
        public void onDestroy() {
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.onDestroy();
            }
        }

        @Override // j3.i
        public void setExtraInfo(JSONObject jsonObject) throws JSONException {
            p.e(jsonObject, "jsonObject");
            MBSplashHandler mBSplashHandler = this.f21746a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setExtraInfo(jsonObject);
            }
        }
    }

    public static final j3.b a() {
        return new a();
    }

    public static final f b() {
        return new b();
    }

    public static final MBBannerView c(Context context) {
        p.e(context, "context");
        return new MBBannerView(context);
    }

    public static final j3.c d() {
        return new c();
    }

    public static final g e() {
        return new C0419d();
    }

    public static final i f() {
        return new e();
    }
}
