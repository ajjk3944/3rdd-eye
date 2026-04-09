package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class ul {
    private static final Interpolator emc = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> ypw;

    private static SparseArray<WeakReference<Interpolator>> emc() {
        if (ypw == null) {
            ypw = new SparseArray<>();
        }
        return ypw;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.ypw.uym.emc<T> ypw(com.bytedance.adsdk.ypw.uym r24, android.util.JsonReader r25, float r26, com.bytedance.adsdk.ypw.bw.wo<T> r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.bw.ul.ypw(com.bytedance.adsdk.ypw.uym, android.util.JsonReader, float, com.bytedance.adsdk.ypw.bw.wo):com.bytedance.adsdk.ypw.uym.emc");
    }

    private static WeakReference<Interpolator> emc(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (ul.class) {
            weakReference = emc().get(i10);
        }
        return weakReference;
    }

    private static void emc(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (ul.class) {
            ypw.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.ypw.uym.emc<T> emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, float f10, wo<T> woVar, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return ypw(uymVar, jsonReader, f10, woVar);
        }
        if (z10) {
            return emc(uymVar, jsonReader, f10, woVar);
        }
        return emc(jsonReader, f10, woVar);
    }

    private static <T> com.bytedance.adsdk.ypw.uym.emc<T> emc(com.bytedance.adsdk.ypw.uym uymVar, JsonReader jsonReader, float f10, wo<T> woVar) throws IOException {
        Interpolator interpolatorEmc;
        jsonReader.beginObject();
        PointF pointFYpw = null;
        T tYpw = null;
        T tYpw2 = null;
        PointF pointFYpw2 = null;
        PointF pointFYpw3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFYpw4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tYpw = woVar.ypw(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case "i":
                    pointFYpw4 = yzg.ypw(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFYpw = yzg.ypw(jsonReader, 1.0f);
                    break;
                case "s":
                    tYpw2 = woVar.ypw(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFYpw3 = yzg.ypw(jsonReader, f10);
                    break;
                case "to":
                    pointFYpw2 = yzg.ypw(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFYpw != null && pointFYpw4 != null) {
                interpolatorEmc = emc(pointFYpw, pointFYpw4);
            }
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar = new com.bytedance.adsdk.ypw.uym.emc<>(uymVar, tYpw2, tYpw, interpolatorEmc, fNextDouble, null);
            emcVar.msw = pointFYpw2;
            emcVar.zz = pointFYpw3;
            return emcVar;
        }
        tYpw = tYpw2;
        interpolatorEmc = emc;
        com.bytedance.adsdk.ypw.uym.emc<T> emcVar2 = new com.bytedance.adsdk.ypw.uym.emc<>(uymVar, tYpw2, tYpw, interpolatorEmc, fNextDouble, null);
        emcVar2.msw = pointFYpw2;
        emcVar2.zz = pointFYpw3;
        return emcVar2;
    }

    private static Interpolator emc(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.ypw.ycc.bw.ypw(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.ypw.ycc.bw.ypw(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.ypw.ycc.bw.ypw(pointF2.x, -1.0f, 1.0f);
        float fYpw = com.bytedance.adsdk.ypw.ycc.bw.ypw(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fYpw;
        int iEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc(pointF.x, pointF.y, pointF2.x, fYpw);
        WeakReference<Interpolator> weakReferenceEmc = com.bytedance.adsdk.ypw.bw.emc() ? null : emc(iEmc);
        Interpolator interpolator = weakReferenceEmc != null ? weakReferenceEmc.get() : null;
        if (weakReferenceEmc != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.ypw.aa.emc(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.ypw.aa.emc(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.ypw.bw.emc()) {
            try {
                emc(iEmc, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.ypw.uym.emc<T> emc(JsonReader jsonReader, float f10, wo<T> woVar) throws IOException {
        return new com.bytedance.adsdk.ypw.uym.emc<>(woVar.ypw(jsonReader, f10));
    }
}
