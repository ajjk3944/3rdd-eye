package kc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.location.LocationManager;
import com.ui.wifiman.model.vendor.d;
import dc.C5341a;
import hc.InterfaceC5974b;
import j4.AbstractC6248c;
import j4.InterfaceC6247b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import lc.InterfaceC6573d;
import ld.InterfaceC6575b;
import mc.C6795b;
import mc.InterfaceC6794a;
import mh.InterfaceC6835l;
import nc.InterfaceC6924a;
import oc.C7117b;
import oc.InterfaceC7116a;
import oc.InterfaceC7118c;
import org.kodein.di.DI;
import pc.InterfaceC7283a;
import qc.C7450b;
import qc.InterfaceC7449a;
import rc.InterfaceC7585a;
import rc.InterfaceC7586b;
import rj.InterfaceC7733m2;
import rj.c6;
import tc.InterfaceC8077a;
import uc.C8159c;
import uc.InterfaceC8157a;
import vc.C8212e;
import vc.InterfaceC8208a;
import vc.InterfaceC8209b;

/* loaded from: classes4.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f51395a = new DI.g("model.android", false, null, new InterfaceC6835l() { // from class: kc.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return w.w((DI.b) obj);
        }
    }, 6, null);

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class A extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class B extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class D extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class E extends org.kodein.type.o<lc.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class F extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class G extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class H extends org.kodein.type.o<C7450b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class I extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class J extends org.kodein.type.o<tc.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class K extends org.kodein.type.o<C6795b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class L extends org.kodein.type.o<C8159c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class M extends org.kodein.type.o<nc.k> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class N extends org.kodein.type.o<nc.i> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class O extends org.kodein.type.o<pc.j> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/T1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class P extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Q extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class R extends org.kodein.type.o<C7450b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class S extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class T extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class U extends org.kodein.type.o<lc.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class V extends org.kodein.type.o<lc.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class W extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class X extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Y extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Z extends org.kodein.type.o<InterfaceC5974b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$a, reason: case insensitive filesystem */
    public static final class C6426a extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a0 extends org.kodein.type.o<Mb.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$b, reason: case insensitive filesystem */
    public static final class C6427b extends org.kodein.type.o<InterfaceC8209b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b0 extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$c, reason: case insensitive filesystem */
    public static final class C6428c extends org.kodein.type.o<InterfaceC8208a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$d, reason: case insensitive filesystem */
    public static final class C6429d extends org.kodein.type.o<lc.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d0 extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$e, reason: case insensitive filesystem */
    public static final class C6430e extends org.kodein.type.o<lc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$f, reason: case insensitive filesystem */
    public static final class C6431f extends org.kodein.type.o<InterfaceC6573d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f0 extends org.kodein.type.o<Resources> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$g, reason: case insensitive filesystem */
    public static final class C6432g extends org.kodein.type.o<C7117b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$h, reason: case insensitive filesystem */
    public static final class C6433h extends org.kodein.type.o<InterfaceC7116a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h0 extends org.kodein.type.o<d.b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$i, reason: case insensitive filesystem */
    public static final class C6434i extends org.kodein.type.o<InterfaceC7118c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i0 extends org.kodein.type.o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$j, reason: case insensitive filesystem */
    public static final class C6435j extends org.kodein.type.o<rc.h> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j0 extends org.kodein.type.o<Nd.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$k, reason: case insensitive filesystem */
    public static final class C6436k extends org.kodein.type.o<C7450b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$l, reason: case insensitive filesystem */
    public static final class C6437l extends org.kodein.type.o<InterfaceC7586b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class l0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$m, reason: case insensitive filesystem */
    public static final class C6438m extends org.kodein.type.o<InterfaceC7585a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class m0 extends org.kodein.type.o<PackageManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$n, reason: case insensitive filesystem */
    public static final class C6439n extends org.kodein.type.o<InterfaceC7449a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class n0 extends org.kodein.type.o<C5341a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$o, reason: case insensitive filesystem */
    public static final class C6440o extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class o0 extends org.kodein.type.o<Context> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$p, reason: case insensitive filesystem */
    public static final class C6441p extends org.kodein.type.o<InterfaceC8077a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class p0 extends org.kodein.type.o<InterfaceC8077a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$q, reason: case insensitive filesystem */
    public static final class C6442q extends org.kodein.type.o<InterfaceC6794a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q0 extends org.kodein.type.o<LocationManager> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$r, reason: case insensitive filesystem */
    public static final class C6443r extends org.kodein.type.o<InterfaceC8157a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/v4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class r0 extends org.kodein.type.o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$s, reason: case insensitive filesystem */
    public static final class C6444s extends org.kodein.type.o<nc.j> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$t, reason: case insensitive filesystem */
    public static final class C6445t extends org.kodein.type.o<InterfaceC6924a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/W1", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$u, reason: case insensitive filesystem */
    public static final class C6446u extends org.kodein.type.o<InterfaceC7283a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$v, reason: case insensitive filesystem */
    public static final class C6447v extends org.kodein.type.o<C7450b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$w, reason: collision with other inner class name */
    public static final class C1901w extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$x, reason: case insensitive filesystem */
    public static final class C6448x extends org.kodein.type.o<C8212e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$y, reason: case insensitive filesystem */
    public static final class C6449y extends org.kodein.type.o<lc.g> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/B0", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kc.w$z, reason: case insensitive filesystem */
    public static final class C6450z extends org.kodein.type.o<lc.g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8212e A(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new T().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (C8212e) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C8212e.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc.g B(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new lc.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc.g C(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new U().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (lc.g) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, lc.g.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lc.g D(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new V().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (lc.g) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, lc.g.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7117b E(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C7117b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7117b F(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new W().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (C7117b) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C7117b.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7117b G(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new X().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (C7117b) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C7117b.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rc.h H(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new Y().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6247b interfaceC6247bA = AbstractC6248c.a((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
        AbstractC6492s.h(interfaceC6247bA, "create(...)");
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new Z().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC5974b interfaceC5974b = (InterfaceC5974b) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC5974b.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new a0().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new rc.h(interfaceC6247bA, interfaceC5974b, (Mb.a) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, Mb.a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rc.h I(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new b0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (rc.h) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, rc.h.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.android.permissions.c J(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new c0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new com.ui.wifiman.model.android.permissions.c((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rc.h K(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new d0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (rc.h) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, rc.h.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc.d L(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new e0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new tc.d((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6795b M(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new f0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Resources resources = (Resources) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Resources.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new g0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Context context = (Context) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, Context.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new h0().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        d.b bVar = (d.b) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, d.b.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new i0().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC6575b interfaceC6575b = (InterfaceC6575b) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, InterfaceC6575b.class), null);
        InterfaceC7733m2 interfaceC7733m2G5 = singleton.g();
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new j0().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C6795b(resources, context, bVar, interfaceC6575b, (Nd.c) interfaceC7733m2G5.e(new org.kodein.type.d(iVarE5, Nd.c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8159c N(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new k0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C8159c((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nc.k O(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new l0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new nc.k((Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nc.i P(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new m0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        PackageManager packageManager = (PackageManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, PackageManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new n0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new nc.i(packageManager, (C5341a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, C5341a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.j Q(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new o0().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        Context context = (Context) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, Context.class), null);
        InterfaceC7733m2 interfaceC7733m2G2 = singleton.g();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new p0().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) interfaceC7733m2G2.e(new org.kodein.type.d(iVarE2, InterfaceC8077a.class), null);
        InterfaceC7733m2 interfaceC7733m2G3 = singleton.g();
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new q0().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        LocationManager locationManager = (LocationManager) interfaceC7733m2G3.e(new org.kodein.type.d(iVarE3, LocationManager.class), null);
        InterfaceC7733m2 interfaceC7733m2G4 = singleton.g();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new r0().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new pc.j(context, interfaceC8077a, locationManager, (com.ui.wifiman.model.android.permissions.d) interfaceC7733m2G4.e(new org.kodein.type.d(iVarE4, com.ui.wifiman.model.android.permissions.d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8212e R(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        return new C8212e();
    }

    public static final DI.g S() {
        return f51395a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J w(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        org.kodein.type.i iVarE = org.kodein.type.s.e(new C6436k().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD = Module.d(new org.kodein.type.d(iVarE, C7450b.class), null, null);
        InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: kc.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.x((uj.j) obj);
            }
        };
        uj.q qVarC = Module.c();
        org.kodein.type.q qVarB = Module.b();
        boolean zE = Module.e();
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD.a(new uj.u(qVarC, qVarB, zE, new org.kodein.type.d(iVarE2, C7450b.class), null, true, interfaceC6835l));
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new C6439n().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD2 = Module.d(new org.kodein.type.d(iVarE3, InterfaceC7449a.class), null, null);
        InterfaceC6835l interfaceC6835l2 = new InterfaceC6835l() { // from class: kc.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.y((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB2 = Module.b();
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new C6447v().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD2.a(new uj.n(qVarB2, new org.kodein.type.d(iVarE4, C7450b.class), interfaceC6835l2));
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new C6440o().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD3 = Module.d(new org.kodein.type.d(iVarE5, com.ui.wifiman.model.android.permissions.d.class), null, null);
        InterfaceC6835l interfaceC6835l3 = new InterfaceC6835l() { // from class: kc.f
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.J((uj.j) obj);
            }
        };
        uj.q qVarC2 = Module.c();
        org.kodein.type.q qVarB3 = Module.b();
        boolean zE2 = Module.e();
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD3.a(new uj.u(qVarC2, qVarB3, zE2, new org.kodein.type.d(iVarE6, com.ui.wifiman.model.android.permissions.c.class), null, true, interfaceC6835l3));
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new C6441p().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD4 = Module.d(new org.kodein.type.d(iVarE7, InterfaceC8077a.class), null, null);
        InterfaceC6835l interfaceC6835l4 = new InterfaceC6835l() { // from class: kc.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.L((uj.j) obj);
            }
        };
        uj.q qVarC3 = Module.c();
        org.kodein.type.q qVarB4 = Module.b();
        boolean zE3 = Module.e();
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD4.a(new uj.u(qVarC3, qVarB4, zE3, new org.kodein.type.d(iVarE8, tc.d.class), null, true, interfaceC6835l4));
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new C6442q().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD5 = Module.d(new org.kodein.type.d(iVarE9, InterfaceC6794a.class), null, null);
        InterfaceC6835l interfaceC6835l5 = new InterfaceC6835l() { // from class: kc.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.M((uj.j) obj);
            }
        };
        uj.q qVarC4 = Module.c();
        org.kodein.type.q qVarB5 = Module.b();
        boolean zE4 = Module.e();
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD5.a(new uj.u(qVarC4, qVarB5, zE4, new org.kodein.type.d(iVarE10, C6795b.class), null, true, interfaceC6835l5));
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new C6443r().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD6 = Module.d(new org.kodein.type.d(iVarE11, InterfaceC8157a.class), null, null);
        InterfaceC6835l interfaceC6835l6 = new InterfaceC6835l() { // from class: kc.i
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.N((uj.j) obj);
            }
        };
        uj.q qVarC5 = Module.c();
        org.kodein.type.q qVarB6 = Module.b();
        boolean zE5 = Module.e();
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD6.a(new uj.u(qVarC5, qVarB6, zE5, new org.kodein.type.d(iVarE12, C8159c.class), null, true, interfaceC6835l6));
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new C6444s().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD7 = Module.d(new org.kodein.type.d(iVarE13, nc.j.class), null, null);
        InterfaceC6835l interfaceC6835l7 = new InterfaceC6835l() { // from class: kc.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.O((uj.j) obj);
            }
        };
        uj.q qVarC6 = Module.c();
        org.kodein.type.q qVarB7 = Module.b();
        boolean zE6 = Module.e();
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD7.a(new uj.u(qVarC6, qVarB7, zE6, new org.kodein.type.d(iVarE14, nc.k.class), null, true, interfaceC6835l7));
        org.kodein.type.i iVarE15 = org.kodein.type.s.e(new C6445t().getSuperType());
        AbstractC6492s.g(iVarE15, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD8 = Module.d(new org.kodein.type.d(iVarE15, InterfaceC6924a.class), null, null);
        InterfaceC6835l interfaceC6835l8 = new InterfaceC6835l() { // from class: kc.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.P((uj.j) obj);
            }
        };
        uj.q qVarC7 = Module.c();
        org.kodein.type.q qVarB8 = Module.b();
        boolean zE7 = Module.e();
        org.kodein.type.i iVarE16 = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE16, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD8.a(new uj.u(qVarC7, qVarB8, zE7, new org.kodein.type.d(iVarE16, nc.i.class), null, true, interfaceC6835l8));
        org.kodein.type.i iVarE17 = org.kodein.type.s.e(new C6446u().getSuperType());
        AbstractC6492s.g(iVarE17, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD9 = Module.d(new org.kodein.type.d(iVarE17, InterfaceC7283a.class), null, null);
        c6 c6Var = c6.f60607a;
        InterfaceC6835l interfaceC6835l9 = new InterfaceC6835l() { // from class: kc.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.Q((uj.j) obj);
            }
        };
        uj.q qVarC8 = Module.c();
        org.kodein.type.q qVarB9 = Module.b();
        boolean zE8 = Module.e();
        org.kodein.type.i iVarE18 = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE18, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD9.a(new uj.u(qVarC8, qVarB9, zE8, new org.kodein.type.d(iVarE18, pc.j.class), c6Var, true, interfaceC6835l9));
        org.kodein.type.i iVarE19 = org.kodein.type.s.e(new C6426a().getSuperType());
        AbstractC6492s.g(iVarE19, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD10 = Module.d(new org.kodein.type.d(iVarE19, C8212e.class), null, null);
        InterfaceC6835l interfaceC6835l10 = new InterfaceC6835l() { // from class: kc.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.R((uj.j) obj);
            }
        };
        uj.q qVarC9 = Module.c();
        org.kodein.type.q qVarB10 = Module.b();
        boolean zE9 = Module.e();
        org.kodein.type.i iVarE20 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE20, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD10.a(new uj.u(qVarC9, qVarB10, zE9, new org.kodein.type.d(iVarE20, C8212e.class), null, true, interfaceC6835l10));
        org.kodein.type.i iVarE21 = org.kodein.type.s.e(new C6427b().getSuperType());
        AbstractC6492s.g(iVarE21, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD11 = Module.d(new org.kodein.type.d(iVarE21, InterfaceC8209b.class), null, null);
        InterfaceC6835l interfaceC6835l11 = new InterfaceC6835l() { // from class: kc.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.z((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB11 = Module.b();
        org.kodein.type.i iVarE22 = org.kodein.type.s.e(new C1901w().getSuperType());
        AbstractC6492s.g(iVarE22, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD11.a(new uj.n(qVarB11, new org.kodein.type.d(iVarE22, C8212e.class), interfaceC6835l11));
        org.kodein.type.i iVarE23 = org.kodein.type.s.e(new C6428c().getSuperType());
        AbstractC6492s.g(iVarE23, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD12 = Module.d(new org.kodein.type.d(iVarE23, InterfaceC8208a.class), null, null);
        InterfaceC6835l interfaceC6835l12 = new InterfaceC6835l() { // from class: kc.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.A((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB12 = Module.b();
        org.kodein.type.i iVarE24 = org.kodein.type.s.e(new C6448x().getSuperType());
        AbstractC6492s.g(iVarE24, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD12.a(new uj.n(qVarB12, new org.kodein.type.d(iVarE24, C8212e.class), interfaceC6835l12));
        org.kodein.type.i iVarE25 = org.kodein.type.s.e(new C6429d().getSuperType());
        AbstractC6492s.g(iVarE25, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD13 = Module.d(new org.kodein.type.d(iVarE25, lc.g.class), null, null);
        InterfaceC6835l interfaceC6835l13 = new InterfaceC6835l() { // from class: kc.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.B((uj.j) obj);
            }
        };
        uj.q qVarC10 = Module.c();
        org.kodein.type.q qVarB13 = Module.b();
        boolean zE10 = Module.e();
        org.kodein.type.i iVarE26 = org.kodein.type.s.e(new E().getSuperType());
        AbstractC6492s.g(iVarE26, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD13.a(new uj.u(qVarC10, qVarB13, zE10, new org.kodein.type.d(iVarE26, lc.g.class), null, true, interfaceC6835l13));
        org.kodein.type.i iVarE27 = org.kodein.type.s.e(new C6430e().getSuperType());
        AbstractC6492s.g(iVarE27, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD14 = Module.d(new org.kodein.type.d(iVarE27, lc.e.class), null, null);
        InterfaceC6835l interfaceC6835l14 = new InterfaceC6835l() { // from class: kc.r
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.C((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB14 = Module.b();
        org.kodein.type.i iVarE28 = org.kodein.type.s.e(new C6449y().getSuperType());
        AbstractC6492s.g(iVarE28, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD14.a(new uj.n(qVarB14, new org.kodein.type.d(iVarE28, lc.g.class), interfaceC6835l14));
        org.kodein.type.i iVarE29 = org.kodein.type.s.e(new C6431f().getSuperType());
        AbstractC6492s.g(iVarE29, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD15 = Module.d(new org.kodein.type.d(iVarE29, InterfaceC6573d.class), null, null);
        InterfaceC6835l interfaceC6835l15 = new InterfaceC6835l() { // from class: kc.s
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.D((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB15 = Module.b();
        org.kodein.type.i iVarE30 = org.kodein.type.s.e(new C6450z().getSuperType());
        AbstractC6492s.g(iVarE30, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD15.a(new uj.n(qVarB15, new org.kodein.type.d(iVarE30, lc.g.class), interfaceC6835l15));
        org.kodein.type.i iVarE31 = org.kodein.type.s.e(new C6432g().getSuperType());
        AbstractC6492s.g(iVarE31, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD16 = Module.d(new org.kodein.type.d(iVarE31, C7117b.class), null, null);
        InterfaceC6835l interfaceC6835l16 = new InterfaceC6835l() { // from class: kc.t
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.E((uj.j) obj);
            }
        };
        uj.q qVarC11 = Module.c();
        org.kodein.type.q qVarB16 = Module.b();
        boolean zE11 = Module.e();
        org.kodein.type.i iVarE32 = org.kodein.type.s.e(new F().getSuperType());
        AbstractC6492s.g(iVarE32, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD16.a(new uj.u(qVarC11, qVarB16, zE11, new org.kodein.type.d(iVarE32, C7117b.class), null, true, interfaceC6835l16));
        org.kodein.type.i iVarE33 = org.kodein.type.s.e(new C6433h().getSuperType());
        AbstractC6492s.g(iVarE33, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD17 = Module.d(new org.kodein.type.d(iVarE33, InterfaceC7116a.class), null, null);
        InterfaceC6835l interfaceC6835l17 = new InterfaceC6835l() { // from class: kc.u
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.F((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB17 = Module.b();
        org.kodein.type.i iVarE34 = org.kodein.type.s.e(new A().getSuperType());
        AbstractC6492s.g(iVarE34, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD17.a(new uj.n(qVarB17, new org.kodein.type.d(iVarE34, C7117b.class), interfaceC6835l17));
        org.kodein.type.i iVarE35 = org.kodein.type.s.e(new C6434i().getSuperType());
        AbstractC6492s.g(iVarE35, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD18 = Module.d(new org.kodein.type.d(iVarE35, InterfaceC7118c.class), null, null);
        InterfaceC6835l interfaceC6835l18 = new InterfaceC6835l() { // from class: kc.v
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.G((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB18 = Module.b();
        org.kodein.type.i iVarE36 = org.kodein.type.s.e(new B().getSuperType());
        AbstractC6492s.g(iVarE36, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD18.a(new uj.n(qVarB18, new org.kodein.type.d(iVarE36, C7117b.class), interfaceC6835l18));
        org.kodein.type.i iVarE37 = org.kodein.type.s.e(new C6435j().getSuperType());
        AbstractC6492s.g(iVarE37, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD19 = Module.d(new org.kodein.type.d(iVarE37, rc.h.class), null, null);
        InterfaceC6835l interfaceC6835l19 = new InterfaceC6835l() { // from class: kc.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.H((uj.j) obj);
            }
        };
        uj.q qVarC12 = Module.c();
        org.kodein.type.q qVarB19 = Module.b();
        boolean zE12 = Module.e();
        org.kodein.type.i iVarE38 = org.kodein.type.s.e(new G().getSuperType());
        AbstractC6492s.g(iVarE38, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD19.a(new uj.u(qVarC12, qVarB19, zE12, new org.kodein.type.d(iVarE38, rc.h.class), null, true, interfaceC6835l19));
        org.kodein.type.i iVarE39 = org.kodein.type.s.e(new C6437l().getSuperType());
        AbstractC6492s.g(iVarE39, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD20 = Module.d(new org.kodein.type.d(iVarE39, InterfaceC7586b.class), null, null);
        InterfaceC6835l interfaceC6835l20 = new InterfaceC6835l() { // from class: kc.c
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.I((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB20 = Module.b();
        org.kodein.type.i iVarE40 = org.kodein.type.s.e(new C().getSuperType());
        AbstractC6492s.g(iVarE40, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD20.a(new uj.n(qVarB20, new org.kodein.type.d(iVarE40, rc.h.class), interfaceC6835l20));
        org.kodein.type.i iVarE41 = org.kodein.type.s.e(new C6438m().getSuperType());
        AbstractC6492s.g(iVarE41, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        DI.b.InterfaceC2016b interfaceC2016bD21 = Module.d(new org.kodein.type.d(iVarE41, InterfaceC7585a.class), null, null);
        InterfaceC6835l interfaceC6835l21 = new InterfaceC6835l() { // from class: kc.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.K((uj.j) obj);
            }
        };
        org.kodein.type.q qVarB21 = Module.b();
        org.kodein.type.i iVarE42 = org.kodein.type.s.e(new D().getSuperType());
        AbstractC6492s.g(iVarE42, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        interfaceC2016bD21.a(new uj.n(qVarB21, new org.kodein.type.d(iVarE42, rc.h.class), interfaceC6835l21));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7450b x(uj.j singleton) {
        AbstractC6492s.i(singleton, "$this$singleton");
        InterfaceC7733m2 interfaceC7733m2G = singleton.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new Q().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return new C7450b((PackageManager) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, PackageManager.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7450b y(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new R().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (C7450b) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C7450b.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8212e z(uj.j provider) {
        AbstractC6492s.i(provider, "$this$provider");
        InterfaceC7733m2 interfaceC7733m2G = provider.g();
        org.kodein.type.i iVarE = org.kodein.type.s.e(new S().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        return (C8212e) interfaceC7733m2G.e(new org.kodein.type.d(iVarE, C8212e.class), null);
    }
}
