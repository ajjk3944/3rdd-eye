package com.bytedance.sdk.openadsdk.ylm;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc {
    private Context emc;
    private WeakReference<msw> ypw;
    private Map<String, emc> xq = new HashMap();
    private SensorEventListener dg = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            msw mswVarDg;
            if (sensorEvent.sensor.getType() != 1 || (mswVarDg = ycc.this.dg()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                mswVarDg.emc("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener bw = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            msw mswVarDg;
            if (sensorEvent.sensor.getType() != 4 || (mswVarDg = ycc.this.dg()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                mswVarDg.emc("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener ycc = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            msw mswVarDg;
            if (sensorEvent.sensor.getType() != 10 || (mswVarDg = ycc.this.dg()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                mswVarDg.emc("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener uym = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = ru.ypw;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = ru.xq;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = ru.dg;
            SensorManager.getRotationMatrix(fArr5, null, ru.ypw, ru.xq);
            float[] fArr6 = ru.bw;
            SensorManager.getOrientation(fArr5, fArr6);
            msw mswVarDg = ycc.this.dg();
            if (mswVarDg == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                mswVarDg.emc("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface emc {
        JSONObject emc(JSONObject jSONObject) throws Throwable;
    }

    public ycc(msw mswVar) {
        this.emc = mswVar.emc();
        this.ypw = new WeakReference<>(mswVar);
        xq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.ylm.emc bw() {
        msw mswVarDg = dg();
        if (mswVarDg == null) {
            return null;
        }
        return mswVarDg.aa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public msw dg() {
        WeakReference<msw> weakReference = this.ypw;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void xq() {
        this.xq.put("adInfo", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.45
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                if (mswVarDg == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectYzg = mswVarDg.yzg();
                if (jSONObjectYzg != null) {
                    jSONObjectYzg.put("code", 1);
                    return jSONObjectYzg;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.xq.put("appInfo", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.56
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = ycc.this.emc().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                msw mswVarDg = ycc.this.dg();
                if (mswVarDg != null) {
                    jSONObject2.put("deviceId", mswVarDg.uym());
                    jSONObject2.put("netType", mswVarDg.vk());
                    jSONObject2.put("innerAppName", mswVarDg.dg());
                    jSONObject2.put("appName", mswVarDg.bw());
                    jSONObject2.put("appVersion", mswVarDg.ycc());
                    Map<String, String> mapYpw = mswVarDg.ypw();
                    for (String str : mapYpw.keySet()) {
                        jSONObject2.put(str, mapYpw.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.xq.put("playableSDKInfo", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.62
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.xq.put("subscribe_app_ad", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.63
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("download_app_ad", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.64
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("isViewable", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.2
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                if (mswVarDg == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", mswVarDg.zz());
                return jSONObject3;
            }
        });
        this.xq.put("getVolume", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.3
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                if (mswVarDg == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", mswVarDg.msw());
                return jSONObject3;
            }
        });
        this.xq.put("getScreenSize", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.4
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                if (mswVarDg == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSba = mswVarDg.sba();
                jSONObjectSba.put("code", 1);
                return jSONObjectSba;
            }
        });
        this.xq.put("start_accelerometer_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.5
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        uym.emc("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ru.emc(ycc.this.emc, ycc.this.dg, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("close_accelerometer_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.6
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, ycc.this.dg);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("start_gyro_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.7
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        uym.emc("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ru.ypw(ycc.this.emc, ycc.this.bw, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("close_gyro_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.8
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, ycc.this.bw);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("start_accelerometer_grativityless_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.9
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        uym.emc("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ru.xq(ycc.this.emc, ycc.this.ycc, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("close_accelerometer_grativityless_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.10
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, ycc.this.ycc);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("start_rotation_vector_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.11
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        uym.emc("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ru.dg(ycc.this.emc, ycc.this.uym, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("close_rotation_vector_observer", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.13
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, ycc.this.uym);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("device_shake", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.14
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("device_shake_short", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.15
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ru.emc(ycc.this.emc, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    uym.emc("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.xq.put("playable_style", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.16
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXq = mswVarDg.xq();
                jSONObjectXq.put("code", 1);
                return jSONObjectXq;
            }
        });
        this.xq.put("sendReward", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.17
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.ylm();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playableInteractionTriggered", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.18
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.sra();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("webview_time_track", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.19
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.xq.put("playable_event", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.20
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.ypw(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("reportAd", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.21
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("close", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.22
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("openAdLandPageLinks", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.24
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("get_viewport", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.25
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectUl = mswVarDg.ul();
                jSONObjectUl.put("code", 1);
                return jSONObjectUl;
            }
        });
        this.xq.put("jssdk_load_finish", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.26
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.lt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_material_render_result", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.27
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.zz(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("detect_change_playable_click", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.28
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectRu = mswVarDg.ru();
                jSONObjectRu.put("code", 1);
                return jSONObjectRu;
            }
        });
        this.xq.put("check_camera_permission", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.29
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSz = mswVarDg.sz();
                jSONObjectSz.put("code", 1);
                return jSONObjectSz;
            }
        });
        this.xq.put("check_external_storage", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.30
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQh = mswVarDg.qh();
                if (jSONObjectQh.isNull("result")) {
                    jSONObjectQh.put("code", -1);
                    return jSONObjectQh;
                }
                jSONObjectQh.put("code", 1);
                return jSONObjectQh;
            }
        });
        this.xq.put("playable_open_camera", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.31
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_pick_photo", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.32
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_download_media_in_photos", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.33
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.emc(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_preventTouchEvent", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.35
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.ypw(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_settings_info", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.36
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectCf = mswVarDg.cf();
                jSONObjectCf.put("code", 1);
                return jSONObjectCf;
            }
        });
        this.xq.put("playable_load_main_scene", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.37
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.rie();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_enter_section", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.38
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.dg(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_end", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.39
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.hxp();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_finish_play_playable", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.40
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.ee();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_transfrom_module_show", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.41
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.db();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_transfrom_module_change_color", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.42
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.sb();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_set_scroll_rect", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.43
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_click_area", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.44
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.bw(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_real_play_start", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.46
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_material_first_frame_show", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.47
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.sf();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_stuck_check_pong", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.48
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.dr();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_material_adnormal_mask", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.49
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mswVarDg.ycc(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_long_press_panel", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.50
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_alpha_player_play", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.51
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_transfrom_module_highlight", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.52
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_send_click_event", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.53
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_query_media_permission_declare", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.54
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectUym = mswVarDg.uym(jSONObject);
                jSONObjectUym.put("code", 1);
                return jSONObjectUym;
            }
        });
        this.xq.put("playable_query_media_permission_enable", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.55
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                msw mswVarDg = ycc.this.dg();
                JSONObject jSONObject2 = new JSONObject();
                if (mswVarDg == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMsw = mswVarDg.msw(jSONObject);
                jSONObjectMsw.put("code", 1);
                return jSONObjectMsw;
            }
        });
        this.xq.put("playable_apply_media_permission", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.57
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_start_kws", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.58
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_close_kws", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.59
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_video_preload_task_add", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.60
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.xq.put("playable_video_preload_task_cancel", new emc() { // from class: com.bytedance.sdk.openadsdk.ylm.ycc.61
            @Override // com.bytedance.sdk.openadsdk.ylm.ycc.emc
            public JSONObject emc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.ylm.emc emcVarBw = ycc.this.bw();
                JSONObject jSONObject2 = new JSONObject();
                if (emcVarBw == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    public Set<String> emc() {
        return this.xq.keySet();
    }

    public void ypw() {
        ru.emc(this.emc, this.dg);
        ru.emc(this.emc, this.bw);
        ru.emc(this.emc, this.ycc);
        ru.emc(this.emc, this.uym);
    }

    public JSONObject emc(String str, JSONObject jSONObject) {
        try {
            emc emcVar = this.xq.get(str);
            if (emcVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return emcVar.emc(jSONObject);
        } catch (Throwable th) {
            uym.emc("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
