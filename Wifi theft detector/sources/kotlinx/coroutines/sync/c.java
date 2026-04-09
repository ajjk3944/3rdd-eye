package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.internal.f0;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22684a = f0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f22685b = new c0("PERMIT");

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f22686c = new c0("TAKEN");

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f22687d = new c0("BROKEN");

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f22688e = new c0("CANCELLED");

    /* renamed from: f, reason: collision with root package name */
    public static final int f22689f = f0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    public static final d h(long j10, d dVar) {
        return new d(j10, dVar, 0);
    }
}
