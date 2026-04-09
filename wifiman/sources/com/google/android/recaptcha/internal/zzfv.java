package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzfv extends l implements InterfaceC6839p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfv(String[] strArr, zzfw zzfwVar, String str, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzfv(this.zza, this.zzb, this.zzc, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC5467b.g();
        v.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + AbstractC3689v.z0(arrayList, ",", null, null, 0, null, null, 62, null) + ")", null);
        return J.f24997a;
    }
}
