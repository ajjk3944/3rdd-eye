package com.ui.sso.api.provider;

import Yg.J;
import aj.AbstractC3868b;
import aj.C3871e;
import aj.w;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationException;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import th.p;

/* loaded from: classes3.dex */
public interface UiAccountProviderMessageSerializer {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer$SerializationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SerializationError extends Exception {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        public SerializationError(String message, Throwable th2) {
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

        public /* synthetic */ SerializationError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }
    }

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final C1346a f41926d = new C1346a(null);

        /* renamed from: a, reason: collision with root package name */
        private final p f41927a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3868b f41928b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3868b f41929c;

        /* renamed from: com.ui.sso.api.provider.UiAccountProviderMessageSerializer$a$a, reason: collision with other inner class name */
        public static final class C1346a {
            public /* synthetic */ C1346a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1346a() {
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41930a = new b();

            b() {
                super(1);
            }

            public final void a(C3871e Json) {
                AbstractC6492s.i(Json, "$this$Json");
                Json.f(true);
                Json.e(false);
                Json.c("type");
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3871e) obj);
                return J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final c f41931a = new c();

            c() {
                super(1);
            }

            public final void a(C3871e Json) {
                AbstractC6492s.i(Json, "$this$Json");
                Json.e(true);
                Json.c("type");
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C3871e) obj);
                return J.f24997a;
            }
        }

        public a(p type) {
            AbstractC6492s.i(type, "type");
            this.f41927a = type;
            this.f41928b = w.b(null, c.f41931a, 1, null);
            this.f41929c = w.b(null, b.f41930a, 1, null);
        }

        public final Object a(String msgStr) throws SerializationError {
            AbstractC6492s.i(msgStr, "msgStr");
            try {
                return this.f41929c.b(Vi.w.e(this.f41927a), msgStr);
            } catch (ClassCastException e10) {
                throw new SerializationError("json deserialization failed", e10);
            } catch (SerializationException e11) {
                throw new SerializationError("json deserialization failed", e11);
            } catch (IllegalArgumentException e12) {
                throw new SerializationError("json deserialization failed", e12);
            }
        }

        public final String b(Object obj) throws SerializationError {
            try {
                return this.f41928b.c(Vi.w.e(this.f41927a), obj);
            } catch (SerializationException e10) {
                throw new SerializationError("json serialization failed", e10);
            } catch (IllegalArgumentException e11) {
                throw new SerializationError("json serialization failed", e11);
            }
        }
    }

    Bundle a(Object obj);

    Object b(Bundle bundle);
}
