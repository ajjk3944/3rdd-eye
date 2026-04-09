package d4;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class l extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6843d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f6844g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(c0 c0Var, int i10) {
        super(0);
        this.f6843d = i10;
        this.f6844g = c0Var;
    }

    @Override // ar.a
    public final Object c() throws IOException {
        switch (this.f6843d) {
            case 0:
                return ((j0) this.f6844g.j.getValue()).f6832c;
            default:
                g0 g0Var = this.f6844g.f6774a;
                File canonicalFile = ((File) g0Var.f6810c.c()).getCanonicalFile();
                synchronized (g0.f6807e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = g0.f6806d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    br.l.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new j0(canonicalFile, g0Var.f6808a, (n0) g0Var.f6809b.a(canonicalFile), new as.x(9, canonicalFile));
        }
    }
}
