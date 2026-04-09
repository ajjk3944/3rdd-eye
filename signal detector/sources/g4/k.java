package g4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class k extends z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f20229b;

    public /* synthetic */ k(z zVar, int i) {
        this.f20228a = i;
        this.f20229b = zVar;
    }

    @Override // g4.z
    public final Object b(C2762a c2762a) throws IOException {
        switch (this.f20228a) {
            case 0:
                return new AtomicLong(((Number) this.f20229b.b(c2762a)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                c2762a.a();
                while (c2762a.o()) {
                    arrayList.add(Long.valueOf(((Number) this.f20229b.b(c2762a)).longValue()));
                }
                c2762a.h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) throws IOException {
        switch (this.f20228a) {
            case 0:
                this.f20229b.c(c2764c, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c2764c.b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f20229b.c(c2764c, Long.valueOf(atomicLongArray.get(i)));
                }
                c2764c.h();
                break;
        }
    }
}
