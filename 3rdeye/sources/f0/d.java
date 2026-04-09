package f0;

import E.u;
import androidx.camera.core.impl.Q0;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;

/* compiled from: VideoTimebaseConverter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final u f37804a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0 f37805b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraUseInconsistentTimebaseQuirk f37806c;

    /* renamed from: d, reason: collision with root package name */
    public long f37807d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Q0 f37808e;

    /* compiled from: VideoTimebaseConverter.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37809a;

        static {
            int[] iArr = new int[Q0.values().length];
            f37809a = iArr;
            try {
                iArr[Q0.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37809a[Q0.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(u uVar, Q0 q02, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f37804a = uVar;
        this.f37805b = q02;
        this.f37806c = cameraUseInconsistentTimebaseQuirk;
    }
}
