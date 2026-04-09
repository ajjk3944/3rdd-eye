package f6;

import f6.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f21143c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f21144d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21145e;

    public a(b.InterfaceC0394b interfaceC0394b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0394b);
        this.f21143c = new HashSet(hashSet);
        this.f21144d = jSONObject;
        this.f21145e = j10;
    }
}
