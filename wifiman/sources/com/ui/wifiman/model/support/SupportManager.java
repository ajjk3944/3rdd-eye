package com.ui.wifiman.model.support;

import gg.z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface SupportManager {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/support/SupportManager$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "SupportFileCreationError", "Lcom/ui/wifiman/model/support/SupportManager$Error$SupportFileCreationError;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/support/SupportManager$Error$SupportFileCreationError;", "Lcom/ui/wifiman/model/support/SupportManager$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SupportFileCreationError extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportFileCreationError(Throwable cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
                this.message = "Support file creation failed with cause: " + getCause().getMessage();
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

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    z a();

    z c();
}
