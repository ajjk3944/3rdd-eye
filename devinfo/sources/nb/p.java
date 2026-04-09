package nb;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f29920c;

    public /* synthetic */ p(boolean z3, String str, o oVar) {
        this.f29918a = z3;
        this.f29919b = str;
        this.f29920c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        int i4 = 0;
        boolean z3 = this.f29918a;
        String str = this.f29919b;
        o oVar = this.f29920c;
        String str2 = (z3 || !r.c(str, oVar, true, false).f29936a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i4 >= 2) {
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
            i4++;
        }
        y.h(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + tb.b.b(messageDigest.digest(oVar.f29917c)) + ", atk=" + z3 + ", ver=12451000.false";
    }
}
