package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes4.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22447a = new kotlinx.coroutines.internal.c0("NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.c0 f22448b = new kotlinx.coroutines.internal.c0("PENDING");

    public static final t0 a(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.l.f22480a;
        }
        return new StateFlowImpl(obj);
    }

    public static final b d(d1 d1Var, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || bufferOverflow != BufferOverflow.f22241b) ? y0.e(d1Var, dVar, i10, bufferOverflow) : d1Var;
    }
}
