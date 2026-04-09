package Qj;

import java.io.IOException;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
final class d implements Mj.h {

    /* renamed from: a, reason: collision with root package name */
    static final d f19380a = new d();

    d() {
    }

    @Override // Mj.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Character a(ResponseBody responseBody) throws IOException {
        String strC = responseBody.C();
        if (strC.length() == 1) {
            return Character.valueOf(strC.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strC.length());
    }
}
