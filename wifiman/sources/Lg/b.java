package Lg;

import Kg.d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f11655a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11656b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11657c;

    /* renamed from: d, reason: collision with root package name */
    private final javax.jmdns.impl.constants.e f11658d;

    /* renamed from: e, reason: collision with root package name */
    private final javax.jmdns.impl.constants.d f11659e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11660f;

    /* renamed from: g, reason: collision with root package name */
    final Map f11661g;

    b(String str, javax.jmdns.impl.constants.e eVar, javax.jmdns.impl.constants.d dVar, boolean z10) {
        String str2;
        this.f11656b = str;
        this.f11658d = eVar;
        this.f11659e = dVar;
        this.f11660f = z10;
        Map mapB = r.b(d());
        this.f11661g = mapB;
        String str3 = (String) mapB.get(d.a.Domain);
        String str4 = (String) mapB.get(d.a.Protocol);
        String str5 = (String) mapB.get(d.a.Application);
        String lowerCase = ((String) mapB.get(d.a.Instance)).toLowerCase();
        String strA = a(str5, str4, str3);
        this.f11657c = strA;
        StringBuilder sb2 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str2 = lowerCase + ".";
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(strA);
        this.f11655a = sb2.toString().toLowerCase();
    }

    private String a(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str.isEmpty()) {
            str4 = "";
        } else {
            str4 = "_" + str + ".";
        }
        sb2.append(str4);
        if (str2.isEmpty()) {
            str5 = "";
        } else {
            str5 = "_" + str2 + ".";
        }
        sb2.append(str5);
        if (!str3.isEmpty()) {
            str6 = str3 + ".";
        }
        sb2.append(str6);
        String string = sb2.toString();
        if (string.endsWith(".")) {
            return string;
        }
        return string + ".";
    }

    public int b(b bVar) throws IOException {
        byte[] bArrX = x();
        byte[] bArrX2 = bVar.x();
        int iMin = Math.min(bArrX.length, bArrX2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArrX[i10];
            byte b11 = bArrX2[i10];
            if (b10 > b11) {
                return 1;
            }
            if (b10 < b11) {
                return -1;
            }
        }
        return bArrX.length - bArrX2.length;
    }

    public String c() {
        String str = this.f11655a;
        return str != null ? str : "";
    }

    public String d() {
        String str = this.f11656b;
        return str != null ? str : "";
    }

    public Map e() {
        return Collections.unmodifiableMap(this.f11661g);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c().equals(bVar.c()) && g().equals(bVar.g()) && f() == bVar.f();
    }

    public javax.jmdns.impl.constants.d f() {
        javax.jmdns.impl.constants.d dVar = this.f11659e;
        return dVar != null ? dVar : javax.jmdns.impl.constants.d.CLASS_UNKNOWN;
    }

    public javax.jmdns.impl.constants.e g() {
        javax.jmdns.impl.constants.e eVar = this.f11658d;
        return eVar != null ? eVar : javax.jmdns.impl.constants.e.TYPE_IGNORE;
    }

    public String h() {
        String str = (String) e().get(d.a.Subtype);
        return str != null ? str : "";
    }

    public int hashCode() {
        return c().hashCode() + g().indexValue() + f().indexValue();
    }

    public String i() {
        String str = this.f11657c;
        return str != null ? str : "";
    }

    public boolean j() {
        if (!((String) this.f11661g.get(d.a.Application)).equals("dns-sd")) {
            return false;
        }
        String str = (String) this.f11661g.get(d.a.Instance);
        return SnmpConfigurator.O_BIND_ADDRESS.equals(str) || "db".equals(str) || SnmpConfigurator.O_RETRIES.equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    public abstract boolean k(long j10);

    public boolean l() {
        return r() || s();
    }

    public boolean m(b bVar) {
        return c().equals(bVar.c()) && u(bVar.g()) && t(bVar.f());
    }

    public boolean n(b bVar) {
        return bVar != null && bVar.f() == f();
    }

    public boolean o(b bVar) {
        return bVar != null && bVar.g() == g();
    }

    public boolean p() {
        return ((String) this.f11661g.get(d.a.Application)).equals("dns-sd") && ((String) this.f11661g.get(d.a.Instance)).equals("_services");
    }

    public boolean q() {
        return this.f11660f;
    }

    public boolean r() {
        return ((String) this.f11661g.get(d.a.Domain)).endsWith("in-addr.arpa");
    }

    public boolean s() {
        return ((String) this.f11661g.get(d.a.Domain)).endsWith("ip6.arpa");
    }

    public boolean t(javax.jmdns.impl.constants.d dVar) {
        javax.jmdns.impl.constants.d dVar2 = javax.jmdns.impl.constants.d.CLASS_ANY;
        return dVar2 == dVar || dVar2 == f() || f().equals(dVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append('[');
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(System.identityHashCode(this));
        sb2.append(" type: ");
        sb2.append(g());
        sb2.append(", class: ");
        sb2.append(f());
        sb2.append(this.f11660f ? "-unique," : ",");
        sb2.append(" name: ");
        sb2.append(this.f11656b);
        y(sb2);
        sb2.append(']');
        return sb2.toString();
    }

    public boolean u(javax.jmdns.impl.constants.e eVar) {
        return g().equals(eVar);
    }

    public boolean v(b bVar) {
        return h().equals(bVar.h());
    }

    protected void w(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(d().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeShort(g().indexValue());
        dataOutputStream.writeShort(f().indexValue());
    }

    protected byte[] x() throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            w(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    protected void y(StringBuilder sb2) {
    }
}
