package xh;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
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
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class f extends hg.d implements SensorEventListener {
    public SensorManager Z;

    /* renamed from: a0, reason: collision with root package name */
    public Sensor f37122a0;

    /* renamed from: b0, reason: collision with root package name */
    public ImageView f37123b0;

    /* renamed from: c0, reason: collision with root package name */
    public View f37124c0;

    @Override // b5.z
    public final void E(Context context) {
        super.E(context);
        ((TestesActivity) context).setTitle(R.string.earproximity_test);
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        SensorManager sensorManager = (SensorManager) W().getSystemService("sensor");
        this.Z = sensorManager;
        if (sensorManager != null) {
            this.f37122a0 = sensorManager.getDefaultSensor(8);
        }
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f37124c0 == null) {
            View viewInflate = layoutInflater.inflate(R.layout.tests_type_normal, viewGroup, false);
            this.f37124c0 = viewInflate;
            ((TextView) viewInflate.findViewById(R.id.message)).setText(R.string.earproximity_test_question);
            ImageView imageView = (ImageView) this.f37124c0.findViewById(R.id.image);
            this.f37123b0 = imageView;
            imageView.setImageResource(R.drawable.img_earproximity);
            if (t().getConfiguration().orientation == 2) {
                this.f37123b0.setTranslationY(-com.liuzh.deviceinfo.utilities.d.p(50.0f, t().getDisplayMetrics()));
            }
            final int i4 = 0;
            this.f37124c0.findViewById(R.id.iv_failed).setOnClickListener(new View.OnClickListener(this) { // from class: xh.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f37121b;

                {
                    this.f37121b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_ear_proximity", 0).apply();
                            f fVar = this.f37121b;
                            if (!fVar.c0()) {
                                fVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_ear_proximity", 1).apply();
                            f fVar2 = this.f37121b;
                            if (!fVar2.c0()) {
                                fVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f37124c0.findViewById(R.id.iv_success).setOnClickListener(new View.OnClickListener(this) { // from class: xh.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f37121b;

                {
                    this.f37121b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_ear_proximity", 0).apply();
                            f fVar = this.f37121b;
                            if (!fVar.c0()) {
                                fVar.U().finish();
                                break;
                            }
                            break;
                        default:
                            com.liuzh.deviceinfo.utilities.t.f21303b.f21304a.edit().putInt("test_ear_proximity", 1).apply();
                            f fVar2 = this.f37121b;
                            if (!fVar2.c0()) {
                                fVar2.U().finish();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return this.f37124c0;
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        SensorManager sensorManager = this.Z;
        if (sensorManager == null || this.f37122a0 == null) {
            return;
        }
        sensorManager.unregisterListener(this);
    }

    @Override // b5.z
    public final void N() {
        Sensor sensor;
        this.F = true;
        SensorManager sensorManager = this.Z;
        if (sensorManager == null || (sensor = this.f37122a0) == null) {
            return;
        }
        sensorManager.registerListener(this, sensor, 3);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        sh.o oVar = new sh.o(1, view);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(view, oVar);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 8) {
            bi.d.b(new k1.b(29, this, sensorEvent));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
