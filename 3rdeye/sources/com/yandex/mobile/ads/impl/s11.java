package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.av;
import com.yandex.mobile.ads.impl.pj2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class s11 extends jy1 {

    /* renamed from: m, reason: collision with root package name */
    private final uf1 f32837m = new uf1();

    @Override // com.yandex.mobile.ads.impl.jy1
    public final b32 a(byte[] bArr, int i, boolean z10) throws d32 {
        av avVarA;
        this.f32837m.a(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (this.f32837m.a() > 0) {
            if (this.f32837m.a() < 8) {
                throw new d32("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iH = this.f32837m.h();
            if (this.f32837m.h() == 1987343459) {
                uf1 uf1Var = this.f32837m;
                int i10 = iH - 8;
                CharSequence charSequenceA = null;
                av.a aVarA = null;
                while (i10 > 0) {
                    if (i10 < 8) {
                        throw new d32("Incomplete vtt cue box header found.");
                    }
                    int iH2 = uf1Var.h();
                    int iH3 = uf1Var.h();
                    int i11 = iH2 - 8;
                    String strA = s82.a(uf1Var.c(), uf1Var.d(), i11);
                    uf1Var.f(i11);
                    i10 = (i10 - 8) - i11;
                    if (iH3 == 1937011815) {
                        aVarA = pj2.a(strA);
                    } else if (iH3 == 1885436268) {
                        charSequenceA = pj2.a(null, strA.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (aVarA != null) {
                    avVarA = aVarA.a(charSequenceA).a();
                } else {
                    Pattern pattern = pj2.f31776a;
                    pj2.d dVar = new pj2.d();
                    dVar.f31791c = charSequenceA;
                    avVarA = dVar.a().a();
                }
                arrayList.add(avVarA);
            } else {
                this.f32837m.f(iH - 8);
            }
        }
        return new t11(arrayList);
    }
}
