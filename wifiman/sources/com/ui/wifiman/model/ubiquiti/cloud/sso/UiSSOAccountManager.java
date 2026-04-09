package com.ui.wifiman.model.ubiquiti.cloud.sso;

import com.ui.sso.api.UiAccountApi;
import gg.AbstractC5912b;
import gg.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface UiSSOAccountManager {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "AccountApi", "Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$Error$AccountApi;", "Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d$a;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$Error$AccountApi;", "Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager$Error;", "", "message", "Lcom/ui/sso/api/UiAccountApi$Error;", "cause", "<init>", "(Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$Error;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ui/sso/api/UiAccountApi$Error;", "()Lcom/ui/sso/api/UiAccountApi$Error;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AccountApi extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final UiAccountApi.Error cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountApi(String message, UiAccountApi.Error cause) {
                super(null);
                AbstractC6492s.i(message, "message");
                AbstractC6492s.i(cause, "cause");
                this.message = message;
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public UiAccountApi.Error getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountApi)) {
                    return false;
                }
                AccountApi accountApi = (AccountApi) other;
                return AbstractC6492s.d(this.message, accountApi.message) && AbstractC6492s.d(this.cause, accountApi.cause);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return (this.message.hashCode() * 31) + this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "AccountApi(message=" + this.message + ", cause=" + this.cause + ")";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.sso.UiSSOAccountManager$a$a, reason: collision with other inner class name */
        public static final class C1480a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1480a f43523a = new C1480a();

            private C1480a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1480a);
            }

            public int hashCode() {
                return -1638357690;
            }

            public String toString() {
                return "Available";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final Error f43524a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Error error) {
                super(null);
                AbstractC6492s.i(error, "error");
                this.f43524a = error;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f43524a, ((b) obj).f43524a);
            }

            public int hashCode() {
                return this.f43524a.hashCode();
            }

            public String toString() {
                return "Unavailable(error=" + this.f43524a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    i a();

    AbstractC5912b b(b bVar);

    i c();

    AbstractC5912b d(b bVar);

    i e();

    i getState();
}
