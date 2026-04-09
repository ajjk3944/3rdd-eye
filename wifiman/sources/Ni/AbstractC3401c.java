package Ni;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ni.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3401c {
    public static final Object a(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final void b(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
    }
}
