package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class rh1 {

    /* renamed from: a, reason: collision with root package name */
    private final eg2 f32659a;

    /* renamed from: b, reason: collision with root package name */
    private final ac2 f32660b;

    /* renamed from: c, reason: collision with root package name */
    private final qb1 f32661c;

    /* renamed from: d, reason: collision with root package name */
    private final bf2 f32662d;

    /* renamed from: e, reason: collision with root package name */
    private final a f32663e;

    public final class a implements gc2 {

        /* renamed from: a, reason: collision with root package name */
        private gc2 f32664a;

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void a() {
            gc2 gc2Var = this.f32664a;
            if (gc2Var != null) {
                gc2Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void b() {
            ob1 ob1VarB = rh1.this.f32659a.b();
            if (ob1VarB != null) {
                ga1 ga1VarA = ob1VarB.a();
                qb1 qb1Var = rh1.this.f32661c;
                ov0 ov0VarA = ga1VarA.a();
                qb1Var.getClass();
                if (ov0VarA != null) {
                    CheckBox muteControl = ov0VarA.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = ov0VarA.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = ov0VarA.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            gc2 gc2Var = this.f32664a;
            if (gc2Var != null) {
                gc2Var.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gc2
        public final void c() {
            ob1 ob1VarB = rh1.this.f32659a.b();
            if (ob1VarB != null) {
                rh1.this.f32662d.a(ob1VarB);
            }
            gc2 gc2Var = this.f32664a;
            if (gc2Var != null) {
                gc2Var.c();
            }
        }

        public final void a(gc2 gc2Var) {
            this.f32664a = gc2Var;
        }
    }

    public rh1(eg2 videoViewAdapter, ac2 playbackController, qb1 controlsConfigurator, hl1 progressBarConfigurator) {
        kotlin.jvm.internal.l.f(videoViewAdapter, "videoViewAdapter");
        kotlin.jvm.internal.l.f(playbackController, "playbackController");
        kotlin.jvm.internal.l.f(controlsConfigurator, "controlsConfigurator");
        kotlin.jvm.internal.l.f(progressBarConfigurator, "progressBarConfigurator");
        this.f32659a = videoViewAdapter;
        this.f32660b = playbackController;
        this.f32661c = controlsConfigurator;
        this.f32662d = new bf2(controlsConfigurator, progressBarConfigurator);
        this.f32663e = new a();
    }

    public final void a(gc2 gc2Var) {
        this.f32663e.a(gc2Var);
    }

    public final void a() {
        this.f32660b.a(this.f32663e);
        this.f32660b.play();
    }

    public final void a(ob1 videoView) {
        kotlin.jvm.internal.l.f(videoView, "videoView");
        this.f32660b.stop();
        ga1 ga1VarA = videoView.a();
        qb1 qb1Var = this.f32661c;
        ov0 ov0VarA = ga1VarA.a();
        qb1Var.getClass();
        if (ov0VarA != null) {
            CheckBox muteControl = ov0VarA.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(null);
                muteControl.setVisibility(8);
            }
            ProgressBar videoProgress = ov0VarA.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setProgress(0);
                videoProgress.setVisibility(8);
            }
            TextView countDownProgress = ov0VarA.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(8);
            }
        }
    }
}
