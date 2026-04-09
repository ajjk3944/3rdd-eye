package com.ui.wifiman.model.ubiquiti.cloud;

import Wc.d;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import gg.z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface UnifiCloudClient {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "Unauthorized", "IO", "Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;", "Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;", "Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IO extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IO(Throwable cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;", "Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error;", "Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;", "cause", "<init>", "(Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;", "()Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Unauthorized extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final UnauthorisedException cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unauthorized(UnauthorisedException cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public UnauthorisedException getCause() {
                return this.cause;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f43511a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f43512b;

        public a(List consoles, Map consoleNcaTokens) {
            AbstractC6492s.i(consoles, "consoles");
            AbstractC6492s.i(consoleNcaTokens, "consoleNcaTokens");
            this.f43511a = consoles;
            this.f43512b = consoleNcaTokens;
        }

        public final Map a() {
            return this.f43512b;
        }

        public final List b() {
            return this.f43511a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f43511a, aVar.f43511a) && AbstractC6492s.d(this.f43512b, aVar.f43512b);
        }

        public int hashCode() {
            return (this.f43511a.hashCode() * 31) + this.f43512b.hashCode();
        }

        public String toString() {
            return "DevicesResponse(consoles=" + this.f43511a + ", consoleNcaTokens=" + this.f43512b + ")";
        }
    }

    z a();
}
