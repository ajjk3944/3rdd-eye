package p4;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f31242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(z zVar, int i4) {
        super(0);
        this.f31241a = i4;
        this.f31242b = zVar;
    }

    @Override // mk.a
    public final Object invoke() throws IOException {
        switch (this.f31241a) {
            case 0:
                return ((g0) this.f31242b.j.getValue()).f31209c;
            default:
                d0 d0Var = this.f31242b.f31358a;
                File canonicalFile = ((File) d0Var.f31184c.invoke()).getCanonicalFile();
                synchronized (d0.f31181e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = d0.f31180d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    nk.k.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new g0(canonicalFile, d0Var.f31182a, (k0) d0Var.f31183b.invoke(canonicalFile), new b2.b(19, canonicalFile));
        }
    }
}
