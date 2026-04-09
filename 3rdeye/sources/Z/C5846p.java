package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import u.C5616a;
import y.C5787a;

/* compiled from: TorchStateReset.java */
/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5846p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48406a;

    public C5846p() {
        this.f48406a = C5787a.f47852a.e(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public static S a(S s10) {
        S.a aVar = new S.a();
        aVar.f14950c = s10.f14942c;
        Iterator it = Collections.unmodifiableList(s10.f14940a).iterator();
        while (it.hasNext()) {
            aVar.f14948a.add((X) it.next());
        }
        aVar.c(s10.f14941b);
        C1710q0 c1710q0K = C1710q0.K();
        c1710q0K.N(C5616a.J(CaptureRequest.FLASH_MODE), 0);
        aVar.c(new C5616a(C1717u0.J(c1710q0K)));
        return aVar.d();
    }

    public final boolean b(ArrayList arrayList, boolean z10) {
        if (!this.f48406a || !z10) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
