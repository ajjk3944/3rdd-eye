package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzfzb implements androidx.datastore.core.i {

    @NotNull
    public static final zzfzb zza = new zzfzb();

    @NotNull
    private static final zzfyy zzb;

    static {
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        kotlin.jvm.internal.p.d(zzfyyVarZzd, "getDefaultInstance(...)");
        zzb = zzfyyVarZzd;
    }

    private zzfzb() {
    }

    @Override // androidx.datastore.core.i
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.i
    @Nullable
    public final Object readFrom(@NotNull InputStream inputStream, @NotNull c9.c cVar) {
        try {
            zzfyy zzfyyVarZzc = zzfyy.zzc(inputStream);
            kotlin.jvm.internal.p.b(zzfyyVarZzc);
            return zzfyyVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.i
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, c9.c cVar) throws IOException {
        ((zzfyy) obj).zzaO(outputStream);
        return y8.s.f25199a;
    }
}
