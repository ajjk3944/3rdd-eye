package L0;

import Zg.AbstractC3689v;
import java.util.List;
import mh.InterfaceC6835l;

/* renamed from: L0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3184n {
    public static final int a(List list, int i10) {
        int iB = ((C3187q) AbstractC3689v.B0(list)).b();
        if (i10 > ((C3187q) AbstractC3689v.B0(list)).b()) {
            throw new IllegalArgumentException(("Index " + i10 + " should be less or equal than last line's end " + iB).toString());
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C3187q c3187q = (C3187q) list.get(i12);
            char c10 = c3187q.f() > i10 ? (char) 1 : c3187q.b() <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int b(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C3187q c3187q = (C3187q) list.get(i12);
            char c10 = c3187q.g() > i10 ? (char) 1 : c3187q.c() <= i10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i11 = i12 + 1;
            } else {
                if (c10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C3187q) AbstractC3689v.B0(list)).a()) {
            return AbstractC3689v.n(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C3187q c3187q = (C3187q) list.get(i11);
            char c10 = c3187q.h() > f10 ? (char) 1 : c3187q.a() <= f10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void d(List list, long j10, InterfaceC6835l interfaceC6835l) {
        int size = list.size();
        for (int iA = a(list, S.l(j10)); iA < size; iA++) {
            C3187q c3187q = (C3187q) list.get(iA);
            if (c3187q.f() >= S.k(j10)) {
                return;
            }
            if (c3187q.f() != c3187q.b()) {
                interfaceC6835l.invoke(c3187q);
            }
        }
    }
}
