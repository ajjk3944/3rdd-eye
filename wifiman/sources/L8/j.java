package L8;

import java.net.URI;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f11266a = new j();

    private j() {
    }

    public final URI a(String uri) {
        AbstractC6492s.i(uri, "uri");
        try {
            return URI.create(uri);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return null;
        }
    }
}
