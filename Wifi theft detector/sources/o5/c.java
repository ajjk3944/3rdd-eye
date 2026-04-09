package o5;

import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Owner f23648a;

    /* renamed from: b, reason: collision with root package name */
    public final Owner f23649b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23650c;

    /* renamed from: d, reason: collision with root package name */
    public final CreativeType f23651d;

    /* renamed from: e, reason: collision with root package name */
    public final ImpressionType f23652e;

    public c(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        this.f23651d = creativeType;
        this.f23652e = impressionType;
        this.f23648a = owner;
        if (owner2 == null) {
            this.f23649b = Owner.NONE;
        } else {
            this.f23649b = owner2;
        }
        this.f23650c = z10;
    }

    public static c a(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        t5.g.c(creativeType, "CreativeType is null");
        t5.g.c(impressionType, "ImpressionType is null");
        t5.g.c(owner, "Impression owner is null");
        t5.g.b(owner, creativeType, impressionType);
        return new c(creativeType, impressionType, owner, owner2, z10);
    }

    public boolean b() {
        return Owner.NATIVE == this.f23648a;
    }

    public boolean c() {
        return Owner.NATIVE == this.f23649b;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        t5.c.h(jSONObject, "impressionOwner", this.f23648a);
        t5.c.h(jSONObject, "mediaEventsOwner", this.f23649b);
        t5.c.h(jSONObject, "creativeType", this.f23651d);
        t5.c.h(jSONObject, "impressionType", this.f23652e);
        t5.c.h(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f23650c));
        return jSONObject;
    }
}
