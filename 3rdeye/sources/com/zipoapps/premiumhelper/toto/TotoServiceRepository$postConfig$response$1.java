package com.zipoapps.premiumhelper.toto;

import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.e;
import h9.i;
import java.util.Map;
import p9.l;
import sa.u;

/* compiled from: TotoServiceRepository.kt */
@e(c = "com.zipoapps.premiumhelper.toto.TotoServiceRepository$postConfig$response$1", f = "TotoServiceRepository.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TotoServiceRepository$postConfig$response$1 extends i implements l<InterfaceC4347e<? super u<C1992A>>, Object> {
    final /* synthetic */ Map<String, String> $config;
    final /* synthetic */ String $packageName;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $userAgent;
    int label;
    final /* synthetic */ TotoServiceRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotoServiceRepository$postConfig$response$1(TotoServiceRepository totoServiceRepository, String str, String str2, Map<String, String> map, Map<String, String> map2, InterfaceC4347e<? super TotoServiceRepository$postConfig$response$1> interfaceC4347e) {
        super(1, interfaceC4347e);
        this.this$0 = totoServiceRepository;
        this.$packageName = str;
        this.$userAgent = str2;
        this.$params = map;
        this.$config = map2;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
        return new TotoServiceRepository$postConfig$response$1(this.this$0, this.$packageName, this.$userAgent, this.$params, this.$config, interfaceC4347e);
    }

    @Override // p9.l
    public final Object invoke(InterfaceC4347e<? super u<C1992A>> interfaceC4347e) {
        return ((TotoServiceRepository$postConfig$response$1) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return obj;
        }
        n.b(obj);
        TotoServiceApi totoServiceApi = this.this$0.totoServiceApi;
        String str = this.$packageName;
        String str2 = this.$userAgent;
        Map<String, String> map = this.$params;
        Map<String, String> map2 = this.$config;
        this.label = 1;
        Object objPostConfig = totoServiceApi.postConfig(str, str2, map, map2, this);
        return objPostConfig == aVar ? aVar : objPostConfig;
    }
}
