package com.ui.common.semver;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6516j;
import kotlin.text.InterfaceC6518l;
import kotlin.text.t;
import o9.C7110a;
import o9.C7111b;
import o9.C7112c;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class SemVer implements Comparable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final a f41336i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f41337a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41338b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41339c;

    /* renamed from: d, reason: collision with root package name */
    private final C7112c f41340d;

    /* renamed from: e, reason: collision with root package name */
    private final C7110a f41341e;

    /* renamed from: f, reason: collision with root package name */
    private final String f41342f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41343g;

    /* renamed from: h, reason: collision with root package name */
    private final String f41344h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ui/common/semver/SemVer$FormatException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "common-semver"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class FormatException extends RuntimeException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        public FormatException(String message) {
            AbstractC6492s.i(message, "message");
            this.message = message;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SemVer a(String versionString) {
            AbstractC6492s.i(versionString, "versionString");
            InterfaceC6518l interfaceC6518lL = C7111b.f55594a.a().l(versionString);
            if (interfaceC6518lL == null) {
                throw new FormatException(AbstractC6492s.p("Invalid version: ", versionString));
            }
            Integer numQ = t.q((String) interfaceC6518lL.b().get(1));
            Integer numQ2 = t.q((String) interfaceC6518lL.b().get(2));
            Integer numQ3 = t.q((String) interfaceC6518lL.b().get(3));
            C6516j c6516j = interfaceC6518lL.c().get(4);
            String strA = c6516j == null ? null : c6516j.a();
            C6516j c6516j2 = interfaceC6518lL.c().get(5);
            String strA2 = c6516j2 != null ? c6516j2.a() : null;
            if (numQ != null) {
                return new SemVer(numQ.intValue(), numQ2 == null ? 0 : numQ2.intValue(), numQ3 != null ? numQ3.intValue() : 0, strA, strA2);
            }
            throw new FormatException(AbstractC6492s.p("Invalid version: ", versionString));
        }

        public final SemVer b(String versionString) {
            AbstractC6492s.i(versionString, "versionString");
            try {
                return a(versionString);
            } catch (FormatException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    private SemVer(int i10, int i11, int i12, C7112c c7112c, C7110a c7110a) {
        this.f41337a = i10;
        this.f41338b = i11;
        this.f41339c = i12;
        this.f41340d = c7112c;
        this.f41341e = c7110a;
        if (i10 < 0) {
            throw new FormatException("The major number must be >= 0.");
        }
        if (i11 < 0) {
            throw new FormatException("The minor number must be >= 0.");
        }
        if (i12 < 0) {
            throw new FormatException("The patch number must be >= 0.");
        }
        this.f41342f = c7112c == null ? null : c7112c.toString();
        this.f41343g = c7112c != null;
        this.f41344h = c7110a != null ? c7110a.toString() : null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(SemVer other) {
        C7112c c7112c;
        C7112c c7112c2;
        AbstractC6492s.i(other, "other");
        int i10 = this.f41337a;
        int i11 = other.f41337a;
        if (i10 > i11) {
            return 1;
        }
        if (i10 >= i11) {
            int i12 = this.f41338b;
            int i13 = other.f41338b;
            if (i12 > i13) {
                return 1;
            }
            if (i12 >= i13) {
                int i14 = this.f41339c;
                int i15 = other.f41339c;
                if (i14 > i15) {
                    return 1;
                }
                if (i14 >= i15 && ((c7112c = this.f41340d) == null || other.f41340d != null)) {
                    if (c7112c == null && other.f41340d != null) {
                        return 1;
                    }
                    if (c7112c == null || (c7112c2 = other.f41340d) == null) {
                        return 0;
                    }
                    return c7112c.compareTo(c7112c2);
                }
            }
        }
        return -1;
    }

    public final String c() {
        return this.f41344h;
    }

    public final int d() {
        return this.f41337a;
    }

    public boolean equals(Object obj) {
        SemVer semVer = obj instanceof SemVer ? (SemVer) obj : null;
        return semVer != null && compareTo(semVer) == 0;
    }

    public final int g() {
        return this.f41338b;
    }

    public final int h() {
        return this.f41339c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f41337a) * (Integer.hashCode(this.f41338b) + 31) * (Integer.hashCode(this.f41339c) + 31) * (this.f41340d == null ? 1 : j().hashCode() + 31);
    }

    public final C7112c j() {
        return this.f41340d;
    }

    public String toString() {
        String strP;
        String strP2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41337a);
        sb2.append('.');
        sb2.append(this.f41338b);
        sb2.append('.');
        sb2.append(this.f41339c);
        String str = "";
        if (this.f41340d == null || (strP = AbstractC6492s.p("-", j())) == null) {
            strP = "";
        }
        sb2.append(strP);
        if (this.f41344h != null && (strP2 = AbstractC6492s.p(MqttTopic.SINGLE_LEVEL_WILDCARD, c())) != null) {
            str = strP2;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public /* synthetic */ SemVer(int i10, int i11, int i12, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) == 0 ? i12 : 0, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2);
    }

    public SemVer(int i10, int i11, int i12, String str, String str2) {
        this(i10, i11, i12, str == null ? null : C7112c.f55598b.a(str), str2 != null ? C7110a.f55592b.a(str2) : null);
    }
}
