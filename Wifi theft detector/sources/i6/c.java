package i6;

import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Owner f21603a;

    /* renamed from: b, reason: collision with root package name */
    public final Owner f21604b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21605c;

    /* renamed from: d, reason: collision with root package name */
    public final CreativeType f21606d;

    /* renamed from: e, reason: collision with root package name */
    public final ImpressionType f21607e;

    public c(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        this.f21606d = creativeType;
        this.f21607e = impressionType;
        this.f21603a = owner;
        if (owner2 == null) {
            this.f21604b = Owner.NONE;
        } else {
            this.f21604b = owner2;
        }
        this.f21605c = z10;
    }

    public static c a(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        n6.g.d(creativeType, "CreativeType is null");
        n6.g.d(impressionType, "ImpressionType is null");
        n6.g.d(owner, "Impression owner is null");
        n6.g.b(owner, creativeType, impressionType);
        return new c(creativeType, impressionType, owner, owner2, z10);
    }

    public boolean b() {
        return Owner.NATIVE == this.f21603a;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        n6.c.h(jSONObject, "impressionOwner", this.f21603a);
        n6.c.h(jSONObject, "mediaEventsOwner", this.f21604b);
        n6.c.h(jSONObject, "creativeType", this.f21606d);
        n6.c.h(jSONObject, "impressionType", this.f21607e);
        n6.c.h(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f21605c));
        return jSONObject;
    }
}
