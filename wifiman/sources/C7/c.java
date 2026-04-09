package c7;

import Mj.h;
import b7.C4073a;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private final C4073a f33891a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f33892b;

    c(C4073a c4073a, Class cls) {
        this.f33891a = c4073a;
        this.f33892b = cls;
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(ResponseBody responseBody) {
        try {
            return this.f33891a.a(responseBody.getSource(), this.f33892b);
        } finally {
            responseBody.close();
        }
    }
}
