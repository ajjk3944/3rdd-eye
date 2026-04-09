package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Pg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5134zn f39980a;

    /* renamed from: b, reason: collision with root package name */
    public final V f39981b;

    /* renamed from: c, reason: collision with root package name */
    public final A6 f39982c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107yl f39983d;

    /* renamed from: e, reason: collision with root package name */
    public final Te f39984e;

    /* renamed from: f, reason: collision with root package name */
    public final Ue f39985f;

    public Pg() {
        this(new C5134zn(), new V(new C4932rn()), new A6(), new C5107yl(), new Te(), new Ue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4890q6 fromModel(Og og) {
        C4890q6 c4890q6 = new C4890q6();
        c4890q6.f41461f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(og.f39939a, c4890q6.f41461f));
        Kn kn = og.f39940b;
        if (kn != null) {
            An an = kn.f39725a;
            if (an != null) {
                c4890q6.f41456a = this.f39980a.fromModel(an);
            }
            U u8 = kn.f39726b;
            if (u8 != null) {
                c4890q6.f41457b = this.f39981b.fromModel(u8);
            }
            List<Al> list = kn.f39727c;
            if (list != null) {
                c4890q6.f41460e = this.f39983d.fromModel(list);
            }
            c4890q6.f41458c = (String) WrapUtils.getOrDefault(kn.f39731g, c4890q6.f41458c);
            c4890q6.f41459d = this.f39982c.a(kn.f39732h);
            if (!TextUtils.isEmpty(kn.f39728d)) {
                c4890q6.i = this.f39984e.fromModel(kn.f39728d);
            }
            if (!TextUtils.isEmpty(kn.f39729e)) {
                c4890q6.f41464j = kn.f39729e.getBytes();
            }
            if (!AbstractC4623fo.a(kn.f39730f)) {
                c4890q6.f41465k = this.f39985f.fromModel(kn.f39730f);
            }
        }
        return c4890q6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Pg(C5134zn c5134zn, V v10, A6 a62, C5107yl c5107yl, Te te, Ue ue) {
        this.f39980a = c5134zn;
        this.f39981b = v10;
        this.f39982c = a62;
        this.f39983d = c5107yl;
        this.f39984e = te;
        this.f39985f = ue;
    }

    public final Og a(C4890q6 c4890q6) {
        throw new UnsupportedOperationException();
    }
}
