package com.ubnt.discovery.server.lan.processing.parser;

import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ubnt/discovery/server/lan/processing/parser/IllegalFieldSizeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "actualSize", "expectedSize", "<init>", "(II)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getActualSize", "()I", SnmpConfigurator.O_BIND_ADDRESS, "getExpectedSize", "", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "library-server-lan_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IllegalFieldSizeException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int actualSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int expectedSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public IllegalFieldSizeException(int i10, int i11) {
        this.actualSize = i10;
        this.expectedSize = i11;
        this.message = "Invalid field size, expected = " + i11 + "; actual = " + i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
