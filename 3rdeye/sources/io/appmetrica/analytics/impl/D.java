package io.appmetrica.analytics.impl;

import c9.C2078B;
import c9.C2092m;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final AdRevenue f39271a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f39272b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4934s f39273c;

    /* renamed from: d, reason: collision with root package name */
    public final Tm f39274d;

    /* renamed from: e, reason: collision with root package name */
    public final Rm f39275e;

    public D(AdRevenue adRevenue, boolean z10, C4519bn c4519bn, PublicLogger publicLogger) {
        this.f39271a = adRevenue;
        this.f39272b = z10;
        this.f39273c = c4519bn;
        this.f39274d = new Tm(100, "ad revenue strings", publicLogger);
        this.f39275e = new Rm(30720, "ad revenue payload", publicLogger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b9.l a() {
        r rVar = new r();
        int length = 0;
        for (b9.l lVar : C2092m.W(new b9.l(this.f39271a.adNetwork, new C5035w(rVar)), new b9.l(this.f39271a.adPlacementId, new C5060x(rVar)), new b9.l(this.f39271a.adPlacementName, new C5085y(rVar)), new b9.l(this.f39271a.adUnitId, new C5110z(rVar)), new b9.l(this.f39271a.adUnitName, new A(rVar)), new b9.l(this.f39271a.precision, new B(rVar)), new b9.l(this.f39271a.currency.getCurrencyCode(), new C(rVar)))) {
            String str = (String) lVar.f18083b;
            p9.l lVar2 = (p9.l) lVar.f18084c;
            Tm tm = this.f39274d;
            tm.getClass();
            String strA = tm.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            lVar2.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) E.f39320a.get(this.f39271a.adType);
        rVar.f41517d = num != null ? num.intValue() : 0;
        C4883q c4883q = new C4883q();
        BigDecimal bigDecimal = this.f39271a.adRevenue;
        BigInteger bigInteger = Q7.f40009a;
        int i = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(Q7.f40009a) <= 0 && bigIntegerUnscaledValue.compareTo(Q7.f40010b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i++;
        }
        Long lValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
        Integer numValueOf = Integer.valueOf(i);
        long jLongValue = lValueOf.longValue();
        int iIntValue = numValueOf.intValue();
        c4883q.f41443a = jLongValue;
        c4883q.f41444b = iIntValue;
        rVar.f41515b = c4883q;
        Map<String, String> map = this.f39271a.payload;
        String strB = AbstractC5122zb.b(this.f39273c.a(map != null ? C2078B.u(map) : new LinkedHashMap()));
        Rm rm = this.f39275e;
        rm.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(rm.a(strB));
        rVar.f41523k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f39272b) {
            rVar.f41514a = "autocollected".getBytes(C5819a.f48359b);
        }
        return new b9.l(MessageNano.toByteArray(rVar), Integer.valueOf(length2));
    }
}
