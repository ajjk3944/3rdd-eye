package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.ov;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class b00 implements jw0.a {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f25036a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f25037b;

        /* renamed from: c, reason: collision with root package name */
        private ov.a f25038c;

        public a(sz szVar) {
            new HashSet();
            this.f25037b = new HashMap();
        }

        public final void a(jz.a aVar) {
            if (aVar != this.f25038c) {
                this.f25038c = aVar;
                this.f25036a.clear();
                this.f25037b.clear();
            }
        }
    }

    public b00(jz.a aVar, sz szVar) {
        new a(szVar).a(aVar);
    }
}
