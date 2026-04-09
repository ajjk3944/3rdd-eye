package w;

import android.hardware.camera2.CameraAccessException;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: CameraAccessExceptionCompat.java */
/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5687a extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final Set<Integer> f47110c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: b, reason: collision with root package name */
    public final int f47111b;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, Integer.valueOf(Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE))));
    }

    public C5687a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f47111b = 10001;
        if (f47110c.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C5687a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f47111b = cameraAccessException.getReason();
    }

    public C5687a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", Integer.valueOf(Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE), str), assertionError);
        this.f47111b = Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE;
        if (f47110c.contains(Integer.valueOf(Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE))) {
            new CameraAccessException(Sdk$SDKError.b.AD_LOAD_TOO_FREQUENTLY_VALUE, str, assertionError);
        }
    }
}
