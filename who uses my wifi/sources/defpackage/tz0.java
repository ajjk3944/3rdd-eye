package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tz0 extends sv0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz0(pq0 pq0Var, int i) {
        super(pq0Var);
        this.d = i;
    }

    @Override // defpackage.sv0
    public final String b() {
        switch (this.d) {
            case 0:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 1:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 2:
                return "DELETE FROM WorkProgress";
            case 3:
                return "DELETE FROM workspec WHERE id=?";
            case 4:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 5:
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            case 6:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 7:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 8:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            default:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }
}
