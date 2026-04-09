package Oj;

import Mj.h;
import com.google.gson.JsonIOException;
import com.google.gson.e;
import com.google.gson.p;
import okhttp3.ResponseBody;
import w5.C8268a;
import w5.EnumC8269b;

/* loaded from: classes2.dex */
final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final e f17865a;

    /* renamed from: b, reason: collision with root package name */
    private final p f17866b;

    c(e eVar, p pVar) {
        this.f17865a = eVar;
        this.f17866b = pVar;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(ResponseBody responseBody) {
        C8268a c8268aP = this.f17865a.p(responseBody.h());
        try {
            Object objB = this.f17866b.b(c8268aP);
            if (c8268aP.v0() == EnumC8269b.END_DOCUMENT) {
                return objB;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
