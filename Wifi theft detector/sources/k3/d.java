package k3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.widget.MBAdChoice;
import j3.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends UnifiedNativeAdMapper implements OnMBMediaViewListener {

    /* renamed from: a, reason: collision with root package name */
    public Campaign f21818a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f21819b;

    /* renamed from: c, reason: collision with root package name */
    public MediationNativeAdCallback f21820c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21821d;

    public class a extends NativeAd.Image {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable f21822a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f21823b;

        /* renamed from: c, reason: collision with root package name */
        public final double f21824c;

        public a(Drawable drawable, Uri uri, double d10) {
            this.f21822a = drawable;
            this.f21823b = uri;
            this.f21824c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f21822a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f21824c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f21823b;
        }
    }

    public d(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f21821d = j.f(mediationNativeAdConfiguration.getMediationExtras());
        this.f21819b = mediationAdLoadCallback;
    }

    public void a(Campaign campaign, Context context) {
        d dVar;
        this.f21818a = campaign;
        if (campaign.getAppName() != null) {
            setHeadline(this.f21818a.getAppName());
        }
        if (this.f21818a.getAppDesc() != null) {
            setBody(this.f21818a.getAppDesc());
        }
        if (this.f21818a.getAdCall() != null) {
            setCallToAction(this.f21818a.getAdCall());
        }
        setStarRating(Double.valueOf(this.f21818a.getRating()));
        if (TextUtils.isEmpty(this.f21818a.getIconUrl())) {
            dVar = this;
        } else {
            dVar = this;
            setIcon(dVar.new a(null, Uri.parse(this.f21818a.getIconUrl()), 1.0d));
        }
        MBMediaView mBMediaView = new MBMediaView(context);
        mBMediaView.setVideoSoundOnOff(!dVar.f21821d);
        mBMediaView.setNativeAd(dVar.f21818a);
        setMediaView(mBMediaView);
        MBAdChoice mBAdChoice = new MBAdChoice(context);
        mBAdChoice.setCampaign(dVar.f21818a);
        setAdChoicesContent(mBAdChoice);
        setOverrideClickHandling(true);
    }

    public List b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            if (view instanceof MediaView) {
                arrayList.add(view);
                return arrayList;
            }
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return arrayList;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                if (viewGroup.getChildAt(i10) instanceof ViewGroup) {
                    arrayList.addAll(b(viewGroup.getChildAt(i10)));
                } else {
                    arrayList.add(viewGroup.getChildAt(i10));
                }
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onEnterFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onExitFullscreen() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoAdClicked(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onVideoStart() {
        MediationNativeAdCallback mediationNativeAdCallback = this.f21820c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onVideoPlay();
        }
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onFinishRedirection(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onRedirectionFailed(Campaign campaign, String str) {
    }

    @Override // com.mbridge.msdk.out.OnMBMediaViewListener
    public void onStartRedirection(Campaign campaign, String str) {
    }
}
