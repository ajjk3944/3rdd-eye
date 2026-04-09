package io.appmetrica.analytics.coreapi.internal.identifiers;

import N7.B8;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f38880a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38881b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38882c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f38880a = str;
        this.f38881b = str2;
        this.f38882c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkIdentifiers.f38880a;
        }
        if ((i & 2) != 0) {
            str2 = sdkIdentifiers.f38881b;
        }
        if ((i & 4) != 0) {
            str3 = sdkIdentifiers.f38882c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f38880a;
    }

    public final String component2() {
        return this.f38881b;
    }

    public final String component3() {
        return this.f38882c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return l.b(this.f38880a, sdkIdentifiers.f38880a) && l.b(this.f38881b, sdkIdentifiers.f38881b) && l.b(this.f38882c, sdkIdentifiers.f38882c);
    }

    public final String getDeviceId() {
        return this.f38881b;
    }

    public final String getDeviceIdHash() {
        return this.f38882c;
    }

    public final String getUuid() {
        return this.f38880a;
    }

    public int hashCode() {
        String str = this.f38880a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f38881b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38882c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkIdentifiers(uuid=");
        sb.append(this.f38880a);
        sb.append(", deviceId=");
        sb.append(this.f38881b);
        sb.append(", deviceIdHash=");
        return B8.j(sb, this.f38882c, ')');
    }
}
