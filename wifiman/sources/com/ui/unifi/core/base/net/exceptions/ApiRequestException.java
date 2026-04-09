package com.ui.unifi.core.base.net.exceptions;

import Mj.w;
import Yg.J;
import kb.SimpleResponseHeader;
import kb.p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.ResponseBody;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB+\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0007\u0010\u000eB'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0007\u0010\u0011B1\b\u0012\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ui/unifi/core/base/net/exceptions/ApiRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "statusCode", "", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "path", "method", "Lkb/p;", "Lkb/u;", "errorResponse", "(Ljava/lang/String;Ljava/lang/String;Lkb/p;)V", "LMj/w;", "Lokhttp3/ResponseBody;", "(Ljava/lang/String;Ljava/lang/String;LMj/w;)V", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiRequestException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer statusCode;

    private ApiRequestException(Integer num, String str) {
        super(str);
        this.statusCode = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiRequestException(String str, String str2, p errorResponse) {
        AbstractC6492s.i(errorResponse, "errorResponse");
        SimpleResponseHeader simpleResponseHeader = (SimpleResponseHeader) errorResponse.c();
        Integer statusCode = simpleResponseHeader != null ? simpleResponseHeader.getStatusCode() : null;
        String strY = t.y(errorResponse.b());
        this(statusCode, str, str2, strY.length() > 0 ? strY : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiRequestException(String path, String method, w errorResponse) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        AbstractC6492s.i(errorResponse, "errorResponse");
        Integer numValueOf = Integer.valueOf(errorResponse.b());
        ResponseBody responseBodyD = errorResponse.d();
        this(numValueOf, path, method, responseBodyD != null ? responseBodyD.C() : null);
    }

    private ApiRequestException(Integer num, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error response received");
        if (num != null) {
            sb2.append("\nStatus code: " + num.intValue());
        }
        sb2.append("\nRequest: " + str2 + " " + str);
        if (str3 != null) {
            sb2.append("\nError response: " + str3);
        }
        J j10 = J.f24997a;
        this(num, sb2.toString());
    }
}
