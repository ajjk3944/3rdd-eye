package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private String f9000d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.f9000d = a((j<IN, OUT>) in);
        l.a aVar = a().get(this.f9000d);
        while (aVar != null) {
            List<h> list = aVar.f9003a;
            try {
                Object objA = c.a(list, bVar.f8996a, this).a((b) in);
                return !l.a(list) ? objA : bVar.a((b<OUT>) objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f9000d = a(in, cause, this.f9000d);
                aVar = a().get(this.f9000d);
            } catch (Throwable th) {
                new m(bVar);
                this.f9000d = a(in, th, this.f9000d);
                aVar = a().get(this.f9000d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f9000d);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th, String str);
}
