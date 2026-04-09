package N7;

import D7.a;
import android.net.Uri;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: UrlVariable.kt */
/* loaded from: classes.dex */
public final class Dd implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5121a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5122b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5123c;

    public Dd(String name, Uri value) {
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(value, "value");
        this.f5121a = name;
        this.f5122b = value;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        Ed ed = (Ed) D7.a.f1071b.f6763ga.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        ed.getClass();
        return Ed.e(c0011a, this);
    }
}
