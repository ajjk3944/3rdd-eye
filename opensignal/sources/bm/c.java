package bm;

import dt.w;

/* loaded from: classes.dex */
public final class c extends w {
    @Override // dt.w
    public final String a() {
        return "UPDATE speed_test SET place_type = ? WHERE ul_speed = ? AND dl_speed = ? AND latency = ?";
    }
}
