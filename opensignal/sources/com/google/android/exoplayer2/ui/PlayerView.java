package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.f1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int W = 0;
    public final SubtitleView B;
    public final View D;
    public final TextView E;
    public final k F;
    public final FrameLayout G;
    public final FrameLayout H;
    public g1 I;
    public boolean J;
    public j K;
    public boolean L;
    public Drawable M;
    public int N;
    public boolean O;
    public CharSequence P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;

    /* renamed from: a, reason: collision with root package name */
    public final ComponentListener f4605a;

    /* renamed from: d, reason: collision with root package name */
    public final AspectRatioFrameLayout f4606d;

    /* renamed from: g, reason: collision with root package name */
    public final View f4607g;

    /* renamed from: r, reason: collision with root package name */
    public final View f4608r;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4609x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f4610y;

    public final class ComponentListener implements Player$Listener, View.OnLayoutChangeListener, View.OnClickListener, j {
        private Object lastPeriodUidWithTracks;
        private final u1 period = new u1();

        public ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView playerView = PlayerView.this;
            int i10 = PlayerView.W;
            playerView.g();
        }

        @Override // com.google.android.exoplayer2.Player$Listener, eb.k
        public void onCues(List<eb.b> list) {
            SubtitleView subtitleView = PlayerView.this.B;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.a((TextureView) view, PlayerView.this.U);
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.W;
            playerView.i();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.b() || !playerView2.S) {
                playerView2.c(false);
                return;
            }
            k kVar = playerView2.F;
            if (kVar != null) {
                kVar.c();
            }
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPlaybackStateChanged(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.W;
            playerView.i();
            PlayerView.this.k();
            PlayerView playerView2 = PlayerView.this;
            if (!playerView2.b() || !playerView2.S) {
                playerView2.c(false);
                return;
            }
            k kVar = playerView2.F;
            if (kVar != null) {
                kVar.c();
            }
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        public void onRenderedFirstFrame() {
            View view = PlayerView.this.f4607g;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        @Deprecated
        public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onTracksChanged(TrackGroupArray trackGroupArray, ob.j jVar) {
            g1 g1Var = PlayerView.this.I;
            g1Var.getClass();
            w1 currentTimeline = g1Var.getCurrentTimeline();
            if (currentTimeline.p()) {
                this.lastPeriodUidWithTracks = null;
            } else if (g1Var.getCurrentTrackGroups().f4457a == 0) {
                Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int iB = currentTimeline.b(obj);
                    if (iB != -1) {
                        if (g1Var.getCurrentWindowIndex() == currentTimeline.f(iB, this.period, false).f4596c) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            } else {
                this.lastPeriodUidWithTracks = currentTimeline.f(g1Var.getCurrentPeriodIndex(), this.period, true).f4595b;
            }
            PlayerView.this.l(false);
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        @Deprecated
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        }

        @Override // com.google.android.exoplayer2.ui.j
        public void onVisibilityChange(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.W;
            playerView.j();
        }

        @Override // com.google.android.exoplayer2.Player$Listener, com.google.android.exoplayer2.d1
        public void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
            k kVar;
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.W;
            if (playerView.b()) {
                PlayerView playerView2 = PlayerView.this;
                if (!playerView2.S || (kVar = playerView2.F) == null) {
                    return;
                }
                kVar.c();
            }
        }

        @Override // com.google.android.exoplayer2.Player$Listener, rb.r
        public void onVideoSizeChanged(rb.v vVar) {
            PlayerView playerView = PlayerView.this;
            int i10 = PlayerView.W;
            playerView.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        super(context, attributeSet, 0);
        ComponentListener componentListener = new ComponentListener();
        this.f4605a = componentListener;
        if (isInEditMode()) {
            this.f4606d = null;
            this.f4607g = null;
            this.f4608r = null;
            this.f4609x = false;
            this.f4610y = null;
            this.B = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            ImageView imageView = new ImageView(context);
            if (qb.v.f20828a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(o.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(n.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(o.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(n.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i18 = r.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.PlayerView, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(t.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(t.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(t.PlayerView_player_layout_id, i18);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(t.PlayerView_default_artwork, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_use_controller, true);
                int i19 = typedArrayObtainStyledAttributes.getInt(t.PlayerView_surface_type, 1);
                int i20 = typedArrayObtainStyledAttributes.getInt(t.PlayerView_resize_mode, 0);
                int i21 = typedArrayObtainStyledAttributes.getInt(t.PlayerView_show_timeout, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_hide_on_touch, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(t.PlayerView_show_buffering, 0);
                this.O = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_keep_content_on_player_reset, this.O);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                z10 = true;
                i14 = i20;
                z11 = z20;
                z12 = z21;
                i11 = i21;
                z16 = zHasValue;
                i12 = i19;
                z13 = z22;
                i13 = integer;
                z15 = z19;
                i10 = resourceId;
                i16 = resourceId2;
                z14 = z18;
                i15 = color;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            i10 = i18;
            i11 = 5000;
            z11 = true;
            z12 = true;
            z13 = true;
            i12 = 1;
            z14 = true;
            z15 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            z16 = false;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(p.exo_content_frame);
        this.f4606d = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i14);
        }
        View viewFindViewById = findViewById(p.exo_shutter);
        this.f4607g = viewFindViewById;
        if (viewFindViewById != null && z16) {
            viewFindViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout == null || i12 == 0) {
            i17 = 0;
            this.f4608r = null;
            z17 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 == 2) {
                this.f4608r = new TextureView(context);
            } else if (i12 == 3) {
                try {
                    int i22 = sb.l.H;
                    this.f4608r = (View) sb.l.class.getConstructor(Context.class).newInstance(context);
                    z17 = z10;
                    this.f4608r.setLayoutParams(layoutParams);
                    this.f4608r.setOnClickListener(componentListener);
                    i17 = 0;
                    this.f4608r.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f4608r, 0);
                } catch (Exception e4) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e4);
                }
            } else if (i12 != 4) {
                this.f4608r = new SurfaceView(context);
            } else {
                try {
                    int i23 = rb.i.f21490d;
                    this.f4608r = (View) rb.i.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            z17 = false;
            this.f4608r.setLayoutParams(layoutParams);
            this.f4608r.setOnClickListener(componentListener);
            i17 = 0;
            this.f4608r.setClickable(false);
            aspectRatioFrameLayout.addView(this.f4608r, 0);
        }
        this.f4609x = z17;
        this.G = (FrameLayout) findViewById(p.exo_ad_overlay);
        this.H = (FrameLayout) findViewById(p.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(p.exo_artwork);
        this.f4610y = imageView2;
        this.L = (!z14 || imageView2 == null) ? i17 : z10;
        if (i16 != 0) {
            this.M = getContext().getDrawable(i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(p.exo_subtitles);
        this.B = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(p.exo_buffering);
        this.D = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.N = i13;
        TextView textView = (TextView) findViewById(p.exo_error_message);
        this.E = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        k kVar = (k) findViewById(p.exo_controller);
        View viewFindViewById3 = findViewById(p.exo_controller_placeholder);
        if (kVar != null) {
            this.F = kVar;
        } else if (viewFindViewById3 != null) {
            k kVar2 = new k(context, attributeSet);
            this.F = kVar2;
            kVar2.setId(p.exo_controller);
            kVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(kVar2, iIndexOfChild);
        } else {
            this.F = null;
        }
        k kVar3 = this.F;
        this.Q = kVar3 != null ? i11 : i17;
        this.T = z11;
        this.R = z12;
        this.S = z13;
        this.J = (!z15 || kVar3 == null) ? i17 : z10;
        if (kVar3 != null) {
            kVar3.c();
        }
        j();
        k kVar4 = this.F;
        if (kVar4 != null) {
            kVar4.f4670d.add(componentListener);
        }
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        g1 g1Var = this.I;
        return g1Var != null && g1Var.isPlayingAd() && this.I.getPlayWhenReady();
    }

    public final void c(boolean z10) {
        if (!(b() && this.S) && m()) {
            k kVar = this.F;
            boolean z11 = kVar.e() && kVar.getShowTimeoutMs() <= 0;
            boolean zE = e();
            if (z10 || z11 || zE) {
                f(zE);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f4606d;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                ImageView imageView = this.f4610y;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        g1 g1Var = this.I;
        if (g1Var != null && g1Var.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        k kVar = this.F;
        if (z10 && m() && !kVar.e()) {
            c(true);
            return true;
        }
        if ((m() && kVar.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            c(true);
            return true;
        }
        if (z10 && m()) {
            c(true);
        }
        return false;
    }

    public final boolean e() {
        g1 g1Var = this.I;
        if (g1Var == null) {
            return true;
        }
        int playbackState = g1Var.getPlaybackState();
        if (this.R) {
            return playbackState == 1 || playbackState == 4 || !this.I.getPlayWhenReady();
        }
        return false;
    }

    public final void f(boolean z10) {
        if (m()) {
            int i10 = z10 ? 0 : this.Q;
            k kVar = this.F;
            kVar.setShowTimeoutMs(i10);
            View view = kVar.f4695y;
            View view2 = kVar.f4693x;
            if (!kVar.e()) {
                kVar.setVisibility(0);
                Iterator it = kVar.f4670d.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).onVisibilityChange(kVar.getVisibility());
                }
                kVar.i();
                kVar.h();
                kVar.k();
                kVar.l();
                kVar.m();
                boolean zF = kVar.f();
                if (!zF && view2 != null) {
                    view2.requestFocus();
                } else if (zF && view != null) {
                    view.requestFocus();
                }
                boolean zF2 = kVar.f();
                if (!zF2 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                } else if (zF2 && view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            kVar.d();
        }
    }

    public final boolean g() {
        if (!m() || this.I == null) {
            return false;
        }
        k kVar = this.F;
        if (!kVar.e()) {
            c(true);
        } else if (this.T) {
            kVar.c();
        }
        return true;
    }

    public List<a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            arrayList.add(new a(frameLayout));
        }
        k kVar = this.F;
        if (kVar != null) {
            arrayList.add(new a(kVar));
        }
        return oe.h0.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.G;
        qb.b.l(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.R;
    }

    public boolean getControllerHideOnTouch() {
        return this.T;
    }

    public int getControllerShowTimeoutMs() {
        return this.Q;
    }

    public Drawable getDefaultArtwork() {
        return this.M;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.H;
    }

    public g1 getPlayer() {
        return this.I;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4606d;
        qb.b.k(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.B;
    }

    public boolean getUseArtwork() {
        return this.L;
    }

    public boolean getUseController() {
        return this.J;
    }

    public View getVideoSurfaceView() {
        return this.f4608r;
    }

    public final void h() {
        g1 g1Var = this.I;
        rb.v videoSize = g1Var != null ? g1Var.getVideoSize() : rb.v.f21523e;
        int i10 = videoSize.f21524a;
        int i11 = videoSize.f21525b;
        int i12 = videoSize.f21526c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.f21527d) / i11;
        View view = this.f4608r;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            int i13 = this.U;
            ComponentListener componentListener = this.f4605a;
            if (i13 != 0) {
                view.removeOnLayoutChangeListener(componentListener);
            }
            this.U = i12;
            if (i12 != 0) {
                view.addOnLayoutChangeListener(componentListener);
            }
            a((TextureView) view, this.U);
        }
        float f11 = this.f4609x ? 0.0f : f10;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4606d;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.D
            if (r0 == 0) goto L29
            com.google.android.exoplayer2.g1 r1 = r5.I
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.getPlaybackState()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.N
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            com.google.android.exoplayer2.g1 r1 = r5.I
            boolean r1 = r1.getPlayWhenReady()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.i():void");
    }

    public final void j() {
        k kVar = this.F;
        if (kVar == null || !this.J) {
            setContentDescription(null);
        } else if (kVar.getVisibility() == 0) {
            setContentDescription(this.T ? getResources().getString(s.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(s.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.E;
        if (textView != null) {
            CharSequence charSequence = this.P;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                g1 g1Var = this.I;
                if (g1Var != null) {
                    g1Var.p0();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void l(boolean z10) {
        g1 g1Var = this.I;
        View view = this.f4607g;
        ImageView imageView = this.f4610y;
        if (g1Var == null || g1Var.getCurrentTrackGroups().f4457a == 0) {
            if (this.O) {
                return;
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        if (z10 && !this.O && view != null) {
            view.setVisibility(0);
        }
        ob.j currentTrackSelections = g1Var.getCurrentTrackSelections();
        for (int i10 = 0; i10 < currentTrackSelections.f19247a; i10++) {
            TrackSelection trackSelection = currentTrackSelections.f19248b[i10];
            if (trackSelection != null) {
                for (int i11 = 0; i11 < trackSelection.length(); i11++) {
                    if (qb.m.g(trackSelection.getFormat(i11).H) == 2) {
                        if (imageView != null) {
                            imageView.setImageResource(R.color.transparent);
                            imageView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.L) {
            qb.b.k(imageView);
            byte[] bArr = g1Var.getMediaMetadata().f4371f;
            if ((bArr != null ? d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length))) : false) || d(this.M)) {
                return;
            }
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            imageView.setVisibility(4);
        }
    }

    public final boolean m() {
        if (!this.J) {
            return false;
        }
        qb.b.k(this.F);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m() && this.I != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.V = true;
                return true;
            }
            if (action == 1 && this.V) {
                this.V = false;
                performClick();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.I == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(b bVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4606d;
        qb.b.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(com.google.android.exoplayer2.i iVar) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setControlDispatcher(iVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.R = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.S = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        qb.b.k(this.F);
        this.T = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i10) {
        k kVar = this.F;
        qb.b.k(kVar);
        this.Q = i10;
        if (kVar.e()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(j jVar) {
        k kVar = this.F;
        qb.b.k(kVar);
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f4670d;
        j jVar2 = this.K;
        if (jVar2 == jVar) {
            return;
        }
        if (jVar2 != null) {
            copyOnWriteArrayList.remove(jVar2);
        }
        this.K = jVar;
        if (jVar != null) {
            copyOnWriteArrayList.add(jVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        qb.b.j(this.E != null);
        this.P = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.M != drawable) {
            this.M = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(qb.e eVar) {
        if (eVar != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            l(false);
        }
    }

    public void setPlayer(g1 g1Var) {
        qb.b.j(Looper.myLooper() == Looper.getMainLooper());
        qb.b.g(g1Var == null || g1Var.getApplicationLooper() == Looper.getMainLooper());
        g1 g1Var2 = this.I;
        if (g1Var2 == g1Var) {
            return;
        }
        View view = this.f4608r;
        ComponentListener componentListener = this.f4605a;
        if (g1Var2 != null) {
            g1Var2.H(componentListener);
            if (((androidx.lifecycle.o) g1Var2).isCommandAvailable(26)) {
                if (view instanceof TextureView) {
                    g1Var2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    g1Var2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.B;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.I = g1Var;
        boolean zM = m();
        k kVar = this.F;
        if (zM) {
            kVar.setPlayer(g1Var);
        }
        i();
        k();
        l(true);
        if (g1Var == null) {
            if (kVar != null) {
                kVar.c();
                return;
            }
            return;
        }
        androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
        if (oVar.isCommandAvailable(26)) {
            if (view instanceof TextureView) {
                g1Var.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                g1Var.setVideoSurfaceView((SurfaceView) view);
            }
            h();
        }
        if (subtitleView != null && oVar.isCommandAvailable(27)) {
            subtitleView.setCues(g1Var.getCurrentCues());
        }
        g1Var.c0(componentListener);
        c(false);
    }

    public void setRepeatToggleModes(int i10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4606d;
        qb.b.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.N != i10) {
            this.N = i10;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        k kVar = this.F;
        qb.b.k(kVar);
        kVar.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f4607g;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        qb.b.j((z10 && this.f4610y == null) ? false : true);
        if (this.L != z10) {
            this.L = z10;
            l(false);
        }
    }

    public void setUseController(boolean z10) {
        k kVar = this.F;
        qb.b.j((z10 && kVar == null) ? false : true);
        if (this.J == z10) {
            return;
        }
        this.J = z10;
        if (m()) {
            kVar.setPlayer(this.I);
        } else if (kVar != null) {
            kVar.c();
            kVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f4608r;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
