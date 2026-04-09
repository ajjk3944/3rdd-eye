package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5093y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C5018v7 f42110a;

    public C5093y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C5068x7 c5068x7) {
        ContentValues contentValues = new ContentValues();
        Long l5 = c5068x7.f42046a;
        if (l5 != null) {
            contentValues.put("session_id", Long.valueOf(l5.longValue()));
        }
        Tk tk = c5068x7.f42047b;
        if (tk != null) {
            contentValues.put("session_type", Integer.valueOf(tk.f40197a));
        }
        Long l10 = c5068x7.f42048c;
        if (l10 != null) {
            contentValues.put("number_in_session", Long.valueOf(l10.longValue()));
        }
        EnumC4997ub enumC4997ub = c5068x7.f42049d;
        if (enumC4997ub != null) {
            contentValues.put("type", Integer.valueOf(enumC4997ub.f41758a));
        }
        Long l11 = c5068x7.f42050e;
        if (l11 != null) {
            contentValues.put("global_number", Long.valueOf(l11.longValue()));
        }
        Long l12 = c5068x7.f42051f;
        if (l12 != null) {
            contentValues.put("time", Long.valueOf(l12.longValue()));
        }
        C5018v7 c5018v7 = this.f42110a;
        contentValues.put("event_description", MessageNano.toByteArray(c5018v7.f41837a.fromModel(c5068x7.f42052g)));
        return contentValues;
    }

    public C5093y7(C5018v7 c5018v7) {
        this.f42110a = c5018v7;
    }

    public /* synthetic */ C5093y7(C5018v7 c5018v7, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new C5018v7(null, 1, 0 == true ? 1 : 0) : c5018v7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5068x7 toModel(ContentValues contentValues) {
        Tk tk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            tk = Tk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                tk = Tk.BACKGROUND;
            }
        } else {
            tk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C5068x7(asLong, tk, asLong2, asInteger2 != null ? EnumC4997ub.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f42110a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
