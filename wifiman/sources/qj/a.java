package Qj;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
final class a implements Mj.h {

    /* renamed from: a, reason: collision with root package name */
    static final a f19376a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final MediaType f19377b = MediaType.e("text/plain; charset=UTF-8");

    private a() {
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestBody a(Object obj) {
        return RequestBody.d(f19377b, String.valueOf(obj));
    }
}
