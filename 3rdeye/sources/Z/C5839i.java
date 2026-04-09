package z;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.C0;

/* compiled from: OverrideAeModeForStillCapture.java */
/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5839i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48392a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48393b = false;

    public C5839i(C0 c02) {
        this.f48392a = c02.e(AutoFlashUnderExposedQuirk.class) != null;
    }
}
