package com.ui.wifiman.model.ubiquiti.firmware;

import Wc.d;
import com.ui.wifiman.model.ubiquiti.firmware.a;
import gg.i;
import gg.z;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface UbiquitiFirmwareClient {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "IO", "InvalidResponse", "ApiError", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements d {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$ApiError;", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;", "", "httpCode", "apiCode", "", "apiError", "message", "", "cause", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getHttpCode", "()I", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Integer;", "getApiCode", "()Ljava/lang/Integer;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getApiError", "()Ljava/lang/String;", "d", "getMessage", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ApiError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int httpCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Integer apiCode;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String apiError;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApiError(int i10, Integer num, String str, String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.httpCode = i10;
                this.apiCode = num;
                this.apiError = str;
                this.message = message;
                this.cause = th2;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$IO;", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IO extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ IO(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IO(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;", "Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidResponse extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public /* synthetic */ InvalidResponse(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidResponse(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = th2;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    z a(a.EnumC1501a enumC1501a, String str);

    z b(String str, String str2);

    i c(a aVar, File file);
}
