package zb;

import cc.s;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f26837c;

    public /* synthetic */ n(boolean z10, String str, m mVar) {
        this.f26835a = z10;
        this.f26836b = str;
        this.f26837c = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        boolean z10 = this.f26835a;
        String str = this.f26836b;
        m mVar = this.f26837c;
        String str2 = (z10 || !p.b(str, mVar, true, false).f26848a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i10++;
        }
        s.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(mVar.f26834g);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b2 : bArrDigest) {
            char[] cArr2 = gc.b.f9481b;
            cArr[i11] = cArr2[(b2 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b2 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}
