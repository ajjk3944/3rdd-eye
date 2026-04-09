package com.ui.wifiman.model.bluetooth.le;

import com.ui.wifiman.model.bluetooth.le.i;
import h9.C5969a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface BleCommonCharacteristicsReader {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "AndroidRefusedToConnect", "ServicesFetchFailed", "ConnectionFailed", "ConnectionTimedOut", "SimultaneousConnection", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$AndroidRefusedToConnect;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ServicesFetchFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$SimultaneousConnection;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$AndroidRefusedToConnect;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AndroidRefusedToConnect extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public AndroidRefusedToConnect() {
                super(null);
                this.message = "Android refused to connect";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectionFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public ConnectionFailed() {
                super(null);
                this.message = "Device refused connection ";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ConnectionTimedOut;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "", "millis", "<init>", "(J)V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectionTimedOut extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public ConnectionTimedOut(long j10) {
                super(null);
                this.message = "Device timed out since no response come in " + j10 + " ms";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$ServicesFetchFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ServicesFetchFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public ServicesFetchFailed() {
                super(null);
                this.message = "Failed to fetch services";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error$SimultaneousConnection;", "Lcom/ui/wifiman/model/bluetooth/le/BleCommonCharacteristicsReader$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SimultaneousConnection extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public SimultaneousConnection() {
                super(null);
                this.message = "Multiple simultaneous connections not supported. Try again later";
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

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final i.a f42485a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f42486b;

        public a(i.a aVar, Object data) {
            AbstractC6492s.i(aVar, "char");
            AbstractC6492s.i(data, "data");
            this.f42485a = aVar;
            this.f42486b = data;
        }

        public final i.a a() {
            return this.f42485a;
        }

        public final String c() {
            return (String) this.f42485a.getFormatter().invoke(this.f42486b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f42485a == aVar.f42485a && AbstractC6492s.d(this.f42486b, aVar.f42486b);
        }

        public int hashCode() {
            return this.f42485a.hashCode();
        }

        public String toString() {
            return "CharacteristicsData(char=" + this.f42485a + ", data=" + this.f42486b + ")";
        }
    }

    gg.i a(C5969a c5969a);
}
