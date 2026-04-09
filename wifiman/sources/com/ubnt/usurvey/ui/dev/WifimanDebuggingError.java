package com.ubnt.usurvey.ui.dev;

import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ubnt/usurvey/ui/dev/WifimanDebuggingError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifimanDebuggingError extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message = "Nothing really happend. Just some user sent logs attached from the Dev menu to be analysed";

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
