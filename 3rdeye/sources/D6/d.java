package D6;

import kotlin.jvm.internal.l;
import y9.C5826h;

/* compiled from: RegexInputFilter.kt */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final C5826h f1069a;

    public d(String pattern) {
        l.f(pattern, "pattern");
        this.f1069a = new C5826h(pattern);
    }

    @Override // D6.a
    public final boolean a(String str) {
        return this.f1069a.a(str);
    }
}
