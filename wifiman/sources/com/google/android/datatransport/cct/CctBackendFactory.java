package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import d3.AbstractC5294h;
import d3.InterfaceC5290d;
import d3.InterfaceC5299m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC5290d {
    @Override // d3.InterfaceC5290d
    public InterfaceC5299m create(AbstractC5294h abstractC5294h) {
        return new d(abstractC5294h.b(), abstractC5294h.e(), abstractC5294h.d());
    }
}
