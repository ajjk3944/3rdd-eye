package defpackage;

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nw0 extends e50 implements rx {
    public final /* synthetic */ yw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(yw0 yw0Var) {
        super(0);
        this.g = yw0Var;
    }

    @Override // defpackage.rx
    public final Object a() {
        File file = (File) this.g.a.a();
        String absolutePath = file.getAbsolutePath();
        synchronized (yw0.i) {
            LinkedHashSet linkedHashSet = yw0.h;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            i30.l(absolutePath, "it");
            linkedHashSet.add(absolutePath);
        }
        return file;
    }
}
