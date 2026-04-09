package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static final LibraryVersion zzb = new LibraryVersion();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    public LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getVersion(@androidx.annotation.NonNull java.lang.String r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "LibraryVersion"
            java.lang.String r1 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r1)
            java.lang.String r1 = " version is "
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.util.concurrent.ConcurrentHashMap r3 = r8.zzc
            boolean r4 = r3.containsKey(r9)
            if (r4 == 0) goto L1a
            java.lang.Object r9 = r3.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r3 = new java.util.Properties
            r3.<init>()
            r4 = 0
            java.lang.String r5 = "/%s.properties"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L91
            r7 = 0
            r6[r7] = r9     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L91
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L91
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r6 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r5 = r6.getResourceAsStream(r5)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L91
            if (r5 == 0) goto L6e
            r3.load(r5)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            java.lang.String r6 = "version"
            java.lang.String r4 = r3.getProperty(r6, r4)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            com.google.android.gms.common.internal.GmsLogger r3 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r6 = r6 + 12
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r6 = r6 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r7.append(r9)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r7.append(r1)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r7.append(r4)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r3.v(r0, r1)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            goto Lb4
        L68:
            r9 = move-exception
            goto L8d
        L6a:
            r1 = move-exception
            r3 = r4
            r4 = r5
            goto L94
        L6e:
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            int r3 = r3 + 43
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r6.append(r2)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r6.append(r9)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            r1.w(r0, r3)     // Catch: java.lang.Throwable -> L68 java.io.IOException -> L6a
            goto Lb4
        L8d:
            r4 = r5
            goto Lca
        L8f:
            r1 = move-exception
            goto L93
        L91:
            r9 = move-exception
            goto Lca
        L93:
            r3 = r4
        L94:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.android.gms.common.internal.LibraryVersion.zza     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L91
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L91
            int r6 = r6 + 43
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L91
            r7.append(r2)     // Catch: java.lang.Throwable -> L91
            r7.append(r9)     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L91
            r5.e(r0, r2, r1)     // Catch: java.lang.Throwable -> L91
            r5 = r4
            r4 = r3
        Lb4:
            if (r5 == 0) goto Lb9
            com.google.android.gms.common.util.IOUtils.closeQuietly(r5)
        Lb9:
            if (r4 != 0) goto Lc4
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.common.internal.LibraryVersion.zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r1.d(r0, r2)
            java.lang.String r4 = "UNKNOWN"
        Lc4:
            java.util.concurrent.ConcurrentHashMap r0 = r8.zzc
            r0.put(r9, r4)
            return r4
        Lca:
            if (r4 == 0) goto Lcf
            com.google.android.gms.common.util.IOUtils.closeQuietly(r4)
        Lcf:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
