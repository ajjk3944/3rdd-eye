package L4;

import C0.p;
import H0.j;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.ui.noise.NoiseBean;

/* loaded from: classes.dex */
public final class c extends C0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(p pVar, int i) {
        super(pVar);
        this.f2610d = i;
    }

    @Override // C0.z
    public final String b() {
        switch (this.f2610d) {
            case 0:
                return "UPDATE OR ABORT `cellInfo` SET `id` = ?,`cell_id` = ?,`address` = ?,`latitude` = ?,`longitude` = ?,`radius` = ? WHERE `id` = ?";
            case 1:
                return "UPDATE OR ABORT `squatter` SET `id` = ?,`brand` = ?,`mac` = ?,`type` = ?,`host` = ?,`isKnown` = ? WHERE `id` = ?";
            case 2:
                return "DELETE FROM `web_speed` WHERE `id` = ?";
            case 3:
                return "UPDATE OR ABORT `web_speed` SET `id` = ?,`url` = ?,`name` = ?,`logo` = ? WHERE `id` = ?";
            case 4:
                return "DELETE FROM `noise` WHERE `id` = ?";
            default:
                return "DELETE FROM `trace_history` WHERE `id` = ?";
        }
    }

    @Override // C0.d
    public void e(j jVar, Object obj) {
        switch (this.f2610d) {
            case 2:
                jVar.f(1, ((WebSpeedBean) obj).getId());
                break;
            default:
                jVar.f(1, ((NoiseBean) obj).getId());
                break;
        }
    }
}
