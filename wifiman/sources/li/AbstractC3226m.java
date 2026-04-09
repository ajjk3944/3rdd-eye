package Li;

import Ii.InterfaceC3091y0;
import Mi.o;
import dh.C5385j;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Li.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract /* synthetic */ class AbstractC3226m {
    public static final InterfaceC3220g a(InterfaceC3220g interfaceC3220g, int i10, Ki.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != Ki.a.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = Ki.a.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        Ki.a aVar2 = aVar;
        if (interfaceC3220g instanceof Mi.o) {
            return o.a.a((Mi.o) interfaceC3220g, null, i11, aVar2, 1, null);
        }
        return new Mi.g(interfaceC3220g, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC3220g b(InterfaceC3220g interfaceC3220g, int i10, Ki.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = Ki.a.SUSPEND;
        }
        return AbstractC3222i.c(interfaceC3220g, i10, aVar);
    }

    private static final void c(InterfaceC5384i interfaceC5384i) {
        if (interfaceC5384i.get(InterfaceC3091y0.f9363O) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC5384i).toString());
    }

    public static final InterfaceC3220g d(InterfaceC3220g interfaceC3220g) {
        return b(interfaceC3220g, -1, null, 2, null);
    }

    public static final InterfaceC3220g e(InterfaceC3220g interfaceC3220g, InterfaceC5384i interfaceC5384i) {
        c(interfaceC5384i);
        if (AbstractC6492s.d(interfaceC5384i, C5385j.f46088a)) {
            return interfaceC3220g;
        }
        if (interfaceC3220g instanceof Mi.o) {
            return o.a.a((Mi.o) interfaceC3220g, interfaceC5384i, 0, null, 6, null);
        }
        return new Mi.g(interfaceC3220g, interfaceC5384i, 0, null, 12, null);
    }
}
