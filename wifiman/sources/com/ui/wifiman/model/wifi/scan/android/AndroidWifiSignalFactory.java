package com.ui.wifiman.model.wifi.scan.android;

import Wc.d;
import android.net.wifi.ScanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import me.k;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface AndroidWifiSignalFactory {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/wifi/scan/android/AndroidWifiSignalFactory$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LWc/d;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends Exception implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public Error(String message) {
            AbstractC6492s.i(message, "message");
            this.message = message;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    k a(ScanResult scanResult);
}
