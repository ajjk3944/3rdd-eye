package xh;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
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
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class r extends hg.d {
    public Vibrator Z;

    /* renamed from: a0, reason: collision with root package name */
    public View f37148a0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.vibration_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        this.Z = (Vibrator) W().getSystemService("vibrator");
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37148a0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37148a0 = viewInflate;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            if (t().getConfiguration().orientation == 2) {
                imageView.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(45.0f, t().getDisplayMetrics()));
            }
            imageView.setImageResource(R.drawable.img_vibration);
            ((TextView) this.f37148a0.findViewById(R.id.message)).setText(R.string.vibration_test_question);
            final int i4 = 0;
            this.f37148a0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f37147b;

                {
                    this.f37147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_vibration", 0).apply();
                            r rVar = this.f37147b;
                            if (!rVar.c0()) {
                                rVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_vibration", 1).apply();
                            r rVar2 = this.f37147b;
                            if (!rVar2.c0()) {
                                rVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37148a0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f37147b;

                {
                    this.f37147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_vibration", 0).apply();
                            r rVar = this.f37147b;
                            if (!rVar.c0()) {
                                rVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_vibration", 1).apply();
                            r rVar2 = this.f37147b;
                            if (!rVar2.c0()) {
                                rVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return this.f37148a0;
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        Vibrator vibrator = this.Z;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        this.Z.cancel();
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        long[] jArr = {0, 1000, 0};
        Vibrator vibrator = this.Z;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.Z.vibrate(VibrationEffect.createWaveform(jArr, 0));
        } else {
            this.Z.vibrate(jArr, 0);
        }
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        a0 a0Var = new a0(2, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, a0Var);
    }
}
