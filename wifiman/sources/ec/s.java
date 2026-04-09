package Ec;

import Fc.a;
import Jc.a;
import Kc.a;
import Nc.b;
import android.content.Context;
import android.net.wifi.WifiManager;
import be.InterfaceC4091e;
import com.ui.wifiman.model.discovery.engine.bonjour.RxBonjour;
import com.ui.wifiman.model.discovery.engine.bonjour.c;
import com.ui.wifiman.model.discovery.engine.snmp.Snmp;
import com.ui.wifiman.model.vendor.d;
import ed.InterfaceC5453a;
import fe.u;
import gd.C5896a;
import gg.y;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import le.InterfaceC6586g;
import mc.InterfaceC6794a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import rj.c6;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f4554a = new DI.g("model.discovery.engine", false, null, new InterfaceC6835l() { // from class: Ec.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return s.t((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<Mc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<Sc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C extends org.kodein.type.o<Lc.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class D extends org.kodein.type.o<Gc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<Ic.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.snmp.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<Uc.i> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.bonjour.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class I extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.bonjour.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class J extends org.kodein.type.o<Nc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class K extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.snmp.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class L extends org.kodein.type.o<Tc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class M extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class N extends org.kodein.type.o<WifiManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class O extends org.kodein.type.o<Nc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class P extends org.kodein.type.o<u.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Q extends org.kodein.type.o<y> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class R extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class S extends org.kodein.type.o<Snmp> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class T extends org.kodein.type.o<u.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class U extends org.kodein.type.o<y> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class V extends org.kodein.type.o<xa.o> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class W extends org.kodein.type.o<InterfaceC4091e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class X extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Y extends org.kodein.type.o<WifiManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Z extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$a, reason: case insensitive filesystem */
    public static final class C2675a extends org.kodein.type.o<Ic.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a0 extends org.kodein.type.o<RxBonjour> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$b, reason: case insensitive filesystem */
    public static final class C2676b extends org.kodein.type.o<Nc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b0 extends org.kodein.type.o<c.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$c, reason: case insensitive filesystem */
    public static final class C2677c extends org.kodein.type.o<Nc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c0 extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$d, reason: case insensitive filesystem */
    public static final class C2678d extends org.kodein.type.o<Snmp> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d0 extends org.kodein.type.o<C5896a.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$e, reason: case insensitive filesystem */
    public static final class C2679e extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.snmp.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e0 extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$f, reason: case insensitive filesystem */
    public static final class C2680f extends org.kodein.type.o<Jc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f0 extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$g, reason: case insensitive filesystem */
    public static final class C2681g extends org.kodein.type.o<Tc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g0 extends org.kodein.type.o<InterfaceC6794a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$h, reason: case insensitive filesystem */
    public static final class C2682h extends org.kodein.type.o<Uc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h0 extends org.kodein.type.o<u.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$i, reason: case insensitive filesystem */
    public static final class C2683i extends org.kodein.type.o<RxBonjour> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i0 extends org.kodein.type.o<y> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$j, reason: case insensitive filesystem */
    public static final class C2684j extends org.kodein.type.o<c.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j0 extends org.kodein.type.o<xa.o> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$k, reason: case insensitive filesystem */
    public static final class C2685k extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.bonjour.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$l, reason: case insensitive filesystem */
    public static final class C2686l extends org.kodein.type.o<Fc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l0 extends org.kodein.type.o<InterfaceC5453a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$m, reason: case insensitive filesystem */
    public static final class C2687m extends org.kodein.type.o<Mc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m0 extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$n, reason: case insensitive filesystem */
    public static final class C2688n extends org.kodein.type.o<Kc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n0 extends org.kodein.type.o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$o, reason: case insensitive filesystem */
    public static final class C2689o extends org.kodein.type.o<Sc.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$p, reason: case insensitive filesystem */
    public static final class C2690p extends org.kodein.type.o<Lc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$q, reason: case insensitive filesystem */
    public static final class C2691q extends org.kodein.type.o<Gc.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$r, reason: case insensitive filesystem */
    public static final class C2692r extends org.kodein.type.o<a.C0249a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$s, reason: collision with other inner class name */
    public static final class C0190s extends org.kodein.type.o<Fc.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$t, reason: case insensitive filesystem */
    public static final class C2693t extends org.kodein.type.o<a.C0426a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$u, reason: case insensitive filesystem */
    public static final class C2694u extends org.kodein.type.o<Kc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$v, reason: case insensitive filesystem */
    public static final class C2695v extends org.kodein.type.o<b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$w, reason: case insensitive filesystem */
    public static final class C2696w extends org.kodein.type.o<Nc.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/c", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$x, reason: case insensitive filesystem */
    public static final class C2697x extends org.kodein.type.o<a.C0403a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/d", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$y, reason: case insensitive filesystem */
    public static final class C2698y extends org.kodein.type.o<Jc.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ec.s$z, reason: case insensitive filesystem */
    public static final class C2699z extends org.kodein.type.o<com.ui.wifiman.model.discovery.engine.bonjour.b> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Jc.c A(uj.b factory, a.C0403a params) {
        AbstractC6492s.i(factory, "$this$factory");
        AbstractC6492s.i(params, "params");
        u.a aVar = u.a.DISCOVERY_HOSTNAME;
        InterfaceC7733m2 interfaceC7733m2G = factory.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new T().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE, u.a.class);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new U().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Jc.c(params, (y) interfaceC7733m2G.b(dVar, new org.kodein.type.d(iVarE2, y.class), null, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tc.b B(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new V().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        xa.o oVar = (xa.o) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, xa.o.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new W().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC4091e interfaceC4091e = (InterfaceC4091e) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC4091e.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new X().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Tc.b(oVar, interfaceC4091e, (d.b) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, d.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uc.i C(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new Y().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        WifiManager wifiManager = (WifiManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, WifiManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new Z().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Uc.i(wifiManager, (d.b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, d.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.discovery.engine.bonjour.b D(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        RxBonjour rxBonjour = (RxBonjour) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, RxBonjour.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        c.g gVar = (c.g) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, c.g.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = provider.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new c0().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        d.b bVar = (d.b) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, d.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = provider.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new d0().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.discovery.engine.bonjour.b(rxBonjour, gVar, bVar, (C5896a.b) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, C5896a.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fc.d E(uj.b factory, a.C0249a params) {
        AbstractC6492s.i(factory, "$this$factory");
        AbstractC6492s.i(params, "params");
        InterfaceC7733m2 interfaceC7733m2G = factory.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Fc.d(params, (InterfaceC6586g) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6586g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Mc.b F(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new f0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Zc.f fVar = (Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new g0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Mc.b(fVar, (InterfaceC6794a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC6794a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Kc.e G(uj.b factory, a.C0426a params) {
        AbstractC6492s.i(factory, "$this$factory");
        AbstractC6492s.i(params, "params");
        u.a aVar = u.a.HEAVY_PARALLEL;
        InterfaceC7733m2 interfaceC7733m2G = factory.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new h0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE, u.a.class);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new i0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Kc.e(params, (y) interfaceC7733m2G.b(dVar, new org.kodein.type.d(iVarE2, y.class), null, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sc.e H(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new j0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Sc.e((xa.o) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, xa.o.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lc.d I(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new k0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Lc.d((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gc.b J(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC5453a interfaceC5453a = (InterfaceC5453a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC5453a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new m0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Gc.b(interfaceC5453a, (d.b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, d.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ic.b K(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new n0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Ic.b((Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null));
    }

    public static final DI.g s() {
        return f4554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        DI.b.a.a(Module, Pc.d.d(), false, 2, null);
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C2683i().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, RxBonjour.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: Ec.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.u((uj.j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, com.ui.wifiman.model.discovery.engine.bonjour.e.class), null, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C2684j().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, c.g.class), null, null);
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: Ec.r
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.v((uj.j) obj);
            }
        };
        uj.q qVarC2 = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.u(qVarC2, qVarB2, zE2, new org.kodein.type.d(iVarE4, com.ui.wifiman.model.discovery.engine.bonjour.d.class), null, true, interfaceC6835l2));
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new C2685k().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE5, com.ui.wifiman.model.discovery.engine.bonjour.a.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: Ec.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.D((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB3 = Module.b();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C2699z().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new uj.n(qVarB3, new org.kodein.type.d(iVarE6, com.ui.wifiman.model.discovery.engine.bonjour.b.class), interfaceC6835l3));
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new C2686l().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE7, Fc.a.class), null, null);
        InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: Ec.c
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return s.E((uj.b) obj, (a.C0249a) obj2);
            }
        };
        org.kodein.type.q qVarB4 = Module.b();
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new C2692r().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE8, a.C0249a.class);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new C0190s().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new uj.g(qVarB4, dVar, new org.kodein.type.d(iVarE9, Fc.d.class), interfaceC6839p));
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new C2687m().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD5 = Module.d(new org.kodein.type.d(iVarE10, Mc.a.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: Ec.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.F((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB5 = Module.b();
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD5.a(new uj.n(qVarB5, new org.kodein.type.d(iVarE11, Mc.b.class), interfaceC6835l4));
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new C2688n().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD6 = Module.d(new org.kodein.type.d(iVarE12, Kc.a.class), null, null);
        InterfaceC6839p interfaceC6839p2 = new InterfaceC6839p() { // from class: Ec.e
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return s.G((uj.b) obj, (a.C0426a) obj2);
            }
        };
        org.kodein.type.q qVarB6 = Module.b();
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new C2693t().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar2 = new org.kodein.type.d(iVarE13, a.C0426a.class);
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new C2694u().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD6.a(new uj.g(qVarB6, dVar2, new org.kodein.type.d(iVarE14, Kc.e.class), interfaceC6839p2));
        org.kodein.type.i iVarE15 = org.kodein.type.s.e(new C2689o().getSuperType());
        AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD7 = Module.d(new org.kodein.type.d(iVarE15, Sc.b.class), null, null);
        InterfaceC6835l interfaceC6835l5 = new InterfaceC6835l() { // from class: Ec.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.H((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB7 = Module.b();
        org.kodein.type.i iVarE16 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD7.a(new uj.n(qVarB7, new org.kodein.type.d(iVarE16, Sc.e.class), interfaceC6835l5));
        org.kodein.type.i iVarE17 = org.kodein.type.s.e(new C2690p().getSuperType());
        AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD8 = Module.d(new org.kodein.type.d(iVarE17, Lc.a.class), null, null);
        InterfaceC6835l interfaceC6835l6 = new InterfaceC6835l() { // from class: Ec.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.I((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB8 = Module.b();
        org.kodein.type.i iVarE18 = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE18, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD8.a(new uj.n(qVarB8, new org.kodein.type.d(iVarE18, Lc.d.class), interfaceC6835l6));
        org.kodein.type.i iVarE19 = org.kodein.type.s.e(new C2691q().getSuperType());
        AbstractC6492s.g(iVarE19, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD9 = Module.d(new org.kodein.type.d(iVarE19, Gc.a.class), null, null);
        InterfaceC6835l interfaceC6835l7 = new InterfaceC6835l() { // from class: Ec.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.J((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB9 = Module.b();
        org.kodein.type.i iVarE20 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE20, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD9.a(new uj.n(qVarB9, new org.kodein.type.d(iVarE20, Gc.b.class), interfaceC6835l7));
        org.kodein.type.i iVarE21 = org.kodein.type.s.e(new C2675a().getSuperType());
        AbstractC6492s.g(iVarE21, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD10 = Module.d(new org.kodein.type.d(iVarE21, Ic.a.class), null, null);
        InterfaceC6835l interfaceC6835l8 = new InterfaceC6835l() { // from class: Ec.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.K((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB10 = Module.b();
        org.kodein.type.i iVarE22 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE22, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD10.a(new uj.n(qVarB10, new org.kodein.type.d(iVarE22, Ic.b.class), interfaceC6835l8));
        org.kodein.type.i iVarE23 = org.kodein.type.s.e(new C2676b().getSuperType());
        AbstractC6492s.g(iVarE23, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD11 = Module.d(new org.kodein.type.d(iVarE23, Nc.a.class), null, null);
        InterfaceC6835l interfaceC6835l9 = new InterfaceC6835l() { // from class: Ec.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.w((uj.j) obj);
            }
        };
        uj.q qVarC3 = Module.c();
        org.kodein.type.q qVarB11 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE24 = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE24, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD11.a(new uj.u(qVarC3, qVarB11, zE3, new org.kodein.type.d(iVarE24, Nc.e.class), null, true, interfaceC6835l9));
        org.kodein.type.i iVarE25 = org.kodein.type.s.e(new C2677c().getSuperType());
        AbstractC6492s.g(iVarE25, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD12 = Module.d(new org.kodein.type.d(iVarE25, Nc.b.class), null, null);
        InterfaceC6839p interfaceC6839p3 = new InterfaceC6839p() { // from class: Ec.l
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return s.x((uj.b) obj, (b.a) obj2);
            }
        };
        org.kodein.type.q qVarB12 = Module.b();
        org.kodein.type.i iVarE26 = org.kodein.type.s.e(new C2695v().getSuperType());
        AbstractC6492s.g(iVarE26, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar3 = new org.kodein.type.d(iVarE26, b.a.class);
        org.kodein.type.i iVarE27 = org.kodein.type.s.e(new C2696w().getSuperType());
        AbstractC6492s.g(iVarE27, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD12.a(new uj.g(qVarB12, dVar3, new org.kodein.type.d(iVarE27, Nc.c.class), interfaceC6839p3));
        org.kodein.type.i iVarE28 = org.kodein.type.s.e(new C2678d().getSuperType());
        AbstractC6492s.g(iVarE28, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD13 = Module.d(new org.kodein.type.d(iVarE28, Snmp.class), null, null);
        InterfaceC6835l interfaceC6835l10 = new InterfaceC6835l() { // from class: Ec.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.y((uj.j) obj);
            }
        };
        uj.q qVarC4 = Module.c();
        org.kodein.type.q qVarB13 = Module.b();
        boolean zE4 = Module.e();
        org.kodein.type.i iVarE29 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE29, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD13.a(new uj.u(qVarC4, qVarB13, zE4, new org.kodein.type.d(iVarE29, com.ui.wifiman.model.discovery.engine.snmp.c.class), null, true, interfaceC6835l10));
        org.kodein.type.i iVarE30 = org.kodein.type.s.e(new C2679e().getSuperType());
        AbstractC6492s.g(iVarE30, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD14 = Module.d(new org.kodein.type.d(iVarE30, com.ui.wifiman.model.discovery.engine.snmp.a.class), null, null);
        InterfaceC6835l interfaceC6835l11 = new InterfaceC6835l() { // from class: Ec.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.z((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB14 = Module.b();
        org.kodein.type.i iVarE31 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE31, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD14.a(new uj.n(qVarB14, new org.kodein.type.d(iVarE31, com.ui.wifiman.model.discovery.engine.snmp.b.class), interfaceC6835l11));
        org.kodein.type.i iVarE32 = org.kodein.type.s.e(new C2680f().getSuperType());
        AbstractC6492s.g(iVarE32, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD15 = Module.d(new org.kodein.type.d(iVarE32, Jc.a.class), null, null);
        InterfaceC6839p interfaceC6839p4 = new InterfaceC6839p() { // from class: Ec.o
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return s.A((uj.b) obj, (a.C0403a) obj2);
            }
        };
        org.kodein.type.q qVarB15 = Module.b();
        org.kodein.type.i iVarE33 = org.kodein.type.s.e(new C2697x().getSuperType());
        AbstractC6492s.g(iVarE33, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar4 = new org.kodein.type.d(iVarE33, a.C0403a.class);
        org.kodein.type.i iVarE34 = org.kodein.type.s.e(new C2698y().getSuperType());
        AbstractC6492s.g(iVarE34, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD15.a(new uj.g(qVarB15, dVar4, new org.kodein.type.d(iVarE34, Jc.c.class), interfaceC6839p4));
        org.kodein.type.i iVarE35 = org.kodein.type.s.e(new C2681g().getSuperType());
        AbstractC6492s.g(iVarE35, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD16 = Module.d(new org.kodein.type.d(iVarE35, Tc.a.class), null, null);
        c6 c6Var = c6.f60607a;
        InterfaceC6835l interfaceC6835l12 = new InterfaceC6835l() { // from class: Ec.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.B((uj.j) obj);
            }
        };
        uj.q qVarC5 = Module.c();
        org.kodein.type.q qVarB16 = Module.b();
        boolean zE5 = Module.e();
        org.kodein.type.i iVarE36 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE36, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD16.a(new uj.u(qVarC5, qVarB16, zE5, new org.kodein.type.d(iVarE36, Tc.b.class), c6Var, true, interfaceC6835l12));
        org.kodein.type.i iVarE37 = org.kodein.type.s.e(new C2682h().getSuperType());
        AbstractC6492s.g(iVarE37, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD17 = Module.d(new org.kodein.type.d(iVarE37, Uc.e.class), null, null);
        InterfaceC6835l interfaceC6835l13 = new InterfaceC6835l() { // from class: Ec.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return s.C((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB17 = Module.b();
        org.kodein.type.i iVarE38 = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE38, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD17.a(new uj.n(qVarB17, new org.kodein.type.d(iVarE38, Uc.i.class), interfaceC6835l13));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.discovery.engine.bonjour.e u(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Zc.f fVar = (Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.discovery.engine.bonjour.e(fVar, (WifiManager) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, WifiManager.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.discovery.engine.bonjour.d v(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new com.ui.wifiman.model.discovery.engine.bonjour.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nc.e w(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new Nc.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nc.c x(uj.b factory, b.a params) {
        AbstractC6492s.i(factory, "$this$factory");
        AbstractC6492s.i(params, "params");
        InterfaceC7733m2 interfaceC7733m2G = factory.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Nc.a aVar = (Nc.a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Nc.a.class), null);
        u.a aVar2 = u.a.DISCOVERY_NETBIOS;
        InterfaceC7733m2 interfaceC7733m2G2 = factory.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar = new org.kodein.type.d(iVarE2, u.a.class);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new Q().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Nc.c(params, aVar, (y) interfaceC7733m2G2.b(dVar, new org.kodein.type.d(iVarE3, y.class), null, aVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.discovery.engine.snmp.c y(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new com.ui.wifiman.model.discovery.engine.snmp.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.discovery.engine.snmp.b z(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new R().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Zc.f fVar = (Zc.f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Zc.f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = provider.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new S().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.discovery.engine.snmp.b(fVar, (Snmp) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, Snmp.class), null));
    }
}
