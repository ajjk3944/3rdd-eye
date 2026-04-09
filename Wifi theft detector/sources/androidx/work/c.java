package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f4370a = new HashSet();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f4371a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4372b;

        public a(Uri uri, boolean z10) {
            this.f4371a = uri;
            this.f4372b = z10;
        }

        public Uri a() {
            return this.f4371a;
        }

        public boolean b() {
            return this.f4372b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4372b == aVar.f4372b && this.f4371a.equals(aVar.f4371a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f4371a.hashCode() * 31) + (this.f4372b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f4370a.add(new a(uri, z10));
    }

    public Set b() {
        return this.f4370a;
    }

    public int c() {
        return this.f4370a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f4370a.equals(((c) obj).f4370a);
    }

    public int hashCode() {
        return this.f4370a.hashCode();
    }
}
