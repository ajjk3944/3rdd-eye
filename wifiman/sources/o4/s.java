package o4;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f55292a = new CopyOnWriteArrayList();

    public static r a(String str) throws GeneralSecurityException {
        Iterator it = f55292a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.a(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
