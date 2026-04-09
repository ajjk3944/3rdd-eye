package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.VideoNativePlayer;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public class MediaViewPlayerView extends LinearLayout implements VideoPlayerStatusListener {
    private static Handler L = new Handler();
    private String A;
    private String B;
    private CampaignEx C;
    private com.mbridge.msdk.nativex.listener.a D;
    private Timer E;
    private com.mbridge.msdk.videocommon.download.a F;
    private VideoNativePlayer G;
    private h H;
    private o5.b I;
    private com.iab.omid.library.mmadbridge.adsession.media.a J;
    private boolean K;

    /* renamed from: a, reason: collision with root package name */
    private boolean f16363a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16364b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16365c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16366d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16367e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16368f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16369g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16370h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16371i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16372j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16373k;

    /* renamed from: l, reason: collision with root package name */
    private volatile int f16374l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16375m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16376n;

    /* renamed from: o, reason: collision with root package name */
    private TextureView f16377o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f16378p;

    /* renamed from: q, reason: collision with root package name */
    private Surface f16379q;

    /* renamed from: r, reason: collision with root package name */
    private ProgressBar f16380r;

    /* renamed from: s, reason: collision with root package name */
    private MyImageView f16381s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f16382t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f16383u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f16384v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f16385w;

    /* renamed from: x, reason: collision with root package name */
    private View f16386x;

    /* renamed from: y, reason: collision with root package name */
    private AnimationDrawable f16387y;

    /* renamed from: z, reason: collision with root package name */
    private AlphaAnimation f16388z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (MediaViewPlayerView.this.f16373k) {
                    MediaViewPlayerView.this.closeSound();
                    if (MediaViewPlayerView.this.D != null) {
                        MediaViewPlayerView.this.D.b();
                        return;
                    }
                    return;
                }
                MediaViewPlayerView.this.openSound();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.a();
                }
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage());
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MediaViewPlayerView.this.pause();
                MediaViewPlayerView.this.f16382t.setVisibility(0);
                MediaViewPlayerView.this.n();
                MediaViewPlayerView.this.c();
                if (MediaViewPlayerView.this.D != null) {
                    MediaViewPlayerView.this.D.c();
                }
                MediaViewPlayerView.this.f16367e = true;
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaViewPlayerView.this.onClickPlayButton();
        }
    }

    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MediaViewPlayerView.this.f16383u.setVisibility(0);
            MediaViewPlayerView.this.p();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.c();
                MediaViewPlayerView.this.f();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    public class f implements com.mbridge.msdk.foundation.same.image.c {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MediaViewPlayerView.this.f16381s == null || bitmap == null) {
                return;
            }
            MediaViewPlayerView.this.f16381s.setImageUrl(str);
            MediaViewPlayerView.this.f16381s.setImageBitmap(bitmap);
        }
    }

    public class g extends TimerTask {
        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                MediaViewPlayerView.this.gonePauseView();
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage(), th);
            }
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private MediaViewPlayerView f16396a;

        public h(MediaViewPlayerView mediaViewPlayerView) {
            this.f16396a = mediaViewPlayerView;
        }

        public void a() {
            try {
                MediaViewPlayerView mediaViewPlayerView = this.f16396a;
                if (mediaViewPlayerView == null || mediaViewPlayerView.f16372j) {
                    return;
                }
                q0.c("MediaViewPlayerView", "play end and display endcardView");
                this.f16396a.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }
    }

    public class i implements TextureView.SurfaceTextureListener {
        private i() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            try {
                MediaViewPlayerView.this.f16379q = new Surface(surfaceTexture);
                MediaViewPlayerView.this.f16369g = true;
                MediaViewPlayerView.this.f16371i = true;
                if (MediaViewPlayerView.this.f16366d) {
                    if (MediaViewPlayerView.this.f16370h) {
                        MediaViewPlayerView.this.f16365c = false;
                        MediaViewPlayerView.this.f16370h = false;
                    }
                    if (!MediaViewPlayerView.this.isComplete() && !MediaViewPlayerView.this.f16367e) {
                        MediaViewPlayerView.this.startOrPlayVideo();
                        return;
                    }
                    MediaViewPlayerView.this.m();
                    return;
                }
                if (MediaViewPlayerView.this.f16364b) {
                    if (MediaViewPlayerView.this.hasPrepare() && MediaViewPlayerView.this.isComplete()) {
                        MediaViewPlayerView.this.m();
                        return;
                    }
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                if (MediaViewPlayerView.this.hasPrepare() && !MediaViewPlayerView.this.isComplete()) {
                    MediaViewPlayerView.this.startOrPlayVideo();
                    return;
                }
                MediaViewPlayerView.this.m();
            } catch (Exception e10) {
                q0.b("MediaViewPlayerView", e10.getMessage());
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                if (MediaViewPlayerView.this.G != null && MediaViewPlayerView.this.G.isPlayIng()) {
                    MediaViewPlayerView.this.pause();
                }
                MediaViewPlayerView.this.f16365c = true;
                MediaViewPlayerView.this.f16369g = false;
            } catch (Throwable th) {
                q0.b("MediaViewPlayerView", th.getMessage());
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            q0.c("MediaViewPlayerView", "onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public /* synthetic */ i(MediaViewPlayerView mediaViewPlayerView, a aVar) {
            this();
        }
    }

    public MediaViewPlayerView(Context context) {
        super(context);
        this.f16363a = false;
        this.f16364b = false;
        this.f16365c = false;
        this.f16366d = false;
        this.f16367e = false;
        this.f16368f = false;
        this.f16369g = false;
        this.f16370h = true;
        this.f16371i = false;
        this.f16372j = true;
        this.f16373k = false;
        this.f16374l = -1;
        this.f16375m = true;
        this.f16376n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }

    private String getPlayUrl() {
        CampaignEx campaignEx;
        String str;
        try {
            campaignEx = this.C;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
        if (campaignEx == null) {
            return null;
        }
        try {
            if (this.F == null) {
                if (campaignEx.getAdType() == 287 || this.C.getAdType() == 94) {
                    str = this.C.getRequestId() + this.C.getId() + this.C.getVideoUrlEncode();
                } else {
                    str = this.C.getId() + this.C.getVideoUrlEncode() + this.C.getBidToken();
                }
                this.F = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.A, str);
            }
        } catch (Exception e11) {
            q0.b("MediaViewPlayerView", e11.getMessage());
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.F;
        if (aVar != null && aVar.o() == 5) {
            String strP = this.F.p();
            if (new File(strP).exists()) {
                return strP;
            }
        }
        String videoUrlEncode = this.C.getVideoUrlEncode();
        if (a1.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    public void closeSound() {
        this.f16373k = false;
        try {
            if (this.G != null) {
                this.f16384v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_close", "drawable"));
                this.G.closeSound();
            }
            try {
                com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.J;
                if (aVar != null) {
                    aVar.p(0.0f);
                }
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public boolean curIsFullScreen() {
        return this.f16366d;
    }

    public Campaign getCampaign() {
        return this.C;
    }

    public boolean getIsActiviePause() {
        return this.f16367e;
    }

    public void gonePauseView() {
        Handler handler = L;
        if (handler != null) {
            handler.post(new e());
        }
    }

    public boolean halfLoadingViewisVisible() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.loadingViewIsVisible();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean hasPrepare() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.hasPrepare();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean initPlayerViewData(String str, CampaignEx campaignEx, boolean z10, VideoPlayerStatusListener videoPlayerStatusListener, com.mbridge.msdk.videocommon.download.a aVar, String str2) {
        try {
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
            this.f16363a = false;
        }
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return false;
        }
        this.B = str;
        this.f16364b = z10;
        this.C = campaignEx;
        this.F = aVar;
        this.A = str2;
        this.G.initParameter(campaignEx.getVideoUrlEncode(), true, this.f16372j, this.f16381s, videoPlayerStatusListener);
        h();
        this.f16363a = true;
        return true;
    }

    public boolean isComplete() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isComplete();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlaying() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                return videoNativePlayer.isPlaying();
            }
            return false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
            return false;
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    public void onClickPlayButton() {
        com.mbridge.msdk.nativex.listener.a aVar;
        try {
            e();
            f();
            setIsComplete(false);
            if (this.f16368f) {
                this.G.play();
            } else if (!hasPrepare() || this.f16365c) {
                q0.c("MediaViewPlayerView", "点击播放 playVideo()");
                this.G.replaySameSource(getContext(), this.B, this.f16379q);
            } else {
                q0.c("MediaViewPlayerView", "startOrPlayVideo() hasPrepare():" + hasPrepare() + " mIsNeedToRepeatPrepare:" + this.f16365c);
                startOrPlayVideo();
            }
            if (this.f16367e && (aVar = this.D) != null) {
                aVar.d();
            }
            this.f16367e = false;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void onClickPlayerView() {
        ImageView imageView;
        try {
            MyImageView myImageView = this.f16381s;
            if ((myImageView == null || myImageView.getVisibility() != 0) && isPlaying() && (imageView = this.f16383u) != null) {
                if (imageView.getVisibility() == 0) {
                    gonePauseView();
                    a();
                    return;
                }
                AlphaAnimation alphaAnimation = this.f16388z;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                this.f16388z = alphaAnimation2;
                alphaAnimation2.setDuration(300L);
                this.f16388z.setInterpolator(new DecelerateInterpolator());
                this.f16388z.setAnimationListener(new d());
                n();
                this.f16386x.startAnimation(this.f16388z);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        if (this.D != null && !TextUtils.isEmpty(this.B)) {
            this.D.a(this.B);
        }
        h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            return;
        }
        try {
            if (this.f16372j) {
                return;
            }
            this.f16365c = true;
            m();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            this.f16365c = true;
            m();
            if (this.K) {
                return;
            }
            this.G.play(getContext(), this.B, this.f16379q);
            this.K = true;
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        try {
            e();
            l();
            this.f16367e = false;
            this.f16365c = false;
            this.f16374l = i10;
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
        a(i10, i11);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        try {
            this.f16365c = true;
            b();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        if (this.D == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.b(this.B);
    }

    public void openSound() {
        this.f16373k = true;
        try {
            if (this.G != null) {
                this.f16384v.setImageResource(i0.a(getContext(), "mbridge_nativex_sound_open", "drawable"));
                this.G.openSound();
            }
            try {
                com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.J;
                if (aVar != null) {
                    aVar.p(1.0f);
                }
            } catch (IllegalArgumentException e10) {
                q0.a("OMSDK", e10.getMessage());
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void pause() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.pause();
                this.f16368f = true;
            }
            if (this.J != null) {
                q0.b("omsdk", "mediaviewplayerview pause");
                this.J.j();
            }
            d();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void playVideo() {
        com.iab.omid.library.mmadbridge.adsession.media.a aVar;
        try {
            if (this.f16363a && this.G != null) {
                if (!this.f16369g) {
                    m();
                    return;
                }
                if ((!TextUtils.isEmpty(this.B) && this.B.startsWith("http")) || this.B.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                    this.B = getPlayUrl();
                }
                e();
                this.G.play(getContext(), this.B, this.f16379q);
                if ((this.f16368f || this.f16367e) && (aVar = this.J) != null) {
                    this.f16368f = false;
                    aVar.l();
                }
                if (this.f16373k) {
                    this.G.openSound();
                } else {
                    this.G.closeSound();
                }
                this.f16365c = false;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void registerView(o5.b bVar) {
        this.I = bVar;
        if (bVar != null) {
            bVar.d(this);
            LinearLayout linearLayout = this.f16378p;
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            bVar.a(linearLayout, friendlyObstructionPurpose, null);
            bVar.a(this.f16380r, friendlyObstructionPurpose, null);
            MyImageView myImageView = this.f16381s;
            FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.VIDEO_CONTROLS;
            bVar.a(myImageView, friendlyObstructionPurpose2, null);
            bVar.a(this.f16382t, friendlyObstructionPurpose2, null);
            bVar.a(this.f16383u, friendlyObstructionPurpose2, null);
            bVar.a(this.f16384v, friendlyObstructionPurpose, null);
        }
    }

    public void release() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.releasePlayer();
                this.G = null;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f16372j = z10;
    }

    public void setEnterFullScreen() {
        try {
            q0.c("MediaViewPlayerView", "setEnterFullScreen");
            this.f16366d = true;
            this.f16370h = true;
            this.f16384v.setVisibility(0);
            d();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setExitFullScreen() {
        try {
            this.f16366d = false;
            this.f16365c = false;
            this.f16384v.setVisibility(8);
            l();
            e();
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    public void setIsActivePause(boolean z10) {
        this.f16367e = z10;
    }

    public void setIsComplete(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsComplete(z10);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setIsFrontDesk(boolean z10) {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.setIsFrontDesk(z10);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    public void setMediaViewPlayListener(h hVar) {
        this.H = hVar;
    }

    public void setOnMediaViewPlayerViewListener(com.mbridge.msdk.nativex.listener.a aVar) {
        this.D = aVar;
    }

    public void setVideoEvents(com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
        this.J = aVar;
    }

    public void showPlayView() {
        this.f16382t.setVisibility(0);
    }

    public void showProgressView(boolean z10) {
        this.f16376n = z10;
        ProgressBar progressBar = this.f16380r;
        if (progressBar != null) {
            progressBar.setVisibility(z10 ? 0 : 4);
        }
    }

    public void showSoundIndicator(boolean z10) {
        this.f16375m = z10;
        if (z10) {
            l();
        } else {
            d();
        }
    }

    public void startOrPlayVideo() {
        try {
            if (!this.f16369g) {
                m();
            } else if (hasPrepare()) {
                o();
            } else {
                playVideo();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            VideoNativePlayer videoNativePlayer = this.G;
            if (videoNativePlayer != null) {
                videoNativePlayer.stop();
            }
            d();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public void unregisterView() {
        o5.b bVar = this.I;
        if (bVar != null) {
            bVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f16382t.getVisibility() != 0) {
            this.f16386x.setVisibility(8);
        }
    }

    private void g() {
        try {
            j();
            i();
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    private void h() {
        try {
            CampaignEx campaignEx = this.C;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (!a1.a(imageUrl) && getContext() != null) {
                if (!com.mbridge.msdk.foundation.same.image.b.a(getContext()).c(imageUrl)) {
                    com.mbridge.msdk.foundation.same.image.b.a(getContext()).a(imageUrl, new f());
                    return;
                }
                Bitmap bitmapB = com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(imageUrl);
                MyImageView myImageView = this.f16381s;
                if (myImageView == null || bitmapB == null) {
                    return;
                }
                myImageView.setImageUrl(imageUrl);
                this.f16381s.setImageBitmap(bitmapB);
                this.f16381s.setVisibility(0);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void i() {
        VideoNativePlayer videoNativePlayer = new VideoNativePlayer();
        this.G = videoNativePlayer;
        videoNativePlayer.setSelfVideoFeedsPlayerListener(this);
    }

    private void j() {
        try {
            a aVar = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_playerview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            if (viewInflate != null) {
                this.f16378p = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_ll_loading", "id"));
                TextureView textureView = (TextureView) viewInflate.findViewById(i0.a(getContext(), "mbridge_textureview", "id"));
                this.f16377o = textureView;
                textureView.setKeepScreenOn(true);
                this.f16377o.setSurfaceTextureListener(new i(this, aVar));
                this.f16380r = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_progress", "id"));
                this.f16381s = (MyImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_playend_pic", "id"));
                this.f16382t = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_play", "id"));
                this.f16383u = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_pause", "id"));
                this.f16384v = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound", "id"));
                this.f16386x = viewInflate.findViewById(i0.a(getContext(), "mbridge_view_cover", "id"));
                ImageView imageView = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_iv_sound_animation", "id"));
                this.f16385w = imageView;
                AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
                this.f16387y = animationDrawable;
                animationDrawable.start();
                k();
                addView(viewInflate, -1, -1);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void k() {
        this.f16384v.setOnClickListener(new a());
        this.f16383u.setOnClickListener(new b());
        this.f16382t.setOnClickListener(new c());
    }

    private void l() {
        ImageView imageView;
        if (this.f16366d || (imageView = this.f16385w) == null || imageView.getVisibility() == 0 || !this.f16375m) {
            return;
        }
        this.f16385w.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            this.f16381s.setVisibility(0);
            this.f16382t.setVisibility(0);
            n();
            c();
            this.f16380r.setVisibility(8);
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f16386x.setVisibility(0);
    }

    private void o() {
        com.iab.omid.library.mmadbridge.adsession.media.a aVar;
        try {
            if (this.G == null) {
                return;
            }
            e();
            if (this.f16371i) {
                this.G.start(this.f16379q);
                this.f16371i = false;
            } else {
                this.G.start();
            }
            if ((this.f16368f || this.f16367e) && (aVar = this.J) != null) {
                this.f16368f = false;
                aVar.l();
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        a();
        this.E = new Timer();
        this.E.schedule(new g(), 2000L);
    }

    private void b() {
        try {
            if (URLUtil.isNetworkUrl(this.B)) {
                return;
            }
            String videoUrlEncode = this.C.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                this.B = videoUrlEncode;
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f16383u.setVisibility(8);
    }

    private void d() {
        if (this.f16385w.getVisibility() == 0) {
            this.f16385w.setVisibility(8);
        }
    }

    private void e() {
        try {
            this.f16381s.setVisibility(8);
            this.f16382t.setVisibility(8);
            f();
            showProgressView(this.f16376n);
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void a(int i10, int i11) {
        try {
            ProgressBar progressBar = this.f16380r;
            if (progressBar == null || progressBar.getVisibility() != 0) {
                return;
            }
            if (i11 > 0) {
                this.f16380r.setMax(i11);
            }
            if (i10 >= 0) {
                this.f16380r.setProgress(i10 + 1);
            }
        } catch (Throwable th) {
            q0.b("MediaViewPlayerView", th.getMessage());
        }
    }

    private void a() {
        try {
            Handler handler = L;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            q0.b("MediaViewPlayerView", e10.getMessage());
        }
    }

    public MediaViewPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16363a = false;
        this.f16364b = false;
        this.f16365c = false;
        this.f16366d = false;
        this.f16367e = false;
        this.f16368f = false;
        this.f16369g = false;
        this.f16370h = true;
        this.f16371i = false;
        this.f16372j = true;
        this.f16373k = false;
        this.f16374l = -1;
        this.f16375m = true;
        this.f16376n = true;
        this.I = null;
        this.J = null;
        this.K = false;
        g();
    }
}
