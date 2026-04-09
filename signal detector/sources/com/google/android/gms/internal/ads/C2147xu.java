package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2147xu {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17641a = new HashMap();

    public final C2093wu a(EnumC1770qu enumC1770qu, Context context, C1554mu c1554mu, L6 l6) {
        C1823ru c1823ru;
        HashMap map = this.f17641a;
        C2093wu c2093wu = (C2093wu) map.get(enumC1770qu);
        if (c2093wu != null) {
            return c2093wu;
        }
        if (enumC1770qu == EnumC1770qu.f16421a) {
            E9 e9 = H9.d7;
            G9 g9 = C2841s.f23267e.f23270c;
            int iIntValue = ((Integer) g9.a(e9)).intValue();
            int iIntValue2 = ((Integer) g9.a(H9.j7)).intValue();
            int iIntValue3 = ((Integer) g9.a(H9.l7)).intValue();
            String str = (String) g9.a(H9.n7);
            String str2 = (String) g9.a(H9.f7);
            c1823ru = new C1823ru(context, enumC1770qu, iIntValue, iIntValue2, iIntValue3, str, str2);
        } else if (enumC1770qu == EnumC1770qu.f16422b) {
            E9 e92 = H9.e7;
            G9 g92 = C2841s.f23267e.f23270c;
            int iIntValue4 = ((Integer) g92.a(e92)).intValue();
            int iIntValue5 = ((Integer) g92.a(H9.k7)).intValue();
            int iIntValue6 = ((Integer) g92.a(H9.m7)).intValue();
            String str3 = (String) g92.a(H9.o7);
            String str4 = (String) g92.a(H9.g7);
            c1823ru = new C1823ru(context, enumC1770qu, iIntValue4, iIntValue5, iIntValue6, str3, str4);
        } else if (enumC1770qu == EnumC1770qu.f16423c) {
            E9 e93 = H9.r7;
            G9 g93 = C2841s.f23267e.f23270c;
            int iIntValue7 = ((Integer) g93.a(e93)).intValue();
            int iIntValue8 = ((Integer) g93.a(H9.t7)).intValue();
            int iIntValue9 = ((Integer) g93.a(H9.u7)).intValue();
            String str5 = (String) g93.a(H9.p7);
            String str6 = (String) g93.a(H9.q7);
            c1823ru = new C1823ru(context, enumC1770qu, iIntValue7, iIntValue8, iIntValue9, str5, str6);
        } else {
            c1823ru = null;
        }
        C1338iu c1338iu = new C1338iu(c1823ru);
        C2093wu c2093wu2 = new C2093wu(c1338iu, new C1184g(c1338iu, c1554mu, l6));
        map.put(enumC1770qu, c2093wu2);
        return c2093wu2;
    }
}
