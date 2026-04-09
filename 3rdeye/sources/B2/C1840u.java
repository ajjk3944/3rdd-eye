package b2;

import n.AbstractC5340b;

/* compiled from: WorkProgressDao_Impl.java */
/* renamed from: b2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840u extends AbstractC5340b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1840u(w1.k kVar, int i) {
        super(kVar);
        this.f17134d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17134d) {
            case 0:
                return "DELETE FROM WorkProgress";
            case 1:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            default:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }
}
