package di;

import Bh.G;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* renamed from: di.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5396e extends r {
    public C5396e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c10) ? String.valueOf(c10) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // di.AbstractC5398g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 a(G module) {
        AbstractC6492s.i(module, "module");
        AbstractC7346d0 abstractC7346d0U = module.q().u();
        AbstractC6492s.h(abstractC7346d0U, "getCharType(...)");
        return abstractC7346d0U;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        AbstractC6492s.h(str, "format(...)");
        return str;
    }
}
