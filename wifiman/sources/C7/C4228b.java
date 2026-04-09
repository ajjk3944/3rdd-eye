package c7;

import Mj.h;
import b7.C4073a;
import ej.C5481e;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4228b implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final MediaType f33889b = MediaType.g("application/xml; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final C4073a f33890a;

    C4228b(C4073a c4073a) {
        this.f33890a = c4073a;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) throws IOException {
        C5481e c5481e = new C5481e();
        this.f33890a.b(c5481e, obj);
        return RequestBody.c(f33889b, c5481e.v0());
    }
}
