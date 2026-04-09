package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private String f6621d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) {
        new m(bVar);
        this.f6621d = a((j<IN, OUT>) in);
        l.a aVar = a().get(this.f6621d);
        while (aVar != null) {
            List<h> list = aVar.f6624a;
            try {
                Object objA = c.a(list, bVar.f6617a, this).a((b) in);
                return !l.a(list) ? objA : bVar.a((b<OUT>) objA);
            } catch (i.a e6) {
                Throwable cause = e6.getCause();
                new m(bVar);
                this.f6621d = a(in, cause, this.f6621d);
                aVar = a().get(this.f6621d);
            } catch (Throwable th) {
                new m(bVar);
                this.f6621d = a(in, th, this.f6621d);
                aVar = a().get(this.f6621d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f6621d);
    }

    public abstract String a(IN in);

    public abstract String a(IN in, Throwable th, String str);
}
