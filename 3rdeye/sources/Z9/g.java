package Z9;

import U9.F;
import U9.v;
import ia.w;
import java.util.regex.Pattern;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes3.dex */
public final class g extends F {

    /* renamed from: b, reason: collision with root package name */
    public final String f14076b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14077c;

    /* renamed from: d, reason: collision with root package name */
    public final w f14078d;

    public g(String str, long j4, w wVar) {
        this.f14076b = str;
        this.f14077c = j4;
        this.f14078d = wVar;
    }

    @Override // U9.F
    public final long contentLength() {
        return this.f14077c;
    }

    @Override // U9.F
    public final v contentType() {
        String str = this.f14076b;
        if (str == null) {
            return null;
        }
        Pattern pattern = v.f12729d;
        return v.a.b(str);
    }

    @Override // U9.F
    public final ia.g source() {
        return this.f14078d;
    }
}
