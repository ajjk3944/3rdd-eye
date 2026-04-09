package W4;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;

/* loaded from: classes3.dex */
public class a extends AbstractC8026a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private String f23607a;

    /* renamed from: b, reason: collision with root package name */
    private String f23608b;

    /* renamed from: c, reason: collision with root package name */
    private int f23609c;

    /* renamed from: d, reason: collision with root package name */
    private long f23610d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f23611e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f23612f;

    public a(String str, String str2, int i10, long j10, Bundle bundle, Uri uri) {
        this.f23607a = str;
        this.f23608b = str2;
        this.f23609c = i10;
        this.f23610d = j10;
        this.f23611e = bundle;
        this.f23612f = uri;
    }

    public long b() {
        return this.f23610d;
    }

    public String e() {
        return this.f23608b;
    }

    public String f() {
        return this.f23607a;
    }

    public Bundle g() {
        Bundle bundle = this.f23611e;
        return bundle == null ? new Bundle() : bundle;
    }

    public int i() {
        return this.f23609c;
    }

    public Uri j() {
        return this.f23612f;
    }

    public void k(long j10) {
        this.f23610d = j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        b.c(this, parcel, i10);
    }
}
