package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Df implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f39303a = new Bf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5076xf fromModel(Cf cf) {
        C5076xf c5076xf = new C5076xf();
        if (!TextUtils.isEmpty(cf.f39260a)) {
            c5076xf.f42072a = cf.f39260a;
        }
        c5076xf.f42073b = cf.f39261b.toString();
        c5076xf.f42074c = cf.f39262c;
        c5076xf.f42075d = cf.f39263d;
        c5076xf.f42076e = this.f39303a.fromModel(cf.f39264e).intValue();
        return c5076xf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Cf toModel(C5076xf c5076xf) {
        JSONObject jSONObject;
        String str = c5076xf.f42072a;
        String str2 = c5076xf.f42073b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new Cf(str, jSONObject, c5076xf.f42074c, c5076xf.f42075d, this.f39303a.toModel(Integer.valueOf(c5076xf.f42076e)));
    }
}
