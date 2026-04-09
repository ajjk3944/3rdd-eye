package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzhc extends IOException {
    public final int zza;

    public zzhc(int i10) {
        this.zza = i10;
    }

    public zzhc(@Nullable String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzhc(@Nullable String str, @Nullable Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzhc(@Nullable Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}
