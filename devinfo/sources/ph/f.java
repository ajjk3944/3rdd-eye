package ph;

import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;
import java.util.Arrays;
import nk.k;
import ol.i;
import yj.u;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends hg.e implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public final int f31983b;

    /* renamed from: c, reason: collision with root package name */
    public float f31984c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer[] f31985d;

    /* renamed from: e, reason: collision with root package name */
    public final SensorManager f31986e;

    /* renamed from: f, reason: collision with root package name */
    public final Sensor f31987f;
    public final o9.e g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f31988h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f31989i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f31990k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f31991l;

    /* renamed from: m, reason: collision with root package name */
    public final i f31992m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f31993n;

    /* renamed from: o, reason: collision with root package name */
    public final l0 f31994o;

    /* renamed from: p, reason: collision with root package name */
    public long f31995p;

    public f(int i4) {
        this.f31983b = i4;
        Integer[] numArr = {1, 10, 9, 2, 14, 4, 16, 15, 20, 3, 11, 6, 5};
        Integer[] numArr2 = wi.h.f36757b ? new Integer[]{35} : new Integer[0];
        int length = numArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(numArr, 13 + length);
        System.arraycopy(numArr2, 0, objArrCopyOf, 13, length);
        k.b(objArrCopyOf);
        this.f31985d = (Integer[]) objArrCopyOf;
        SensorManager sensorManager = (SensorManager) fi.a.f24058a.getSystemService("sensor");
        this.f31986e = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(i4) : null;
        this.f31987f = defaultSensor;
        this.g = new o9.e();
        l0 l0Var = new l0();
        this.f31988h = l0Var;
        l0 l0Var2 = new l0();
        this.f31989i = l0Var2;
        this.j = l0Var2;
        l0 l0Var3 = new l0();
        this.f31990k = l0Var3;
        this.f31991l = l0Var3;
        this.f31992m = new i();
        l0 l0Var4 = new l0();
        this.f31993n = l0Var4;
        this.f31994o = l0Var4;
        l0Var.j(Boolean.valueOf((sensorManager == null || defaultSensor == null) ? false : true));
    }

    public static o9.f g(int i4, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(o.T(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                cm.g.N();
                throw null;
            }
            arrayList2.add(new o9.d(i10, ((a) obj).f31965a));
            i10 = i12;
        }
        o9.f fVar = new o9.f("", arrayList2);
        int color = fi.a.f24058a.getColor(i4);
        if (fVar.f30441a == null) {
            fVar.f30441a = new ArrayList();
        }
        fVar.f30441a.clear();
        fVar.f30441a.add(Integer.valueOf(color));
        fVar.E = false;
        fVar.F = false;
        fVar.f30463v = w9.g.c(2.0f);
        fVar.f30446f = false;
        fVar.f30465x = 3;
        return fVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) throws Resources.NotFoundException {
        if (sensorEvent == null || this.f31986e == null || this.f31987f == null || System.currentTimeMillis() - this.f31995p < 20) {
            return;
        }
        this.f31995p = System.currentTimeMillis();
        sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        k.d(fArr, "values");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i4 = 0;
        for (float f10 : fArr) {
            i4++;
            if (i4 > 1) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) String.valueOf(f10));
        }
        sb2.append((CharSequence) "");
        Resources resources = DeviceInfoApp.f21145f.getResources();
        int i10 = this.f31983b;
        l0 l0Var = this.f31990k;
        i iVar = this.f31992m;
        if (1 == i10 || 35 == i10 || 10 == i10 || 9 == i10) {
            String strS = d.h.s(resources.getString(R.string.ms), "²");
            float[] fArr2 = sensorEvent.values;
            k.d(fArr2, "values");
            iVar.o(fArr2, strS);
            float[] fArr3 = sensorEvent.values;
            k.d(fArr3, "values");
            l0Var.h(new h(fArr3[0], fArr3.length > 1 ? Float.valueOf(fArr3[1]) : null, fArr3.length > 2 ? Float.valueOf(fArr3[2]) : null, fArr3.length > 3 ? Float.valueOf(fArr3[3]) : null, strS, null));
        } else if (2 == i10 || 14 == i10) {
            String string = 14 == i10 ? resources.getString(R.string.geomagnetic_field) : null;
            String string2 = resources.getString(R.string.mu_tesla);
            k.d(string2, "getString(...)");
            float[] fArr4 = sensorEvent.values;
            k.d(fArr4, "values");
            iVar.o(fArr4, string2);
            float[] fArr5 = sensorEvent.values;
            k.d(fArr5, "values");
            l0Var.h(new h(fArr5[0], fArr5.length > 1 ? Float.valueOf(fArr5[1]) : null, fArr5.length > 2 ? Float.valueOf(fArr5[2]) : null, fArr5.length > 3 ? Float.valueOf(fArr5[3]) : null, string2, string));
        } else if (4 == i10 || 16 == i10) {
            String string3 = resources.getString(R.string.angular_speed);
            k.d(string3, "getString(...)");
            String string4 = resources.getString(R.string.rad);
            k.d(string4, "getString(...)");
            float[] fArr6 = sensorEvent.values;
            k.d(fArr6, "values");
            iVar.o(fArr6, string4);
            float[] fArr7 = sensorEvent.values;
            k.d(fArr7, "values");
            l0Var.h(new h(fArr7[0], fArr7.length > 1 ? Float.valueOf(fArr7[1]) : null, fArr7.length > 2 ? Float.valueOf(fArr7[2]) : null, fArr7.length > 3 ? Float.valueOf(fArr7[3]) : null, string4, string3));
        } else if (15 == i10 || 20 == i10 || 3 == i10 || 11 == i10) {
            String string5 = resources.getString(R.string.angular_speed);
            k.d(string5, "getString(...)");
            String string6 = 3 == i10 ? resources.getString(R.string.degree_icon) : "";
            k.b(string6);
            float[] fArr8 = sensorEvent.values;
            k.d(fArr8, "values");
            iVar.o(fArr8, string6);
            float[] fArr9 = sensorEvent.values;
            k.d(fArr9, "values");
            l0Var.h(new h(fArr9[0], fArr9.length > 1 ? Float.valueOf(fArr9[1]) : null, fArr9.length > 2 ? Float.valueOf(fArr9[2]) : null, fArr9.length > 3 ? Float.valueOf(fArr9[3]) : null, string6, string5));
        } else if (6 == i10) {
            String string7 = resources.getString(R.string.pressure);
            k.d(string7, "getString(...)");
            String string8 = resources.getString(R.string.hpa);
            k.d(string8, "getString(...)");
            float[] fArr10 = sensorEvent.values;
            k.d(fArr10, "values");
            iVar.o(fArr10, string8);
            float[] fArr11 = sensorEvent.values;
            k.d(fArr11, "values");
            l0Var.h(new h(fArr11[0], fArr11.length > 1 ? Float.valueOf(fArr11[1]) : null, fArr11.length > 2 ? Float.valueOf(fArr11[2]) : null, fArr11.length > 3 ? Float.valueOf(fArr11[3]) : null, string8, string7));
        } else if (19 == i10 || 8 == i10 || 5 == i10 || 12 == i10 || 13 == i10) {
            if (sensorEvent.sensor.getType() == 8) {
                String string9 = resources.getString(R.string.proximity_sensor);
                k.d(string9, "getString(...)");
                String string10 = resources.getString(R.string.cm);
                k.d(string10, "getString(...)");
                float[] fArr12 = sensorEvent.values;
                k.d(fArr12, "values");
                iVar.o(fArr12, string10);
                float[] fArr13 = sensorEvent.values;
                k.d(fArr13, "values");
                l0Var.h(new h(fArr13[0], fArr13.length > 1 ? Float.valueOf(fArr13[1]) : null, fArr13.length > 2 ? Float.valueOf(fArr13[2]) : null, fArr13.length > 3 ? Float.valueOf(fArr13[3]) : null, string10, string9));
            } else if (sensorEvent.sensor.getType() == 12) {
                String string11 = resources.getString(R.string.humidity_sensor);
                k.d(string11, "getString(...)");
                String string12 = resources.getString(R.string.percentage);
                k.d(string12, "getString(...)");
                float[] fArr14 = sensorEvent.values;
                k.d(fArr14, "values");
                iVar.o(fArr14, string12);
                float[] fArr15 = sensorEvent.values;
                k.d(fArr15, "values");
                l0Var.h(new h(fArr15[0], fArr15.length > 1 ? Float.valueOf(fArr15[1]) : null, fArr15.length > 2 ? Float.valueOf(fArr15[2]) : null, fArr15.length > 3 ? Float.valueOf(fArr15[3]) : null, string12, string11));
                this.f31984c = sensorEvent.values[0];
            } else if (sensorEvent.sensor.getType() == 5) {
                String string13 = resources.getString(R.string.illuminance);
                k.d(string13, "getString(...)");
                String string14 = resources.getString(R.string.lx);
                k.d(string14, "getString(...)");
                float[] fArr16 = sensorEvent.values;
                k.d(fArr16, "values");
                iVar.o(fArr16, string14);
                float[] fArr17 = sensorEvent.values;
                k.d(fArr17, "values");
                l0Var.h(new h(fArr17[0], fArr17.length > 1 ? Float.valueOf(fArr17[1]) : null, fArr17.length > 2 ? Float.valueOf(fArr17[2]) : null, fArr17.length > 3 ? Float.valueOf(fArr17[3]) : null, string14, string13));
            } else if (sensorEvent.sensor.getType() == 19) {
                String string15 = resources.getString(R.string.steps);
                k.d(string15, "getString(...)");
                float[] fArr18 = sensorEvent.values;
                k.d(fArr18, "values");
                iVar.o(fArr18, "");
                float[] fArr19 = sensorEvent.values;
                k.d(fArr19, "values");
                l0Var.h(new h(fArr19[0], fArr19.length > 1 ? Float.valueOf(fArr19[1]) : null, fArr19.length > 2 ? Float.valueOf(fArr19[2]) : null, fArr19.length > 3 ? Float.valueOf(fArr19[3]) : null, "", string15));
            } else if (sensorEvent.sensor.getType() == 13) {
                if (this.f31984c != 0.0f) {
                    float f11 = sensorEvent.values[0];
                    boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
                    double d10 = (f11 * 17.62f) / (f11 + 243.12f);
                    float fExp = (float) ((Math.exp(d10) * (((r4 / 100.0f) * 216.7f) * 6.112f)) / (f11 + 273.15f));
                    double d11 = this.f31984c / 100.0f;
                    double dLog = (Math.log(d11) + d10) / (17.62f - (Math.log(d11) + d10));
                    String string16 = resources.getString(R.string.absolute_humidity_temperature_sensor);
                    k.d(string16, "getString(...)");
                    String string17 = resources.getString(R.string.percentage);
                    k.d(string17, "getString(...)");
                    iVar.o(new float[]{fExp, (float) (dLog * 243.12f)}, string17);
                    float[] fArr20 = sensorEvent.values;
                    k.d(fArr20, "values");
                    l0Var.h(new h(fArr20[0], fArr20.length > 1 ? Float.valueOf(fArr20[1]) : null, fArr20.length > 2 ? Float.valueOf(fArr20[2]) : null, fArr20.length > 3 ? Float.valueOf(fArr20[3]) : null, string17, string16));
                }
            }
        }
        o9.e eVar = this.g;
        ArrayList arrayList = eVar.f30440i;
        if (arrayList != null) {
            arrayList.clear();
        }
        eVar.b();
        ArrayList arrayList2 = (ArrayList) iVar.f30592c;
        ArrayList arrayList3 = (ArrayList) iVar.f30595f;
        ArrayList arrayList4 = (ArrayList) iVar.f30594e;
        ArrayList arrayList5 = (ArrayList) iVar.f30593d;
        if (!arrayList2.isEmpty()) {
            eVar.a(g(R.color.sensor_chart_x, (ArrayList) iVar.f30592c));
        }
        if (!arrayList5.isEmpty()) {
            eVar.a(g(R.color.sensor_chart_y, arrayList5));
        }
        if (!arrayList4.isEmpty()) {
            eVar.a(g(R.color.sensor_chart_z, arrayList4));
        }
        if (!arrayList3.isEmpty()) {
            eVar.a(g(R.color.sensor_chart_w, arrayList3));
        }
        eVar.b();
        this.f31993n.j(u.f37649a);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
    }
}
