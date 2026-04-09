package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class kr3 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static void a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        throw ex0.e(it);
    }
}
