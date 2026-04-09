package com.ui.wmw.wifi;

import com.ui.wmw.api.v1.ApiV1WifiScanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public abstract class WmwWifiScanResultProcessor {

    /* renamed from: a, reason: collision with root package name */
    private final ApiV1WifiScanResult.Result f45518a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ui/wmw/wifi/WmwWifiScanResultProcessor$InvalidData;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidData extends RuntimeException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public InvalidData(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public WmwWifiScanResultProcessor(ApiV1WifiScanResult.Result result) {
        AbstractC6492s.i(result, "result");
        this.f45518a = result;
    }

    protected final ApiV1WifiScanResult.Result c() {
        return this.f45518a;
    }
}
