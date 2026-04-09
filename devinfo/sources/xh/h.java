package xh;

import android.content.Context;
import android.media.AudioManager;
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
import e4.a0;
import e4.m0;
import e4.v0;
import java.io.IOException;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class h extends hg.d {
    public MediaPlayer Z;

    /* renamed from: a0, reason: collision with root package name */
    public TestesActivity f37127a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f37128b0;

    /* renamed from: c0, reason: collision with root package name */
    public Integer f37129c0 = null;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f37130d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    public AudioManager f37131e0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        TestesActivity testesActivity = (TestesActivity) context;
        this.f37127a0 = testesActivity;
        testesActivity.setTitle(R.string.earspeaker_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        super.F(bundle);
        AudioManager audioManager = (AudioManager) this.f37127a0.getSystemService("audio");
        this.f37131e0 = audioManager;
        if (audioManager == null) {
            return;
        }
        this.f37129c0 = Integer.valueOf(audioManager.getMode());
        this.f37130d0 = Boolean.valueOf(this.f37131e0.isSpeakerphoneOn());
        this.f37131e0.setMode(3);
        this.f37131e0.setSpeakerphoneOn(false);
        this.f37127a0.setVolumeControlStream(0);
        this.Z = new MediaPlayer();
        try {
            this.Z.setDataSource(this.f37127a0, RingtoneManager.getDefaultUri(1));
            this.Z.prepare();
        } catch (Exception unused) {
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37128b0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37128b0 = viewInflate;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            if (t().getConfiguration().orientation == 2) {
                imageView.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(35.0f, t().getDisplayMetrics()));
            }
            imageView.setImageResource(R.drawable.img_earspeaker);
            ((TextView) this.f37128b0.findViewById(R.id.message)).setText(R.string.earspeaker_test_question);
            final int i4 = 0;
            this.f37128b0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37126b;

                {
                    this.f37126b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_ear_speaker", 0);
                            this.f37126b.f37127a0.finish();
                            break;
                        default:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_ear_speaker", 1);
                            this.f37126b.f37127a0.finish();
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37128b0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f37126b;

                {
                    this.f37126b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_ear_speaker", 0);
                            this.f37126b.f37127a0.finish();
                            break;
                        default:
                            je.u.z(com.liuzh.deviceinfo.utilities.t.f21303b.f21304a, "test_ear_speaker", 1);
                            this.f37126b.f37127a0.finish();
                            break;
                    }
                }
            });
        }
        return this.f37128b0;
    }

    @Override // b5.z
    public final void H() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.Z;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.Z.release();
            this.Z = null;
        }
        AudioManager audioManager = this.f37131e0;
        if (audioManager != null) {
            Boolean bool = this.f37130d0;
            if (bool != null) {
                audioManager.setSpeakerphoneOn(bool.booleanValue());
            }
            Integer num = this.f37129c0;
            if (num != null) {
                this.f37131e0.setMode(num.intValue());
            }
        }
        this.F = true;
    }

    @Override // b5.z
    public final void L() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.Z;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
        this.F = true;
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
        a0 a0Var = new a0(1, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, a0Var);
    }
}
