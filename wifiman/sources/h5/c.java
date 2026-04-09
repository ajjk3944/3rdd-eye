package H5;

import H5.e;
import Mj.h;
import Vi.A;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public abstract class c {
    public static final h.a a(A a10, MediaType contentType) {
        AbstractC6492s.i(a10, "<this>");
        AbstractC6492s.i(contentType, "contentType");
        return new b(contentType, new e.a(a10));
    }
}
