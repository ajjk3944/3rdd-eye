package lm;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.gson.j;
import com.google.gson.w;
import hm.d;
import hm.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import km.m;
import nk.k;
import rl.p;
import rl.v;
import rl.x;
import u6.t;
import vk.h;
import yf.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final p f28845c;

    /* renamed from: a, reason: collision with root package name */
    public final j f28846a;

    /* renamed from: b, reason: collision with root package name */
    public final w f28847b;

    static {
        h hVar = p.f33121d;
        f28845c = t.k("application/json; charset=UTF-8");
    }

    public b(j jVar, w wVar) {
        this.f28846a = jVar;
        this.f28847b = wVar;
    }

    @Override // km.m
    public final Object l(Object obj) throws IOException {
        e eVar = new e();
        c cVarF = this.f28846a.f(new OutputStreamWriter(new d(eVar), StandardCharsets.UTF_8));
        this.f28847b.c(cVarF, obj);
        cVarF.close();
        hm.h byteString = eVar.readByteString(eVar.f25174b);
        int i4 = x.f33190a;
        k.e(byteString, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return new v(f28845c, byteString);
    }
}
