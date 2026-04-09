package com.ubnt.teleport.unifi.util.moshi;

import Y6.f;
import Y6.h;
import Y6.k;
import Y6.o;
import Y6.u;
import ej.C5481e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ubnt/teleport/unifi/util/moshi/ForcedStringValueAdapter;", "", "<init>", "()V", "LY6/o;", "writer", "", "string", "LYg/J;", "toJson", "(LY6/o;Ljava/lang/String;)V", "LY6/k;", "reader", "LY6/h;", "delegate", "fromJson", "(LY6/k;LY6/h;)Ljava/lang/String;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ForcedStringValueAdapter {
    @f
    @ForcedStringValue
    public final String fromJson(k reader, h<Object> delegate) {
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(delegate, "delegate");
        String strI = delegate.i(reader.o0());
        AbstractC6492s.h(strI, "delegate.toJson(data)");
        return strI;
    }

    @u
    public final void toJson(o writer, @ForcedStringValue String string) {
        AbstractC6492s.i(writer, "writer");
        AbstractC6492s.i(string, "string");
        writer.p0(new C5481e().F(string));
    }
}
