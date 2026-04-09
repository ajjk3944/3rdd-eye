package v;

import G.h;
import N7.B8;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.EnumC1716u;
import androidx.camera.core.impl.EnumC1718v;
import androidx.camera.core.impl.EnumC1719w;
import androidx.camera.core.impl.EnumC1721y;
import androidx.camera.core.impl.EnumC1722z;
import androidx.camera.core.impl.P0;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: Camera2CameraCaptureResult.java */
/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5651f implements androidx.camera.core.impl.A {

    /* renamed from: a, reason: collision with root package name */
    public final P0 f46695a;

    /* renamed from: b, reason: collision with root package name */
    public final CaptureResult f46696b;

    public C5651f(P0 p02, CaptureResult captureResult) {
        this.f46695a = p02;
        this.f46696b = captureResult;
    }

    @Override // androidx.camera.core.impl.A
    public final P0 a() {
        return this.f46695a;
    }

    @Override // androidx.camera.core.impl.A
    public final void b(h.b bVar) throws NumberFormatException {
        Integer num;
        CaptureResult captureResult = this.f46696b;
        B8.f(this, bVar);
        try {
            Integer num2 = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                bVar.e(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C.S.g("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l5 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = bVar.f1824a;
        if (l5 != null) {
            bVar.c("ExposureTime", String.valueOf(l5.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f10 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.c("FNumber", String.valueOf(f10.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            bVar.c("SensitivityType", String.valueOf(3), arrayList);
            bVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f11 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.d(f11.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
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
        Integer num = (Integer) this.f46696b.get(CaptureResult.CONTROL_AWB_STATE);
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
        C.S.b("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC1721y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1722z d() {
        Integer num = (Integer) this.f46696b.get(CaptureResult.FLASH_STATE);
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
        C.S.b("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC1722z.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1716u e() {
        Integer num = (Integer) this.f46696b.get(CaptureResult.CONTROL_AE_STATE);
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
                C.S.b("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC1716u.UNKNOWN;
            }
        }
        return EnumC1716u.SEARCHING;
    }

    @Override // androidx.camera.core.impl.A
    public final CaptureResult f() {
        return this.f46696b;
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC1719w g() {
        Integer num = (Integer) this.f46696b.get(CaptureResult.CONTROL_AF_STATE);
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
                C.S.b("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC1719w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.A
    public final long getTimestamp() {
        Long l5 = (Long) this.f46696b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l5 == null) {
            return -1L;
        }
        return l5.longValue();
    }

    public final EnumC1718v h() {
        Integer num = (Integer) this.f46696b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC1718v.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC1718v.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC1718v.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                C.S.b("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC1718v.UNKNOWN;
            }
        }
        return EnumC1718v.OFF;
    }

    public C5651f(CaptureResult captureResult) {
        this(P0.f14934b, captureResult);
    }
}
