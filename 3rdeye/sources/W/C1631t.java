package W;

import W.AbstractC1632u;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: MediaStoreOutputOptions.java */
/* renamed from: W.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631t extends AbstractC1632u {

    /* renamed from: c, reason: collision with root package name */
    public static final ContentValues f13298c = new ContentValues();

    /* renamed from: b, reason: collision with root package name */
    public final a f13299b;

    /* compiled from: MediaStoreOutputOptions.java */
    /* renamed from: W.t$a */
    public static abstract class a extends AbstractC1632u.a {

        /* compiled from: MediaStoreOutputOptions.java */
        /* renamed from: W.t$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0188a extends AbstractC1632u.a.AbstractC0189a<AbstractC0188a> {
        }

        public abstract Uri d();

        public abstract ContentResolver e();

        public abstract ContentValues f();
    }

    public C1631t(a aVar) {
        super(aVar);
        this.f13299b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1631t)) {
            return false;
        }
        return this.f13299b.equals(((C1631t) obj).f13299b);
    }

    public final int hashCode() {
        return this.f13299b.hashCode();
    }

    public final String toString() {
        return this.f13299b.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}
