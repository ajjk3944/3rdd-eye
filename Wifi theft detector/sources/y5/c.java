package y5;

import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import d6.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Owner f25129a;

    /* renamed from: b, reason: collision with root package name */
    public final Owner f25130b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25131c;

    /* renamed from: d, reason: collision with root package name */
    public final CreativeType f25132d;

    /* renamed from: e, reason: collision with root package name */
    public final ImpressionType f25133e;

    public c(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        this.f25132d = creativeType;
        this.f25133e = impressionType;
        this.f25129a = owner;
        if (owner2 == null) {
            this.f25130b = Owner.NONE;
        } else {
            this.f25130b = owner2;
        }
        this.f25131c = z10;
    }

    public static c a(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        g.c(creativeType, "CreativeType is null");
        g.c(impressionType, "ImpressionType is null");
        g.c(owner, "Impression owner is null");
        g.b(owner, creativeType, impressionType);
        return new c(creativeType, impressionType, owner, owner2, z10);
    }

    public boolean b() {
        return Owner.NATIVE == this.f25129a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        d6.c.i(jSONObject, "impressionOwner", this.f25129a);
        d6.c.i(jSONObject, "mediaEventsOwner", this.f25130b);
        d6.c.i(jSONObject, "creativeType", this.f25132d);
        d6.c.i(jSONObject, "impressionType", this.f25133e);
        d6.c.i(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f25131c));
        return jSONObject;
    }
}
