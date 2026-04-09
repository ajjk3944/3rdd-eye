package rl;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final p f33102d;

    /* renamed from: b, reason: collision with root package name */
    public final List f33103b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33104c;

    static {
        vk.h hVar = p.f33121d;
        f33102d = u6.t.k("application/x-www-form-urlencoded");
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        nk.k.e(arrayList, "encodedNames");
        nk.k.e(arrayList2, "encodedValues");
        this.f33103b = sl.h.j(arrayList);
        this.f33104c = sl.h.j(arrayList2);
    }

    @Override // rl.x
    public final long a() {
        return e(null, true);
    }

    @Override // rl.x
    public final p b() {
        return f33102d;
    }

    @Override // rl.x
    public final void d(hm.f fVar) throws EOFException {
        e(fVar, false);
    }

    public final long e(hm.f fVar, boolean z3) throws EOFException {
        hm.e buffer;
        if (z3) {
            buffer = new hm.e();
        } else {
            nk.k.b(fVar);
            buffer = fVar.getBuffer();
        }
        List list = this.f33103b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 > 0) {
                buffer.E(38);
            }
            buffer.T((String) list.get(i4));
            buffer.E(61);
            buffer.T((String) this.f33104c.get(i4));
        }
        if (!z3) {
            return 0L;
        }
        long j = buffer.f25174b;
        buffer.e();
        return j;
    }
}
