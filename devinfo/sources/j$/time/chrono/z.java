package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final z f26107d;

    /* renamed from: e, reason: collision with root package name */
    public static final z[] f26108e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f26109a;

    /* renamed from: b, reason: collision with root package name */
    public final transient j$.time.f f26110b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f26111c;

    @Override // j$.time.temporal.n
    public final /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.o(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.l(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.m(this, qVar);
    }

    static {
        z zVar = new z(-1, j$.time.f.K(1868, 1, 1), "Meiji");
        f26107d = zVar;
        f26108e = new z[]{zVar, new z(0, j$.time.f.K(1912, 7, 30), "Taisho"), new z(1, j$.time.f.K(1926, 12, 25), "Showa"), new z(2, j$.time.f.K(1989, 1, 8), "Heisei"), new z(3, j$.time.f.K(2019, 5, 1), "Reiwa")};
    }

    public final z n() {
        if (this == f26108e[r0.length - 1]) {
            return null;
        }
        return q(this.f26109a + 1);
    }

    public z(int i4, j$.time.f fVar, String str) {
        this.f26109a = i4;
        this.f26110b = fVar;
        this.f26111c = str;
    }

    public static z q(int i4) {
        int i10 = i4 + 1;
        if (i10 >= 0) {
            z[] zVarArr = f26108e;
            if (i10 < zVarArr.length) {
                return zVarArr[i10];
            }
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return mVar.c(getValue(), j$.time.temporal.a.ERA);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.chrono.z h(j$.time.f r5) {
        /*
            j$.time.f r0 = j$.time.chrono.y.f26103d
            boolean r1 = j$.time.b.b(r0)
            r2 = 1
            if (r1 == 0) goto L13
            r5.getClass()
            int r0 = r5.C(r0)
            if (r0 >= 0) goto L21
            goto L1f
        L13:
            long r3 = r5.x()
            long r0 = r0.x()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L3c
            j$.time.chrono.z[] r0 = j$.time.chrono.z.f26108e
            int r0 = r0.length
            int r0 = r0 - r2
        L28:
            if (r0 < 0) goto L3a
            j$.time.chrono.z[] r1 = j$.time.chrono.z.f26108e
            r1 = r1[r0]
            j$.time.f r2 = r1.f26110b
            int r2 = r5.compareTo(r2)
            if (r2 < 0) goto L37
            return r1
        L37:
            int r0 = r0 + (-1)
            goto L28
        L3a:
            r5 = 0
            return r5
        L3c:
            j$.time.a r5 = new j$.time.a
            java.lang.String r0 = "JapaneseDate before Meiji 6 are not supported"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.z.h(j$.time.f):j$.time.chrono.z");
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f26109a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar != aVar) {
            return j$.time.temporal.r.d(this, qVar);
        }
        return w.f26101c.j(aVar);
    }

    public final String toString() {
        return this.f26111c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 5, this);
    }
}
