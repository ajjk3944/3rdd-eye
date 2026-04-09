package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26133a;

    public /* synthetic */ h(int i4) {
        this.f26133a = i4;
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb2) {
        switch (this.f26133a) {
            case 0:
                Long lA = pVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.n nVar = pVar.f26161a;
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                Long lValueOf = nVar.e(aVar) ? Long.valueOf(nVar.w(aVar)) : null;
                int i4 = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.f26204b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jB = j$.com.android.tools.r8.a.B(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeG = LocalDateTime.G(j$.com.android.tools.r8.a.A(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jB > 0) {
                        sb2.append('+');
                        sb2.append(jB);
                    }
                    sb2.append(localDateTimeG);
                    if (localDateTimeG.f26043b.f26177c == 0) {
                        sb2.append(":00");
                    }
                } else {
                    long j8 = jLongValue + 62167219200L;
                    long j9 = j8 / 315569520000L;
                    long j10 = j8 % 315569520000L;
                    LocalDateTime localDateTimeG2 = LocalDateTime.G(j10 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb2.length();
                    sb2.append(localDateTimeG2);
                    if (localDateTimeG2.f26043b.f26177c == 0) {
                        sb2.append(":00");
                    }
                    if (j9 < 0) {
                        if (localDateTimeG2.f26042a.f26118a == -10000) {
                            sb2.replace(length, length + 2, Long.toString(j9 - 1));
                        } else if (j10 == 0) {
                            sb2.insert(length, j9);
                        } else {
                            sb2.insert(length + 1, Math.abs(j9));
                        }
                    }
                }
                if (iA > 0) {
                    sb2.append('.');
                    int i10 = 100000000;
                    while (true) {
                        if (iA > 0 || i4 % 3 != 0 || i4 < -2) {
                            int i11 = iA / i10;
                            sb2.append((char) (i11 + 48));
                            iA -= i11 * i10;
                            i10 /= 10;
                            i4++;
                        }
                    }
                }
                sb2.append('Z');
                return true;
            default:
                a aVar2 = n.f26151f;
                j$.time.temporal.n nVar2 = pVar.f26161a;
                Object objL = nVar2.l(aVar2);
                if (objL == null && pVar.f26163c == 0) {
                    throw new j$.time.a("Unable to extract " + aVar2 + " from temporal " + nVar2);
                }
                j$.time.v vVar = (j$.time.v) objL;
                if (vVar == null) {
                    return false;
                }
                sb2.append(vVar.h());
                return true;
        }
    }

    public final String toString() {
        switch (this.f26133a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
