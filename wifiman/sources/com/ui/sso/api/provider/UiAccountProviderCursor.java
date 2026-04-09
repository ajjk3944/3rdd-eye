package com.ui.sso.api.provider;

import android.database.Cursor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public abstract class UiAccountProviderCursor {

    public interface Serializer {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Error extends Exception {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public Error(String message, Throwable th2) {
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

            public /* synthetic */ Error(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }
        }

        UiAccountProviderCursor a(Cursor cursor, th.d dVar);

        Cursor b(UiAccountProviderCursor uiAccountProviderCursor);
    }

    public static final class a extends UiAccountProviderCursor {

        /* renamed from: a, reason: collision with root package name */
        private final List f41916a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(null);
            AbstractC6492s.i(list, "list");
            this.f41916a = list;
        }

        public final List a() {
            return this.f41916a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f41916a, ((a) obj).f41916a);
        }

        public int hashCode() {
            return this.f41916a.hashCode();
        }

        public String toString() {
            return "Accounts(list=" + this.f41916a + ")";
        }
    }

    public /* synthetic */ UiAccountProviderCursor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiAccountProviderCursor() {
    }
}
