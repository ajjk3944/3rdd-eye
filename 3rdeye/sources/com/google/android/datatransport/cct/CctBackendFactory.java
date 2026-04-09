package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import w3.b;
import z3.d;
import z3.h;
import z3.k;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // z3.d
    public k create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
