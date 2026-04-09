package com.google.gson;

import java.io.IOException;
import java.util.Date;

/* loaded from: classes2.dex */
final class DefaultDateTypeAdapter extends TypeAdapter<Date> {
    @Override // com.google.gson.TypeAdapter
    public final Date b(E5.a aVar) throws IOException {
        if (aVar.C0() == E5.b.NULL) {
            aVar.v0();
            return null;
        }
        aVar.y0();
        throw null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(E5.c cVar, Date date) throws IOException {
        if (date != null) {
            throw null;
        }
        cVar.B();
    }

    public final String toString() {
        throw null;
    }
}
