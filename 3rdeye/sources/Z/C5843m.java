package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import y.C5787a;

/* compiled from: StillCaptureFlow.java */
/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5843m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48400a;

    public C5843m() {
        this.f48400a = ((StillCaptureFlashStopRepeatingQuirk) C5787a.f47852a.e(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(ArrayList arrayList, boolean z10) {
        if (!this.f48400a || !z10) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }
}
