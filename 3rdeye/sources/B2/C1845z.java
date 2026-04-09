package b2;

import n.AbstractC5340b;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: b2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1845z extends AbstractC5340b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1845z(w1.k kVar, int i) {
        super(kVar);
        this.f17179d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17179d) {
            case 0:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 1:
                return "DELETE FROM workspec WHERE id=?";
            default:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }
}
