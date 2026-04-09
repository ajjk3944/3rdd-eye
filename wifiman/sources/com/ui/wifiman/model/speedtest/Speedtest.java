package com.ui.wifiman.model.speedtest;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.i;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface Speedtest {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/speedtest/Speedtest$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "Internal", "NetworkConnection", "Unexpected", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Internal;", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Internal;", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Internal extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public Internal(Throwable th2) {
                super(null);
                this.cause = th2;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/speedtest/Speedtest$Error$NetworkConnection;", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NetworkConnection extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public NetworkConnection(Throwable th2) {
                super(null);
                this.cause = th2;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/speedtest/Speedtest$Error$Unexpected;", "Lcom/ui/wifiman/model/speedtest/Speedtest$Error;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Unexpected extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public Unexpected(Throwable th2) {
                super(null);
                this.cause = th2;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.speedtest.Speedtest$a$a, reason: collision with other inner class name */
        public static final class C1416a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final long f42871a;

            /* renamed from: b, reason: collision with root package name */
            private final ArrayList f42872b;

            /* renamed from: c, reason: collision with root package name */
            private final c f42873c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1416a(long j10, ArrayList measurementHistory) {
                super(null);
                AbstractC6492s.i(measurementHistory, "measurementHistory");
                this.f42871a = j10;
                this.f42872b = measurementHistory;
                this.f42873c = c.FINISHED;
            }

            @Override // com.ui.wifiman.model.speedtest.Speedtest.a
            public long a() {
                return this.f42871a;
            }

            public final ArrayList b() {
                return this.f42872b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1416a)) {
                    return false;
                }
                C1416a c1416a = (C1416a) obj;
                return this.f42871a == c1416a.f42871a && AbstractC6492s.d(this.f42872b, c1416a.f42872b);
            }

            public int hashCode() {
                return (Long.hashCode(this.f42871a) * 31) + this.f42872b.hashCode();
            }

            public String toString() {
                return "Finished(bitsPerSecond=" + this.f42871a + ", measurementHistory=" + this.f42872b + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final c f42874a;

            /* renamed from: b, reason: collision with root package name */
            private final long f42875b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c state, long j10) {
                super(null);
                AbstractC6492s.i(state, "state");
                this.f42874a = state;
                this.f42875b = j10;
            }

            @Override // com.ui.wifiman.model.speedtest.Speedtest.a
            public long a() {
                return this.f42875b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f42874a == bVar.f42874a && this.f42875b == bVar.f42875b;
            }

            public int hashCode() {
                return (this.f42874a.hashCode() * 31) + Long.hashCode(this.f42875b);
            }

            public String toString() {
                return "Ongoing(state=" + this.f42874a + ", bitsPerSecond=" + this.f42875b + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class c {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ c[] $VALUES;
            public static final c CONNECTING = new c("CONNECTING", 0);
            public static final c IN_PROGRESS = new c("IN_PROGRESS", 1);
            public static final c FINISHED = new c("FINISHED", 2);

            private static final /* synthetic */ c[] $values() {
                return new c[]{CONNECTING, IN_PROGRESS, FINISHED};
            }

            static {
                c[] cVarArr$values = $values();
                $VALUES = cVarArr$values;
                $ENTRIES = AbstractC5827b.a(cVarArr$values);
            }

            private c(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) $VALUES.clone();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract long a();

        private a() {
        }
    }

    public interface b {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f42876a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42877b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42878c;

        public c(long j10, String str, String str2) {
            this.f42876a = j10;
            this.f42877b = str;
            this.f42878c = str2;
        }

        public final String a() {
            return this.f42877b;
        }

        public final String b() {
            return this.f42878c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f42876a == cVar.f42876a && AbstractC6492s.d(this.f42877b, cVar.f42877b) && AbstractC6492s.d(this.f42878c, cVar.f42878c);
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.f42876a) * 31;
            String str = this.f42877b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f42878c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ResultProcessingOutput(localResultId=" + this.f42876a + ", serverResultId=" + this.f42877b + ", unifiResultId=" + this.f42878c + ")";
        }
    }

    public static abstract class d {
        public abstract f a();

        public abstract Error b();

        public abstract boolean c();

        public abstract f d();

        public abstract f e();

        public abstract f f();

        public abstract f g();

        public abstract e h();

        public abstract f i();

        public String toString() {
            String str;
            a aVar;
            String str2;
            a aVar2;
            com.ui.wifiman.model.speedtest.result.b bVar;
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            numberFormat.setMinimumFractionDigits(2);
            numberFormat.setMaximumFractionDigits(2);
            String strV = O.b(getClass()).v();
            e eVarH = h();
            f fVarF = f();
            f.a.c cVar = fVarF instanceof f.a.c ? (f.a.c) fVarF : null;
            Long lValueOf = (cVar == null || (bVar = (com.ui.wifiman.model.speedtest.result.b) cVar.c()) == null) ? null : Long.valueOf(bVar.f());
            f fVarA = a();
            f.a.c cVar2 = fVarA instanceof f.a.c ? (f.a.c) fVarA : null;
            String str3 = "null";
            if (cVar2 == null || (aVar2 = (a) cVar2.c()) == null || (str = numberFormat.format(aVar2.a() / 1000000.0d)) == null) {
                str = "null";
            }
            f fVarI = i();
            f.a.c cVar3 = fVarI instanceof f.a.c ? (f.a.c) fVarI : null;
            if (cVar3 != null && (aVar = (a) cVar3.c()) != null && (str2 = numberFormat.format(aVar.a() / 1000000.0d)) != null) {
                str3 = str2;
            }
            Error errorB = b();
            return "SPEEDTEST STATE (" + strV + ") ( step: " + eVarH + ", ID: " + lValueOf + ", download: " + str + ", upload: " + str3 + "),error: " + (errorB != null ? errorB.getMessage() : null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e SETUP = new e("SETUP", 0);
        public static final e LATENCY_CHECK = new e("LATENCY_CHECK", 1);
        public static final e DOWNLOAD_INIT = new e("DOWNLOAD_INIT", 2);
        public static final e DOWNLOAD = new e("DOWNLOAD", 3);
        public static final e UPLOAD_INIT = new e("UPLOAD_INIT", 4);
        public static final e UPLOAD = new e("UPLOAD", 5);
        public static final e RESULT_PROCESSING = new e("RESULT_PROCESSING", 6);
        public static final e END = new e("END", 7);

        private static final /* synthetic */ e[] $values() {
            return new e[]{SETUP, LATENCY_CHECK, DOWNLOAD_INIT, DOWNLOAD, UPLOAD_INIT, UPLOAD, RESULT_PROCESSING, END};
        }

        static {
            e[] eVarArr$values = $values();
            $VALUES = eVarArr$values;
            $ENTRIES = AbstractC5827b.a(eVarArr$values);
        }

        private e(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public static abstract class f {

        public static abstract class a extends f {

            /* renamed from: com.ui.wifiman.model.speedtest.Speedtest$f$a$a, reason: collision with other inner class name */
            public static final class C1417a extends a {

                /* renamed from: a, reason: collision with root package name */
                private final Throwable f42879a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1417a(Throwable error) {
                    super(null);
                    AbstractC6492s.i(error, "error");
                    this.f42879a = error;
                }

                public final Throwable c() {
                    return this.f42879a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1417a) && AbstractC6492s.d(this.f42879a, ((C1417a) obj).f42879a);
                }

                public int hashCode() {
                    return this.f42879a.hashCode();
                }

                public String toString() {
                    return "Failed(error=" + this.f42879a + ")";
                }
            }

            public static final class b extends a {
                public b() {
                    super(null);
                }
            }

            public static final class c extends a {

                /* renamed from: a, reason: collision with root package name */
                private final Object f42880a;

                public c(Object obj) {
                    super(null);
                    this.f42880a = obj;
                }

                public final Object c() {
                    return this.f42880a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && AbstractC6492s.d(this.f42880a, ((c) obj).f42880a);
                }

                public int hashCode() {
                    Object obj = this.f42880a;
                    if (obj == null) {
                        return 0;
                    }
                    return obj.hashCode();
                }

                public String toString() {
                    return "Success(data=" + this.f42880a + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        public static final class b extends f {
            public b() {
                super(null);
            }
        }

        public static final class c extends f {

            /* renamed from: a, reason: collision with root package name */
            private final Object f42881a;

            public c(Object obj) {
                super(null);
                this.f42881a = obj;
            }

            public final Object c() {
                return this.f42881a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC6492s.d(this.f42881a, ((c) obj).f42881a);
            }

            public int hashCode() {
                Object obj = this.f42881a;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public String toString() {
                return "InProgress(data=" + this.f42881a + ")";
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            if ((this instanceof b) || (this instanceof c) || (this instanceof a.C1417a)) {
                return false;
            }
            if ((this instanceof a.c) || (this instanceof a.b)) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final Object b() {
            if ((this instanceof b) || (this instanceof a.b) || (this instanceof a.C1417a)) {
                return null;
            }
            if (this instanceof c) {
                return ((c) this).c();
            }
            if (this instanceof a.c) {
                return ((a.c) this).c();
            }
            throw new NoWhenBranchMatchedException();
        }

        private f() {
        }
    }

    i a(b bVar);
}
