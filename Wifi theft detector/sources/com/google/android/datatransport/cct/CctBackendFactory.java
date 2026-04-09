package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import v3.d;
import y3.c;
import y3.f;
import y3.k;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements c {
    @Override // y3.c
    public k create(f fVar) {
        return new d(fVar.b(), fVar.e(), fVar.d());
    }
}
