package com.ui.wifiman.model.bluetooth.le;

import Zg.AbstractC3689v;
import android.bluetooth.le.ScanResult;
import com.ui.wifiman.model.bluetooth.le.j;
import com.ui.wifiman.model.bluetooth.le.l;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import yc.s;

/* loaded from: classes4.dex */
public final class k implements j.a {

    /* renamed from: a, reason: collision with root package name */
    private final s f42576a;

    /* renamed from: b, reason: collision with root package name */
    private final l.b f42577b;

    public k(s ubntBeaconParser, l.b microsoftBeaconParser) {
        AbstractC6492s.i(ubntBeaconParser, "ubntBeaconParser");
        AbstractC6492s.i(microsoftBeaconParser, "microsoftBeaconParser");
        this.f42576a = ubntBeaconParser;
        this.f42577b = microsoftBeaconParser;
    }

    @Override // com.ui.wifiman.model.bluetooth.le.j.a
    public List a(ScanResult scanResult) {
        AbstractC6492s.i(scanResult, "scanResult");
        return AbstractC3689v.q(this.f42576a.a(scanResult), this.f42577b.a(scanResult));
    }
}
