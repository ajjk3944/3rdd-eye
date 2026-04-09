package com.unity3d.ads.core.data.repository;

import c9.c;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l9.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.i;
import y8.s;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "", "sdkConfig", "isInit"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AndroidSessionRepository$persistedNativeConfiguration$1 extends SuspendLambda implements q {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public AndroidSessionRepository$persistedNativeConfiguration$1(c cVar) {
        super(3, cVar);
    }

    @Nullable
    public final Object invoke(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z10, @Nullable c cVar) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(cVar);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z10;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        return i.a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, d9.a.a(this.Z$0));
    }

    @Override // l9.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((NativeConfigurationOuterClass.NativeConfiguration) obj, ((Boolean) obj2).booleanValue(), (c) obj3);
    }
}
