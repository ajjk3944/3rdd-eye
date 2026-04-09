package w3;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import w3.i;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: a, reason: collision with root package name */
    public final long f24819a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24820b;

    /* renamed from: c, reason: collision with root package name */
    public final ClientInfo f24821c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f24822d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24823e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24824f;

    /* renamed from: g, reason: collision with root package name */
    public final QosTier f24825g;

    public static final class b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f24826a;

        /* renamed from: b, reason: collision with root package name */
        public Long f24827b;

        /* renamed from: c, reason: collision with root package name */
        public ClientInfo f24828c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f24829d;

        /* renamed from: e, reason: collision with root package name */
        public String f24830e;

        /* renamed from: f, reason: collision with root package name */
        public List f24831f;

        /* renamed from: g, reason: collision with root package name */
        public QosTier f24832g;

        @Override // w3.i.a
        public i a() {
            String str = "";
            if (this.f24826a == null) {
                str = " requestTimeMs";
            }
            if (this.f24827b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new e(this.f24826a.longValue(), this.f24827b.longValue(), this.f24828c, this.f24829d, this.f24830e, this.f24831f, this.f24832g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w3.i.a
        public i.a b(ClientInfo clientInfo) {
            this.f24828c = clientInfo;
            return this;
        }

        @Override // w3.i.a
        public i.a c(List list) {
            this.f24831f = list;
            return this;
        }

        @Override // w3.i.a
        public i.a d(Integer num) {
            this.f24829d = num;
            return this;
        }

        @Override // w3.i.a
        public i.a e(String str) {
            this.f24830e = str;
            return this;
        }

        @Override // w3.i.a
        public i.a f(QosTier qosTier) {
            this.f24832g = qosTier;
            return this;
        }

        @Override // w3.i.a
        public i.a g(long j10) {
            this.f24826a = Long.valueOf(j10);
            return this;
        }

        @Override // w3.i.a
        public i.a h(long j10) {
            this.f24827b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // w3.i
    public ClientInfo b() {
        return this.f24821c;
    }

    @Override // w3.i
    public List c() {
        return this.f24824f;
    }

    @Override // w3.i
    public Integer d() {
        return this.f24822d;
    }

    @Override // w3.i
    public String e() {
        return this.f24823e;
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List list;
        QosTier qosTier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f24819a == iVar.g() && this.f24820b == iVar.h() && ((clientInfo = this.f24821c) != null ? clientInfo.equals(iVar.b()) : iVar.b() == null) && ((num = this.f24822d) != null ? num.equals(iVar.d()) : iVar.d() == null) && ((str = this.f24823e) != null ? str.equals(iVar.e()) : iVar.e() == null) && ((list = this.f24824f) != null ? list.equals(iVar.c()) : iVar.c() == null) && ((qosTier = this.f24825g) != null ? qosTier.equals(iVar.f()) : iVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // w3.i
    public QosTier f() {
        return this.f24825g;
    }

    @Override // w3.i
    public long g() {
        return this.f24819a;
    }

    @Override // w3.i
    public long h() {
        return this.f24820b;
    }

    public int hashCode() {
        long j10 = this.f24819a;
        long j11 = this.f24820b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        ClientInfo clientInfo = this.f24821c;
        int iHashCode = (i10 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f24822d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f24823e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f24824f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f24825g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f24819a + ", requestUptimeMs=" + this.f24820b + ", clientInfo=" + this.f24821c + ", logSource=" + this.f24822d + ", logSourceName=" + this.f24823e + ", logEvents=" + this.f24824f + ", qosTier=" + this.f24825g + "}";
    }

    public e(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f24819a = j10;
        this.f24820b = j11;
        this.f24821c = clientInfo;
        this.f24822d = num;
        this.f24823e = str;
        this.f24824f = list;
        this.f24825g = qosTier;
    }
}
