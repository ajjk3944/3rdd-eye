package f2;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f46866a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46867b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46868c;

    public q(Uri uri, String str, String str2) {
        this.f46866a = uri;
        this.f46867b = str;
        this.f46868c = str2;
    }

    public String a() {
        return this.f46867b;
    }

    public String b() {
        return this.f46868c;
    }

    public Uri c() {
        return this.f46866a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        AbstractC6492s.i(intent, "intent");
    }
}
