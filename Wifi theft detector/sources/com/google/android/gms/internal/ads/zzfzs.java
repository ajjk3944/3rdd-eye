package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
final class zzfzs extends SuspendLambda implements l9.p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzs(zzfyu zzfyuVar, c9.c cVar) {
        super(2, cVar);
        this.zzb = zzfyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, cVar);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // l9.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (c9.c) obj2)).invokeSuspend(y8.s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        kotlin.c.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzievVarZzb = zzfzaVarZza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String strZza = zzfyuVar.zza();
        kotlin.jvm.internal.p.d(strZza, "getGwsQueryId(...)");
        zzfzaVarZza.zzc(zzievVarZzb, strZza, zzfyuVar);
        return zzfzaVarZza.zza();
    }
}
