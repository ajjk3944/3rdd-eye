package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class M7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final J7 f39851a;

    public M7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(L7 l72) {
        ContentValues contentValues = new ContentValues();
        Long l5 = l72.f39745a;
        if (l5 != null) {
            contentValues.put(FacebookMediationAdapter.KEY_ID, Long.valueOf(l5.longValue()));
        }
        Tk tk = l72.f39746b;
        if (tk != null) {
            contentValues.put("type", Integer.valueOf(tk.f40197a));
        }
        String str = l72.f39747c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        J7 j72 = this.f39851a;
        contentValues.put("session_description", MessageNano.toByteArray(j72.f39684a.fromModel(l72.f39748d)));
        return contentValues;
    }

    public M7(J7 j72) {
        this.f39851a = j72;
    }

    public /* synthetic */ M7(J7 j72, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new J7(null, 1, null) : j72);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L7 toModel(ContentValues contentValues) {
        Tk tk;
        Long asLong = contentValues.getAsLong(FacebookMediationAdapter.KEY_ID);
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            tk = Tk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                tk = Tk.BACKGROUND;
            }
        } else {
            tk = null;
        }
        return new L7(asLong, tk, contentValues.getAsString("report_request_parameters"), this.f39851a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
