package cb;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final EventMessage[] f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3556b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3557c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3558d;

    public f(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f3557c = str;
        this.f3558d = str2;
        this.f3556b = jArr;
        this.f3555a = eventMessageArr;
    }

    public final String a() {
        String str = this.f3557c;
        int iD = c7.a.d(1, str);
        String str2 = this.f3558d;
        return c7.a.k(c7.a.d(iD, str2), str, "/", str2);
    }
}
