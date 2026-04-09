package nm;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import br.l;
import com.airbnb.lottie.LottieAnimationView;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import g4.j;
import qk.f;
import qk.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18457a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoTestActivity f18458d;

    public /* synthetic */ a(VideoTestActivity videoTestActivity, int i10) {
        this.f18457a = i10;
        this.f18458d = videoTestActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18457a) {
            case 0:
                VideoTestActivity videoTestActivity = this.f18458d;
                al.c cVar = videoTestActivity.T;
                if (cVar == null) {
                    l.l("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) ((b9.c) cVar.f822d).f2478d;
                linearLayout.setVisibility(8);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) linearLayout.findViewById(h.spinner_animation_view);
                lottieAnimationView.H = false;
                lottieAnimationView.D.j();
                al.c cVar2 = videoTestActivity.T;
                if (cVar2 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) cVar2.f825g).setImageResource(f.video_initialisation_icon);
                al.c cVar3 = videoTestActivity.T;
                if (cVar3 != null) {
                    ((TextView) cVar3.f826h).setText(videoTestActivity.getString(qk.l.loading_label));
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case 1:
                VideoTestActivity videoTestActivity2 = this.f18458d;
                al.c cVar4 = videoTestActivity2.T;
                if (cVar4 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) cVar4.f825g).setImageResource(f.ic_stalling_buffering);
                al.c cVar5 = videoTestActivity2.T;
                if (cVar5 != null) {
                    ((TextView) cVar5.f826h).setText(videoTestActivity2.getString(qk.l.error_label));
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case 2:
                al.c cVar6 = this.f18458d.T;
                if (cVar6 != null) {
                    ((ProgressBar) cVar6.j).setVisibility(4);
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case 3:
                al.c cVar7 = this.f18458d.T;
                if (cVar7 == null) {
                    l.l("binding");
                    throw null;
                }
                ProgressBar progressBar = (ProgressBar) cVar7.k;
                progressBar.setProgress(progressBar.getMax());
                return;
            case 4:
                al.c cVar8 = this.f18458d.T;
                if (cVar8 != null) {
                    ((ProgressBar) cVar8.j).setVisibility(0);
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case j.STRING_FIELD_NUMBER /* 5 */:
                VideoTestActivity videoTestActivity3 = this.f18458d;
                al.c cVar9 = videoTestActivity3.T;
                if (cVar9 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) cVar9.f825g).setImageResource(f.ic_stalling_buffering);
                al.c cVar10 = videoTestActivity3.T;
                if (cVar10 != null) {
                    ((TextView) cVar10.f826h).setText(videoTestActivity3.getString(qk.l.buffering_label));
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            default:
                VideoTestActivity videoTestActivity4 = this.f18458d;
                al.c cVar11 = videoTestActivity4.T;
                if (cVar11 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) cVar11.f825g).setImageResource(f.video_playback_icon);
                al.c cVar12 = videoTestActivity4.T;
                if (cVar12 != null) {
                    ((TextView) cVar12.f826h).setText(videoTestActivity4.getString(qk.l.playback_label));
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
        }
    }
}
