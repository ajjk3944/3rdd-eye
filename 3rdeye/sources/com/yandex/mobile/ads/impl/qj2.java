package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class qj2 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final uf1 f32234m = new uf1();

    /* renamed from: n, reason: collision with root package name */
    private final mj2 f32235n = new mj2();

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) throws yf1, d32 {
        oj2 oj2VarA;
        this.f32234m.a(i, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            uf1 uf1Var = this.f32234m;
            int i10 = rj2.f32673a;
            int iD = uf1Var.d();
            String strJ = uf1Var.j();
            if (strJ == null || !strJ.startsWith("WEBVTT")) {
                uf1Var.e(iD);
                throw yf1.a("Expected WEBVTT. Got " + uf1Var.j(), (Exception) null);
            }
            while (!TextUtils.isEmpty(this.f32234m.j())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                uf1 uf1Var2 = this.f32234m;
                int iD2 = 0;
                char c10 = 65535;
                while (c10 == 65535) {
                    iD2 = uf1Var2.d();
                    String strJ2 = uf1Var2.j();
                    c10 = strJ2 == null ? (char) 0 : "STYLE".equals(strJ2) ? (char) 2 : strJ2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                uf1Var2.e(iD2);
                if (c10 == 0) {
                    return new sj2(arrayList2);
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(this.f32234m.j())) {
                    }
                } else if (c10 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new d32("A style block was found after the first cue.");
                    }
                    this.f32234m.j();
                    arrayList.addAll(this.f32235n.a(this.f32234m));
                } else if (c10 == 3 && (oj2VarA = pj2.a(this.f32234m, arrayList)) != null) {
                    arrayList2.add(oj2VarA);
                }
            }
        } catch (yf1 e4) {
            throw new d32(e4);
        }
    }
}
