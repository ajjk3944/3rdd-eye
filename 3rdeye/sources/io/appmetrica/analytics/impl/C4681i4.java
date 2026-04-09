package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4681i4 extends C4683i6 {

    /* renamed from: q, reason: collision with root package name */
    public HashMap f41035q;

    /* renamed from: r, reason: collision with root package name */
    public Tm f41036r;

    /* renamed from: s, reason: collision with root package name */
    public Rm f41037s;

    /* renamed from: t, reason: collision with root package name */
    public Rm f41038t;

    /* renamed from: u, reason: collision with root package name */
    public C5014v3 f41039u;

    /* renamed from: v, reason: collision with root package name */
    public Tm f41040v;

    public C4681i4(PublicLogger publicLogger) {
        this.f41035q = new HashMap();
        a(publicLogger);
    }

    public static C4683i6 b(String str, String str2) {
        C4683i6 c4683i6 = new C4683i6("", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 5376;
        c4683i6.a(str, str2);
        return c4683i6;
    }

    public static C4683i6 n() {
        C4683i6 c4683i6 = new C4683i6("", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 5632;
        return c4683i6;
    }

    public static C4683i6 o() {
        C4683i6 c4683i6 = new C4683i6("", 0);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4683i6.f41047d = 40961;
        return c4683i6;
    }

    public final void a(String str, String str2, EnumC4655h4 enumC4655h4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f41035q.remove(enumC4655h4);
        } else {
            this.f41035q.put(enumC4655h4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f41035q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f41050g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.C4683i6
    public final void c(String str) {
        Tm tm = this.f41040v;
        tm.getClass();
        this.f41051h = tm.a(str);
    }

    public final String d(String str) {
        Tm tm = this.f41036r;
        tm.getClass();
        String strA = tm.a(str);
        a(str, strA, EnumC4655h4.NAME);
        return strA;
    }

    public final String e(String str) throws UnsupportedEncodingException {
        Rm rm = this.f41037s;
        rm.getClass();
        String strA = rm.a(str);
        a(str, strA, EnumC4655h4.VALUE);
        return strA;
    }

    public final C4681i4 f(String str) throws UnsupportedEncodingException {
        Rm rm = this.f41038t;
        rm.getClass();
        String strA = rm.a(str);
        a(str, strA, EnumC4655h4.VALUE);
        this.f41045b = strA;
        return this;
    }

    public final HashMap<EnumC4655h4, Integer> p() {
        return this.f41035q;
    }

    @Override // io.appmetrica.analytics.impl.C4683i6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f41044a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.C4683i6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f41045b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.C4683i6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public C4681i4(String str, int i, PublicLogger publicLogger) {
        this("", str, i, publicLogger);
    }

    public C4681i4(String str, String str2, int i, PublicLogger publicLogger) {
        this(str, str2, i, 0, publicLogger);
    }

    public C4681i4(String str, String str2, int i, int i10, PublicLogger publicLogger) {
        this.f41035q = new HashMap();
        a(publicLogger);
        this.f41045b = e(str);
        this.f41044a = d(str2);
        setType(i);
        setCustomType(i10);
    }

    public final C4681i4 a(HashMap<EnumC4655h4, Integer> map) {
        this.f41035q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f41036r = new Tm(1000, "event name", publicLogger);
        this.f41037s = new Rm(245760, "event value", publicLogger);
        this.f41038t = new Rm(1024000, "event extended value", publicLogger);
        this.f41039u = new C5014v3(245760, "event value bytes", publicLogger);
        this.f41040v = new Tm(200, "user profile id", publicLogger);
    }

    public C4681i4(byte[] bArr, String str, int i, PublicLogger publicLogger) {
        this.f41035q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f41044a = d(str);
        setType(i);
    }

    public final void a(byte[] bArr) {
        C5014v3 c5014v3 = this.f41039u;
        c5014v3.getClass();
        byte[] bArrA = c5014v3.a(bArr);
        EnumC4655h4 enumC4655h4 = EnumC4655h4.VALUE;
        if (bArr.length != bArrA.length) {
            this.f41035q.put(enumC4655h4, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f41035q.remove(enumC4655h4);
        }
        Iterator it = this.f41035q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f41050g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static C4683i6 a(C4546co c4546co) {
        C4683i6 c4683i6O = o();
        c4683i6O.setValue(new String(Base64.encode(MessageNano.toByteArray(c4546co), 0)));
        return c4683i6O;
    }

    public static C4681i4 a(PublicLogger publicLogger, Yi yi) {
        int length;
        C4681i4 c4681i4 = new C4681i4(publicLogger);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4681i4.f41047d = 40976;
        Wi wi = new Wi();
        wi.f40348b = yi.f40425a.currency.getCurrencyCode().getBytes();
        wi.f40352f = yi.f40425a.priceMicros;
        wi.f40349c = StringUtils.stringToBytesForProtobuf(new Tm(200, "revenue productID", yi.f40429e).a(yi.f40425a.productID));
        wi.f40347a = ((Integer) WrapUtils.getOrDefault(yi.f40425a.quantity, 1)).intValue();
        Rm rm = yi.f40426b;
        String str = yi.f40425a.payload;
        rm.getClass();
        wi.f40350d = StringUtils.stringToBytesForProtobuf(rm.a(str));
        if (AbstractC4623fo.a(yi.f40425a.receipt)) {
            Ri ri = new Ri();
            String str2 = (String) yi.f40427c.a(yi.f40425a.receipt.data);
            length = !StringUtils.equalsNullSafety(yi.f40425a.receipt.data, str2) ? yi.f40425a.receipt.data.length() : 0;
            String str3 = (String) yi.f40428d.a(yi.f40425a.receipt.signature);
            ri.f40068a = StringUtils.stringToBytesForProtobuf(str2);
            ri.f40069b = StringUtils.stringToBytesForProtobuf(str3);
            wi.f40351e = ri;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(wi), Integer.valueOf(length));
        c4681i4.f41045b = c4681i4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c4681i4.f41050g = ((Integer) pair.second).intValue();
        return c4681i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4681i4 a(PublicLogger publicLogger, D d10) {
        C4681i4 c4681i4 = new C4681i4(publicLogger);
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4681i4.f41047d = 40977;
        b9.l lVarA = d10.a();
        c4681i4.f41045b = c4681i4.e(new String(Base64.encode((byte[]) lVarA.f18083b, 0)));
        c4681i4.f41050g = ((Integer) lVarA.f18084c).intValue();
        return c4681i4;
    }
}
