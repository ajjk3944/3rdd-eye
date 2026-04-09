package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Exception {
        new m(bVar);
        String strA = a((a<IN, OUT>) in);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f6615a;
        Object objA = c.a(list, ((i) bVar).f6608a, this).a((b) in);
        return !l.a(list) ? objA : bVar.a((b<OUT>) objA);
    }

    public abstract String a(IN in);
}
