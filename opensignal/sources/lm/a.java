package lm;

import android.os.Handler;
import android.widget.ProgressBar;
import c5.h;
import com.google.android.exoplayer2.ui.PlayerView;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import fm.l;
import h7.r1;
import h9.r2;
import hk.f;
import ni.c0;
import ni.d1;
import ni.e1;
import ni.g;
import tm.c;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final l f15546a;

    /* renamed from: b, reason: collision with root package name */
    public PlayerView f15547b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f15548c;

    /* renamed from: d, reason: collision with root package name */
    public h f15549d;

    /* renamed from: e, reason: collision with root package name */
    public c f15550e;

    /* renamed from: f, reason: collision with root package name */
    public ni.f f15551f;

    /* renamed from: g, reason: collision with root package name */
    public r1 f15552g;

    /* renamed from: h, reason: collision with root package name */
    public VideoTestResult f15553h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15554i;

    public a(l lVar) {
        br.l.e(lVar, "videoResultMapper");
        this.f15546a = lVar;
        this.f15548c = new Handler();
    }

    @Override // hk.f
    public final void a(hk.h hVar, vj.c cVar) {
        br.l.e(cVar, "result");
    }

    @Override // hk.f
    public final void c(long j, String str, hk.h hVar, String str2) {
        br.l.e(str, "jobName");
        br.l.e(str2, "error");
        r1 r1Var = this.f15552g;
        if (r1Var != null) {
            VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 1));
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 2));
        }
    }

    @Override // hk.f
    public final void d(long j, String str, vj.c cVar, boolean z10) {
        Double d6;
        Double d10;
        br.l.e(str, "jobName");
        if (str.equals("CORE")) {
            br.l.c(cVar, "null cannot be cast to non-null type com.opensignal.sdk.data.job.result.CoreResult");
            this.f15551f = (ni.f) cVar;
            return;
        }
        if (str.equals("VIDEO")) {
            br.l.c(cVar, "null cannot be cast to non-null type com.opensignal.sdk.data.job.result.VideoResult.VideoCompleteResult");
            d1 d1Var = (d1) cVar;
            ni.f fVar = this.f15551f;
            g gVarI = fVar != null ? fVar.i() : null;
            br.l.b(gVarI);
            c cVar2 = this.f15550e;
            br.l.b(cVar2);
            this.f15546a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = d1Var.j;
            long j10 = d1Var.f17747h;
            double d11 = d1Var.I;
            String str2 = d1Var.f17758u;
            long j11 = d1Var.f17756s;
            long j12 = d1Var.f17762y;
            c0 c0Var = gVarI.f17839t;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = (c0Var == null || (d10 = c0Var.f17697b) == null) ? 0.0d : d10.doubleValue();
            if (c0Var != null && (d6 = c0Var.f17698c) != null) {
                dDoubleValue = d6.doubleValue();
            }
            VideoTestResult videoTestResult = new VideoTestResult(0, jCurrentTimeMillis, j7, j10, d11, str2, j11, j12, dDoubleValue2, dDoubleValue, cVar2.f22890a, cVar2.f22891d, cVar2.f22892g, false, com.staircase3.opensignal.utils.l.UNKNOWN);
            this.f15553h = videoTestResult;
            this.f15554i = true;
            r1 r1Var = this.f15552g;
            if (r1Var != null) {
                r1Var.b0(videoTestResult, j);
            }
        }
    }

    @Override // hk.f
    public final void e(hk.h hVar) {
        br.l.e(hVar, "task");
        r1 r1Var = this.f15552g;
        if (r1Var != null) {
            VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 0));
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 4));
        }
    }

    @Override // hk.f
    public final void f(long j, String str, vj.c cVar, boolean z10) {
        br.l.e(str, "jobName");
        br.l.e(cVar, "result");
        if (str.equals("VIDEO")) {
            e1 e1Var = (e1) cVar;
            r1 r1Var = this.f15552g;
            if (r1Var != null) {
                final int i10 = (int) e1Var.f17803h;
                final int i11 = (int) e1Var.f17804i;
                final VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
                videoTestActivity.runOnUiThread(new Runnable() { // from class: nm.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoTestActivity videoTestActivity2 = videoTestActivity;
                        al.c cVar2 = videoTestActivity2.T;
                        if (cVar2 == null) {
                            br.l.l("binding");
                            throw null;
                        }
                        ((ProgressBar) cVar2.k).setMax(i11);
                        al.c cVar3 = videoTestActivity2.T;
                        if (cVar3 != null) {
                            ((ProgressBar) cVar3.k).setProgress(i10);
                        } else {
                            br.l.l("binding");
                            throw null;
                        }
                    }
                });
            }
        }
    }

    public final void g() {
        r1 r1Var = this.f15552g;
        if (r1Var != null) {
            VideoTestActivity videoTestActivity = (VideoTestActivity) ((r2) r1Var.f10199d).f10470a;
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 6));
            videoTestActivity.runOnUiThread(new nm.a(videoTestActivity, 2));
        }
    }

    @Override // hk.f
    public final void b(hk.h hVar) {
    }
}
