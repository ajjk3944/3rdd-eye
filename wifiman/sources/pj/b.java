package Pj;

import Mj.h;
import Y6.o;
import ej.C5481e;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final MediaType f18712b = MediaType.e("application/json; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Y6.h f18713a;

    b(Y6.h hVar) {
        this.f18713a = hVar;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) {
        C5481e c5481e = new C5481e();
        this.f18713a.j(o.S(c5481e), obj);
        return RequestBody.c(f18712b, c5481e.v0());
    }
}
