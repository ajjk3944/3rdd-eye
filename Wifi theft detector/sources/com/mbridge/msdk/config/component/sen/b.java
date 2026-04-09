package com.mbridge.msdk.config.component.sen;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.sen.a> f13678b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final SensorEventListener f13679c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f13677a = (SensorManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("sensor");

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String lowerCase = sensorEvent.sensor.getName().toLowerCase();
            float[] fArr = sensorEvent.values;
            HashMap map = new HashMap();
            map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "accelerometer");
            map.put(com.mbridge.msdk.config.component.common.util.c.a("x"), String.valueOf(fArr[0]));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("y"), String.valueOf(fArr[1]));
            map.put(com.mbridge.msdk.config.component.common.util.c.a("z"), String.valueOf(fArr[2]));
            float[] fArr2 = new float[3];
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[3];
            float[] fArr5 = new float[9];
            float[] fArr6 = new float[9];
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr7 = sensorEvent.values;
                System.arraycopy(fArr7, 0, fArr2, 0, fArr7.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr8 = sensorEvent.values;
                System.arraycopy(fArr8, 0, fArr3, 0, fArr8.length);
            }
            if (lowerCase.contains("accelerometer")) {
                if (SensorManager.getRotationMatrix(fArr5, fArr6, fArr2, fArr3)) {
                    SensorManager.getOrientation(fArr5, fArr4);
                    Math.toDegrees(fArr4[0]);
                    float degrees = (float) Math.toDegrees(fArr4[1]);
                    float degrees2 = (float) Math.toDegrees(fArr4[2]);
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    float f12 = fArr[2];
                    double dSqrt = Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("tileX"), String.valueOf(degrees));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("tileY"), String.valueOf(degrees2));
                    map.put(com.mbridge.msdk.config.component.common.util.c.a("magnitude"), String.valueOf(dSqrt));
                }
                map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "accelerometer");
                b.this.a((HashMap<String, Object>) map);
                return;
            }
            if (lowerCase.contains("magnetic")) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "magnetic");
                b.this.a((HashMap<String, Object>) map);
            } else if (lowerCase.contains("gyroscope")) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "gyroscope");
                b.this.a((HashMap<String, Object>) map);
            } else if (lowerCase.contains("rotation")) {
                float f13 = fArr[3];
                map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), "rotation");
                map.put(com.mbridge.msdk.config.component.common.util.c.a("cos"), String.valueOf(f13));
                b.this.a((HashMap<String, Object>) map);
            }
        }
    }

    public void b(com.mbridge.msdk.config.component.sen.a aVar) {
        if (aVar != null) {
            this.f13678b.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.sen.a aVar) {
        if (this.f13678b.contains(aVar)) {
            return;
        }
        this.f13678b.add(aVar);
    }

    public void a() {
        SensorManager sensorManager = this.f13677a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f13679c);
        }
        this.f13678b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> map) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        bVar.a(map);
        ArrayList<com.mbridge.msdk.config.component.sen.a> arrayList = this.f13678b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            com.mbridge.msdk.config.component.sen.a aVar = arrayList.get(i10);
            i10++;
            aVar.a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE), str);
        map.put(com.mbridge.msdk.config.component.common.util.c.a("code"), a(str));
        map.put(com.mbridge.msdk.config.component.common.util.c.a("reason"), str2);
        bVar.a(map);
        ArrayList<com.mbridge.msdk.config.component.sen.a> arrayList = this.f13678b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            com.mbridge.msdk.config.component.sen.a aVar = arrayList.get(i10);
            i10++;
            aVar.a(bVar);
        }
    }

    private String a(String str) {
        if (str.contains("accelerometer")) {
            return "200001";
        }
        if (str.contains("magnetic")) {
            return "200002";
        }
        if (str.contains("gyroscope")) {
            return "200003";
        }
        if (str.contains("rotation")) {
            return "200004";
        }
        return "";
    }

    public void a(int i10, String str, int i11) {
        try {
            Sensor defaultSensor = this.f13677a.getDefaultSensor(i10);
            if (defaultSensor != null) {
                this.f13677a.registerListener(this.f13679c, defaultSensor, i11);
                return;
            }
            a(str, str + " is not available");
        } catch (Exception e10) {
            a(str, e10.getMessage());
        }
    }
}
