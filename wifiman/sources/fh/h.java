package Fh;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes4.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Zh.b bVar) {
        String strB = bVar.g().b();
        AbstractC6492s.h(strB, "asString(...)");
        String strK = t.K(strB, '.', '$', false, 4, null);
        if (bVar.f().d()) {
            return strK;
        }
        return bVar.f() + '.' + strK;
    }
}
