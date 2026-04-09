package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vy extends uy {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f17757f = DesugarCollections.synchronizedSet(new HashSet());
    public static final DecimalFormat g = new DecimalFormat("#,###");

    /* renamed from: d, reason: collision with root package name */
    public File f17758d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17759e;

    /* JADX WARN: Code restructure failed: missing block: B:135:0x03c1, code lost:
    
        r2 = r31;
        r6 = r5;
        r25 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03c7, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03cf, code lost:
    
        if (za.i.l(3) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03d1, code lost:
    
        r3 = r10.format(r0);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 22) + java.lang.String.valueOf(r2).length());
        r5.append("Preloaded ");
        r5.append(r3);
        r5.append(" bytes from ");
        r5.append(r2);
        za.i.c(r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0403, code lost:
    
        r14.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x040c, code lost:
    
        if (r15.isFile() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x040e, code lost:
    
        r15.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x041a, code lost:
    
        r15.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x050c  */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.uy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy.b(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void q() {
        this.f17759e = true;
    }

    public final File t(File file) {
        return new File(new File(this.f17758d, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
