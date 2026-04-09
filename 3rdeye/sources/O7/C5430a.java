package o7;

import I9.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;

/* compiled from: JsonNode.kt */
/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5430a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f44871b;

    public C5430a(JSONArray jSONArray) {
        this.f44871b = jSONArray;
    }

    @Override // I9.g
    public final String O() {
        String string = this.f44871b.toString();
        l.e(string, "value.toString()");
        return string;
    }
}
