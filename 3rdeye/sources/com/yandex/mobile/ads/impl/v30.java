package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class v30 implements Parcelable {
    public static final Parcelable.Creator<v30> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f34313b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f34314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34315d;

    /* renamed from: e, reason: collision with root package name */
    public final List<k22> f34316e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f34317f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34318g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f34319h;

    public class a implements Parcelable.Creator<v30> {
        @Override // android.os.Parcelable.Creator
        public final v30 createFromParcel(Parcel parcel) {
            return new v30(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final v30[] newArray(int i) {
            return new v30[i];
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f34320a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f34321b;

        /* renamed from: c, reason: collision with root package name */
        private String f34322c;

        /* renamed from: d, reason: collision with root package name */
        private List<k22> f34323d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f34324e;

        /* renamed from: f, reason: collision with root package name */
        private String f34325f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f34326g;

        public b(Uri uri, String str) {
            this.f34320a = str;
            this.f34321b = uri;
        }

        public final v30 a() {
            String str = this.f34320a;
            Uri uri = this.f34321b;
            String str2 = this.f34322c;
            List listH = this.f34323d;
            if (listH == null) {
                listH = xj0.h();
            }
            return new v30(str, uri, str2, listH, this.f34324e, this.f34325f, this.f34326g, 0);
        }

        public final b b(byte[] bArr) {
            this.f34324e = bArr;
            return this;
        }

        public final b b(String str) {
            this.f34322c = str;
            return this;
        }

        public final b a(String str) {
            this.f34325f = str;
            return this;
        }

        public final b a(byte[] bArr) {
            this.f34326g = bArr;
            return this;
        }

        public final b a(ArrayList arrayList) {
            this.f34323d = arrayList;
            return this;
        }
    }

    public /* synthetic */ v30(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, int i) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public final v30 a(v30 v30Var) {
        List arrayList;
        if (!this.f34313b.equals(v30Var.f34313b)) {
            throw new IllegalArgumentException();
        }
        if (this.f34316e.isEmpty() || v30Var.f34316e.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(this.f34316e);
            for (int i = 0; i < v30Var.f34316e.size(); i++) {
                k22 k22Var = v30Var.f34316e.get(i);
                if (!arrayList.contains(k22Var)) {
                    arrayList.add(k22Var);
                }
            }
        }
        return new v30(this.f34313b, v30Var.f34314c, v30Var.f34315d, arrayList, v30Var.f34317f, v30Var.f34318g, v30Var.f34319h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v30)) {
            return false;
        }
        v30 v30Var = (v30) obj;
        return this.f34313b.equals(v30Var.f34313b) && this.f34314c.equals(v30Var.f34314c) && s82.a(this.f34315d, v30Var.f34315d) && this.f34316e.equals(v30Var.f34316e) && Arrays.equals(this.f34317f, v30Var.f34317f) && s82.a(this.f34318g, v30Var.f34318g) && Arrays.equals(this.f34319h, v30Var.f34319h);
    }

    public final int hashCode() {
        int iHashCode = (this.f34314c.hashCode() + (this.f34313b.hashCode() * 961)) * 31;
        String str = this.f34315d;
        int iHashCode2 = (Arrays.hashCode(this.f34317f) + ((this.f34316e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f34318g;
        return Arrays.hashCode(this.f34319h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f34315d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f34313b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34313b);
        parcel.writeString(this.f34314c.toString());
        parcel.writeString(this.f34315d);
        parcel.writeInt(this.f34316e.size());
        for (int i10 = 0; i10 < this.f34316e.size(); i10++) {
            parcel.writeParcelable(this.f34316e.get(i10), 0);
        }
        parcel.writeByteArray(this.f34317f);
        parcel.writeString(this.f34318g);
        parcel.writeByteArray(this.f34319h);
    }

    public v30(Parcel parcel) {
        this.f34313b = (String) s82.a(parcel.readString());
        this.f34314c = Uri.parse((String) s82.a(parcel.readString()));
        this.f34315d = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add((k22) parcel.readParcelable(k22.class.getClassLoader()));
        }
        this.f34316e = Collections.unmodifiableList(arrayList);
        this.f34317f = parcel.createByteArray();
        this.f34318g = parcel.readString();
        this.f34319h = (byte[]) s82.a(parcel.createByteArray());
    }

    private v30(String str, Uri uri, String str2, List<k22> list, byte[] bArr, String str3, byte[] bArr2) {
        int iA = s82.a(uri, str2);
        if (iA == 0 || iA == 2 || iA == 1) {
            zf.a("customCacheKey must be null for type: " + iA, str3 == null);
        }
        this.f34313b = str;
        this.f34314c = uri;
        this.f34315d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f34316e = Collections.unmodifiableList(arrayList);
        this.f34317f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f34318g = str3;
        this.f34319h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : s82.f32904f;
    }
}
