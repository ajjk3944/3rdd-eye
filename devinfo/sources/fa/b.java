package fa;

import android.content.Context;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23852a;

    /* renamed from: b, reason: collision with root package name */
    public final na.a f23853b;

    /* renamed from: c, reason: collision with root package name */
    public final na.a f23854c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23855d;

    public b(Context context, na.a aVar, na.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f23852a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f23853b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f23854c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f23855d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f23852a.equals(bVar.f23852a) && this.f23853b.equals(bVar.f23853b) && this.f23854c.equals(bVar.f23854c) && this.f23855d.equals(bVar.f23855d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f23852a.hashCode() ^ 1000003) * 1000003) ^ this.f23853b.hashCode()) * 1000003) ^ this.f23854c.hashCode()) * 1000003) ^ this.f23855d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f23852a);
        sb2.append(", wallClock=");
        sb2.append(this.f23853b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f23854c);
        sb2.append(", backendName=");
        return h.w(sb2, this.f23855d, "}");
    }
}
