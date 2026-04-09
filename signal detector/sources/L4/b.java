package L4;

import C0.p;
import S4.n;
import com.lefan.signal.ui.noise.NoiseZoom_Impl;

/* loaded from: classes.dex */
public final class b extends C0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, int i) {
        super(pVar);
        this.f2609d = i;
    }

    @Override // C0.z
    public final String b() {
        switch (this.f2609d) {
            case 0:
                return "INSERT OR REPLACE INTO `cellInfo` (`id`,`cell_id`,`address`,`latitude`,`longitude`,`radius`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `cellInfo` (`id`,`cell_id`,`address`,`latitude`,`longitude`,`radius`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `macvendor` (`id`,`brand`,`mac`) VALUES (nullif(?, 0),?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `squatter` (`id`,`brand`,`mac`,`type`,`host`,`isKnown`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `web_speed` (`id`,`url`,`name`,`logo`) VALUES (nullif(?, 0),?,?,?)";
            case 5:
                return "INSERT OR ABORT INTO `noise` (`id`,`time`,`minValue`,`avgValue`,`maxValue`,`lat`,`lon`,`address`,`step`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `trace_history` (`id`,`trace_link`,`trace_time`) VALUES (nullif(?, 0),?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 10:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 12:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020f  */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v102, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v53 */
    @Override // C0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(H0.j r17, java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.b.e(H0.j, java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, NoiseZoom_Impl noiseZoom_Impl) {
        super(noiseZoom_Impl);
        this.f2609d = 5;
    }
}
