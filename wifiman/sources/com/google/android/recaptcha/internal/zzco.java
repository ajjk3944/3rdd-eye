package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.recaptcha.RecaptchaException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzco extends l implements InterfaceC6839p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzco(Application application, String str, long j10, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzco(this.zzb, this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws RecaptchaException, TimeoutCancellationException, ApiException {
        Object objG = AbstractC5467b.g();
        int i10 = this.zza;
        v.b(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj = zzcq.zzb(application, str, j10, this);
            if (obj == objG) {
                return objG;
            }
        }
        return obj;
    }
}
