package com.ui.uidb;

import ab.C3783f;
import bb.C4079a;
import bb.InterfaceC4080b;
import dh.InterfaceC5380e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface UiDB {

    /* renamed from: a, reason: collision with root package name */
    public static final a f42191a = a.f42200a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ui/uidb/UiDB$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "NotChanged", "ProductNotFound", "RequestFailed", "IO", "ContentInvalid", "Lcom/ui/uidb/UiDB$Error$ContentInvalid;", "Lcom/ui/uidb/UiDB$Error$IO;", "Lcom/ui/uidb/UiDB$Error$NotChanged;", "Lcom/ui/uidb/UiDB$Error$ProductNotFound;", "Lcom/ui/uidb/UiDB$Error$RequestFailed;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/uidb/UiDB$Error$ContentInvalid;", "Lcom/ui/uidb/UiDB$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ContentInvalid extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContentInvalid(String message, Throwable th2) {
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

            public /* synthetic */ ContentInvalid(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ui/uidb/UiDB$Error$IO;", "Lcom/ui/uidb/UiDB$Error;", "", "message", "Ljava/io/IOException;", "cause", "<init>", "(Ljava/lang/String;Ljava/io/IOException;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/io/IOException;", "()Ljava/io/IOException;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IO extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final IOException cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IO(String message, IOException iOException) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
                this.cause = iOException;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public IOException getCause() {
                return this.cause;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public /* synthetic */ IO(String str, IOException iOException, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : iOException);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/uidb/UiDB$Error$NotChanged;", "Lcom/ui/uidb/UiDB$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotChanged extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public NotChanged() {
                super(null);
                this.message = "UI DB Snapshot is still the same and doesn't need to be fetched and processed.";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ui/uidb/UiDB$Error$ProductNotFound;", "Lcom/ui/uidb/UiDB$Error;", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ProductNotFound extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/uidb/UiDB$Error$RequestFailed;", "Lcom/ui/uidb/UiDB$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RequestFailed extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestFailed(String message, Throwable th2) {
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

            public /* synthetic */ RequestFailed(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : th2);
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
        static final /* synthetic */ a f42200a = new a();

        private a() {
        }

        public static /* synthetic */ UiDB b(a aVar, b bVar, boolean z10, OkHttpClient okHttpClient, InterfaceC4080b interfaceC4080b, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = b.PRODUCTION;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                okHttpClient = new OkHttpClient();
            }
            if ((i10 & 8) != 0) {
                interfaceC4080b = InterfaceC4080b.f33095a.a(z10);
            }
            return aVar.a(bVar, z10, okHttpClient, interfaceC4080b);
        }

        public final UiDB a(b environment, boolean z10, OkHttpClient sharedOkhttpClient, InterfaceC4080b snapshotSerializer) {
            AbstractC6492s.i(environment, "environment");
            AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
            AbstractC6492s.i(snapshotSerializer, "snapshotSerializer");
            return new com.ui.uidb.a(sharedOkhttpClient, environment, z10, snapshotSerializer, new C3783f(), null, 32, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b PRODUCTION = new b("PRODUCTION", 0, "static.ui.com");
        public static final b STAGE = new b("STAGE", 1, "static.dev.ui.com");
        private final String host;

        private static final /* synthetic */ b[] $values() {
            return new b[]{PRODUCTION, STAGE};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, String str2) {
            this.host = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String getHost() {
            return this.host;
        }
    }

    public static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final C4079a.C1151a f42201a;

        /* renamed from: b, reason: collision with root package name */
        private final C4079a f42202b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42203c;

        /* renamed from: d, reason: collision with root package name */
        private final b f42204d;

        public c(C4079a.C1151a metadata, C4079a snapshot, String snapshotJson, b environment) {
            AbstractC6492s.i(metadata, "metadata");
            AbstractC6492s.i(snapshot, "snapshot");
            AbstractC6492s.i(snapshotJson, "snapshotJson");
            AbstractC6492s.i(environment, "environment");
            this.f42201a = metadata;
            this.f42202b = snapshot;
            this.f42203c = snapshotJson;
            this.f42204d = environment;
        }

        public final b a() {
            return this.f42204d;
        }

        public final C4079a.C1151a c() {
            return this.f42201a;
        }

        public final C4079a d() {
            return this.f42202b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6492s.d(this.f42201a, cVar.f42201a) && AbstractC6492s.d(this.f42202b, cVar.f42202b) && AbstractC6492s.d(this.f42203c, cVar.f42203c) && this.f42204d == cVar.f42204d;
        }

        public final String g() {
            return this.f42203c;
        }

        public int hashCode() {
            return (((((this.f42201a.hashCode() * 31) + this.f42202b.hashCode()) * 31) + this.f42203c.hashCode()) * 31) + this.f42204d.hashCode();
        }

        public String toString() {
            return "SnapshotResponse(metadata=" + this.f42201a + ", snapshot=" + this.f42202b + ", snapshotJson=" + this.f42203c + ", environment=" + this.f42204d + ")";
        }
    }

    Object a(Ya.a aVar, InterfaceC5380e interfaceC5380e);
}
