package p6;

import java.util.HashSet;
import org.json.JSONObject;
import p6.b;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f23893c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f23894d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23895e;

    public a(b.InterfaceC0454b interfaceC0454b, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0454b);
        this.f23893c = new HashSet(hashSet);
        this.f23894d = jSONObject;
        this.f23895e = j10;
    }
}
