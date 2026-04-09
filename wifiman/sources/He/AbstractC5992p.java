package he;

import android.net.wifi.WifiManager;
import be.InterfaceC4091e;
import com.ui.wifiman.model.vendor.d;
import com.ui.wifiman.model.wifi.scan.android.AndroidWifiSignalFactory;
import com.ui.wifiman.model.wmw.WifimanWizard;
import dc.C5341a;
import fe.u;
import je.C6296B;
import je.C6298D;
import je.C6315p;
import je.InterfaceC6297C;
import je.InterfaceC6300a;
import je.v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import le.InterfaceC6586g;
import me.C6808G;
import me.C6813e;
import me.InterfaceC6807F;
import me.InterfaceC6809a;
import me.InterfaceC6814f;
import me.r;
import me.s;
import mh.InterfaceC6835l;
import ne.C6937a;
import ne.C6938b;
import oe.C7124b;
import oe.InterfaceC7123a;
import org.kodein.di.DI;
import pe.C7317b;
import pe.InterfaceC7316a;
import rj.InterfaceC7733m2;
import tc.InterfaceC8077a;
import uj.q;

/* renamed from: he.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5992p {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f48608a = new DI.g("model.wifi", false, null, new InterfaceC6835l() { // from class: he.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC5992p.p((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$A */
    public static final class A extends org.kodein.type.o<C6315p> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$B */
    public static final class B extends org.kodein.type.o<C6808G> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$C */
    public static final class C extends org.kodein.type.o<WifiManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$D */
    public static final class D extends org.kodein.type.o<InterfaceC6300a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$E */
    public static final class E extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$F */
    public static final class F extends org.kodein.type.o<T7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$G */
    public static final class G extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$H */
    public static final class H extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$I */
    public static final class I extends org.kodein.type.o<T7.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$J */
    public static final class J extends org.kodein.type.o<InterfaceC6814f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$K */
    public static final class K extends org.kodein.type.o<C6296B> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$L */
    public static final class L extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$M */
    public static final class M extends org.kodein.type.o<WifimanWizard> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$N */
    public static final class N extends org.kodein.type.o<InterfaceC6807F> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$O */
    public static final class O extends org.kodein.type.o<InterfaceC7123a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$P */
    public static final class P extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$Q */
    public static final class Q extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$R */
    public static final class R extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$S */
    public static final class S extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$T */
    public static final class T extends org.kodein.type.o<C5341a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$U */
    public static final class U extends org.kodein.type.o<C6296B> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$V */
    public static final class V extends org.kodein.type.o<InterfaceC4091e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$W */
    public static final class W extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$X */
    public static final class X extends org.kodein.type.o<InterfaceC6809a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$Y */
    public static final class Y extends org.kodein.type.o<InterfaceC7316a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$Z */
    public static final class Z extends org.kodein.type.o<r> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$a, reason: case insensitive filesystem */
    public static final class C5993a extends org.kodein.type.o<InterfaceC7123a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$a0 */
    public static final class a0 extends org.kodein.type.o<InterfaceC8077a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$b, reason: case insensitive filesystem */
    public static final class C5994b extends org.kodein.type.o<InterfaceC6586g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$b0 */
    public static final class b0 extends org.kodein.type.o<WifiManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$c, reason: case insensitive filesystem */
    public static final class C5995c extends org.kodein.type.o<C6937a.InterfaceC1989a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$c0 */
    public static final class c0 extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$d, reason: case insensitive filesystem */
    public static final class C5996d extends org.kodein.type.o<ie.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/C4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$d0 */
    public static final class d0 extends org.kodein.type.o<O7.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$e, reason: case insensitive filesystem */
    public static final class C5997e extends org.kodein.type.o<InterfaceC7316a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/D4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$e0 */
    public static final class e0 extends org.kodein.type.o<fe.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$f, reason: case insensitive filesystem */
    public static final class C5998f extends org.kodein.type.o<C6296B> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$f0 */
    public static final class f0 extends org.kodein.type.o<AndroidWifiSignalFactory> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$g, reason: case insensitive filesystem */
    public static final class C5999g extends org.kodein.type.o<InterfaceC6297C> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$g0 */
    public static final class g0 extends org.kodein.type.o<u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$h, reason: case insensitive filesystem */
    public static final class C6000h extends org.kodein.type.o<je.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$h0 */
    public static final class h0 extends org.kodein.type.o<InterfaceC7316a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$i, reason: case insensitive filesystem */
    public static final class C6001i extends org.kodein.type.o<r> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$i0 */
    public static final class i0 extends org.kodein.type.o<T7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$j, reason: case insensitive filesystem */
    public static final class C6002j extends org.kodein.type.o<AndroidWifiSignalFactory> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$k, reason: case insensitive filesystem */
    public static final class C6003k extends org.kodein.type.o<InterfaceC6814f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$l, reason: case insensitive filesystem */
    public static final class C6004l extends org.kodein.type.o<InterfaceC6809a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$m, reason: case insensitive filesystem */
    public static final class C6005m extends org.kodein.type.o<InterfaceC6300a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$n, reason: case insensitive filesystem */
    public static final class C6006n extends org.kodein.type.o<InterfaceC6807F> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$o, reason: case insensitive filesystem */
    public static final class C6007o extends org.kodein.type.o<C7124b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$p, reason: collision with other inner class name */
    public static final class C1802p extends org.kodein.type.o<com.ui.wifiman.model.wifi.scan.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$q, reason: case insensitive filesystem */
    public static final class C6008q extends org.kodein.type.o<C6938b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$r, reason: case insensitive filesystem */
    public static final class C6009r extends org.kodein.type.o<ie.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$s, reason: case insensitive filesystem */
    public static final class C6010s extends org.kodein.type.o<C7317b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$t, reason: case insensitive filesystem */
    public static final class C6011t extends org.kodein.type.o<C6296B> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$u, reason: case insensitive filesystem */
    public static final class C6012u extends org.kodein.type.o<C6298D> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$v, reason: case insensitive filesystem */
    public static final class C6013v extends org.kodein.type.o<v> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$w, reason: case insensitive filesystem */
    public static final class C6014w extends org.kodein.type.o<s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$x, reason: case insensitive filesystem */
    public static final class C6015x extends org.kodein.type.o<com.ui.wifiman.model.wifi.scan.android.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$y, reason: case insensitive filesystem */
    public static final class C6016y extends org.kodein.type.o<com.ui.wifiman.model.wifi.scan.android.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: he.p$z, reason: case insensitive filesystem */
    public static final class C6017z extends org.kodein.type.o<C6813e> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6813e A(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C6813e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6315p B(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new h0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7316a interfaceC7316a = (InterfaceC7316a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC7316a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new i0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6315p(interfaceC7316a, (T7.a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, T7.a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6808G C(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C6808G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7124b D(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C7124b();
    }

    public static final DI.g E() {
        return f48608a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J p(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C5998f().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, C6296B.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: he.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.q((uj.j) obj);
            }
        };
        q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C6011t().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, C6296B.class), null, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C5999g().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, InterfaceC6297C.class), null, null);
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: he.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.r((uj.j) obj);
            }
        };
        q qVarC2 = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new C6012u().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.u(qVarC2, qVarB2, zE2, new org.kodein.type.d(iVarE4, C6298D.class), null, true, interfaceC6835l2));
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new C6000h().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE5, je.u.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: he.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.w((uj.j) obj);
            }
        };
        q qVarC3 = Module.c();
        org.kodein.type.q qVarB3 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C6013v().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new uj.u(qVarC3, qVarB3, zE3, new org.kodein.type.d(iVarE6, v.class), null, true, interfaceC6835l3));
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new C6001i().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE7, r.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: he.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.x((uj.j) obj);
            }
        };
        q qVarC4 = Module.c();
        org.kodein.type.q qVarB4 = Module.b();
        boolean zE4 = Module.e();
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new C6014w().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new uj.u(qVarC4, qVarB4, zE4, new org.kodein.type.d(iVarE8, s.class), null, true, interfaceC6835l4));
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new C6002j().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD5 = Module.d(new org.kodein.type.d(iVarE9, AndroidWifiSignalFactory.class), null, null);
        InterfaceC6835l interfaceC6835l5 = new InterfaceC6835l() { // from class: he.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.y((uj.j) obj);
            }
        };
        q qVarC5 = Module.c();
        org.kodein.type.q qVarB5 = Module.b();
        boolean zE5 = Module.e();
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new C6015x().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD5.a(new uj.u(qVarC5, qVarB5, zE5, new org.kodein.type.d(iVarE10, com.ui.wifiman.model.wifi.scan.android.b.class), null, true, interfaceC6835l5));
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new C6003k().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD6 = Module.d(new org.kodein.type.d(iVarE11, InterfaceC6814f.class), null, null);
        InterfaceC6835l interfaceC6835l6 = new InterfaceC6835l() { // from class: he.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.z((uj.j) obj);
            }
        };
        q qVarC6 = Module.c();
        org.kodein.type.q qVarB6 = Module.b();
        boolean zE6 = Module.e();
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new C6016y().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD6.a(new uj.u(qVarC6, qVarB6, zE6, new org.kodein.type.d(iVarE12, com.ui.wifiman.model.wifi.scan.android.a.class), null, true, interfaceC6835l6));
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new C6004l().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD7 = Module.d(new org.kodein.type.d(iVarE13, InterfaceC6809a.class), null, null);
        InterfaceC6835l interfaceC6835l7 = new InterfaceC6835l() { // from class: he.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.A((uj.j) obj);
            }
        };
        q qVarC7 = Module.c();
        org.kodein.type.q qVarB7 = Module.b();
        boolean zE7 = Module.e();
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new C6017z().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD7.a(new uj.u(qVarC7, qVarB7, zE7, new org.kodein.type.d(iVarE14, C6813e.class), null, true, interfaceC6835l7));
        org.kodein.type.i iVarE15 = org.kodein.type.s.e(new C6005m().getSuperType());
        AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD8 = Module.d(new org.kodein.type.d(iVarE15, InterfaceC6300a.class), null, null);
        InterfaceC6835l interfaceC6835l8 = new InterfaceC6835l() { // from class: he.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.B((uj.j) obj);
            }
        };
        q qVarC8 = Module.c();
        org.kodein.type.q qVarB8 = Module.b();
        boolean zE8 = Module.e();
        org.kodein.type.i iVarE16 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD8.a(new uj.u(qVarC8, qVarB8, zE8, new org.kodein.type.d(iVarE16, C6315p.class), null, true, interfaceC6835l8));
        org.kodein.type.i iVarE17 = org.kodein.type.s.e(new C6006n().getSuperType());
        AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD9 = Module.d(new org.kodein.type.d(iVarE17, InterfaceC6807F.class), null, null);
        InterfaceC6835l interfaceC6835l9 = new InterfaceC6835l() { // from class: he.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.C((uj.j) obj);
            }
        };
        q qVarC9 = Module.c();
        org.kodein.type.q qVarB9 = Module.b();
        boolean zE9 = Module.e();
        org.kodein.type.i iVarE18 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE18, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD9.a(new uj.u(qVarC9, qVarB9, zE9, new org.kodein.type.d(iVarE18, C6808G.class), null, true, interfaceC6835l9));
        org.kodein.type.i iVarE19 = org.kodein.type.s.e(new C5993a().getSuperType());
        AbstractC6492s.g(iVarE19, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD10 = Module.d(new org.kodein.type.d(iVarE19, InterfaceC7123a.class), null, null);
        InterfaceC6835l interfaceC6835l10 = new InterfaceC6835l() { // from class: he.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.D((uj.j) obj);
            }
        };
        q qVarC10 = Module.c();
        org.kodein.type.q qVarB10 = Module.b();
        boolean zE10 = Module.e();
        org.kodein.type.i iVarE20 = org.kodein.type.s.e(new C6007o().getSuperType());
        AbstractC6492s.g(iVarE20, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD10.a(new uj.u(qVarC10, qVarB10, zE10, new org.kodein.type.d(iVarE20, C7124b.class), null, true, interfaceC6835l10));
        org.kodein.type.i iVarE21 = org.kodein.type.s.e(new C5994b().getSuperType());
        AbstractC6492s.g(iVarE21, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD11 = Module.d(new org.kodein.type.d(iVarE21, InterfaceC6586g.class), null, null);
        InterfaceC6835l interfaceC6835l11 = new InterfaceC6835l() { // from class: he.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.s((uj.j) obj);
            }
        };
        q qVarC11 = Module.c();
        org.kodein.type.q qVarB11 = Module.b();
        boolean zE11 = Module.e();
        org.kodein.type.i iVarE22 = org.kodein.type.s.e(new C1802p().getSuperType());
        AbstractC6492s.g(iVarE22, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD11.a(new uj.u(qVarC11, qVarB11, zE11, new org.kodein.type.d(iVarE22, com.ui.wifiman.model.wifi.scan.a.class), null, true, interfaceC6835l11));
        org.kodein.type.i iVarE23 = org.kodein.type.s.e(new C5995c().getSuperType());
        AbstractC6492s.g(iVarE23, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD12 = Module.d(new org.kodein.type.d(iVarE23, C6937a.InterfaceC1989a.class), null, null);
        InterfaceC6835l interfaceC6835l12 = new InterfaceC6835l() { // from class: he.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.t((uj.j) obj);
            }
        };
        q qVarC12 = Module.c();
        org.kodein.type.q qVarB12 = Module.b();
        boolean zE12 = Module.e();
        org.kodein.type.i iVarE24 = org.kodein.type.s.e(new C6008q().getSuperType());
        AbstractC6492s.g(iVarE24, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD12.a(new uj.u(qVarC12, qVarB12, zE12, new org.kodein.type.d(iVarE24, C6938b.class), null, true, interfaceC6835l12));
        org.kodein.type.i iVarE25 = org.kodein.type.s.e(new C5996d().getSuperType());
        AbstractC6492s.g(iVarE25, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD13 = Module.d(new org.kodein.type.d(iVarE25, ie.f.class), null, null);
        InterfaceC6835l interfaceC6835l13 = new InterfaceC6835l() { // from class: he.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.u((uj.j) obj);
            }
        };
        q qVarC13 = Module.c();
        org.kodein.type.q qVarB13 = Module.b();
        boolean zE13 = Module.e();
        org.kodein.type.i iVarE26 = org.kodein.type.s.e(new C6009r().getSuperType());
        AbstractC6492s.g(iVarE26, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD13.a(new uj.u(qVarC13, qVarB13, zE13, new org.kodein.type.d(iVarE26, ie.g.class), null, true, interfaceC6835l13));
        org.kodein.type.i iVarE27 = org.kodein.type.s.e(new C5997e().getSuperType());
        AbstractC6492s.g(iVarE27, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD14 = Module.d(new org.kodein.type.d(iVarE27, InterfaceC7316a.class), null, null);
        InterfaceC6835l interfaceC6835l14 = new InterfaceC6835l() { // from class: he.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC5992p.v((uj.j) obj);
            }
        };
        q qVarC14 = Module.c();
        org.kodein.type.q qVarB14 = Module.b();
        boolean zE14 = Module.e();
        org.kodein.type.i iVarE28 = org.kodein.type.s.e(new C6010s().getSuperType());
        AbstractC6492s.g(iVarE28, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD14.a(new uj.u(qVarC14, qVarB14, zE14, new org.kodein.type.d(iVarE28, C7317b.class), null, true, interfaceC6835l14));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6296B q(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        WifiManager wifiManager = (WifiManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, WifiManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6300a interfaceC6300a = (InterfaceC6300a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC6300a.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        u uVar = (u) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, u.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6296B(wifiManager, interfaceC6300a, (T7.a) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, T7.a.class), null), uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6298D r(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        je.u uVar = (je.u) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, je.u.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        u uVar2 = (u) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, u.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6298D(uVar, uVar2, (T7.d) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, T7.d.class), null), 0L, 0L, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.wifi.scan.a s(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6814f interfaceC6814f = (InterfaceC6814f) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6814f.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        C6296B c6296b = (C6296B) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, C6296B.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        d.b bVar = (d.b) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, d.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        WifimanWizard wifimanWizard = (WifimanWizard) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, WifimanWizard.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6807F interfaceC6807F = (InterfaceC6807F) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, InterfaceC6807F.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7123a interfaceC7123a = (InterfaceC7123a) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE6, InterfaceC7123a.class), null);
        InterfaceC7733m2 interfaceC7733m2G7 = singleton.g();
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.wifi.scan.a(interfaceC6814f, c6296b, bVar, wifimanWizard, interfaceC6807F, interfaceC7123a, (u) interfaceC7733m2G7.e(new org.kodein.type.d(iVarE7, u.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6938b t(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new Q().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6586g interfaceC6586g = (InterfaceC6586g) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6586g.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new R().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6938b(interfaceC6586g, (u) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, u.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie.g u(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new S().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6586g interfaceC6586g = (InterfaceC6586g) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6586g.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new T().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new ie.g(interfaceC6586g, (C5341a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, C5341a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7317b v(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C7317b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v w(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new U().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        C6296B c6296b = (C6296B) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C6296B.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new V().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC4091e interfaceC4091e = (InterfaceC4091e) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC4091e.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new W().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new v(c6296b, (InterfaceC6586g) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, InterfaceC6586g.class), null), interfaceC4091e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s x(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.wifi.scan.android.b y(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new X().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6809a interfaceC6809a = (InterfaceC6809a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC6809a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new Y().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7316a interfaceC7316a = (InterfaceC7316a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC7316a.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new Z().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.wifi.scan.android.b(interfaceC6809a, interfaceC7316a, (r) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, r.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.wifi.scan.android.a z(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, InterfaceC8077a.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        WifiManager wifiManager = (WifiManager) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, WifiManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new c0().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        com.ui.wifiman.model.android.permissions.d dVar = (com.ui.wifiman.model.android.permissions.d) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, com.ui.wifiman.model.android.permissions.d.class), null);
        O7.d dVar2 = O7.d.WIFI_SCANNER;
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new d0().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        org.kodein.type.d dVar3 = new org.kodein.type.d(iVarE4, O7.d.class);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new e0().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        fe.n nVar = (fe.n) interfaceC7733m2G4.b(dVar3, new org.kodein.type.d(iVarE5, fe.n.class), null, dVar2);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new f0().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        AndroidWifiSignalFactory androidWifiSignalFactory = (AndroidWifiSignalFactory) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE6, AndroidWifiSignalFactory.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new g0().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.wifi.scan.android.a(wifiManager, interfaceC8077a, dVar, nVar, androidWifiSignalFactory, (u) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE7, u.class), null));
    }
}
