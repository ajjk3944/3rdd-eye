package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.v1;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class k extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public final View B;
    public final View D;
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public final TextView H;
    public final TextView I;
    public final c0 J;
    public final StringBuilder K;
    public final Formatter L;
    public final u1 M;
    public final v1 N;
    public final f O;
    public final f P;
    public final Drawable Q;
    public final Drawable R;
    public final Drawable S;
    public final String T;
    public final String U;
    public final String V;
    public final Drawable W;

    /* renamed from: a, reason: collision with root package name */
    public final PlayerControlView$ComponentListener f4666a;

    /* renamed from: a0, reason: collision with root package name */
    public final Drawable f4667a0;

    /* renamed from: b0, reason: collision with root package name */
    public final float f4668b0;

    /* renamed from: c0, reason: collision with root package name */
    public final float f4669c0;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f4670d;

    /* renamed from: d0, reason: collision with root package name */
    public final String f4671d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f4672e0;

    /* renamed from: f0, reason: collision with root package name */
    public g1 f4673f0;

    /* renamed from: g, reason: collision with root package name */
    public final View f4674g;

    /* renamed from: g0, reason: collision with root package name */
    public com.google.android.exoplayer2.i f4675g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4676h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4677i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f4678j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f4679k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4680l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4681m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4682n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f4683o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f4684p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f4685q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f4686r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4687r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f4688s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f4689t0;

    /* renamed from: u0, reason: collision with root package name */
    public long[] f4690u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean[] f4691v0;

    /* renamed from: w0, reason: collision with root package name */
    public final long[] f4692w0;

    /* renamed from: x, reason: collision with root package name */
    public final View f4693x;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean[] f4694x0;

    /* renamed from: y, reason: collision with root package name */
    public final View f4695y;

    /* renamed from: y0, reason: collision with root package name */
    public long f4696y0;

    /* renamed from: z0, reason: collision with root package name */
    public long f4697z0;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.exoplayer2.ui.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.exoplayer2.ui.f] */
    public k(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        int resourceId = r.exo_player_control_view;
        this.f4680l0 = 5000;
        this.f4682n0 = 0;
        this.f4681m0 = 200;
        this.f4689t0 = -9223372036854775807L;
        this.f4683o0 = true;
        this.f4684p0 = true;
        this.f4685q0 = true;
        this.f4687r0 = true;
        this.f4688s0 = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t.PlayerControlView, 0, 0);
            try {
                this.f4680l0 = typedArrayObtainStyledAttributes.getInt(t.PlayerControlView_show_timeout, this.f4680l0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(t.PlayerControlView_controller_layout_id, resourceId);
                this.f4682n0 = typedArrayObtainStyledAttributes.getInt(t.PlayerControlView_repeat_toggle_modes, this.f4682n0);
                this.f4683o0 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerControlView_show_rewind_button, this.f4683o0);
                this.f4684p0 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerControlView_show_fastforward_button, this.f4684p0);
                this.f4685q0 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerControlView_show_previous_button, this.f4685q0);
                this.f4687r0 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerControlView_show_next_button, this.f4687r0);
                this.f4688s0 = typedArrayObtainStyledAttributes.getBoolean(t.PlayerControlView_show_shuffle_button, this.f4688s0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(t.PlayerControlView_time_bar_min_update_interval, this.f4681m0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f4670d = new CopyOnWriteArrayList();
        this.M = new u1();
        this.N = new v1();
        StringBuilder sb2 = new StringBuilder();
        this.K = sb2;
        this.L = new Formatter(sb2, Locale.getDefault());
        this.f4690u0 = new long[0];
        this.f4691v0 = new boolean[0];
        this.f4692w0 = new long[0];
        this.f4694x0 = new boolean[0];
        PlayerControlView$ComponentListener playerControlView$ComponentListener = new PlayerControlView$ComponentListener(this);
        this.f4666a = playerControlView$ComponentListener;
        this.f4675g0 = new cg.e();
        final int i10 = 0;
        this.O = new Runnable(this) { // from class: com.google.android.exoplayer2.ui.f

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f4658d;

            {
                this.f4658d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f4658d.j();
                        break;
                    default:
                        this.f4658d.c();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.P = new Runnable(this) { // from class: com.google.android.exoplayer2.ui.f

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f4658d;

            {
                this.f4658d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f4658d.j();
                        break;
                    default:
                        this.f4658d.c();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c0 c0Var = (c0) findViewById(p.exo_progress);
        View viewFindViewById = findViewById(p.exo_progress_placeholder);
        if (c0Var != null) {
            this.J = c0Var;
        } else if (viewFindViewById != null) {
            e eVar = new e(context, attributeSet);
            eVar.setId(p.exo_progress);
            eVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(eVar, iIndexOfChild);
            this.J = eVar;
        } else {
            this.J = null;
        }
        this.H = (TextView) findViewById(p.exo_duration);
        this.I = (TextView) findViewById(p.exo_position);
        c0 c0Var2 = this.J;
        if (c0Var2 != null) {
            ((e) c0Var2).T.add(playerControlView$ComponentListener);
        }
        View viewFindViewById2 = findViewById(p.exo_play);
        this.f4693x = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById3 = findViewById(p.exo_pause);
        this.f4695y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById4 = findViewById(p.exo_prev);
        this.f4674g = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById5 = findViewById(p.exo_next);
        this.f4686r = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById6 = findViewById(p.exo_rew);
        this.D = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById7 = findViewById(p.exo_ffwd);
        this.B = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(playerControlView$ComponentListener);
        }
        ImageView imageView = (ImageView) findViewById(p.exo_repeat_toggle);
        this.E = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(playerControlView$ComponentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(p.exo_shuffle);
        this.F = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(playerControlView$ComponentListener);
        }
        View viewFindViewById8 = findViewById(p.exo_vr);
        this.G = viewFindViewById8;
        setShowVrButton(false);
        g(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.f4668b0 = resources.getInteger(q.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f4669c0 = resources.getInteger(q.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.Q = resources.getDrawable(o.exo_controls_repeat_off);
        this.R = resources.getDrawable(o.exo_controls_repeat_one);
        this.S = resources.getDrawable(o.exo_controls_repeat_all);
        this.W = resources.getDrawable(o.exo_controls_shuffle_on);
        this.f4667a0 = resources.getDrawable(o.exo_controls_shuffle_off);
        this.T = resources.getString(s.exo_controls_repeat_off_description);
        this.U = resources.getString(s.exo_controls_repeat_one_description);
        this.V = resources.getString(s.exo_controls_repeat_all_description);
        this.f4671d0 = resources.getString(s.exo_controls_shuffle_on_description);
        this.f4672e0 = resources.getString(s.exo_controls_shuffle_off_description);
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        g1 g1Var = this.f4673f0;
        if (g1Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (g1Var.getPlaybackState() != 4) {
                    ((cg.e) this.f4675g0).getClass();
                    androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
                    long currentPosition = oVar.getCurrentPosition() + oVar.getSeekForwardIncrement();
                    long duration = oVar.getDuration();
                    if (duration != -9223372036854775807L) {
                        currentPosition = Math.min(currentPosition, duration);
                    }
                    oVar.seekTo(oVar.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
                    return true;
                }
            } else {
                if (keyCode == 89) {
                    ((cg.e) this.f4675g0).getClass();
                    androidx.lifecycle.o oVar2 = (androidx.lifecycle.o) g1Var;
                    long currentPosition2 = oVar2.getCurrentPosition() + (-oVar2.getSeekBackIncrement());
                    long duration2 = oVar2.getDuration();
                    if (duration2 != -9223372036854775807L) {
                        currentPosition2 = Math.min(currentPosition2, duration2);
                    }
                    oVar2.seekTo(oVar2.getCurrentWindowIndex(), Math.max(currentPosition2, 0L));
                    return true;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode == 79 || keyCode == 85) {
                        int playbackState = g1Var.getPlaybackState();
                        if (playbackState != 1 && playbackState != 4 && g1Var.getPlayWhenReady()) {
                            ((cg.e) this.f4675g0).getClass();
                            g1Var.setPlayWhenReady(false);
                            return true;
                        }
                        b(g1Var);
                    } else {
                        if (keyCode == 87) {
                            ((cg.e) this.f4675g0).o(g1Var);
                            return true;
                        }
                        if (keyCode == 88) {
                            ((cg.e) this.f4675g0).p(g1Var);
                            return true;
                        }
                        if (keyCode == 126) {
                            b(g1Var);
                            return true;
                        }
                        if (keyCode == 127) {
                            ((cg.e) this.f4675g0).getClass();
                            g1Var.setPlayWhenReady(false);
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void b(g1 g1Var) {
        int playbackState = g1Var.getPlaybackState();
        if (playbackState == 1) {
            ((cg.e) this.f4675g0).getClass();
            g1Var.prepare();
        } else if (playbackState == 4) {
            int currentWindowIndex = g1Var.getCurrentWindowIndex();
            ((cg.e) this.f4675g0).getClass();
            g1Var.seekTo(currentWindowIndex, -9223372036854775807L);
        }
        ((cg.e) this.f4675g0).getClass();
        g1Var.setPlayWhenReady(true);
    }

    public final void c() {
        if (e()) {
            setVisibility(8);
            Iterator it = this.f4670d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.O);
            removeCallbacks(this.P);
            this.f4689t0 = -9223372036854775807L;
        }
    }

    public final void d() {
        f fVar = this.P;
        removeCallbacks(fVar);
        if (this.f4680l0 <= 0) {
            this.f4689t0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f4680l0;
        this.f4689t0 = jUptimeMillis + j;
        if (this.f4676h0) {
            postDelayed(fVar, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.P);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        return getVisibility() == 0;
    }

    public final boolean f() {
        g1 g1Var = this.f4673f0;
        return (g1Var == null || g1Var.getPlaybackState() == 4 || this.f4673f0.getPlaybackState() == 1 || !this.f4673f0.getPlayWhenReady()) ? false : true;
    }

    public final void g(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.f4668b0 : this.f4669c0);
        view.setVisibility(z10 ? 0 : 8);
    }

    public g1 getPlayer() {
        return this.f4673f0;
    }

    public int getRepeatToggleModes() {
        return this.f4682n0;
    }

    public boolean getShowShuffleButton() {
        return this.f4688s0;
    }

    public int getShowTimeoutMs() {
        return this.f4680l0;
    }

    public boolean getShowVrButton() {
        View view = this.G;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        boolean z10;
        boolean zIsCommandAvailable;
        boolean z11;
        boolean z12;
        if (e() && this.f4676h0) {
            g1 g1Var = this.f4673f0;
            boolean z13 = false;
            if (g1Var != null) {
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
                boolean zIsCommandAvailable2 = oVar.isCommandAvailable(4);
                boolean zIsCommandAvailable3 = oVar.isCommandAvailable(6);
                if (oVar.isCommandAvailable(10)) {
                    this.f4675g0.getClass();
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (oVar.isCommandAvailable(11)) {
                    this.f4675g0.getClass();
                    z13 = true;
                }
                zIsCommandAvailable = oVar.isCommandAvailable(8);
                z10 = z13;
                z13 = zIsCommandAvailable3;
                z11 = zIsCommandAvailable2;
            } else {
                z10 = false;
                zIsCommandAvailable = false;
                z11 = false;
                z12 = false;
            }
            g(this.f4685q0, z13, this.f4674g);
            g(this.f4683o0, z12, this.D);
            g(this.f4684p0, z10, this.B);
            g(this.f4687r0, zIsCommandAvailable, this.f4686r);
            c0 c0Var = this.J;
            if (c0Var != null) {
                ((e) c0Var).setEnabled(z11);
            }
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        if (e() && this.f4676h0) {
            boolean zF = f();
            View view = this.f4693x;
            boolean z12 = true;
            if (view != null) {
                z10 = zF && view.isFocused();
                z11 = qb.v.f20828a < 21 ? z10 : zF && h.a(view);
                view.setVisibility(zF ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f4695y;
            if (view2 != null) {
                z10 |= !zF && view2.isFocused();
                if (qb.v.f20828a < 21) {
                    z12 = z10;
                } else if (zF || !h.a(view2)) {
                    z12 = false;
                }
                z11 |= z12;
                view2.setVisibility(zF ? 0 : 8);
            }
            if (z10) {
                boolean zF2 = f();
                if (!zF2 && view != null) {
                    view.requestFocus();
                } else if (zF2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z11) {
                boolean zF3 = f();
                if (!zF3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else {
                    if (!zF3 || view2 == null) {
                        return;
                    }
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    public final void j() {
        long contentPosition;
        long contentBufferedPosition;
        if (e() && this.f4676h0) {
            g1 g1Var = this.f4673f0;
            if (g1Var != null) {
                contentPosition = g1Var.getContentPosition() + this.f4696y0;
                contentBufferedPosition = g1Var.getContentBufferedPosition() + this.f4696y0;
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z10 = contentPosition != this.f4697z0;
            this.f4697z0 = contentPosition;
            TextView textView = this.I;
            if (textView != null && !this.f4679k0 && z10) {
                textView.setText(qb.v.w(this.K, this.L, contentPosition));
            }
            c0 c0Var = this.J;
            if (c0Var != null) {
                e eVar = (e) c0Var;
                eVar.setPosition(contentPosition);
                eVar.setBufferedPosition(contentBufferedPosition);
            }
            f fVar = this.O;
            removeCallbacks(fVar);
            int playbackState = g1Var == null ? 1 : g1Var.getPlaybackState();
            if (g1Var != null) {
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
                if (oVar.getPlaybackState() == 3 && oVar.getPlayWhenReady() && oVar.getPlaybackSuppressionReason() == 0) {
                    long jMin = Math.min(c0Var != null ? ((e) c0Var).getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                    float f10 = g1Var.getPlaybackParameters().f4070a;
                    postDelayed(fVar, qb.v.j(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f4681m0, 1000L));
                    return;
                }
            }
            if (playbackState == 4 || playbackState == 1) {
                return;
            }
            postDelayed(fVar, 1000L);
        }
    }

    public final void k() {
        ImageView imageView;
        if (e() && this.f4676h0 && (imageView = this.E) != null) {
            if (this.f4682n0 == 0) {
                g(false, false, imageView);
                return;
            }
            g1 g1Var = this.f4673f0;
            String str = this.T;
            Drawable drawable = this.Q;
            if (g1Var == null) {
                g(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(true, true, imageView);
            int repeatMode = g1Var.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.R);
                imageView.setContentDescription(this.U);
            } else if (repeatMode == 2) {
                imageView.setImageDrawable(this.S);
                imageView.setContentDescription(this.V);
            }
            imageView.setVisibility(0);
        }
    }

    public final void l() {
        ImageView imageView;
        if (e() && this.f4676h0 && (imageView = this.F) != null) {
            g1 g1Var = this.f4673f0;
            if (!this.f4688s0) {
                g(false, false, imageView);
                return;
            }
            String str = this.f4672e0;
            Drawable drawable = this.f4667a0;
            if (g1Var == null) {
                g(true, false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            g(true, true, imageView);
            if (g1Var.getShuffleModeEnabled()) {
                drawable = this.W;
            }
            imageView.setImageDrawable(drawable);
            if (g1Var.getShuffleModeEnabled()) {
                str = this.f4671d0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:17:0x003a->B:18:0x003b BREAK  A[LOOP:0: B:11:0x0028->B:15:0x0035]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.k.m():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4676h0 = true;
        long j = this.f4689t0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.P, jUptimeMillis);
            }
        } else if (e()) {
            d();
        }
        i();
        h();
        k();
        l();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4676h0 = false;
        removeCallbacks(this.O);
        removeCallbacks(this.P);
    }

    @Deprecated
    public void setControlDispatcher(com.google.android.exoplayer2.i iVar) {
        if (this.f4675g0 != iVar) {
            this.f4675g0 = iVar;
            h();
        }
    }

    public void setPlayer(g1 g1Var) {
        qb.b.j(Looper.myLooper() == Looper.getMainLooper());
        qb.b.g(g1Var == null || g1Var.getApplicationLooper() == Looper.getMainLooper());
        g1 g1Var2 = this.f4673f0;
        if (g1Var2 == g1Var) {
            return;
        }
        PlayerControlView$ComponentListener playerControlView$ComponentListener = this.f4666a;
        if (g1Var2 != null) {
            g1Var2.H(playerControlView$ComponentListener);
        }
        this.f4673f0 = g1Var;
        if (g1Var != null) {
            g1Var.c0(playerControlView$ComponentListener);
        }
        i();
        h();
        k();
        l();
        m();
    }

    public void setProgressUpdateListener(i iVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f4682n0 = i10;
        g1 g1Var = this.f4673f0;
        if (g1Var != null) {
            int repeatMode = g1Var.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                com.google.android.exoplayer2.i iVar = this.f4675g0;
                g1 g1Var2 = this.f4673f0;
                ((cg.e) iVar).getClass();
                g1Var2.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                com.google.android.exoplayer2.i iVar2 = this.f4675g0;
                g1 g1Var3 = this.f4673f0;
                ((cg.e) iVar2).getClass();
                g1Var3.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                com.google.android.exoplayer2.i iVar3 = this.f4675g0;
                g1 g1Var4 = this.f4673f0;
                ((cg.e) iVar3).getClass();
                g1Var4.setRepeatMode(2);
            }
        }
        k();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f4684p0 = z10;
        h();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f4677i0 = z10;
        m();
    }

    public void setShowNextButton(boolean z10) {
        this.f4687r0 = z10;
        h();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f4685q0 = z10;
        h();
    }

    public void setShowRewindButton(boolean z10) {
        this.f4683o0 = z10;
        h();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f4688s0 = z10;
        l();
    }

    public void setShowTimeoutMs(int i10) {
        this.f4680l0 = i10;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.G;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f4681m0 = qb.v.i(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.G;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            g(getShowVrButton(), onClickListener != null, view);
        }
    }
}
