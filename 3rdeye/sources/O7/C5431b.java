package o7;

import I9.g;
import kotlin.jvm.internal.l;
import org.json.JSONObject;

/* compiled from: JsonNode.kt */
/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5431b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f44872b;

    public C5431b(JSONObject value) {
        l.f(value, "value");
        this.f44872b = value;
    }

    @Override // I9.g
    public final String O() {
        String string = this.f44872b.toString();
        l.e(string, "value.toString()");
        return string;
    }
}
