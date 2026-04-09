package com.zipoapps.premiumhelper.toto;

import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Map;
import sa.u;
import ua.f;
import ua.i;
import ua.k;
import ua.o;
import ua.s;

/* compiled from: TotoServiceApi.kt */
/* loaded from: classes3.dex */
public interface TotoServiceApi {
    @f("/v1/apps/{package}/config")
    Object getConfig(@s("package") String str, @i("User-Agent") String str2, InterfaceC4347e<? super u<Map<String, Map<String, Integer>>>> interfaceC4347e);

    @o("/v1/apps/{package}/config")
    Object postConfig(@s("package") String str, @i("User-Agent") String str2, @ua.u Map<String, String> map, @ua.a Map<String, String> map2, InterfaceC4347e<? super u<C1992A>> interfaceC4347e);

    @k({"Content-Type: application/json"})
    @o("api/v1/register")
    Object register(@ua.a RegisterTotoRequest registerTotoRequest, @i("User-Agent") String str, InterfaceC4347e<? super u<C1992A>> interfaceC4347e);
}
