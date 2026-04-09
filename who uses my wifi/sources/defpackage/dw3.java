package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dw3 {
    public final HashMap a;
    public final HashMap b;

    public /* synthetic */ dw3(mr2 mr2Var) {
        this.a = new HashMap((HashMap) mr2Var.g);
        this.b = new HashMap((HashMap) mr2Var.h);
    }

    public final Object a(gi2 gi2Var, Class cls) throws GeneralSecurityException {
        cw3 cw3Var = new cw3(gi2Var.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(cw3Var)) {
            return ((aw3) map.get(cw3Var)).c.mo19b(gi2Var);
        }
        String string = cw3Var.toString();
        throw new GeneralSecurityException(ex0.l(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object b(jr3 jr3Var, hv3 hv3Var, Class cls) throws GeneralSecurityException {
        HashMap map = this.b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        ew3 ew3Var = (ew3) map.get(cls);
        return ew3Var.b(jr3Var, hv3Var, new lv2(this, ew3Var, 12));
    }
}
