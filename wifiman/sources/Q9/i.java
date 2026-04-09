package Q9;

import androidx.lifecycle.E;
import f2.C5512k;
import f2.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class i {
    public static final Object a(C5512k c5512k, String key) {
        AbstractC6492s.i(c5512k, "<this>");
        AbstractC6492s.i(key, "key");
        E eK = c5512k.k();
        Object objD = eK.d(key);
        if (objD == null) {
            return null;
        }
        eK.f(key);
        return objD;
    }

    public static final void b(n nVar, String key, Object obj) {
        E eK;
        AbstractC6492s.i(nVar, "<this>");
        AbstractC6492s.i(key, "key");
        C5512k c5512kL = nVar.L();
        if (c5512kL == null || (eK = c5512kL.k()) == null) {
            return;
        }
        eK.i(key, obj);
    }
}
