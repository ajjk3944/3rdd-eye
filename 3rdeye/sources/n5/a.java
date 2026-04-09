package N5;

import N5.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<String> f4669c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f4670d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4671e;

    public a(b.a aVar, HashSet<String> hashSet, JSONObject jSONObject, long j4) {
        super(aVar);
        this.f4669c = new HashSet<>(hashSet);
        this.f4670d = jSONObject;
        this.f4671e = j4;
    }
}
