package io.appmetrica.analytics.impl;

import N7.C1154e9;
import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class L3 implements R5 {
    @Override // io.appmetrica.analytics.impl.R5, p9.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap mapC = AbstractC5122zb.c(asString);
        if (Dm.a(mapC)) {
            return mapC;
        }
        AbstractC4877pj.a(C1154e9.i("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
