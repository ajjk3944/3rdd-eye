package xh;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;
import e4.m0;
import e4.v0;
import java.io.IOException;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class o extends hg.d {
    public MediaPlayer Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f37145a0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.loudspeaker_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        super.F(bundle);
        this.Z = new MediaPlayer();
        if (c0()) {
            return;
        }
        try {
            if (this.Z.isPlaying()) {
                return;
            }
            this.Z.setDataSource(W(), RingtoneManager.getDefaultUri(1));
            this.Z.prepare();
        } catch (Exception unused) {
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37145a0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37145a0 = viewInflate;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            if (t().getConfiguration().orientation == 2) {
                imageView.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(40.0f, t().getDisplayMetrics()));
            }
            imageView.setImageResource(R.drawable.img_speaker);
            ((TextView) this.f37145a0.findViewById(R.id.message)).setText(R.string.loudspeaker_test_question);
            final int i4 = 0;
            this.f37145a0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f37144b;

                {
                    this.f37144b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_loud_speaker", 0).apply();
                            o oVar = this.f37144b;
                            if (!oVar.c0()) {
                                oVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_loud_speaker", 1).apply();
                            o oVar2 = this.f37144b;
                            if (!oVar2.c0()) {
                                oVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37145a0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o f37144b;

                {
                    this.f37144b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_loud_speaker", 0).apply();
                            o oVar = this.f37144b;
                            if (!oVar.c0()) {
                                oVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_loud_speaker", 1).apply();
                            o oVar2 = this.f37144b;
                            if (!oVar2.c0()) {
                                oVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return this.f37145a0;
    }

    @Override // b5.z
    public final void H() throws IllegalStateException {
        this.F = true;
        MediaPlayer mediaPlayer = this.Z;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.Z.release();
            this.Z = null;
        }
    }

    @Override // b5.z
    public final void L() throws IllegalStateException {
        this.F = true;
        MediaPlayer mediaPlayer = this.Z;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // b5.z
    public final void N() throws IllegalStateException {
        this.F = true;
        MediaPlayer mediaPlayer = this.Z;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        sh.o oVar = new sh.o(2, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, oVar);
    }
}
