package j4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o4.C2762a;
import o4.C2764c;

/* renamed from: j4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2591x extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        ArrayList arrayList = new ArrayList();
        c2762a.a();
        while (c2762a.o()) {
            try {
                arrayList.add(Integer.valueOf(c2762a.t()));
            } catch (NumberFormatException e6) {
                throw new g4.p(e6);
            }
        }
        c2762a.h();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        c2764c.b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            c2764c.u(r6.get(i));
        }
        c2764c.h();
    }
}
