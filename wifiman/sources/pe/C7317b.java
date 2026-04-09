package pe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* renamed from: pe.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7317b implements InterfaceC7316a {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f57877a = Pattern.compile("^\"(.*)\"$");

    @Override // pe.InterfaceC7316a
    public String a(String value) {
        AbstractC6492s.i(value, "value");
        if (t.m0(value) || AbstractC6492s.d(value, "<unknown ssid>")) {
            return null;
        }
        Matcher matcher = this.f57877a.matcher(value);
        if (matcher.find()) {
            value = matcher.group(1);
        }
        AbstractC6492s.f(value);
        if (t.m0(value)) {
            return null;
        }
        return value;
    }
}
