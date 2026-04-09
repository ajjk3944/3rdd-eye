package jk;

import ar.k;
import br.l;
import br.n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class e extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final e f13762d = new e(1);

    @Override // ar.k
    public final Object a(Object obj) throws NoSuchAlgorithmException {
        b bVar = (b) obj;
        l.e(bVar, "encryption");
        MessageDigest messageDigest = MessageDigest.getInstance(bVar.getDigestName());
        l.d(messageDigest, "getInstance(...)");
        return messageDigest;
    }
}
