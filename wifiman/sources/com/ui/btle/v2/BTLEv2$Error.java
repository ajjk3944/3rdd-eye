package com.ui.btle.v2;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/ui/btle/v2/BTLEv2$Error", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "Connection", "Protocol", "Lcom/ui/btle/v2/BTLEv2$Error$Connection;", "Lcom/ui/btle/v2/BTLEv2$Error$Protocol;", "btle-v2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BTLEv2$Error extends RuntimeException {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ui/btle/v2/BTLEv2$Error$Connection;", "Lcom/ui/btle/v2/BTLEv2$Error;", "()V", "btle-v2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Connection extends BTLEv2$Error {
        public Connection() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/btle/v2/BTLEv2$Error$Protocol;", "Lcom/ui/btle/v2/BTLEv2$Error;", "()V", "InvalidPacketContent", "InvalidPacketFragmentLength", "Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;", "Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketFragmentLength;", "btle-v2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Protocol extends BTLEv2$Error {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketContent;", "Lcom/ui/btle/v2/BTLEv2$Error$Protocol;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "btle-v2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidPacketContent extends Protocol {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidPacketContent(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketFragmentLength;", "Lcom/ui/btle/v2/BTLEv2$Error$Protocol;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "btle-v2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class InvalidPacketFragmentLength extends Protocol {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidPacketFragmentLength(String message, Throwable th2) {
                super(null);
                AbstractC6492s.i(message, "message");
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

        public /* synthetic */ Protocol(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Protocol() {
            super(null);
        }
    }

    public /* synthetic */ BTLEv2$Error(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BTLEv2$Error() {
    }
}
