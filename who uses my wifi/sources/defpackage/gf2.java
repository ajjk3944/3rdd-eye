package defpackage;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gf2 extends ff2 {
    public static final Set k = Collections.synchronizedSet(new HashSet());
    public static final DecimalFormat l = new DecimalFormat("#,###");
    public File i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x050c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    @Override // defpackage.ff2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf2.b(java.lang.String):boolean");
    }

    @Override // defpackage.ff2
    public final void l() {
        this.j = true;
    }

    public final File o(File file) {
        return new File(new File(this.i, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
