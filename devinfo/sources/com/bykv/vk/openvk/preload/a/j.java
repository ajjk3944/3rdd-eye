package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private String f6612d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.f6612d = a((j<IN, OUT>) in);
        l.a aVar = a().get(this.f6612d);
        while (aVar != null) {
            List<h> list = aVar.f6615a;
            try {
                Object objA = c.a(list, bVar.f6608a, this).a((b) in);
                return !l.a(list) ? objA : bVar.a((b<OUT>) objA);
            } catch (i.a e2) {
                Throwable cause = e2.getCause();
                new m(bVar);
                this.f6612d = a(in, cause, this.f6612d);
                aVar = a().get(this.f6612d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f6612d = a(in, th2, this.f6612d);
                aVar = a().get(this.f6612d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f6612d);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th2, String str);
}
