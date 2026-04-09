package t4;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class k extends AbstractC5605c {

    /* renamed from: a, reason: collision with root package name */
    public final int f46423a = 1;

    @Override // t4.AbstractC5605c
    public final boolean a() {
        return false;
    }

    @Override // t4.AbstractC5605c
    public final int b() {
        return this.f46423a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5605c)) {
            return false;
        }
        AbstractC5605c abstractC5605c = (AbstractC5605c) obj;
        return this.f46423a == abstractC5605c.b() && !abstractC5605c.a();
    }

    public final int hashCode() {
        return ((this.f46423a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return B4.i.j(new StringBuilder("AppUpdateOptions{appUpdateType="), this.f46423a, ", allowAssetPackDeletion=false}");
    }
}
