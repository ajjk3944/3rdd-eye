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
public class v extends hg.d {
    public ImageView Z;

    /* renamed from: a0, reason: collision with root package name */
    public Vibrator f37155a0;

    /* renamed from: b0, reason: collision with root package name */
    public View f37156b0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.volumeup_test);
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37156b0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37156b0 = viewInflate;
            ((TextView) viewInflate.findViewById(R.id.message)).setText(R.string.volumeup_test_question);
            this.Z = (ImageView) this.f37156b0.findViewById(R.id.image);
            if (t().getConfiguration().orientation == 2) {
                this.Z.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(60.0f, t().getDisplayMetrics()));
            }
            this.Z.setImageResource(R.drawable.img_volume_up);
            final int i4 = 0;
            this.f37156b0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f37154b;

                {
                    this.f37154b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_up", 0).apply();
                            this.f37154b.U().finish();
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_up", 1).apply();
                            this.f37154b.U().finish();
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37156b0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f37154b;

                {
                    this.f37154b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_up", 0).apply();
                            this.f37154b.U().finish();
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_volume_up", 1).apply();
                            this.f37154b.U().finish();
                            break;
                    }
                }
            });
            this.f37155a0 = (Vibrator) W().getSystemService("vibrator");
        }
        return this.f37156b0;
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        sh.k kVar = new sh.k(3, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, kVar);
    }

    @Override // hg.d
    public final boolean e0(int i4, KeyEvent keyEvent) {
        if (i4 != 24) {
            return false;
        }
        this.Z.setImageResource(R.drawable.img_volume_up_active);
        Vibrator vibrator = this.f37155a0;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return true;
        }
        this.f37155a0.vibrate(400L);
        return true;
    }

    @Override // hg.d
    public final boolean f0(int i4, KeyEvent keyEvent) {
        if (i4 != 24) {
            return false;
        }
        this.Z.setImageResource(R.drawable.img_volume_up);
        return true;
    }
}
