package s3;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: s3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7907w implements a.d {

    /* renamed from: c, reason: collision with root package name */
    public static final C7907w f61349c = a().a();

    /* renamed from: b, reason: collision with root package name */
    private final String f61350b;

    /* renamed from: s3.w$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f61351a;

        /* synthetic */ a(AbstractC7909y abstractC7909y) {
        }

        public C7907w a() {
            return new C7907w(this.f61351a, null);
        }

        public a b(String str) {
            this.f61351a = str;
            return this;
        }
    }

    /* synthetic */ C7907w(String str, AbstractC7910z abstractC7910z) {
        this.f61350b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f61350b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7907w) {
            return AbstractC7900o.a(this.f61350b, ((C7907w) obj).f61350b);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC7900o.b(this.f61350b);
    }
}
