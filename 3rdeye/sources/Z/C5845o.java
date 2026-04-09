package z;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.C0;
import java.util.Iterator;

/* compiled from: TemplateParamsOverride.java */
/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5845o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48404a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48405b;

    public C5845o(C0 c02) {
        boolean z10;
        Iterator it = c02.f(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                z10 = true;
                break;
            }
        }
        this.f48404a = z10;
        this.f48405b = c02.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
