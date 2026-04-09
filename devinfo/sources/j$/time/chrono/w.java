package j$.time.chrono;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final w f26101c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String h() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.f.E(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n q(int i4) {
        return z.q(i4);
    }

    public final j$.time.temporal.u j(j$.time.temporal.a aVar) {
        switch (v.f26100a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.f26108e;
                int i4 = zVarArr[zVarArr.length - 1].f26110b.f26118a;
                int iMin = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - zVarArr[zVarArr.length - 1].f26110b.f26118a;
                int i10 = zVarArr[0].f26110b.f26118a;
                int i11 = 1;
                while (true) {
                    z[] zVarArr2 = z.f26108e;
                    if (i11 >= zVarArr2.length) {
                        return j$.time.temporal.u.f(iMin, 999999999 - i4);
                    }
                    z zVar = zVarArr2[i11];
                    iMin = Math.min(iMin, (zVar.f26110b.f26118a - i10) + 1);
                    i10 = zVar.f26110b.f26118a;
                    i11++;
                }
            case 6:
                z zVar2 = z.f26107d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.f26204b.f26230c;
                for (z zVar3 : z.f26108e) {
                    jMin = Math.min(jMin, ((zVar3.f26110b.I() ? 366 : 365) - zVar3.f26110b.H()) + 1);
                    if (zVar3.n() != null) {
                        jMin = Math.min(jMin, zVar3.n().f26110b.H() - 1);
                    }
                }
                return j$.time.temporal.u.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.f26204b.f26231d);
            case 7:
                return j$.time.temporal.u.e(y.f26103d.f26118a, 999999999L);
            case 8:
                long j = z.f26107d.f26109a;
                z[] zVarArr3 = z.f26108e;
                return j$.time.temporal.u.e(j, zVarArr3[zVarArr3.length - 1].f26109a);
            default:
                return aVar.f26204b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
