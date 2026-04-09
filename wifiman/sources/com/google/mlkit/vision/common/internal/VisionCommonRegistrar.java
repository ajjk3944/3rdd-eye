package com.google.mlkit.vision.common.internal;

import E3.k;
import F4.c;
import F4.d;
import F4.g;
import F4.q;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;

/* loaded from: classes3.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return k.y(c.e(a.class).b(q.m(a.C1227a.class)).e(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // F4.g
            public final Object a(d dVar) {
                return new a(dVar.g(a.C1227a.class));
            }
        }).c());
    }
}
