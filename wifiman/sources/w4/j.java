package W4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import t3.AbstractC8026a;

/* loaded from: classes3.dex */
public final class j extends AbstractC8026a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private final Uri f23626a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f23627b;

    /* renamed from: c, reason: collision with root package name */
    private final List f23628c;

    public static class a extends AbstractC8026a {
        public static final Parcelable.Creator<a> CREATOR = new l();

        /* renamed from: a, reason: collision with root package name */
        private final String f23629a;

        public a(String str) {
            this.f23629a = str;
        }

        public String b() {
            return this.f23629a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.c(this, parcel, i10);
        }
    }

    public j(Uri uri, Uri uri2, List list) {
        this.f23626a = uri;
        this.f23627b = uri2;
        this.f23628c = list == null ? new ArrayList() : list;
    }

    public Uri b() {
        return this.f23627b;
    }

    public Uri e() {
        return this.f23626a;
    }

    public List f() {
        return this.f23628c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        k.c(this, parcel, i10);
    }
}
