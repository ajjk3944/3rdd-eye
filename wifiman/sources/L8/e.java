package L8;

import java.net.URI;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f11263a = new e();

    private e() {
    }

    public final URI a(String domain) {
        AbstractC6492s.i(domain, "domain");
        return j.f11266a.a("https://www.google.com/s2/favicons?sz=64&domain=" + domain);
    }
}
