package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1606ji implements InterfaceC0691Mw {
    public static byte[] A0o;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final Uri A0C;
    public final EnumC0690Mv A0D;
    public final AbstractC1601jd A0E;
    public final C0898Vb A0F;
    public final C0898Vb A0G;
    public final C0898Vb A0H;
    public final C0899Vc A0I;
    public final EnumC0902Vf A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final Collection<String> A0g;
    public final List<C1606ji> A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    static {
        A01();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1606ji(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C0898Vb c0898Vb, AbstractC1601jd abstractC1601jd, C0898Vb c0898Vb2, C0898Vb c0898Vb3, C0899Vc c0899Vc, String str16, String str17, long j, EnumC0902Vf enumC0902Vf, boolean z3, int i4, int i10, List<C1606ji> list, String str18, String str19, int i11, String str20, Uri uri, String str21, boolean z10, boolean z11, int i12, int i13, int i14, int i15, EnumC0690Mv enumC0690Mv, Collection<String> collection, int i16, boolean z12, int i17, boolean z13, int i18, boolean z14, int i19) {
        this.A0M = str;
        this.A0K = str2;
        this.A0Y = str3;
        this.A0Z = str4;
        this.A0W = str5;
        this.A0V = str6;
        this.A0O = str7;
        this.A0T = str8;
        this.A0P = str9;
        this.A0U = str10;
        this.A0X = str11;
        this.A0S = str12;
        this.A0R = str13;
        this.A0Q = str14;
        this.A0L = str15;
        this.A0F = c0898Vb;
        this.A0E = abstractC1601jd;
        this.A0G = c0898Vb2;
        this.A0H = c0898Vb3;
        this.A0I = c0899Vc;
        this.A0f = str16;
        this.A0e = str17;
        this.A0B = j;
        this.A0J = enumC0902Vf;
        this.A0j = z3;
        this.A0h = list;
        this.A0a = str18;
        this.A0c = str19;
        this.A0N = A00(0, 9, 50);
        this.A02 = i4;
        this.A01 = i10;
        this.A00 = i11;
        this.A0b = str20;
        this.A0C = uri;
        this.A0d = str21;
        this.A0m = z10;
        this.A0n = z11;
        this.A06 = i12;
        this.A07 = i13;
        this.A09 = i14;
        this.A0A = i15;
        this.A0D = enumC0690Mv;
        this.A0g = collection;
        this.A03 = i16;
        this.A0i = z12;
        this.A08 = i17;
        this.A0k = z13;
        this.A04 = i18;
        this.A0l = z14;
        this.A05 = i19;
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0o = new byte[]{-122, -87, -120, -83, -76, -82, -88, -86, -72};
    }

    public C1606ji() {
        this.A0M = null;
        this.A0K = null;
        this.A0Y = null;
        this.A0Z = null;
        this.A0W = null;
        this.A0V = null;
        this.A0O = null;
        this.A0T = null;
        this.A0P = null;
        this.A0U = null;
        this.A0X = null;
        this.A0S = null;
        this.A0R = null;
        this.A0Q = null;
        this.A0L = null;
        this.A0N = null;
        this.A0E = null;
        this.A0G = null;
        this.A0H = null;
        this.A0I = null;
        this.A0e = null;
        this.A0f = null;
        this.A0F = null;
        this.A0B = -1L;
        this.A0J = EnumC0902Vf.A03;
        this.A0j = false;
        this.A02 = -1;
        this.A01 = 0;
        this.A0i = false;
        String strA00 = A00(0, 0, 51);
        this.A0a = strA00;
        this.A0c = strA00;
        this.A00 = 0;
        this.A0b = null;
        this.A0C = null;
        this.A0d = null;
        this.A0m = false;
        this.A0n = false;
        this.A06 = 0;
        this.A07 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0D = null;
        this.A0g = null;
        this.A03 = 0;
        this.A0h = null;
        this.A08 = 0;
        this.A0k = false;
        this.A04 = 10;
        this.A0l = false;
        this.A05 = 1;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A03;
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A06;
    }

    public final int A09() {
        return this.A07;
    }

    public final int A0A() {
        return this.A08;
    }

    public final int A0B() {
        return this.A09;
    }

    public final int A0C() {
        return this.A0A;
    }

    public final long A0D() {
        return this.A0B;
    }

    public final Uri A0E() {
        return this.A0C;
    }

    public final AbstractC1601jd A0F() {
        return this.A0E;
    }

    public final C0898Vb A0G() {
        return this.A0F;
    }

    public final C0898Vb A0H() {
        return this.A0H;
    }

    public final C0898Vb A0I() {
        return this.A0G;
    }

    public final C0899Vc A0J() {
        return this.A0I;
    }

    public final EnumC0902Vf A0K() {
        return this.A0J;
    }

    public final String A0L() {
        return this.A0K;
    }

    public final String A0M() {
        return this.A0M;
    }

    public final String A0N() {
        return this.A0N;
    }

    public final String A0O() {
        return this.A0O;
    }

    public final String A0P() {
        return this.A0P;
    }

    public final String A0Q() {
        return this.A0Q;
    }

    public final String A0R() {
        return this.A0R;
    }

    public final String A0S() {
        return this.A0S;
    }

    public final String A0T() {
        return this.A0T;
    }

    public final String A0U() {
        return this.A0U;
    }

    public final String A0V() {
        return this.A0W;
    }

    public final String A0W() {
        return this.A0X;
    }

    public final String A0X() {
        return this.A0Y;
    }

    public final String A0Y() {
        return this.A0Z;
    }

    public final String A0Z() {
        return this.A0L;
    }

    public final String A0a() {
        return this.A0b;
    }

    public final String A0b() {
        return this.A0c;
    }

    public final String A0c() {
        return this.A0d;
    }

    public final String A0d() {
        return this.A0e;
    }

    public final String A0e() {
        return this.A0f;
    }

    public final List<C1606ji> A0f() {
        return this.A0h;
    }

    public final boolean A0g() {
        return this.A0l;
    }

    public final boolean A0h() {
        return this.A0k;
    }

    public final boolean A0i() {
        return this.A0i;
    }

    public final boolean A0j() {
        return this.A0j;
    }

    public final boolean A0k() {
        return this.A0m;
    }

    public final boolean A0l() {
        return this.A0n;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final String A7O() {
        return this.A0a;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final Collection<String> A7p() {
        return this.A0g;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0691Mw
    public final EnumC0690Mv A8K() {
        return this.A0D;
    }
}
