package Oj;

import Mj.h;
import com.google.gson.e;
import com.google.gson.p;
import ej.C5481e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import w5.C8270c;

/* loaded from: classes2.dex */
final class b implements h {

    /* renamed from: c, reason: collision with root package name */
    private static final MediaType f17862c = MediaType.e("application/json; charset=UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final e f17863a;

    /* renamed from: b, reason: collision with root package name */
    private final p f17864b;

    b(e eVar, p pVar) {
        this.f17863a = eVar;
        this.f17864b = pVar;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) throws IOException {
        C5481e c5481e = new C5481e();
        C8270c c8270cQ = this.f17863a.q(new OutputStreamWriter(c5481e.p0(), StandardCharsets.UTF_8));
        this.f17864b.d(c8270cQ, obj);
        c8270cQ.close();
        return RequestBody.c(f17862c, c5481e.v0());
    }
}
