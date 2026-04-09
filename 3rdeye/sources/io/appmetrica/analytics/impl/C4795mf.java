package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.mf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4795mf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f41257a;

    public C4795mf() {
        this(new Bf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5101yf fromModel(C4847of c4847of) {
        C5101yf c5101yf = new C5101yf();
        if (!TextUtils.isEmpty(c4847of.f41374a)) {
            c5101yf.f42139a = c4847of.f41374a;
        }
        c5101yf.f42140b = c4847of.f41375b.toString();
        c5101yf.f42141c = this.f41257a.fromModel(c4847of.f41376c).intValue();
        return c5101yf;
    }

    public C4795mf(Bf bf) {
        this.f41257a = bf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4847of toModel(C5101yf c5101yf) {
        JSONObject jSONObject;
        String str = c5101yf.f42139a;
        String str2 = c5101yf.f42140b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4847of(str, jSONObject, this.f41257a.toModel(Integer.valueOf(c5101yf.f42141c)));
    }
}
