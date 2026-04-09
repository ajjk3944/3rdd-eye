package j$.util.stream;

import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j6 extends b6 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f26631d;

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f26631d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void end() {
        j$.util.c.u(this.f26631d, this.f26508b);
        long size = this.f26631d.size();
        m5 m5Var = this.f26617a;
        m5Var.c(size);
        if (!this.f26509c) {
            ArrayList arrayList = this.f26631d;
            Objects.requireNonNull(m5Var);
            Collection.EL.a(arrayList, new j$.util.q(7, m5Var));
        } else {
            ArrayList arrayList2 = this.f26631d;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayList2.get(i4);
                i4++;
                if (m5Var.e()) {
                    break;
                } else {
                    m5Var.n((m5) obj);
                }
            }
        }
        m5Var.end();
        this.f26631d = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        this.f26631d.add(obj);
    }
}
