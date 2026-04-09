package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;

/* loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private IN f6622d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) {
        this.f6622d = in;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e6) {
            return a((b) bVar, e6.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    public abstract boolean a(Throwable th);

    public final IN g() {
        return this.f6622d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (a(th)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e6) {
                th = e6.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public OUT a() {
        return this.f6622d;
    }
}
