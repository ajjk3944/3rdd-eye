package wc;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.ubnt.usurvey.a;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.wifiman.model.bluetooth.classic.BluetoothScanner;
import com.ui.wifiman.model.bluetooth.le.BleCommonCharacteristicsReader;
import com.ui.wifiman.model.bluetooth.le.BleScanner;
import com.ui.wifiman.model.bluetooth.le.j;
import com.ui.wifiman.model.bluetooth.le.l;
import com.ui.wifiman.model.vendor.d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import rj.InterfaceC7733m2;
import rj.b6;
import rj.c6;
import tc.InterfaceC8077a;
import wc.C8322b;

/* renamed from: wc.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8295A {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f64801a = new DI.g("model.bluetooth", false, null, new InterfaceC6835l() { // from class: wc.n
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC8295A.n((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$A, reason: collision with other inner class name */
    public static final class C2292A extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$B */
    public static final class B extends org.kodein.type.o<InterfaceC8077a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$C */
    public static final class C extends org.kodein.type.o<BluetoothScanner> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$D */
    public static final class D extends org.kodein.type.o<BleScanner> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$E */
    public static final class E extends org.kodein.type.o<InterfaceC8324d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$F */
    public static final class F extends org.kodein.type.o<a.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$G */
    public static final class G extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$H */
    public static final class H extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$I */
    public static final class I extends org.kodein.type.o<BluetoothManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$J */
    public static final class J extends org.kodein.type.o<InterfaceC8324d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$K */
    public static final class K extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$L */
    public static final class L extends org.kodein.type.o<InterfaceC8077a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$M */
    public static final class M extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$N */
    public static final class N extends org.kodein.type.o<BluetoothManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$O */
    public static final class O extends org.kodein.type.o<InterfaceC8324d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$P */
    public static final class P extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$Q */
    public static final class Q extends org.kodein.type.o<Ac.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$R */
    public static final class R extends org.kodein.type.o<xa.o> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$S */
    public static final class S extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$T */
    public static final class T extends org.kodein.type.o<j.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$U */
    public static final class U extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$V */
    public static final class V extends org.kodein.type.o<yc.s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$W */
    public static final class W extends org.kodein.type.o<l.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$X */
    public static final class X extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$Y */
    public static final class Y extends org.kodein.type.o<BluetoothManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$Z */
    public static final class Z extends org.kodein.type.o<P7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$a */
    public static final class a extends org.kodein.type.o<C8322b.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$a0 */
    public static final class a0 extends org.kodein.type.o<BleCommonCharacteristicsReader> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$b, reason: case insensitive filesystem */
    public static final class C8296b extends org.kodein.type.o<h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$b0 */
    public static final class b0 extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$c, reason: case insensitive filesystem */
    public static final class C8297c extends org.kodein.type.o<T8.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$c0 */
    public static final class c0 extends org.kodein.type.o<h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$d, reason: case insensitive filesystem */
    public static final class C8298d extends org.kodein.type.o<Ac.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$d0 */
    public static final class d0 extends org.kodein.type.o<fe.u> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$e, reason: case insensitive filesystem */
    public static final class C8299e extends org.kodein.type.o<InterfaceC8324d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$f, reason: case insensitive filesystem */
    public static final class C8300f extends org.kodein.type.o<BluetoothScanner> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$g, reason: case insensitive filesystem */
    public static final class C8301g extends org.kodein.type.o<BleScanner> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$h, reason: case insensitive filesystem */
    public static final class C8302h extends org.kodein.type.o<j.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$i, reason: case insensitive filesystem */
    public static final class C8303i extends org.kodein.type.o<yc.s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$j, reason: case insensitive filesystem */
    public static final class C8304j extends org.kodein.type.o<l.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$k, reason: case insensitive filesystem */
    public static final class C8305k extends org.kodein.type.o<BleCommonCharacteristicsReader> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$l, reason: case insensitive filesystem */
    public static final class C8306l extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$m, reason: case insensitive filesystem */
    public static final class C8307m extends org.kodein.type.o<C8323c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$n, reason: case insensitive filesystem */
    public static final class C8308n extends org.kodein.type.o<m> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$o, reason: case insensitive filesystem */
    public static final class C8309o extends org.kodein.type.o<BTLEv2RxAndroidBle> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$p, reason: case insensitive filesystem */
    public static final class C8310p extends org.kodein.type.o<Ac.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$q, reason: case insensitive filesystem */
    public static final class C8311q extends org.kodein.type.o<e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$r, reason: case insensitive filesystem */
    public static final class C8312r extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.classic.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$s, reason: case insensitive filesystem */
    public static final class C8313s extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$t, reason: case insensitive filesystem */
    public static final class C8314t extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.k> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$u, reason: case insensitive filesystem */
    public static final class C8315u extends org.kodein.type.o<yc.s> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$v, reason: case insensitive filesystem */
    public static final class C8316v extends org.kodein.type.o<l.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$w, reason: case insensitive filesystem */
    public static final class C8317w extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$x, reason: case insensitive filesystem */
    public static final class C8318x extends org.kodein.type.o<com.ui.wifiman.model.bluetooth.le.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$y, reason: case insensitive filesystem */
    public static final class C8319y extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: wc.A$z, reason: case insensitive filesystem */
    public static final class C8320z extends org.kodein.type.o<BluetoothManager> {
    }

    public static final DI.g A() {
        return f64801a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C8298d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, Ac.a.class), null, null);
        b6 b6Var = b6.f60605a;
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: wc.r
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.o((uj.j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C8310p().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, Ac.b.class), b6Var, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C8299e().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, InterfaceC8324d.class), null, null);
        c6 c6Var = c6.f60607a;
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: wc.u
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.p((uj.j) obj);
            }
        };
        uj.q qVarC2 = Module.c();
        org.kodein.type.q qVarB2 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new C8311q().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.u(qVarC2, qVarB2, zE2, new org.kodein.type.d(iVarE4, e.class), c6Var, true, interfaceC6835l2));
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new C8300f().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE5, BluetoothScanner.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: wc.v
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.s((uj.j) obj);
            }
        };
        uj.q qVarC3 = Module.c();
        org.kodein.type.q qVarB3 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new C8312r().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new uj.u(qVarC3, qVarB3, zE3, new org.kodein.type.d(iVarE6, com.ui.wifiman.model.bluetooth.classic.a.class), c6Var, true, interfaceC6835l3));
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new C8301g().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE7, BleScanner.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: wc.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.t((uj.j) obj);
            }
        };
        uj.q qVarC4 = Module.c();
        org.kodein.type.q qVarB4 = Module.b();
        boolean zE4 = Module.e();
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new C8313s().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new uj.u(qVarC4, qVarB4, zE4, new org.kodein.type.d(iVarE8, com.ui.wifiman.model.bluetooth.le.f.class), c6Var, true, interfaceC6835l4));
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new C8302h().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD5 = Module.d(new org.kodein.type.d(iVarE9, j.a.class), null, null);
        InterfaceC6835l interfaceC6835l5 = new InterfaceC6835l() { // from class: wc.x
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.u((uj.j) obj);
            }
        };
        uj.q qVarC5 = Module.c();
        org.kodein.type.q qVarB5 = Module.b();
        boolean zE5 = Module.e();
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new C8314t().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD5.a(new uj.u(qVarC5, qVarB5, zE5, new org.kodein.type.d(iVarE10, com.ui.wifiman.model.bluetooth.le.k.class), c6Var, true, interfaceC6835l5));
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new C8303i().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD6 = Module.d(new org.kodein.type.d(iVarE11, yc.s.class), null, null);
        InterfaceC6835l interfaceC6835l6 = new InterfaceC6835l() { // from class: wc.y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.v((uj.j) obj);
            }
        };
        uj.q qVarC6 = Module.c();
        org.kodein.type.q qVarB6 = Module.b();
        boolean zE6 = Module.e();
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new C8315u().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD6.a(new uj.u(qVarC6, qVarB6, zE6, new org.kodein.type.d(iVarE12, yc.s.class), c6Var, true, interfaceC6835l6));
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new C8304j().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD7 = Module.d(new org.kodein.type.d(iVarE13, l.b.class), null, null);
        InterfaceC6835l interfaceC6835l7 = new InterfaceC6835l() { // from class: wc.z
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.w((uj.j) obj);
            }
        };
        uj.q qVarC7 = Module.c();
        org.kodein.type.q qVarB7 = Module.b();
        boolean zE7 = Module.e();
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new C8316v().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD7.a(new uj.u(qVarC7, qVarB7, zE7, new org.kodein.type.d(iVarE14, l.b.class), c6Var, true, interfaceC6835l7));
        org.kodein.type.i iVarE15 = org.kodein.type.s.e(new C8305k().getSuperType());
        AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD8 = Module.d(new org.kodein.type.d(iVarE15, BleCommonCharacteristicsReader.class), null, null);
        InterfaceC6835l interfaceC6835l8 = new InterfaceC6835l() { // from class: wc.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.x((uj.j) obj);
            }
        };
        uj.q qVarC8 = Module.c();
        org.kodein.type.q qVarB8 = Module.b();
        boolean zE8 = Module.e();
        org.kodein.type.i iVarE16 = org.kodein.type.s.e(new C8317w().getSuperType());
        AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD8.a(new uj.u(qVarC8, qVarB8, zE8, new org.kodein.type.d(iVarE16, com.ui.wifiman.model.bluetooth.le.d.class), c6Var, true, interfaceC6835l8));
        org.kodein.type.i iVarE17 = org.kodein.type.s.e(new C8306l().getSuperType());
        AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD9 = Module.d(new org.kodein.type.d(iVarE17, com.ui.wifiman.model.bluetooth.le.a.class), null, null);
        InterfaceC6835l interfaceC6835l9 = new InterfaceC6835l() { // from class: wc.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.y((uj.j) obj);
            }
        };
        uj.q qVarC9 = Module.c();
        org.kodein.type.q qVarB9 = Module.b();
        boolean zE9 = Module.e();
        org.kodein.type.i iVarE18 = org.kodein.type.s.e(new C8318x().getSuperType());
        AbstractC6492s.g(iVarE18, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD9.a(new uj.u(qVarC9, qVarB9, zE9, new org.kodein.type.d(iVarE18, com.ui.wifiman.model.bluetooth.le.c.class), c6Var, true, interfaceC6835l9));
        org.kodein.type.i iVarE19 = org.kodein.type.s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE19, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD10 = Module.d(new org.kodein.type.d(iVarE19, C8322b.a.class), null, null);
        InterfaceC6835l interfaceC6835l10 = new InterfaceC6835l() { // from class: wc.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.z((uj.j) obj);
            }
        };
        uj.q qVarC10 = Module.c();
        org.kodein.type.q qVarB10 = Module.b();
        boolean zE10 = Module.e();
        org.kodein.type.i iVarE20 = org.kodein.type.s.e(new C8307m().getSuperType());
        AbstractC6492s.g(iVarE20, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD10.a(new uj.u(qVarC10, qVarB10, zE10, new org.kodein.type.d(iVarE20, C8323c.class), c6Var, true, interfaceC6835l10));
        org.kodein.type.i iVarE21 = org.kodein.type.s.e(new C8296b().getSuperType());
        AbstractC6492s.g(iVarE21, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD11 = Module.d(new org.kodein.type.d(iVarE21, h.class), null, null);
        InterfaceC6835l interfaceC6835l11 = new InterfaceC6835l() { // from class: wc.s
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.q((uj.j) obj);
            }
        };
        uj.q qVarC11 = Module.c();
        org.kodein.type.q qVarB11 = Module.b();
        boolean zE11 = Module.e();
        org.kodein.type.i iVarE22 = org.kodein.type.s.e(new C8308n().getSuperType());
        AbstractC6492s.g(iVarE22, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD11.a(new uj.u(qVarC11, qVarB11, zE11, new org.kodein.type.d(iVarE22, m.class), c6Var, true, interfaceC6835l11));
        org.kodein.type.i iVarE23 = org.kodein.type.s.e(new C8297c().getSuperType());
        AbstractC6492s.g(iVarE23, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD12 = Module.d(new org.kodein.type.d(iVarE23, T8.a.class), null, null);
        InterfaceC6835l interfaceC6835l12 = new InterfaceC6835l() { // from class: wc.t
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8295A.r((uj.j) obj);
            }
        };
        uj.q qVarC12 = Module.c();
        org.kodein.type.q qVarB12 = Module.b();
        boolean zE12 = Module.e();
        org.kodein.type.i iVarE24 = org.kodein.type.s.e(new C8309o().getSuperType());
        AbstractC6492s.g(iVarE24, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD12.a(new uj.u(qVarC12, qVarB12, zE12, new org.kodein.type.d(iVarE24, BTLEv2RxAndroidBle.class), null, true, interfaceC6835l12));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ac.b o(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C8319y().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new Ac.b((d.b) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, d.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e p(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C8320z().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BluetoothManager bluetoothManager = (BluetoothManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, BluetoothManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new C2292A().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        PackageManager packageManager = (PackageManager) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, PackageManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new e(bluetoothManager, packageManager, (InterfaceC8077a) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, InterfaceC8077a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m q(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BluetoothScanner bluetoothScanner = (BluetoothScanner) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, BluetoothScanner.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BleScanner bleScanner = (BleScanner) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, BleScanner.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8324d interfaceC8324d = (InterfaceC8324d) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, InterfaceC8324d.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new m(interfaceC8324d, bluetoothScanner, bleScanner, (a.b) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, a.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BTLEv2RxAndroidBle r(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        BTLEv2RxAndroidBle.a aVar = BTLEv2RxAndroidBle.f41084d;
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return aVar.b((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.bluetooth.classic.a s(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BluetoothManager bluetoothManager = (BluetoothManager) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, BluetoothManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8324d interfaceC8324d = (InterfaceC8324d) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, InterfaceC8324d.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        d.b bVar = (d.b) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, d.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, InterfaceC8077a.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.bluetooth.classic.a(context, bluetoothManager, interfaceC8324d, interfaceC8077a, bVar, (com.ui.wifiman.model.android.permissions.d) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE6, com.ui.wifiman.model.android.permissions.d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.bluetooth.le.f t(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BluetoothManager bluetoothManager = (BluetoothManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, BluetoothManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8324d interfaceC8324d = (InterfaceC8324d) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC8324d.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        d.b bVar = (d.b) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, d.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new Q().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Ac.a aVar = (Ac.a) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, Ac.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new R().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        xa.o oVar = (xa.o) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, xa.o.class), null);
        InterfaceC7733m2 interfaceC7733m2G6 = singleton.g();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new S().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        PackageManager packageManager = (PackageManager) interfaceC7733m2G6.e(new org.kodein.type.d(iVarE6, PackageManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G7 = singleton.g();
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new T().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        j.a aVar2 = (j.a) interfaceC7733m2G7.e(new org.kodein.type.d(iVarE7, j.a.class), null);
        InterfaceC7733m2 interfaceC7733m2G8 = singleton.g();
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new U().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.bluetooth.le.f(bluetoothManager, interfaceC8324d, bVar, aVar, oVar, packageManager, aVar2, (com.ui.wifiman.model.android.permissions.d) interfaceC7733m2G8.e(new org.kodein.type.d(iVarE8, com.ui.wifiman.model.android.permissions.d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.bluetooth.le.k u(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new V().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        yc.s sVar = (yc.s) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, yc.s.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new W().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.bluetooth.le.k(sVar, (l.b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, l.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yc.s v(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new yc.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l.b w(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new l.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.bluetooth.le.d x(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new X().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new Y().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BluetoothManager bluetoothManager = (BluetoothManager) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, BluetoothManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new Z().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.bluetooth.le.d(context, bluetoothManager, (P7.a) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, P7.a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.bluetooth.le.c y(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new a0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        BleCommonCharacteristicsReader bleCommonCharacteristicsReader = (BleCommonCharacteristicsReader) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, BleCommonCharacteristicsReader.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new b0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.bluetooth.le.c(bleCommonCharacteristicsReader, (d.b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, d.b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8323c z(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new c0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        h hVar = (h) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, h.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new d0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C8323c(hVar, (fe.u) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, fe.u.class), null));
    }
}
