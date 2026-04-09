package u2;

import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f23808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23809b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23810c;

    public i(int i, int i3, boolean z6) {
        this.f23808a = i;
        this.f23809b = i3;
        this.f23810c = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f23808a == iVar.f23808a && this.f23809b == iVar.f23809b && this.f23810c == iVar.f23810c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f23810c ? 1237 : 1231) ^ ((((this.f23808a ^ 1000003) * 1000003) ^ this.f23809b) * 1000003);
    }

    public final String toString() {
        int i = this.f23808a;
        int length = String.valueOf(i).length();
        int i3 = this.f23809b;
        int length2 = String.valueOf(i3).length();
        boolean z6 = this.f23810c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z6).length() + 1);
        AbstractC2763b.h(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i3);
        sb.append(", notificationFlowEnabled=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
