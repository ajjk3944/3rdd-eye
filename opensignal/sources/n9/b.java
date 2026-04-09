package n9;

import android.content.Context;
import w.g;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17398a;

    /* renamed from: b, reason: collision with root package name */
    public final v9.a f17399b;

    /* renamed from: c, reason: collision with root package name */
    public final v9.a f17400c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17401d;

    public b(Context context, v9.a aVar, v9.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f17398a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f17399b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f17400c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f17401d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            b bVar = (b) ((d) obj);
            if (this.f17398a.equals(bVar.f17398a) && this.f17399b.equals(bVar.f17399b) && this.f17400c.equals(bVar.f17400c) && this.f17401d.equals(bVar.f17401d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17398a.hashCode() ^ 1000003) * 1000003) ^ this.f17399b.hashCode()) * 1000003) ^ this.f17400c.hashCode()) * 1000003) ^ this.f17401d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f17398a);
        sb2.append(", wallClock=");
        sb2.append(this.f17399b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f17400c);
        sb2.append(", backendName=");
        return g.j(sb2, this.f17401d, "}");
    }
}
