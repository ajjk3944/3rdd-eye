package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes3.dex */
public final class Ln implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C5134zn f39808a;

    /* renamed from: b, reason: collision with root package name */
    public final V f39809b;

    /* renamed from: c, reason: collision with root package name */
    public final A6 f39810c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107yl f39811d;

    /* renamed from: e, reason: collision with root package name */
    public final Te f39812e;

    /* renamed from: f, reason: collision with root package name */
    public final Ue f39813f;

    public Ln() {
        this(new C5134zn(), new V(new C4932rn()), new A6(), new C5107yl(), new Te(), new Ue());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4838o6 fromModel(Kn kn) {
        C4838o6 c4838o6 = new C4838o6();
        An an = kn.f39725a;
        if (an != null) {
            c4838o6.f41351a = this.f39808a.fromModel(an);
        }
        U u8 = kn.f39726b;
        if (u8 != null) {
            c4838o6.f41352b = this.f39809b.fromModel(u8);
        }
        List<Al> list = kn.f39727c;
        if (list != null) {
            c4838o6.f41355e = this.f39811d.fromModel(list);
        }
        String str = kn.f39731g;
        if (str != null) {
            c4838o6.f41353c = str;
        }
        c4838o6.f41354d = this.f39810c.a(kn.f39732h);
        if (!TextUtils.isEmpty(kn.f39728d)) {
            c4838o6.f41358h = this.f39812e.fromModel(kn.f39728d);
        }
        if (!TextUtils.isEmpty(kn.f39729e)) {
            c4838o6.i = kn.f39729e.getBytes();
        }
        if (!AbstractC4623fo.a(kn.f39730f)) {
            c4838o6.f41359j = this.f39813f.fromModel(kn.f39730f);
        }
        return c4838o6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ln(C5134zn c5134zn, V v10, A6 a62, C5107yl c5107yl, Te te, Ue ue) {
        this.f39809b = v10;
        this.f39808a = c5134zn;
        this.f39810c = a62;
        this.f39811d = c5107yl;
        this.f39812e = te;
        this.f39813f = ue;
    }

    public final Kn a(C4838o6 c4838o6) {
        throw new UnsupportedOperationException();
    }
}
