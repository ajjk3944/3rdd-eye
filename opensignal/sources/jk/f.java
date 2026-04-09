package jk;

import ar.k;
import br.l;
import ch.n;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final k f13763a = e.f13762d;

    @Override // jk.c
    public final boolean a(byte[] bArr, byte[] bArr2, b bVar) {
        l.e(bArr, "bytesSent");
        l.e(bArr2, "bytesReceived");
        if (bVar == null) {
            return false;
        }
        MessageDigest messageDigest = (MessageDigest) this.f13763a.a(bVar);
        messageDigest.reset();
        byte[] bArrDigest = messageDigest.digest(bArr);
        l.d(bArrDigest, "digest(...)");
        byte[] bArrCopyOf = Arrays.copyOf(bArrDigest, 6);
        l.d(bArrCopyOf, "copyOf(...)");
        boolean zEquals = Arrays.equals(bArr2, bArrCopyOf);
        n.b("UdpV3PayloadComparator", "mutationReceived: " + dr.a.a(bArr2));
        n.b("UdpV3PayloadComparator", "mutationOfSent  : " + dr.a.a(bArrCopyOf));
        return zEquals;
    }
}
