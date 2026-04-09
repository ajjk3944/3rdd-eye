package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class H0 implements S2 {

    /* renamed from: a, reason: collision with root package name */
    public final C2036vr f8534a;

    public H0(int i) {
        switch (i) {
            case 1:
                this.f8534a = new C2036vr();
                break;
            default:
                this.f8534a = new C2036vr(10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.U3 a(com.google.android.gms.internal.ads.InterfaceC2046w0 r18, com.google.android.gms.internal.ads.C1994v2 r19, int r20) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.H0.a(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.v2, int):com.google.android.gms.internal.ads.U3");
    }

    @Override // com.google.android.gms.internal.ads.S2
    public void h(byte[] bArr, int i, int i3, T2 t22) {
        C2244zj c2244zjA;
        C2036vr c2036vr = this.f8534a;
        c2036vr.z(i + i3, bArr);
        c2036vr.E(i);
        ArrayList arrayList = new ArrayList();
        while (c2036vr.B() > 0) {
            AbstractC0582Jp.y("Incomplete Mp4Webvtt Top Level box header found.", c2036vr.B() >= 8);
            int iB = c2036vr.b() - 8;
            if (c2036vr.b() == 1987343459) {
                CharSequence charSequenceA = null;
                C1597nj c1597njA = null;
                while (iB > 0) {
                    AbstractC0582Jp.y("Incomplete vtt cue box header found.", iB >= 8);
                    int iB2 = c2036vr.b();
                    int iB3 = c2036vr.b();
                    int i6 = iB - 8;
                    int i7 = iB2 - 8;
                    byte[] bArr2 = c2036vr.f17354a;
                    int i8 = c2036vr.f17355b;
                    String str = Vt.f12096a;
                    String str2 = new String(bArr2, i8, i7, StandardCharsets.UTF_8);
                    c2036vr.G(i7);
                    if (iB3 == 1937011815) {
                        C2211z3 c2211z3 = new C2211z3();
                        A3.c(str2, c2211z3);
                        c1597njA = c2211z3.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = A3.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    iB = i6 - i7;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (c1597njA != null) {
                    c1597njA.f15799a = charSequenceA;
                    c1597njA.f15800b = null;
                    c2244zjA = c1597njA.a();
                } else {
                    Pattern pattern = A3.f6922a;
                    C2211z3 c2211z32 = new C2211z3();
                    c2211z32.f17821c = charSequenceA;
                    c2244zjA = c2211z32.a().a();
                }
                arrayList.add(c2244zjA);
            } else {
                c2036vr.G(iB);
            }
        }
        t22.mo4b(new N2(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
