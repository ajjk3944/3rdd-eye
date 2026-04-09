package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.gms.internal.ads.e0;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class CusPlayerView extends ComponentLinearLayout {
    public static final String TAG = "PlayerView";

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.b f13838a;

    /* renamed from: b, reason: collision with root package name */
    private String f13839b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13840c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13841d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13842e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13843f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceHolder f13844g;

    /* renamed from: h, reason: collision with root package name */
    protected float f13845h;

    /* renamed from: i, reason: collision with root package name */
    protected float f13846i;

    /* renamed from: j, reason: collision with root package name */
    protected int f13847j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13848k;

    /* renamed from: l, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.adsession.media.a f13849l;

    /* renamed from: m, reason: collision with root package name */
    private String f13850m;

    /* renamed from: n, reason: collision with root package name */
    private AudioManager f13851n;

    /* renamed from: o, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f13852o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13853p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13854q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13855r;

    public class a implements AudioManager.OnAudioFocusChangeListener {
        public a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            CusPlayerView.this.a(i10);
        }
    }

    public class b implements SurfaceHolder.Callback {
        private b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            try {
                q0.c("PlayerView", "surfaceChanged");
                if (CusPlayerView.this.f13838a != null && surfaceHolder != null && CusPlayerView.this.f13844g != surfaceHolder) {
                    CusPlayerView.this.f13844g = surfaceHolder;
                    CusPlayerView.this.f13838a.a(surfaceHolder);
                }
                CusPlayerView.this.f13841d = false;
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceCreated");
                if (CusPlayerView.this.f13838a == null || surfaceHolder == null) {
                    return;
                }
                CusPlayerView.this.f13844g = surfaceHolder;
                CusPlayerView.this.f13838a.a(surfaceHolder);
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            try {
                q0.c("PlayerView", "surfaceDestroyed ");
                CusPlayerView.this.f13841d = true;
                CusPlayerView.this.f13843f = true;
                CusPlayerView.this.f13838a.m();
                CusPlayerView.this.pauseOmsdk();
            } catch (Exception e10) {
                q0.b("PlayerView", e10.getMessage());
            }
        }

        public /* synthetic */ b(CusPlayerView cusPlayerView, a aVar) {
            this();
        }
    }

    public CusPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13840c = false;
        this.f13841d = false;
        this.f13842e = false;
        this.f13843f = false;
        this.f13847j = 1;
        this.f13848k = false;
        this.f13850m = "";
        this.f13853p = false;
        this.f13854q = false;
        this.f13855r = true;
        b();
    }

    private void c() {
        try {
            this.f13851n = (AudioManager) getContext().getSystemService("audio");
            this.f13852o = new a();
            q0.c("PlayerView", "AudioManager initialized");
        } catch (Exception e10) {
            q0.b("PlayerView", "Failed to initialize AudioManager: " + e10.getMessage());
        }
    }

    private void d() {
        SurfaceView surfaceView = new SurfaceView(getContext().getApplicationContext());
        SurfaceHolder holder = surfaceView.getHolder();
        this.f13844g = holder;
        holder.setKeepScreenOn(true);
        this.f13844g.addCallback(new b(this, null));
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = new com.mbridge.msdk.config.dynamic.baseview.video.b();
        this.f13838a = bVar;
        bVar.a(getContext(), this.f13844g);
        addView(surfaceView, -1, -1);
    }

    private boolean e() {
        int i10;
        try {
            if (this.f13851n == null) {
                q0.b("PlayerView", "AudioManager is null, cannot request audio focus");
                return false;
            }
            boolean z10 = true;
            if (this.f13854q) {
                q0.c("PlayerView", "Requesting audio focus with mix mode (AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)");
                i10 = 3;
            } else {
                q0.c("PlayerView", "Requesting audio focus without mix mode (AUDIOFOCUS_GAIN)");
                i10 = 1;
            }
            if (this.f13851n.requestAudioFocus(this.f13852o, 3, i10) != 1) {
                z10 = false;
            }
            this.f13853p = z10;
            return z10;
        } catch (Exception e10) {
            q0.b("PlayerView", "Error requesting audio focus: " + e10.getMessage());
            return false;
        }
    }

    public void closeSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.j();
        }
    }

    public void coverUnlockResume() {
        try {
            if (this.f13838a != null) {
                q0.c("PlayerView", "coverUnlockResume========");
                if (this.f13838a.f() && !this.f13843f) {
                    start(true);
                    return;
                }
                playVideo(0);
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public int getCurPosition() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar;
        try {
            bVar = this.f13838a;
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
        long jC = bVar != null ? bVar.c() : 0L;
        return e0.a(jC);
    }

    public int getDuration() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            return bVar.d();
        }
        return 0;
    }

    public String getSelfTag() {
        return this.f13850m;
    }

    public com.iab.omid.library.mmadbridge.adsession.media.a getVideoEvents() {
        return this.f13849l;
    }

    public float getVolume() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0.0f;
    }

    public void initBufferIngParam(int i10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.b(i10);
        }
    }

    public boolean initVFPData(String str, String str2, com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.c("PlayerView", "playUrl==null");
            return false;
        }
        this.f13839b = str;
        this.f13838a.a(aVar);
        this.f13838a.c(this.f13839b);
        this.f13840c = true;
        return true;
    }

    public boolean isComplete() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                if (bVar.g()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public boolean isMixWithOtherAudio() {
        return this.f13854q;
    }

    public boolean isPlayIng() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                return bVar.h();
            }
            return false;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
            return false;
        }
    }

    public boolean isPlayWithoutAudioFocus() {
        return this.f13855r;
    }

    public boolean isSilent() {
        return this.f13838a.i();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f13845h = motionEvent.getRawX();
        this.f13846i = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onPause() {
        try {
            pause();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void onResume() {
        try {
            if (this.f13838a == null || this.f13841d || isComplete() || this.f13842e) {
                return;
            }
            q0.c("PlayerView", "onresume========");
            if (this.f13838a.f()) {
                resumeStart();
            } else {
                playVideo(0);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void openSound() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.t();
        }
    }

    public void pause() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                bVar.m();
            }
            pauseOmsdk();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void pauseOmsdk() {
        try {
            if (this.f13849l == null || this.f13848k) {
                return;
            }
            q0.a("omsdk", "play view:  pause");
            this.f13848k = true;
            this.f13849l.j();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean playVideo(int i10) {
        try {
            if (this.f13838a == null) {
                q0.c("PlayerView", "player init error 播放失败");
                return false;
            }
            if (!this.f13840c) {
                q0.c("PlayerView", "vfp init failed 播放失败");
                return false;
            }
            if (e()) {
                this.f13838a.t();
            } else {
                q0.d("PlayerView", "Audio focus request denied");
                if (this.f13855r) {
                    q0.c("PlayerView", "Continuing playback without audio");
                    this.f13838a.j();
                }
            }
            this.f13838a.a(i10);
            this.f13843f = false;
            return true;
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage(), th);
            return false;
        }
    }

    public void prepare() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                bVar.o();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void release() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                bVar.p();
            }
            if (this.f13849l != null) {
                this.f13849l = null;
            }
            a();
            if (this.f13844g != null) {
                q0.b("PlayerView", "mSurfaceHolder release");
                this.f13844g.getSurface().release();
            }
        } catch (Throwable th) {
            q0.b("PlayerView", th.getMessage());
        }
    }

    public void resumeOMSDK() {
        try {
            com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.f13849l;
            if (aVar != null) {
                this.f13848k = false;
                aVar.l();
                q0.a("omsdk", "play view:  resume");
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public void resumeStart() {
        try {
            if (e()) {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
                if (bVar != null) {
                    bVar.t();
                }
            } else {
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f13838a;
                if (bVar2 != null) {
                    bVar2.j();
                }
            }
            start(true);
            resumeOMSDK();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekTo(int i10) {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                bVar.a(i10);
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void seekToEndFrame() {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.q();
        }
    }

    public void setIsCovered(boolean z10) {
        try {
            this.f13842e = z10;
            q0.b("PlayerView", "mIsCovered:" + z10);
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void setMixWithOtherAudio(int i10) {
        this.f13854q = i10 == 1;
    }

    public void setPlayWithoutAudioFocus(boolean z10) {
        this.f13855r = z10;
        q0.c("PlayerView", "setPlayWithoutAudioFocus: " + z10);
    }

    public void setPlaybackParams(float f10) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.a(f10);
        }
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13850m = SameMD5.getMD5(str);
    }

    public void setVideoEvents(com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
        this.f13849l = aVar;
    }

    public void setVolume(float f10, float f11) {
        com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
        if (bVar != null) {
            bVar.a(f10, f11);
        }
    }

    public void start(boolean z10) {
        try {
            if (this.f13838a != null) {
                if (z10) {
                    if (e()) {
                        this.f13838a.t();
                    } else {
                        this.f13838a.j();
                    }
                }
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
                if (bVar == null || this.f13842e) {
                    return;
                }
                bVar.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    public void stop() {
        try {
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
            if (bVar != null) {
                bVar.s();
            }
            if (this.f13849l != null) {
                this.f13849l = null;
            }
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    private void b() {
        try {
            d();
            c();
        } catch (Exception e10) {
            q0.b("PlayerView", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        try {
            if (i10 == -3) {
                q0.c("PlayerView", "Audio focus lost transient can duck");
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar = this.f13838a;
                if (bVar != null) {
                    bVar.a(0.3f, 0.3f);
                    return;
                }
                return;
            }
            if (i10 == -2) {
                q0.c("PlayerView", "Audio focus lost transient");
                this.f13853p = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar2 = this.f13838a;
                if (bVar2 == null || !bVar2.h()) {
                    return;
                }
                this.f13838a.m();
                return;
            }
            if (i10 == -1) {
                q0.c("PlayerView", "Audio focus lost");
                this.f13853p = false;
                com.mbridge.msdk.config.dynamic.baseview.video.b bVar3 = this.f13838a;
                if (bVar3 == null || !bVar3.h()) {
                    return;
                }
                this.f13838a.m();
                return;
            }
            if (i10 != 1) {
                return;
            }
            q0.c("PlayerView", "Audio focus gained");
            this.f13853p = true;
            com.mbridge.msdk.config.dynamic.baseview.video.b bVar4 = this.f13838a;
            if (bVar4 != null) {
                bVar4.a(1.0f, 1.0f);
                if (this.f13838a.h()) {
                    return;
                }
                this.f13838a.n();
            }
        } catch (Exception e10) {
            q0.b("PlayerView", "Error handling audio focus change: " + e10.getMessage());
        }
    }

    public boolean playVideo() {
        return playVideo(0);
    }

    private void a() {
        try {
            AudioManager audioManager = this.f13851n;
            if (audioManager == null || !this.f13853p) {
                return;
            }
            int iAbandonAudioFocus = audioManager.abandonAudioFocus(this.f13852o);
            this.f13853p = false;
            q0.c("PlayerView", "Audio focus abandoned, result: " + iAbandonAudioFocus);
        } catch (Exception e10) {
            q0.b("PlayerView", "Error abandoning audio focus: " + e10.getMessage());
        }
    }
}
