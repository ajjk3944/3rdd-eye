package Wh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes4.dex */
public abstract class e {
    public static final Object a(h.d dVar, h.f extension) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(extension, "extension");
        if (dVar.S(extension)) {
            return dVar.J(extension);
        }
        return null;
    }

    public static final Object b(h.d dVar, h.f extension, int i10) {
        AbstractC6492s.i(dVar, "<this>");
        AbstractC6492s.i(extension, "extension");
        if (i10 < dVar.P(extension)) {
            return dVar.K(extension, i10);
        }
        return null;
    }
}
