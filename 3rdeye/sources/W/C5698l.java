package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* compiled from: CameraCharacteristicsCompat.java */
/* renamed from: w.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5698l {

    /* renamed from: b, reason: collision with root package name */
    public final C5697k f47142b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47143c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f47141a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public C5709w f47144d = null;

    public C5698l(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47142b = new C5696j(cameraCharacteristics);
        } else {
            this.f47142b = new C5697k(cameraCharacteristics);
        }
        this.f47143c = str;
    }

    public final <T> T a(CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) this.f47142b.f47140a.get(key);
        }
        synchronized (this) {
            try {
                T t10 = (T) this.f47141a.get(key);
                if (t10 != null) {
                    return t10;
                }
                T t11 = (T) this.f47142b.f47140a.get(key);
                if (t11 != null) {
                    this.f47141a.put(key, t11);
                }
                return t11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C5709w b() {
        if (this.f47144d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f47144d = new C5709w(streamConfigurationMap, new K4.b(this.f47143c, 9));
            } catch (AssertionError | NullPointerException e4) {
                throw new IllegalArgumentException(e4.getMessage());
            }
        }
        return this.f47144d;
    }
}
