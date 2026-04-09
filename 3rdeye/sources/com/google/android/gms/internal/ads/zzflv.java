package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflv extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final AtomicReference zzc;
    private final zzfmh zzd;

    public zzflv(Handler handler, Context context, zzfls zzflsVar, zzfmh zzfmhVar) {
        super(handler);
        this.zzc = new AtomicReference(Float.valueOf(-1.0f));
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzd = zzfmhVar;
    }

    public static /* bridge */ /* synthetic */ float zza(zzflv zzflvVar) {
        AudioManager audioManager = zzflvVar.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
            if (f10 > 1.0f) {
                return 1.0f;
            }
        }
        return f10;
    }

    private final void zzf() {
        new Thread(new zzflu(this)).start();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        zzf();
    }

    public final void zzc() {
        zzf();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzd() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
