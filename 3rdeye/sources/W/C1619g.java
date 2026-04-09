package W;

import W.C1631t;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;

/* compiled from: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.java */
/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1619g extends C1631t.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f13259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13260b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f13261c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f13262d;

    /* renamed from: e, reason: collision with root package name */
    public final ContentValues f13263e;

    /* compiled from: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.java */
    /* renamed from: W.g$a */
    public static final class a extends C1631t.a.AbstractC0188a {

        /* renamed from: a, reason: collision with root package name */
        public Long f13264a;

        /* renamed from: b, reason: collision with root package name */
        public Long f13265b;

        /* renamed from: c, reason: collision with root package name */
        public ContentResolver f13266c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f13267d;

        /* renamed from: e, reason: collision with root package name */
        public ContentValues f13268e;
    }

    public C1619g(long j4, long j10, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.f13259a = j4;
        this.f13260b = j10;
        this.f13261c = contentResolver;
        this.f13262d = uri;
        this.f13263e = contentValues;
    }

    @Override // W.AbstractC1632u.a
    public final long a() {
        return this.f13260b;
    }

    @Override // W.AbstractC1632u.a
    public final long b() {
        return this.f13259a;
    }

    @Override // W.AbstractC1632u.a
    public final Location c() {
        return null;
    }

    @Override // W.C1631t.a
    public final Uri d() {
        return this.f13262d;
    }

    @Override // W.C1631t.a
    public final ContentResolver e() {
        return this.f13261c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1631t.a)) {
            return false;
        }
        C1631t.a aVar = (C1631t.a) obj;
        return this.f13259a == aVar.b() && this.f13260b == aVar.a() && aVar.c() == null && this.f13261c.equals(aVar.e()) && this.f13262d.equals(aVar.d()) && this.f13263e.equals(aVar.f());
    }

    @Override // W.C1631t.a
    public final ContentValues f() {
        return this.f13263e;
    }

    public final int hashCode() {
        long j4 = this.f13259a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f13260b;
        return ((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * (-721379959)) ^ this.f13261c.hashCode()) * 1000003) ^ this.f13262d.hashCode()) * 1000003) ^ this.f13263e.hashCode();
    }

    public final String toString() {
        return "MediaStoreOutputOptionsInternal{fileSizeLimit=" + this.f13259a + ", durationLimitMillis=" + this.f13260b + ", location=null, contentResolver=" + this.f13261c + ", collectionUri=" + this.f13262d + ", contentValues=" + this.f13263e + "}";
    }
}
