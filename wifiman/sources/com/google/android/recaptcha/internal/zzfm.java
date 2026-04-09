package com.google.android.recaptcha.internal;

import Yg.m;
import Yg.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class zzfm {
    private final m zza;

    public zzfm() {
        int i10 = zzav.zza;
        this.zza = n.b(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws IOException, zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        AbstractC6492s.g(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
