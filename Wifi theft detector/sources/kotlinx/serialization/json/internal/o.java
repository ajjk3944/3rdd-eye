package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public abstract class o {
    public static final j a(d0 sb, z9.a json) {
        kotlin.jvm.internal.p.e(sb, "sb");
        kotlin.jvm.internal.p.e(json, "json");
        return json.e().h() ? new n(sb, json) : new j(sb);
    }
}
