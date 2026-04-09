package z;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.C0;
import y.C5787a;

/* compiled from: AutoFlashAEModeDisabler.java */
/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5832b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48386b;

    public C5832b(C0 c02) {
        this.f48385a = c02.d(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f48386b = C5787a.f47852a.e(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
