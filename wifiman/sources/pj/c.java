package Pj;

import Mj.h;
import Y6.k;
import com.squareup.moshi.JsonDataException;
import ej.InterfaceC5483g;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    private static final ej.h f18714b = ej.h.g("EFBBBF");

    /* renamed from: a, reason: collision with root package name */
    private final Y6.h f18715a;

    c(Y6.h hVar) {
        this.f18715a = hVar;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(ResponseBody responseBody) {
        InterfaceC5483g bodySource = responseBody.getBodySource();
        try {
            if (bodySource.i0(0L, f18714b)) {
                bodySource.d(r1.b0());
            }
            k kVarB0 = k.b0(bodySource);
            Object objB = this.f18715a.b(kVarB0);
            if (kVarB0.d0() != k.c.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return objB;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }
}
