package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
final class zzfzl extends SuspendLambda implements l9.p {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(String str, c9.c cVar) {
        super(2, cVar);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, cVar);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    @Override // l9.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzl) create((zzfyy) obj, (c9.c) obj2)).invokeSuspend(y8.s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zzfzaVarZza.zzd(zzfzaVarZza.zzb(), this.zzb);
        return zzfzaVarZza.zza();
    }
}
