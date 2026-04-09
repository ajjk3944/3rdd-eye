package w6;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: CachedBitmap.java */
/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5738b {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f47495a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f47496b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC5737a f47497c;

    public C5738b(Bitmap bitmap, Uri uri, EnumC5737a enumC5737a) {
        this.f47495a = bitmap;
        this.f47496b = uri;
        this.f47497c = enumC5737a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5738b.class == obj.getClass()) {
            C5738b c5738b = (C5738b) obj;
            if (!this.f47495a.equals(c5738b.f47495a) || this.f47497c != c5738b.f47497c) {
                return false;
            }
            Uri uri = c5738b.f47496b;
            Uri uri2 = this.f47496b;
            if (uri2 != null) {
                return uri2.equals(uri);
            }
            if (uri == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f47497c.hashCode() + (this.f47495a.hashCode() * 31)) * 31;
        Uri uri = this.f47496b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }
}
