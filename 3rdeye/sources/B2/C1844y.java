package b2;

import n.AbstractC5340b;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: b2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1844y extends AbstractC5340b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1844y(w1.k kVar, int i) {
        super(kVar);
        this.f17178d = i;
    }

    @Override // n.AbstractC5340b
    public final String e() {
        switch (this.f17178d) {
            case 0:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 1:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 2:
                return "UPDATE workspec SET output=? WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }
}
