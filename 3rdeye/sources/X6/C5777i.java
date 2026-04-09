package x6;

import android.net.Uri;
import kotlin.jvm.internal.l;

/* compiled from: DivVideoSource.kt */
/* renamed from: x6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5777i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f47792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47793b;

    /* renamed from: c, reason: collision with root package name */
    public final C5776h f47794c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f47795d;

    public C5777i(Uri url, String mimeType, C5776h c5776h, Long l5) {
        l.f(url, "url");
        l.f(mimeType, "mimeType");
        this.f47792a = url;
        this.f47793b = mimeType;
        this.f47794c = c5776h;
        this.f47795d = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5777i)) {
            return false;
        }
        C5777i c5777i = (C5777i) obj;
        return l.b(this.f47792a, c5777i.f47792a) && l.b(this.f47793b, c5777i.f47793b) && l.b(this.f47794c, c5777i.f47794c) && l.b(this.f47795d, c5777i.f47795d);
    }

    public final int hashCode() {
        int iN = B4.g.n(this.f47792a.hashCode() * 31, 31, this.f47793b);
        C5776h c5776h = this.f47794c;
        int iHashCode = (iN + (c5776h == null ? 0 : c5776h.hashCode())) * 31;
        Long l5 = this.f47795d;
        return iHashCode + (l5 != null ? l5.hashCode() : 0);
    }

    public final String toString() {
        return "DivVideoSource(url=" + this.f47792a + ", mimeType=" + this.f47793b + ", resolution=" + this.f47794c + ", bitrate=" + this.f47795d + ')';
    }
}
