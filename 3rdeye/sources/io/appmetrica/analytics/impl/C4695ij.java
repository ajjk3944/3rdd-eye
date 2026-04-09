package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ij, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4695ij implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f41087a;

    /* renamed from: b, reason: collision with root package name */
    public final H3 f41088b;

    /* renamed from: c, reason: collision with root package name */
    public final La f41089c;

    /* renamed from: d, reason: collision with root package name */
    public final La f41090d;

    public C4695ij() {
        this(new Ee(), new H3(), new La(100), new La(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(C4799mj c4799mj) {
        Ni niFromModel;
        H8 h82 = new H8();
        Gn gnA = this.f41089c.a(c4799mj.f41265a);
        h82.f39568a = StringUtils.getUTF8Bytes((String) gnA.f39550a);
        List<String> list = c4799mj.f41266b;
        Ni niA = null;
        if (list != null) {
            niFromModel = this.f41088b.fromModel(list);
            h82.f39569b = (C5044w8) niFromModel.f39906a;
        } else {
            niFromModel = null;
        }
        Gn gnA2 = this.f41090d.a(c4799mj.f41267c);
        h82.f39570c = StringUtils.getUTF8Bytes((String) gnA2.f39550a);
        Map<String, String> map = c4799mj.f41268d;
        if (map != null) {
            niA = this.f41087a.fromModel(map);
            h82.f39571d = (C8) niA.f39906a;
        }
        return new Ni(h82, new C5039w3(C5039w3.b(gnA, niFromModel, gnA2, niA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4695ij(Ee ee, H3 h32, La la2, La la3) {
        this.f41087a = ee;
        this.f41088b = h32;
        this.f41089c = la2;
        this.f41090d = la3;
    }

    public final C4799mj a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
