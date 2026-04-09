package com.ubnt.discovery.server.lan.processing.parser;

import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ubnt/discovery/server/lan/processing/parser/UnknownFieldException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "fieldId", "<init>", "(I)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getFieldId", "()I", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "library-server-lan_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnknownFieldException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int fieldId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public UnknownFieldException(int i10) {
        this.fieldId = i10;
        this.message = "Unknown field = " + i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
