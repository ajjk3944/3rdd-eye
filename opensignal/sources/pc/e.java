package pc;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class e extends mc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd.h f20444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Boolean bool, dd.h hVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.f20443e = bool;
        this.f20444f = hVar;
    }

    @Override // mc.a
    public final boolean R(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) mc.b.a(parcel, Status.CREATOR);
        mc.b.b(parcel);
        vc.e.P(status, this.f20443e, this.f20444f);
        return true;
    }
}
