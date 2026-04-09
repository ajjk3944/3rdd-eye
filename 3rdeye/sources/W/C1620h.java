package W;

import android.net.Uri;

/* compiled from: AutoValue_OutputResults.java */
/* renamed from: W.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1620h extends AbstractC1633v {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13269a;

    public C1620h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f13269a = uri;
    }

    @Override // W.AbstractC1633v
    public final Uri a() {
        return this.f13269a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1633v) {
            return this.f13269a.equals(((AbstractC1633v) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f13269a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.f13269a + "}";
    }
}
