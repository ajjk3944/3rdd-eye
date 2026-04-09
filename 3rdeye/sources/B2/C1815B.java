package b2;

/* compiled from: WorkSpecDao_Impl.java */
/* renamed from: b2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815B extends w1.d {
    @Override // n.AbstractC5340b
    public final String e() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }

    @Override // w1.d
    public final void i(F1.f fVar, Object obj) throws Throwable {
        C1842w c1842w = (C1842w) obj;
        String str = c1842w.f17138a;
        if (str == null) {
            fVar.f(1);
        } else {
            fVar.h(1, str);
        }
        fVar.b(2, C1819F.j(c1842w.f17139b));
        String str2 = c1842w.f17140c;
        if (str2 == null) {
            fVar.f(3);
        } else {
            fVar.h(3, str2);
        }
        String str3 = c1842w.f17141d;
        if (str3 == null) {
            fVar.f(4);
        } else {
            fVar.h(4, str3);
        }
        byte[] bArrI = androidx.work.e.i(c1842w.f17142e);
        if (bArrI == null) {
            fVar.f(5);
        } else {
            fVar.b0(5, bArrI);
        }
        byte[] bArrI2 = androidx.work.e.i(c1842w.f17143f);
        if (bArrI2 == null) {
            fVar.f(6);
        } else {
            fVar.b0(6, bArrI2);
        }
        fVar.b(7, c1842w.f17144g);
        fVar.b(8, c1842w.f17145h);
        fVar.b(9, c1842w.i);
        fVar.b(10, c1842w.f17147k);
        fVar.b(11, C1819F.a(c1842w.f17148l));
        fVar.b(12, c1842w.f17149m);
        fVar.b(13, c1842w.f17150n);
        fVar.b(14, c1842w.f17151o);
        fVar.b(15, c1842w.f17152p);
        fVar.b(16, c1842w.f17153q ? 1L : 0L);
        fVar.b(17, C1819F.h(c1842w.f17154r));
        fVar.b(18, c1842w.f17155s);
        fVar.b(19, c1842w.f17156t);
        fVar.b(20, c1842w.f17157u);
        fVar.b(21, c1842w.f17158v);
        fVar.b(22, c1842w.f17159w);
        androidx.work.d dVar = c1842w.f17146j;
        if (dVar != null) {
            fVar.b(23, C1819F.g(dVar.f16882a));
            fVar.b(24, dVar.f16883b ? 1L : 0L);
            fVar.b(25, dVar.f16884c ? 1L : 0L);
            fVar.b(26, dVar.f16885d ? 1L : 0L);
            fVar.b(27, dVar.f16886e ? 1L : 0L);
            fVar.b(28, dVar.f16887f);
            fVar.b(29, dVar.f16888g);
            fVar.b0(30, C1819F.i(dVar.f16889h));
        } else {
            fVar.f(23);
            fVar.f(24);
            fVar.f(25);
            fVar.f(26);
            fVar.f(27);
            fVar.f(28);
            fVar.f(29);
            fVar.f(30);
        }
        if (str == null) {
            fVar.f(31);
        } else {
            fVar.h(31, str);
        }
    }
}
