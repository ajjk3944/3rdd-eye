package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class m12 {

    /* renamed from: a, reason: collision with root package name */
    private final eo f30152a;

    /* renamed from: b, reason: collision with root package name */
    private final b f30153b;

    public static abstract class a extends AbstractC4117h<String> {

        /* renamed from: d, reason: collision with root package name */
        final CharSequence f30154d;

        /* renamed from: e, reason: collision with root package name */
        final eo f30155e;

        /* renamed from: g, reason: collision with root package name */
        int f30157g = 0;

        /* renamed from: f, reason: collision with root package name */
        final boolean f30156f = false;

        /* renamed from: h, reason: collision with root package name */
        int f30158h = Integer.MAX_VALUE;

        public a(m12 m12Var, CharSequence charSequence) {
            this.f30155e = m12Var.f30152a;
            this.f30154d = charSequence;
        }
    }

    public interface b {
    }

    private m12(l12 l12Var, eo eoVar) {
        this.f30153b = l12Var;
        this.f30152a = eoVar;
    }

    public final List<String> a(CharSequence charSequence) {
        charSequence.getClass();
        l12 l12Var = (l12) this.f30153b;
        l12Var.getClass();
        k12 k12Var = new k12(l12Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (k12Var.hasNext()) {
            arrayList.add(k12Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static m12 a(char c10) {
        return new m12(new l12(new eo.b(c10)), eo.d.f26956c);
    }
}
