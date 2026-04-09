package t;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8015b {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f61657a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f61658b;

    public C8015b(Uri uri, Bundle bundle) {
        this.f61657a = uri;
        this.f61658b = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8015b)) {
            return false;
        }
        C8015b c8015b = (C8015b) obj;
        return AbstractC6492s.d(this.f61657a, c8015b.f61657a) && AbstractC6492s.d(this.f61658b, c8015b.f61658b);
    }

    public int hashCode() {
        Uri uri = this.f61657a;
        return ((uri != null ? uri.hashCode() : 0) * 31) + this.f61658b.hashCode();
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f61657a + ", extras=" + this.f61658b + ')';
    }
}
