package Kg;

import Lg.q;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class d implements Cloneable {

    public enum a {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    public static d d(String str, String str2, int i10, int i11, int i12, boolean z10, Map map) {
        return new q(str, str2, "", i10, i11, i12, z10, map);
    }

    public abstract String A();

    public abstract int B();

    public abstract boolean D();

    public abstract boolean E(d dVar);

    public abstract boolean F();

    /* renamed from: c */
    public abstract d clone();

    public abstract String e();

    public abstract String f();

    public abstract Inet4Address[] i();

    public abstract Inet6Address[] k();

    public abstract InetAddress[] l();

    public abstract String m();

    public abstract String n();

    public abstract int o();

    public abstract int p();

    public abstract Enumeration q();

    public abstract String r(String str);

    public abstract String t();

    public abstract String u();

    public abstract String w();

    public abstract String x();

    public abstract byte[] z();
}
