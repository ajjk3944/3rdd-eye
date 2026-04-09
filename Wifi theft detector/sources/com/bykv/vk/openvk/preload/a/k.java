package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;

/* loaded from: classes.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private IN f9001d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.f9001d = in;
        try {
            return bVar.a((b<OUT>) a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th) {
            return a((b) bVar, th);
        }
    }

    public abstract boolean a(Throwable th);

    public final IN g() {
        return this.f9001d;
    }

    private Object a(b<OUT> bVar, Throwable th) throws Throwable {
        while (a(th)) {
            try {
                return bVar.a((b<OUT>) a());
            } catch (i.a e10) {
                th = e10.getCause();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public OUT a() {
        return this.f9001d;
    }
}
