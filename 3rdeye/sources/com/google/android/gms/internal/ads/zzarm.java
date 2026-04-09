package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzarm extends zzhfj implements Closeable {
    static {
        zzhfq.zzb(zzarm.class);
    }

    public zzarm(zzhfk zzhfkVar, zzarl zzarlVar) throws IOException {
        zze(zzhfkVar, zzhfkVar.zzc(), zzarlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
