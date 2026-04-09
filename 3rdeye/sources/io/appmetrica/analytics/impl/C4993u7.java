package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4993u7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5100ye f41714a;

    /* renamed from: b, reason: collision with root package name */
    public final C7 f41715b;

    public C4993u7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final F7 fromModel(C5043w7 c5043w7) {
        F7 f72 = new F7();
        Integer num = c5043w7.f41898a;
        if (num != null) {
            f72.f39414a = num.intValue();
        }
        String str = c5043w7.f41899b;
        if (str != null) {
            f72.f39415b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c5043w7.f41900c;
        if (str2 != null) {
            f72.f39416c = StringUtils.correctIllFormedString(str2);
        }
        Long l5 = c5043w7.f41901d;
        if (l5 != null) {
            f72.f39417d = l5.longValue();
        }
        B7 b72 = c5043w7.f41902e;
        if (b72 != null) {
            f72.f39418e = this.f41715b.fromModel(b72);
        }
        String str3 = c5043w7.f41903f;
        if (str3 != null) {
            f72.f39419f = str3;
        }
        String str4 = c5043w7.f41904g;
        if (str4 != null) {
            f72.f39420g = str4;
        }
        Long l10 = c5043w7.f41905h;
        if (l10 != null) {
            f72.f39421h = l10.longValue();
        }
        Integer num2 = c5043w7.i;
        if (num2 != null) {
            f72.i = num2.intValue();
        }
        Integer num3 = c5043w7.f41906j;
        if (num3 != null) {
            f72.f39422j = num3.intValue();
        }
        String str5 = c5043w7.f41907k;
        if (str5 != null) {
            f72.f39423k = str5;
        }
        Y8 y82 = c5043w7.f41908l;
        if (y82 != null) {
            f72.f39424l = y82.f40413a;
        }
        String str6 = c5043w7.f41909m;
        if (str6 != null) {
            f72.f39425m = str6;
        }
        EnumC5046wa enumC5046wa = c5043w7.f41910n;
        if (enumC5046wa != null) {
            f72.f39426n = enumC5046wa.f41966a;
        }
        E9 e92 = c5043w7.f41911o;
        if (e92 != null) {
            f72.f39427o = e92.f39363a;
        }
        Boolean bool = c5043w7.f41912p;
        if (bool != null) {
            f72.f39428p = this.f41714a.fromModel(bool).intValue();
        }
        Integer num4 = c5043w7.f41913q;
        if (num4 != null) {
            f72.f39429q = num4.intValue();
        }
        byte[] bArr = c5043w7.f41914r;
        if (bArr != null) {
            f72.f39430r = bArr;
        }
        return f72;
    }

    public C4993u7(C5100ye c5100ye, C7 c72) {
        this.f41714a = c5100ye;
        this.f41715b = c72;
    }

    public /* synthetic */ C4993u7(C5100ye c5100ye, C7 c72, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new C5100ye() : c5100ye, (i & 2) != 0 ? new C7(null, 1, null) : c72);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5043w7 toModel(F7 f72) {
        E9 e92;
        F7 f73 = new F7();
        int i = f72.f39414a;
        Integer numValueOf = i != f73.f39414a ? Integer.valueOf(i) : null;
        String str = f72.f39415b;
        String str2 = !kotlin.jvm.internal.l.b(str, f73.f39415b) ? str : null;
        String str3 = f72.f39416c;
        String str4 = !kotlin.jvm.internal.l.b(str3, f73.f39416c) ? str3 : null;
        long j4 = f72.f39417d;
        Long lValueOf = j4 != f73.f39417d ? Long.valueOf(j4) : null;
        B7 model = this.f41715b.toModel(f72.f39418e);
        String str5 = f72.f39419f;
        String str6 = !kotlin.jvm.internal.l.b(str5, f73.f39419f) ? str5 : null;
        String str7 = f72.f39420g;
        String str8 = !kotlin.jvm.internal.l.b(str7, f73.f39420g) ? str7 : null;
        long j10 = f72.f39421h;
        Long lValueOf2 = Long.valueOf(j10);
        if (j10 == f73.f39421h) {
            lValueOf2 = null;
        }
        int i10 = f72.i;
        Integer numValueOf2 = i10 != f73.i ? Integer.valueOf(i10) : null;
        int i11 = f72.f39422j;
        Integer numValueOf3 = i11 != f73.f39422j ? Integer.valueOf(i11) : null;
        String str9 = f72.f39423k;
        String str10 = !kotlin.jvm.internal.l.b(str9, f73.f39423k) ? str9 : null;
        int i12 = f72.f39424l;
        Integer numValueOf4 = Integer.valueOf(i12);
        if (i12 == f73.f39424l) {
            numValueOf4 = null;
        }
        Y8 y8A = numValueOf4 != null ? Y8.a(Integer.valueOf(numValueOf4.intValue())) : null;
        String str11 = f72.f39425m;
        String str12 = !kotlin.jvm.internal.l.b(str11, f73.f39425m) ? str11 : null;
        int i13 = f72.f39426n;
        Integer numValueOf5 = Integer.valueOf(i13);
        if (i13 == f73.f39426n) {
            numValueOf5 = null;
        }
        EnumC5046wa enumC5046waA = numValueOf5 != null ? EnumC5046wa.a(Integer.valueOf(numValueOf5.intValue())) : null;
        int i14 = f72.f39427o;
        Integer numValueOf6 = Integer.valueOf(i14);
        if (i14 == f73.f39427o) {
            numValueOf6 = null;
        }
        if (numValueOf6 != null) {
            int iIntValue = numValueOf6.intValue();
            E9[] e9ArrValues = E9.values();
            int length = e9ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 < length) {
                    e92 = e9ArrValues[i15];
                    E9[] e9Arr = e9ArrValues;
                    if (e92.f39363a == iIntValue) {
                        break;
                    }
                    i15++;
                    e9ArrValues = e9Arr;
                } else {
                    e92 = E9.NATIVE;
                    break;
                }
            }
        } else {
            e92 = null;
        }
        Boolean boolA = this.f41714a.a(f72.f39428p);
        int i16 = f72.f39429q;
        Integer numValueOf7 = i16 != f73.f39429q ? Integer.valueOf(i16) : null;
        byte[] bArr = f72.f39430r;
        return new C5043w7(numValueOf, str2, str4, lValueOf, model, str6, str8, lValueOf2, numValueOf2, numValueOf3, str10, y8A, str12, enumC5046waA, e92, boolA, numValueOf7, !Arrays.equals(bArr, f73.f39430r) ? bArr : null);
    }
}
