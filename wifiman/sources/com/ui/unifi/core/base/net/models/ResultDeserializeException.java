package com.ui.unifi.core.base.net.models;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ui/unifi/core/base/net/models/ResultDeserializeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "json", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultDeserializeException extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String json;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultDeserializeException(String json, Throwable cause) {
        super("Error parsing JSON", cause);
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(cause, "cause");
        this.json = json;
    }
}
