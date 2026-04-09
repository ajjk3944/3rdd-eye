package y9;

import java.util.regex.Matcher;

/* compiled from: Regex.kt */
/* renamed from: y9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5825g implements InterfaceC5823e {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f48378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48379b;

    public C5825g(Matcher matcher, String str) {
        this.f48378a = matcher;
        this.f48379b = str;
        new C5824f(this);
    }

    public final v9.g a() {
        Matcher matcher = this.f48378a;
        return v9.h.O(matcher.start(), matcher.end());
    }

    @Override // y9.InterfaceC5823e
    public final String getValue() {
        String strGroup = this.f48378a.group();
        kotlin.jvm.internal.l.e(strGroup, "group(...)");
        return strGroup;
    }
}
