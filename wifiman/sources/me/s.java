package me;

import android.net.wifi.ScanResult;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class s implements r {
    @Override // me.r
    public q a(ScanResult scanResult) {
        AbstractC6492s.i(scanResult, "scanResult");
        return new C6806E(scanResult);
    }
}
