package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class c0 extends y {

    /* renamed from: g, reason: collision with root package name */
    public String f22999g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z9.a json, l9.l nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(nodeConsumer, "nodeConsumer");
        this.f23000h = true;
    }

    @Override // kotlinx.serialization.json.internal.y, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new JsonObject(t0());
    }

    @Override // kotlinx.serialization.json.internal.y, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void s0(String key, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(element, "element");
        if (!this.f23000h) {
            Map mapT0 = t0();
            String str = this.f22999g;
            if (str == null) {
                kotlin.jvm.internal.p.t("tag");
                str = null;
            }
            mapT0.put(str, element);
            this.f23000h = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.c) {
            this.f22999g = ((kotlinx.serialization.json.c) element).c();
            this.f23000h = false;
        } else {
            if (element instanceof JsonObject) {
                throw s.d(z9.p.f25457a.getDescriptor());
            }
            if (!(element instanceof kotlinx.serialization.json.a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw s.d(z9.b.f25419a.getDescriptor());
        }
    }
}
