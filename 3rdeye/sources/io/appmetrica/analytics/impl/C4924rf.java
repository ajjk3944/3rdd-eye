package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4924rf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Df f41575a;

    /* renamed from: b, reason: collision with root package name */
    public final C4795mf f41576b;

    public C4924rf() {
        this(new Df(), new C4795mf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5126zf fromModel(C4873pf c4873pf) {
        C5126zf c5126zf = new C5126zf();
        c5126zf.f42186a = this.f41575a.fromModel(c4873pf.f41422a);
        c5126zf.f42187b = new C5101yf[c4873pf.f41423b.size()];
        Iterator<C4847of> it = c4873pf.f41423b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5126zf.f42187b[i] = this.f41576b.fromModel(it.next());
            i++;
        }
        return c5126zf;
    }

    public C4924rf(Df df, C4795mf c4795mf) {
        this.f41575a = df;
        this.f41576b = c4795mf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4873pf toModel(C5126zf c5126zf) {
        Cf model;
        ArrayList arrayList = new ArrayList(c5126zf.f42187b.length);
        for (C5101yf c5101yf : c5126zf.f42187b) {
            arrayList.add(this.f41576b.toModel(c5101yf));
        }
        C5076xf c5076xf = c5126zf.f42186a;
        if (c5076xf == null) {
            model = this.f41575a.toModel(new C5076xf());
        } else {
            model = this.f41575a.toModel(c5076xf);
        }
        return new C4873pf(model, arrayList);
    }
}
