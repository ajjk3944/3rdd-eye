package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4842oa implements Parcelable {
    public static final C4816na CREATOR = new C4816na();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f41368a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentifierStatus f41369b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41370c;

    public C4842oa(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.f41368a = bool;
        this.f41369b = identifierStatus;
        this.f41370c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4842oa)) {
            return false;
        }
        C4842oa c4842oa = (C4842oa) obj;
        return kotlin.jvm.internal.l.b(this.f41368a, c4842oa.f41368a) && this.f41369b == c4842oa.f41369b && kotlin.jvm.internal.l.b(this.f41370c, c4842oa.f41370c);
    }

    public final int hashCode() {
        Boolean bool = this.f41368a;
        int iHashCode = (this.f41369b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.f41370c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeaturesInternal(sslPinning=");
        sb.append(this.f41368a);
        sb.append(", status=");
        sb.append(this.f41369b);
        sb.append(", errorExplanation=");
        return N7.B8.j(sb, this.f41370c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f41368a);
        parcel.writeString(this.f41369b.getValue());
        parcel.writeString(this.f41370c);
    }

    public C4842oa() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
