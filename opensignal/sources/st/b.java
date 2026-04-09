package st;

import java.util.Iterator;
import mq.a0;

/* loaded from: classes.dex */
public final class b implements j, c {

    /* renamed from: a, reason: collision with root package name */
    public final j f22277a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22278b;

    public b(j jVar, int i10) {
        br.l.e(jVar, "sequence");
        this.f22277a = jVar;
        this.f22278b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // st.c
    public final j a(int i10) {
        int i11 = this.f22278b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f22277a, i11);
    }

    @Override // st.j
    public final Iterator iterator() {
        return new a0(this);
    }
}
