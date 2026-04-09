package com.google.ar.core;

import java.util.Map;

/* loaded from: classes3.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    final Map f38176a = new E();

    F() {
    }

    static /* synthetic */ String b(byte b10, int i10, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + b10);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public final synchronized AugmentedFace a(long j10, Session session) {
        Map map = this.f38176a;
        Long lValueOf = Long.valueOf(j10);
        AugmentedFace augmentedFace = (AugmentedFace) map.get(lValueOf);
        if (augmentedFace != null) {
            return augmentedFace;
        }
        AugmentedFace augmentedFace2 = new AugmentedFace(j10, session);
        this.f38176a.put(lValueOf, augmentedFace2);
        return augmentedFace2;
    }
}
