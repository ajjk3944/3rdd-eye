package Ti;

import Ni.C;
import Ni.F;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f22043a = F.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C f22044b = new C("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    private static final C f22045c = new C("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    private static final C f22046d = new C("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    private static final C f22047e = new C("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    private static final int f22048f = F.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j10, k kVar) {
        return new k(j10, kVar, 0);
    }
}
