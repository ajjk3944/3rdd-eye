package androidx.camera.extensions.internal.sessionprocessor;

import C.S;
import G.h;
import N7.B8;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.EnumC1716u;
import androidx.camera.core.impl.EnumC1719w;
import androidx.camera.core.impl.EnumC1721y;
import androidx.camera.core.impl.EnumC1722z;
import androidx.camera.core.impl.P0;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: KeyValueMapCameraCaptureResult.java */
/* loaded from: classes.dex */
public final class c implements A {

    /* renamed from: a, reason: collision with root package name */
    public final Map<CaptureResult.Key, Object> f15138a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f15139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15140c;

    public c(long j4, P0 p02, Map<CaptureResult.Key, Object> map) {
        this.f15138a = map;
        this.f15139b = p02;
        this.f15140c = j4;
    }

    @Override // androidx.camera.core.impl.A
    public final P0 a() {
        return this.f15139b;
    }

    @Override // androidx.camera.core.impl.A
    public final void b(h.b bVar) throws NumberFormatException {
        Integer num;
        Map<CaptureResult.Key, Object> map = this.f15138a;
        B8.f(this, bVar);
        try {
            Integer num2 = (Integer) map.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                bVar.e(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            S.g("KeyValueMapCameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l5 = (Long) map.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = bVar.f1824a;
        if (l5 != null) {
            bVar.c("ExposureTime", String.valueOf(l5.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f10 = (Float) map.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.c("FNumber", String.valueOf(f10.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) map.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) map.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            bVar.c("SensitivityType", String.valueOf(3), arrayList);
            bVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f11 = (Float) map.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.d(f11.floatValue());
        }
        Integer num3 = (Integer) map.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            h.c cVar = h.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            int iOrdinal = cVar.ordinal();
            bVar.c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1721y c() {
        Integer num = (Integer) this.f15138a.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC1721y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1721y.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC1721y.METERING;
        }
        if (iIntValue == 2) {
            return EnumC1721y.CONVERGED;
        }
        if (iIntValue == 3) {
            return EnumC1721y.LOCKED;
        }
        S.b("KeyValueMapCameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1721y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1722z d() {
        Integer num = (Integer) this.f15138a.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC1722z.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC1722z.NONE;
        }
        if (iIntValue == 2) {
            return EnumC1722z.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC1722z.FIRED;
        }
        S.b("KeyValueMapCameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1722z.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1716u e() {
        Integer num = (Integer) this.f15138a.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC1716u.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1716u.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC1716u.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC1716u.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC1716u.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                S.b("KeyValueMapCameraCaptureResult", "Undefined ae state: " + num);
                return EnumC1716u.UNKNOWN;
            }
        }
        return EnumC1716u.SEARCHING;
    }

    @Override // androidx.camera.core.impl.A
    public final CaptureResult f() {
        return null;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1719w g() {
        Integer num = (Integer) this.f15138a.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC1719w.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                S.b("KeyValueMapCameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC1719w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final long getTimestamp() {
        return this.f15140c;
    }
}
