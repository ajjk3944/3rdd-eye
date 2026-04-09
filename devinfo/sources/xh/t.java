package xh;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.tests.TestesActivity;
import e4.m0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class t extends hg.d {
    public ImageView Z;

    /* renamed from: a0, reason: collision with root package name */
    public Vibrator f37151a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f37152b0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.volumedown_test);
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37152b0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37152b0 = viewInflate;
            ((TextView) viewInflate.findViewById(R.id.message)).setText(R.string.volumedown_test_question);
            this.Z = (ImageView) this.f37152b0.findViewById(R.id.image);
            if (t().getConfiguration().orientation == 2) {
                this.Z.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(60.0f, t().getDisplayMetrics()));
            }
            this.Z.setImageResource(R.drawable.img_volume_down);
            final int i4 = 0;
            this.f37152b0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f37150b;

                {
                    this.f37150b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_down", 0).apply();
                            t tVar = this.f37150b;
                            if (!tVar.c0()) {
                                tVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_down", 1).apply();
                            t tVar2 = this.f37150b;
                            if (!tVar2.c0()) {
                                tVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37152b0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.s

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f37150b;

                {
                    this.f37150b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_down", 0).apply();
                            t tVar = this.f37150b;
                            if (!tVar.c0()) {
                                tVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_down", 1).apply();
                            t tVar2 = this.f37150b;
                            if (!tVar2.c0()) {
                                tVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
            this.f37151a0 = (Vibrator) W().getSystemService("vibrator");
        }
        return this.f37152b0;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        j jVar = new j(1, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, jVar);
    }

    @Override // hg.d
    public final boolean e0(int i4, KeyEvent keyEvent) {
        if (i4 != 25) {
            return false;
        }
        this.Z.setImageResource(R.drawable.img_volume_down_active);
        Vibrator vibrator = this.f37151a0;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return true;
        }
        this.f37151a0.vibrate(400L);
        return true;
    }

    @Override // hg.d
    public final boolean f0(int i4, KeyEvent keyEvent) {
        if (i4 != 25) {
            return false;
        }
        this.Z.setImageResource(R.drawable.img_volume_down);
        return true;
    }
}
