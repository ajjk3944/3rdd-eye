package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Pf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f39974a;

    /* renamed from: b, reason: collision with root package name */
    public final Jf f39975b;

    /* renamed from: c, reason: collision with root package name */
    public final H3 f39976c;

    /* renamed from: d, reason: collision with root package name */
    public final Tf f39977d;

    /* renamed from: e, reason: collision with root package name */
    public final La f39978e;

    /* renamed from: f, reason: collision with root package name */
    public final La f39979f;

    public Pf() {
        this(new Ee(), new Jf(), new H3(), new Tf(), new La(100), new La(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ni fromModel(Sf sf) {
        Ni niFromModel;
        Ni niFromModel2;
        Ni niA;
        Ni niA2;
        E8 e82 = new E8();
        Gn gnA = this.f39978e.a(sf.f40110a);
        e82.f39352a = StringUtils.getUTF8Bytes((String) gnA.f39550a);
        Gn gnA2 = this.f39979f.a(sf.f40111b);
        e82.f39353b = StringUtils.getUTF8Bytes((String) gnA2.f39550a);
        List<String> list = sf.f40112c;
        Ni niFromModel3 = null;
        if (list != null) {
            niFromModel = this.f39976c.fromModel(list);
            e82.f39354c = (C5044w8) niFromModel.f39906a;
        } else {
            niFromModel = null;
        }
        Map<String, String> map = sf.f40113d;
        if (map != null) {
            niFromModel2 = this.f39974a.fromModel(map);
            e82.f39355d = (C8) niFromModel2.f39906a;
        } else {
            niFromModel2 = null;
        }
        Lf lf = sf.f40114e;
        if (lf != null) {
            niA = this.f39975b.fromModel(lf);
            e82.f39356e = (D8) niA.f39906a;
        } else {
            niA = null;
        }
        Lf lf2 = sf.f40115f;
        if (lf2 != null) {
            niA2 = this.f39975b.fromModel(lf2);
            e82.f39357f = (D8) niA2.f39906a;
        } else {
            niA2 = null;
        }
        List<String> list2 = sf.f40116g;
        if (list2 != null) {
            niFromModel3 = this.f39977d.fromModel(list2);
            e82.f39358g = (F8[]) niFromModel3.f39906a;
        }
        return new Ni(e82, new C5039w3(C5039w3.b(gnA, gnA2, niFromModel, niFromModel2, niA, niA2, niFromModel3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Pf(Ee ee, Jf jf, H3 h32, Tf tf, La la2, La la3) {
        this.f39974a = ee;
        this.f39975b = jf;
        this.f39976c = h32;
        this.f39977d = tf;
        this.f39978e = la2;
        this.f39979f = la3;
    }

    public final Sf a(Ni ni) {
        throw new UnsupportedOperationException();
    }
}
