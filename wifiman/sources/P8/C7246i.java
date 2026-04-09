package p8;

import Cc.InterfaceC2557a;
import Dc.e;
import Ee.C2706g;
import Le.a;
import Le.b;
import Yg.m;
import Zc.e;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import android.os.Build;
import b8.EnumC4076c;
import com.ui.wifiman.model.vendor.d;
import de.p;
import de.q;
import de.s;
import de.t;
import de.v;
import de.w;
import fc.EnumC5804a;
import fc.EnumC5805b;
import fc.EnumC5806c;
import gg.AbstractC5912b;
import gg.r;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6466c;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.type.o;
import p8.C7246i;
import pc.InterfaceC7283a;
import rj.InterfaceC7810x2;
import s9.d;
import vc.InterfaceC8209b;
import wc.C8321a;
import wc.InterfaceC8324d;
import ye.AbstractC8661g;
import ye.C8658d;
import zc.AbstractC8728b;

/* renamed from: p8.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7246i extends Le.d {

    /* renamed from: A, reason: collision with root package name */
    private final gg.i f57723A;

    /* renamed from: B, reason: collision with root package name */
    private final gg.i f57724B;

    /* renamed from: C, reason: collision with root package name */
    private final gg.i f57725C;

    /* renamed from: D, reason: collision with root package name */
    private final gg.i f57726D;

    /* renamed from: E, reason: collision with root package name */
    private final Li.N f57727E;

    /* renamed from: F, reason: collision with root package name */
    private final Li.N f57728F;

    /* renamed from: G, reason: collision with root package name */
    private final Li.N f57729G;

    /* renamed from: H, reason: collision with root package name */
    private final Li.N f57730H;

    /* renamed from: I, reason: collision with root package name */
    private final Li.N f57731I;

    /* renamed from: g, reason: collision with root package name */
    private final DI f57732g;

    /* renamed from: h, reason: collision with root package name */
    private final m f57733h;

    /* renamed from: i, reason: collision with root package name */
    private final m f57734i;

    /* renamed from: j, reason: collision with root package name */
    private final m f57735j;

    /* renamed from: k, reason: collision with root package name */
    private final m f57736k;

    /* renamed from: l, reason: collision with root package name */
    private final m f57737l;

    /* renamed from: m, reason: collision with root package name */
    private final m f57738m;

    /* renamed from: n, reason: collision with root package name */
    private final m f57739n;

    /* renamed from: o, reason: collision with root package name */
    private final m f57740o;

    /* renamed from: p, reason: collision with root package name */
    private final m f57741p;

    /* renamed from: q, reason: collision with root package name */
    private final m f57742q;

    /* renamed from: r, reason: collision with root package name */
    private final m f57743r;

    /* renamed from: s, reason: collision with root package name */
    private final m f57744s;

    /* renamed from: t, reason: collision with root package name */
    private final m f57745t;

    /* renamed from: u, reason: collision with root package name */
    private final m f57746u;

    /* renamed from: v, reason: collision with root package name */
    private final Comparator f57747v;

    /* renamed from: w, reason: collision with root package name */
    private final Comparator f57748w;

    /* renamed from: x, reason: collision with root package name */
    private final Comparator f57749x;

    /* renamed from: y, reason: collision with root package name */
    private final Comparator f57750y;

    /* renamed from: z, reason: collision with root package name */
    private final Comparator f57751z;

    /* renamed from: N, reason: collision with root package name */
    static final /* synthetic */ th.l[] f57721N = {kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "screenConfig", "getScreenConfig()Lcom/ui/wifiman/model/ui/DiscoveryHomeConfigManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "viewRouter", "getViewRouter()Lcom/ubnt/usurvey/ui/arch/routing/ViewRouter;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "appScreenManager", "getAppScreenManager()Lcom/ui/wifiman/model/android/window/AppWindowService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "networkConnection", "getNetworkConnection()Lcom/ui/wifiman/model/network/connection/NetworkConnectionManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "networkDiscovery", "getNetworkDiscovery()Lcom/ui/wifiman/model/discovery/NetworkDiscovery;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "lanConfigManager", "getLanConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryLanListConfigManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "lanDiscoveryFilter", "getLanDiscoveryFilter()Lcom/ubnt/usurvey/ui/discovery/lan/NetworkDiscoveryDeviceSearchFilter;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "bluetoothReceiver", "getBluetoothReceiver()Lcom/ui/wifiman/model/bluetooth/BluetoothReceiver;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "bluetoothScanner", "getBluetoothScanner()Lcom/ui/wifiman/model/bluetooth/BluetoothSurveyManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "bluetoothConfigManager", "getBluetoothConfigManager()Lcom/ui/wifiman/model/ui/DiscoveryBluetoothListConfigManager;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "bluetoothDiscoveryFilter", "getBluetoothDiscoveryFilter()Lcom/ubnt/usurvey/ui/discovery/bluetooth/BluetoothDeviceSearchFilter;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "permissionsService", "getPermissionsService()Lcom/ui/wifiman/model/android/permissions/AndroidPermissionService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "locationService", "getLocationService()Lcom/ui/wifiman/model/android/location/LocationService;", 0)), kotlin.jvm.internal.O.h(new kotlin.jvm.internal.F(C7246i.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0)), kotlin.jvm.internal.O.g(new kotlin.jvm.internal.D(C7246i.class, "discoveredDeviceStream", "<v#0>", 0))};

    /* renamed from: J, reason: collision with root package name */
    public static final C7247a f57720J = new C7247a(null);

    /* renamed from: X, reason: collision with root package name */
    public static final int f57722X = 8;

    /* renamed from: p8.i$A */
    static final class A implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final A f57752a = new A();

        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC7248b content) {
            AbstractC6492s.i(content, "content");
            if ((content instanceof AbstractC7248b.c) || (content instanceof AbstractC7248b.C2032b)) {
                return AbstractC5912b.m();
            }
            if (!(content instanceof AbstractC7248b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.AbstractC0459a abstractC0459aA = ((AbstractC7248b.a) content).a();
            if ((abstractC0459aA instanceof a.AbstractC0459a.f) || (abstractC0459aA instanceof a.AbstractC0459a.e) || (abstractC0459aA instanceof a.AbstractC0459a.g) || (abstractC0459aA instanceof a.AbstractC0459a.C0460a) || (abstractC0459aA instanceof a.AbstractC0459a.d) || (abstractC0459aA instanceof a.AbstractC0459a.b) || (abstractC0459aA instanceof a.AbstractC0459a.c)) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$B */
    public static final class B implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57753a;

        public B(boolean z10) {
            this.f57753a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        
            if (r2.f57753a != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r2.f57753a != false) goto L10;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                Cc.a r3 = (Cc.InterfaceC2557a) r3
                h9.a r3 = r3.l()
                Cc.a r4 = (Cc.InterfaceC2557a) r4
                h9.a r4 = r4.l()
                if (r3 != 0) goto L12
                if (r4 != 0) goto L12
                r3 = 0
                goto L29
            L12:
                r0 = 1
                r1 = -1
                if (r3 != 0) goto L1e
                boolean r3 = r2.f57753a
                if (r3 == 0) goto L1c
            L1a:
                r3 = r1
                goto L29
            L1c:
                r3 = r0
                goto L29
            L1e:
                if (r4 != 0) goto L25
                boolean r3 = r2.f57753a
                if (r3 == 0) goto L1a
                goto L1c
            L25:
                int r3 = r3.compareTo(r4)
            L29:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.B.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: p8.i$C */
    public static final class C implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57754a;

        public C(boolean z10) {
            this.f57754a = z10;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC6492s.k(((InterfaceC2557a) obj).hashCode(), ((InterfaceC2557a) obj2).hashCode());
        }
    }

    /* renamed from: p8.i$D */
    public static final class D implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57755a;

        public D(boolean z10) {
            this.f57755a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            if (r2.f57755a != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        
            if (r2.f57755a != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                Cc.a r3 = (Cc.InterfaceC2557a) r3
                Dc.j r3 = r3.j()
                r0 = 0
                if (r3 == 0) goto Le
                java.math.BigInteger r3 = r3.x()
                goto Lf
            Le:
                r3 = r0
            Lf:
                Cc.a r4 = (Cc.InterfaceC2557a) r4
                Dc.j r4 = r4.j()
                if (r4 == 0) goto L1b
                java.math.BigInteger r0 = r4.x()
            L1b:
                if (r3 != 0) goto L21
                if (r0 != 0) goto L21
                r3 = 0
                goto L38
            L21:
                r4 = 1
                r1 = -1
                if (r3 != 0) goto L2d
                boolean r3 = r2.f57755a
                if (r3 == 0) goto L2b
            L29:
                r3 = r1
                goto L38
            L2b:
                r3 = r4
                goto L38
            L2d:
                if (r0 != 0) goto L34
                boolean r3 = r2.f57755a
                if (r3 == 0) goto L29
                goto L2b
            L34:
                int r3 = r3.compareTo(r0)
            L38:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.D.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: p8.i$E */
    public static final class E implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57756a;

        public E(boolean z10) {
            this.f57756a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            if (r2.f57756a != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        
            if (r2.f57756a != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                Cc.a r3 = (Cc.InterfaceC2557a) r3
                wc.a r3 = r3.p()
                r0 = 0
                if (r3 == 0) goto Le
                U7.a r3 = r3.k()
                goto Lf
            Le:
                r3 = r0
            Lf:
                Cc.a r4 = (Cc.InterfaceC2557a) r4
                wc.a r4 = r4.p()
                if (r4 == 0) goto L1b
                U7.a r0 = r4.k()
            L1b:
                if (r3 != 0) goto L21
                if (r0 != 0) goto L21
                r3 = 0
                goto L38
            L21:
                r4 = 1
                r1 = -1
                if (r3 != 0) goto L2d
                boolean r3 = r2.f57756a
                if (r3 == 0) goto L2b
            L29:
                r3 = r1
                goto L38
            L2b:
                r3 = r4
                goto L38
            L2d:
                if (r0 != 0) goto L34
                boolean r3 = r2.f57756a
                if (r3 == 0) goto L29
                goto L2b
            L34:
                int r3 = r3.compareTo(r0)
            L38:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.E.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: p8.i$F */
    public static final class F implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57757a;

        public F(boolean z10) {
            this.f57757a = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            if (r2.f57757a != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        
            if (r2.f57757a != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                Cc.a r3 = (Cc.InterfaceC2557a) r3
                wc.a r3 = r3.p()
                r0 = 0
                if (r3 == 0) goto Le
                h9.a r3 = r3.d()
                goto Lf
            Le:
                r3 = r0
            Lf:
                Cc.a r4 = (Cc.InterfaceC2557a) r4
                wc.a r4 = r4.p()
                if (r4 == 0) goto L1b
                h9.a r0 = r4.d()
            L1b:
                if (r3 != 0) goto L21
                if (r0 != 0) goto L21
                r3 = 0
                goto L38
            L21:
                r4 = 1
                r1 = -1
                if (r3 != 0) goto L2d
                boolean r3 = r2.f57757a
                if (r3 == 0) goto L2b
            L29:
                r3 = r1
                goto L38
            L2b:
                r3 = r4
                goto L38
            L2d:
                if (r0 != 0) goto L34
                boolean r3 = r2.f57757a
                if (r3 == 0) goto L29
                goto L2b
            L34:
                int r3 = r3.compareTo(r0)
            L38:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.F.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: p8.i$G */
    public static final class G implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f57758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f57759b;

        public G(boolean z10, boolean z11) {
            this.f57758a = z10;
            this.f57759b = z11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        
            if (r2.f57758a != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        
            if (r2.f57758a != false) goto L10;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                Cc.a r3 = (Cc.InterfaceC2557a) r3
                java.lang.String r3 = r3.getName()
                Cc.a r4 = (Cc.InterfaceC2557a) r4
                java.lang.String r4 = r4.getName()
                if (r3 != 0) goto L12
                if (r4 != 0) goto L12
                r3 = 0
                goto L2b
            L12:
                r0 = 1
                r1 = -1
                if (r3 != 0) goto L1e
                boolean r3 = r2.f57758a
                if (r3 == 0) goto L1c
            L1a:
                r3 = r1
                goto L2b
            L1c:
                r3 = r0
                goto L2b
            L1e:
                if (r4 != 0) goto L25
                boolean r3 = r2.f57758a
                if (r3 == 0) goto L1a
                goto L1c
            L25:
                boolean r0 = r2.f57759b
                int r3 = kotlin.text.t.u(r3, r4, r0)
            L2b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.G.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$H */
    public static final class H extends o<q> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$I */
    public static final class I extends o<q8.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$J */
    public static final class J extends o<com.ui.wifiman.model.android.permissions.d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$K */
    public static final class K extends o<InterfaceC7283a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$L */
    public static final class L extends o<Cc.n> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$M */
    public static final class M extends o<t> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$N */
    public static final class N extends o<InterfaceC6084a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$O */
    public static final class O extends o<InterfaceC8209b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$P */
    public static final class P extends o<Zc.f> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$Q */
    public static final class Q extends o<Dc.e> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$R */
    public static final class R extends o<w> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$S */
    public static final class S extends o<r8.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$T */
    public static final class T extends o<InterfaceC8324d> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p8.i$U */
    public static final class U extends o<wc.h> {
    }

    /* renamed from: p8.i$V */
    static final class V implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final V f57760a = new V();

        V() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC8324d.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC8324d.b.a);
        }
    }

    /* renamed from: p8.i$W */
    static final class W implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final W f57761a = new W();

        W() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(Le.c t10, Boolean bluetoothAvailable) {
            AbstractC6492s.i(t10, "t");
            AbstractC6492s.i(bluetoothAvailable, "bluetoothAvailable");
            if (!bluetoothAvailable.booleanValue()) {
                t10 = null;
            }
            return new C6556a(t10);
        }
    }

    /* renamed from: p8.i$a, reason: case insensitive filesystem */
    public static final class C7247a {
        public /* synthetic */ C7247a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7247a() {
        }
    }

    /* renamed from: p8.i$b, reason: case insensitive filesystem */
    private static abstract class AbstractC7248b {

        /* renamed from: p8.i$b$a */
        public static final class a extends AbstractC7248b {

            /* renamed from: a, reason: collision with root package name */
            private final a.AbstractC0459a f57762a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.AbstractC0459a reason) {
                super(null);
                AbstractC6492s.i(reason, "reason");
                this.f57762a = reason;
            }

            public final a.AbstractC0459a a() {
                return this.f57762a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f57762a, ((a) obj).f57762a);
            }

            public int hashCode() {
                return this.f57762a.hashCode();
            }

            public String toString() {
                return "Empty(reason=" + this.f57762a + ")";
            }
        }

        /* renamed from: p8.i$b$b, reason: collision with other inner class name */
        public static final class C2032b extends AbstractC7248b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2032b f57763a = new C2032b();

            private C2032b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2032b);
            }

            public int hashCode() {
                return -1855813542;
            }

            public String toString() {
                return "InProgress";
            }
        }

        /* renamed from: p8.i$b$c */
        public static final class c extends AbstractC7248b {

            /* renamed from: a, reason: collision with root package name */
            private final Le.c f57764a;

            /* renamed from: b, reason: collision with root package name */
            private final Collection f57765b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f57766c;

            /* renamed from: d, reason: collision with root package name */
            private final Comparator f57767d;

            /* renamed from: e, reason: collision with root package name */
            private final InterfaceC6835l f57768e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Le.c tab, Collection results, boolean z10, Comparator sortComparator, InterfaceC6835l itemFactory) {
                super(null);
                AbstractC6492s.i(tab, "tab");
                AbstractC6492s.i(results, "results");
                AbstractC6492s.i(sortComparator, "sortComparator");
                AbstractC6492s.i(itemFactory, "itemFactory");
                this.f57764a = tab;
                this.f57765b = results;
                this.f57766c = z10;
                this.f57767d = sortComparator;
                this.f57768e = itemFactory;
            }

            public final InterfaceC6835l a() {
                return this.f57768e;
            }

            public final Collection b() {
                return this.f57765b;
            }

            public final Comparator c() {
                return this.f57767d;
            }

            public final Le.c d() {
                return this.f57764a;
            }

            public final boolean e() {
                return this.f57766c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f57764a == cVar.f57764a && AbstractC6492s.d(this.f57765b, cVar.f57765b) && this.f57766c == cVar.f57766c && AbstractC6492s.d(this.f57767d, cVar.f57767d) && AbstractC6492s.d(this.f57768e, cVar.f57768e);
            }

            public int hashCode() {
                return (((((((this.f57764a.hashCode() * 31) + this.f57765b.hashCode()) * 31) + Boolean.hashCode(this.f57766c)) * 31) + this.f57767d.hashCode()) * 31) + this.f57768e.hashCode();
            }

            public String toString() {
                return "Results(tab=" + this.f57764a + ", results=" + this.f57765b + ", ubiquitiGrouped=" + this.f57766c + ", sortComparator=" + this.f57767d + ", itemFactory=" + this.f57768e + ")";
            }
        }

        public /* synthetic */ AbstractC7248b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC7248b() {
        }
    }

    /* renamed from: p8.i$c, reason: case insensitive filesystem */
    public /* synthetic */ class C7249c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57769a;

        static {
            int[] iArr = new int[Le.c.values().length];
            try {
                iArr[Le.c.LAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Le.c.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f57769a = iArr;
        }
    }

    /* renamed from: p8.i$d, reason: case insensitive filesystem */
    static final class C7250d implements n {

        /* renamed from: p8.i$d$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57771a;

            static {
                int[] iArr = new int[Le.c.values().length];
                try {
                    iArr[Le.c.LAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Le.c.BLUETOOTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57771a = iArr;
            }
        }

        C7250d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Le.c tab) {
            AbstractC6492s.i(tab, "tab");
            int i10 = a.f57771a[tab.ordinal()];
            if (i10 == 1) {
                return C7246i.this.f57725C;
            }
            if (i10 == 2) {
                return C7246i.this.f57726D;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$e, reason: case insensitive filesystem */
    static final class C7251e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7251e f57772a = new C7251e();

        C7251e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC8324d.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf((it instanceof InterfaceC8324d.b.a) && ((InterfaceC8324d.b.a) it).a() == InterfaceC8324d.a.STATE_ON);
        }
    }

    /* renamed from: p8.i$f, reason: case insensitive filesystem */
    static final class C7252f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7252f f57773a = new C7252f();

        C7252f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE));
        }
    }

    /* renamed from: p8.i$g, reason: case insensitive filesystem */
    static final class C7253g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7253g f57774a = new C7253g();

        C7253g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Set it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.contains(com.ui.wifiman.model.android.permissions.a.BLUETOOTH));
        }
    }

    /* renamed from: p8.i$h, reason: case insensitive filesystem */
    static final class C7254h implements kg.l {

        /* renamed from: p8.i$h$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57776a;

            static {
                int[] iArr = new int[EnumC5804a.values().length];
                try {
                    iArr[EnumC5804a.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5804a.SIGNAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5804a.MAC.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f57776a = iArr;
            }
        }

        C7254h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Me.f d(InterfaceC2557a it) {
            AbstractC6492s.i(it, "it");
            return AbstractC7271l.a(it);
        }

        @Override // kg.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC7248b a(Boolean bluetoothEnabled, Set results, String str, Boolean locationPermission, Boolean bluetoothPermission, Boolean locationEnabled, p listConfig, C3771a devices) {
            Comparator comparator;
            AbstractC6492s.i(bluetoothEnabled, "bluetoothEnabled");
            AbstractC6492s.i(results, "results");
            AbstractC6492s.i(str, "<unused var>");
            AbstractC6492s.i(locationPermission, "locationPermission");
            AbstractC6492s.i(bluetoothPermission, "bluetoothPermission");
            AbstractC6492s.i(locationEnabled, "locationEnabled");
            AbstractC6492s.i(listConfig, "listConfig");
            AbstractC6492s.i(devices, "devices");
            int i10 = a.f57776a[listConfig.d().ordinal()];
            if (i10 == 1) {
                comparator = C7246i.this.f57749x;
            } else if (i10 == 2) {
                comparator = C7246i.this.f57750y;
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                comparator = C7246i.this.f57751z;
            }
            Comparator comparator2 = comparator;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 31 && !locationPermission.booleanValue()) {
                return new AbstractC7248b.a(a.AbstractC0459a.c.f11589a);
            }
            if (i11 < 31 && !locationEnabled.booleanValue()) {
                return new AbstractC7248b.a(a.AbstractC0459a.b.f11588a);
            }
            if (!bluetoothPermission.booleanValue()) {
                return new AbstractC7248b.a(a.AbstractC0459a.d.f11590a);
            }
            if (!bluetoothEnabled.booleanValue()) {
                return new AbstractC7248b.a(a.AbstractC0459a.C0460a.f11587a);
            }
            if (results.isEmpty()) {
                return new AbstractC7248b.a(a.AbstractC0459a.e.f11591a);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            C7246i c7246i = C7246i.this;
            Iterator it = results.iterator();
            while (it.hasNext()) {
                C8321a c8321a = (C8321a) it.next();
                Object objA = (InterfaceC2557a.b) devices.a(c8321a.f());
                if (objA == null) {
                    objA = AbstractC8728b.a(c8321a);
                }
                n10.f51689a = objA;
                linkedHashSet.add(objA);
                if (((Boolean) c7246i.Q0().e().invoke(n10.f51689a)).booleanValue()) {
                    linkedHashSet2.add(n10.f51689a);
                }
            }
            return linkedHashSet2.isEmpty() ? new AbstractC7248b.a(a.AbstractC0459a.g.f11593a) : new AbstractC7248b.c(Le.c.BLUETOOTH, linkedHashSet2, listConfig.e(), comparator2, new InterfaceC6835l() { // from class: p8.j
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C7246i.C7254h.d((InterfaceC2557a) obj);
                }
            });
        }
    }

    /* renamed from: p8.i$i, reason: collision with other inner class name */
    static final class C2033i implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final C2033i f57777a = new C2033i();

        C2033i() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(AbstractC7248b prev, AbstractC7248b current) {
            AbstractC6492s.i(prev, "prev");
            AbstractC6492s.i(current, "current");
            if ((current instanceof AbstractC7248b.a) || (current instanceof AbstractC7248b.C2032b)) {
                return AbstractC6492s.d(prev, current);
            }
            if (current instanceof AbstractC7248b.c) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$j, reason: case insensitive filesystem */
    static final class C7255j implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7255j f57778a = new C7255j();

        /* renamed from: p8.i$j$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f57779a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC7248b apply(Long it) {
                AbstractC6492s.i(it, "it");
                return new AbstractC7248b.a(a.AbstractC0459a.e.f11591a);
            }
        }

        C7255j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(AbstractC7248b it) {
            AbstractC6492s.i(it, "it");
            return ((it instanceof AbstractC7248b.a) && (((AbstractC7248b.a) it).a() instanceof a.AbstractC0459a.e)) ? gg.i.d2(3000L, TimeUnit.MILLISECONDS).N0(a.f57779a).z1(AbstractC7248b.C2032b.f57763a) : gg.i.K0(it);
        }
    }

    /* renamed from: p8.i$k, reason: case insensitive filesystem */
    static final class C7256k implements n {
        C7256k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2706g apply(AbstractC7248b it) {
            AbstractC6492s.i(it, "it");
            if ((it instanceof AbstractC7248b.a) || (it instanceof AbstractC7248b.C2032b)) {
                return new C2706g(AbstractC3689v.l());
            }
            if (!(it instanceof AbstractC7248b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC7248b.c cVar = (AbstractC7248b.c) it;
            return C7246i.this.N0(cVar, cVar.d(), cVar.e(), cVar.c(), cVar.a());
        }
    }

    /* renamed from: p8.i$l, reason: case insensitive filesystem */
    static final class C7257l implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7257l f57781a = new C7257l();

        /* renamed from: p8.i$l$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57782a;

            static {
                int[] iArr = new int[e.b.values().length];
                try {
                    iArr[e.b.DISCONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.b.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.b.AUTHENTICATING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.b.OBTAINING_IP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.b.CONNECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f57782a = iArr;
            }
        }

        C7257l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f57782a[it.f().ordinal()];
            boolean z10 = true;
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                z10 = false;
            } else if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: p8.i$m, reason: case insensitive filesystem */
    static final class C7258m implements kg.i {

        /* renamed from: p8.i$m$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57784a;

            static {
                int[] iArr = new int[EnumC5805b.values().length];
                try {
                    iArr[EnumC5805b.IP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5805b.NAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57784a = iArr;
            }
        }

        C7258m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Me.f d(InterfaceC2557a it) {
            AbstractC6492s.i(it, "it");
            return AbstractC7271l.b(it);
        }

        @Override // kg.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AbstractC7248b a(Map networkDiscoveryResults, String str, Boolean hasNetwork, v listConfig, C3771a devices) {
            Comparator comparator;
            Object objA;
            AbstractC6492s.i(networkDiscoveryResults, "networkDiscoveryResults");
            AbstractC6492s.i(str, "<unused var>");
            AbstractC6492s.i(hasNetwork, "hasNetwork");
            AbstractC6492s.i(listConfig, "listConfig");
            AbstractC6492s.i(devices, "devices");
            int i10 = a.f57784a[listConfig.c().ordinal()];
            if (i10 == 1) {
                comparator = C7246i.this.f57748w;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                comparator = C7246i.this.f57749x;
            }
            Comparator comparator2 = comparator;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            C7246i c7246i = C7246i.this;
            Iterator it = networkDiscoveryResults.entrySet().iterator();
            while (it.hasNext()) {
                Dc.j jVar = (Dc.j) ((Map.Entry) it.next()).getValue();
                C3772b c3772bU = jVar.u();
                if (c3772bU == null || (objA = (InterfaceC2557a.b) devices.a(c3772bU)) == null) {
                    objA = Dc.n.a(jVar);
                }
                n10.f51689a = objA;
                linkedHashSet.add(objA);
                if (((Boolean) c7246i.V0().e().invoke(n10.f51689a)).booleanValue()) {
                    linkedHashSet2.add(n10.f51689a);
                }
            }
            return !hasNetwork.booleanValue() ? new AbstractC7248b.a(a.AbstractC0459a.f.f11592a) : linkedHashSet.isEmpty() ? AbstractC7248b.C2032b.f57763a : linkedHashSet2.isEmpty() ? new AbstractC7248b.a(a.AbstractC0459a.g.f11593a) : new AbstractC7248b.c(Le.c.LAN, linkedHashSet2, listConfig.d(), comparator2, new InterfaceC6835l() { // from class: p8.k
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C7246i.C7258m.d((InterfaceC2557a) obj);
                }
            });
        }
    }

    /* renamed from: p8.i$n, reason: case insensitive filesystem */
    static final class C7259n implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7259n f57785a = new C7259n();

        C7259n() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Le.a apply(AbstractC7248b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof AbstractC7248b.a) {
                return ((AbstractC7248b.a) it).a();
            }
            if (it instanceof AbstractC7248b.C2032b) {
                return a.b.f11594a;
            }
            if (it instanceof AbstractC7248b.c) {
                return a.c.f11595a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$o, reason: case insensitive filesystem */
    static final class C7260o implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7260o f57786a = new C7260o();

        C7260o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(InterfaceC8324d.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof InterfaceC8324d.b.a);
        }
    }

    /* renamed from: p8.i$p, reason: case insensitive filesystem */
    static final class C7261p implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C7261p f57787a = new C7261p();

        /* renamed from: p8.i$p$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57788a;

            static {
                int[] iArr = new int[EnumC5806c.values().length];
                try {
                    iArr[EnumC5806c.LAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5806c.BLUETOOTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57788a = iArr;
            }
        }

        C7261p() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Le.c apply(s config, Boolean bluetoothAvailable) {
            AbstractC6492s.i(config, "config");
            AbstractC6492s.i(bluetoothAvailable, "bluetoothAvailable");
            if (!bluetoothAvailable.booleanValue()) {
                return Le.c.LAN;
            }
            int i10 = a.f57788a[config.b().ordinal()];
            if (i10 == 1) {
                return Le.c.LAN;
            }
            if (i10 == 2) {
                return Le.c.BLUETOOTH;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$q, reason: case insensitive filesystem */
    static final class C7262q implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7262q f57789a = new C7262q();

        C7262q() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Le.b apply(e.b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof e.b.a.C0154b) {
                return new b.AbstractC0461b.C0462b(((e.b.a.C0154b) it).a());
            }
            if (it instanceof e.b.a.C0153a) {
                return b.AbstractC0461b.a.f11597a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$r, reason: case insensitive filesystem */
    static final class C7263r implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C7263r f57790a = new C7263r();

        C7263r() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(Yg.s prev, Le.b current) {
            AbstractC6492s.i(prev, "prev");
            AbstractC6492s.i(current, "current");
            return Yg.z.a(prev.j(), current);
        }
    }

    /* renamed from: p8.i$s, reason: case insensitive filesystem */
    static final class C7264s implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7264s f57791a = new C7264s();

        /* renamed from: p8.i$s$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f57792a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Le.b apply(Long it) {
                AbstractC6492s.i(it, "it");
                return b.a.f11596a;
            }
        }

        C7264s() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Le.b bVar = (Le.b) sVar.a();
            Le.b bVar2 = (Le.b) sVar.c();
            if (!(bVar2 instanceof b.AbstractC0461b.a)) {
                if (!(bVar2 instanceof b.AbstractC0461b.C0462b) && !(bVar2 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gg.i iVarK0 = gg.i.K0(bVar2);
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if ((bVar instanceof b.AbstractC0461b.a) || (bVar instanceof b.AbstractC0461b.C0462b)) {
                gg.i iVarZ1 = gg.i.d2(2000L, TimeUnit.MILLISECONDS).N0(a.f57792a).z1(bVar2);
                AbstractC6492s.h(iVarZ1, "startWithItem(...)");
                return iVarZ1;
            }
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarK02 = gg.i.K0(b.a.f11596a);
            AbstractC6492s.h(iVarK02, "just(...)");
            return iVarK02;
        }
    }

    /* renamed from: p8.i$t, reason: case insensitive filesystem */
    static final class C7265t implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7265t f57793a = new C7265t();

        C7265t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(e.b it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it instanceof e.b.a.C0154b);
        }
    }

    /* renamed from: p8.i$u, reason: case insensitive filesystem */
    static final class C7266u implements n {
        C7266u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean it) {
            AbstractC6492s.i(it, "it");
            return C7246i.this.O0().a();
        }
    }

    /* renamed from: p8.i$v, reason: case insensitive filesystem */
    static final class C7267v implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C7267v f57795a = new C7267v();

        C7267v() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EnumC4076c apply(Zc.e it) {
            AbstractC6492s.i(it, "it");
            return it.g();
        }
    }

    /* renamed from: p8.i$w, reason: case insensitive filesystem */
    static final class C7268w implements n {

        /* renamed from: p8.i$w$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f57797a;

            static {
                int[] iArr = new int[Le.c.values().length];
                try {
                    iArr[Le.c.LAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Le.c.BLUETOOTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57797a = iArr;
            }
        }

        C7268w() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Le.c it) {
            AbstractC6492s.i(it, "it");
            int i10 = a.f57797a[it.ordinal()];
            if (i10 == 1) {
                return C7246i.this.b1().a(InterfaceC6084a.b.AbstractC6092j.C1834b.f48933a);
            }
            if (i10 == 2) {
                return C7246i.this.b1().a(InterfaceC6084a.b.AbstractC6092j.C1833a.f48932a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: p8.i$x */
    static final class x implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f57798a;

        /* renamed from: p8.i$x$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC7248b f57799a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f57800b;

            public a(AbstractC7248b abstractC7248b, String str) {
                this.f57799a = abstractC7248b;
                this.f57800b = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x00bb A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:70:? A[LOOP:0: B:10:0x001d->B:70:?, LOOP_END, SYNTHETIC] */
            @Override // gg.q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(gg.o r6) {
                /*
                    r5 = this;
                    p8.i$b r0 = r5.f57799a     // Catch: java.lang.Throwable -> L34
                    boolean r1 = r0 instanceof p8.C7246i.AbstractC7248b.a     // Catch: java.lang.Throwable -> L34
                    r2 = 0
                    if (r1 != 0) goto Lc3
                    boolean r1 = r0 instanceof p8.C7246i.AbstractC7248b.C2032b     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto Ld
                    goto Lc3
                Ld:
                    boolean r1 = r0 instanceof p8.C7246i.AbstractC7248b.c     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto Lbd
                    p8.i$b$c r0 = (p8.C7246i.AbstractC7248b.c) r0     // Catch: java.lang.Throwable -> L34
                    java.util.Collection r0 = r0.b()     // Catch: java.lang.Throwable -> L34
                    java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L34
                    java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
                L1d:
                    boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto Lc3
                    java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L34
                    Cc.a r1 = (Cc.InterfaceC2557a) r1     // Catch: java.lang.Throwable -> L34
                    Dc.j r3 = r1.j()     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L37
                    java.lang.String r3 = p8.AbstractC7271l.c(r3)     // Catch: java.lang.Throwable -> L34
                    goto L38
                L34:
                    r0 = move-exception
                    goto Lcd
                L37:
                    r3 = r2
                L38:
                    java.lang.String r4 = r5.f57800b     // Catch: java.lang.Throwable -> L34
                    boolean r3 = kotlin.jvm.internal.AbstractC6492s.d(r3, r4)     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L8c
                    Dc.j r3 = r1.j()     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L4b
                    Mc.a$a r3 = r3.F()     // Catch: java.lang.Throwable -> L34
                    goto L4c
                L4b:
                    r3 = r2
                L4c:
                    if (r3 == 0) goto L51
                    Je.b$d r1 = Je.b.d.f10011b     // Catch: java.lang.Throwable -> L34
                    goto L82
                L51:
                    Dc.j r3 = r1.j()     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L5c
                    Ic.a$a r3 = r3.C()     // Catch: java.lang.Throwable -> L34
                    goto L5d
                L5c:
                    r3 = r2
                L5d:
                    if (r3 == 0) goto L62
                    Je.b$a r1 = Je.b.a.f10008b     // Catch: java.lang.Throwable -> L34
                    goto L82
                L62:
                    a8.b r3 = r1.getId()     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L6e
                    Je.b$b r1 = new Je.b$b     // Catch: java.lang.Throwable -> L34
                    r1.<init>(r3)     // Catch: java.lang.Throwable -> L34
                    goto L82
                L6e:
                    Dc.j r1 = r1.j()     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto L81
                    inet.ipaddr.g r1 = r1.w()     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto L81
                    Je.b$c r3 = new Je.b$c     // Catch: java.lang.Throwable -> L34
                    r3.<init>(r1)     // Catch: java.lang.Throwable -> L34
                    r1 = r3
                    goto L82
                L81:
                    r1 = r2
                L82:
                    if (r1 == 0) goto L8a
                    i8.a$b$i r3 = new i8.a$b$i     // Catch: java.lang.Throwable -> L34
                    r3.<init>(r1)     // Catch: java.lang.Throwable -> L34
                    goto Lb9
                L8a:
                    r3 = r2
                    goto Lb9
                L8c:
                    wc.a r3 = r1.p()     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto L97
                    java.lang.String r3 = p8.AbstractC7271l.d(r3)     // Catch: java.lang.Throwable -> L34
                    goto L98
                L97:
                    r3 = r2
                L98:
                    java.lang.String r4 = r5.f57800b     // Catch: java.lang.Throwable -> L34
                    boolean r3 = kotlin.jvm.internal.AbstractC6492s.d(r3, r4)     // Catch: java.lang.Throwable -> L34
                    if (r3 == 0) goto Lb2
                    a8.b r1 = r1.getId()     // Catch: java.lang.Throwable -> L34
                    if (r1 == 0) goto L8a
                    Je.b$b r3 = new Je.b$b     // Catch: java.lang.Throwable -> L34
                    r3.<init>(r1)     // Catch: java.lang.Throwable -> L34
                    i8.a$b$i r1 = new i8.a$b$i     // Catch: java.lang.Throwable -> L34
                    r1.<init>(r3)     // Catch: java.lang.Throwable -> L34
                    r3 = r1
                    goto Lb9
                Lb2:
                    java.lang.String r1 = "Discovery Home - received clicked on unavailable device"
                    r3 = 6
                    Z7.b.j(r1, r2, r2, r3, r2)     // Catch: java.lang.Throwable -> L34
                    goto L8a
                Lb9:
                    if (r3 == 0) goto L1d
                    r2 = r3
                    goto Lc3
                Lbd:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L34
                    r0.<init>()     // Catch: java.lang.Throwable -> L34
                    throw r0     // Catch: java.lang.Throwable -> L34
                Lc3:
                    if (r2 == 0) goto Lc9
                    r6.onSuccess(r2)     // Catch: java.lang.Throwable -> L34
                    goto Ld0
                Lc9:
                    r6.a()     // Catch: java.lang.Throwable -> L34
                    goto Ld0
                Lcd:
                    r6.onError(r0)
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p8.C7246i.x.a.a(gg.o):void");
            }
        }

        x(String str) {
            this.f57798a = str;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(AbstractC7248b content) {
            AbstractC6492s.i(content, "content");
            gg.n nVarC = gg.n.c(new a(content, this.f57798a));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: p8.i$y */
    static final class y implements n {
        y() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(InterfaceC6084a.b.C6091i it) {
            AbstractC6492s.i(it, "it");
            return C7246i.this.b1().a(it);
        }
    }

    /* renamed from: p8.i$z */
    static final class z implements n {
        z() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(AbstractC7248b content) {
            AbstractC6492s.i(content, "content");
            if ((content instanceof AbstractC7248b.c) || (content instanceof AbstractC7248b.C2032b)) {
                return AbstractC5912b.m();
            }
            if (!(content instanceof AbstractC7248b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.AbstractC0459a abstractC0459aA = ((AbstractC7248b.a) content).a();
            if (abstractC0459aA instanceof a.AbstractC0459a.f) {
                return C7246i.this.b1().a(InterfaceC6084a.b.D.g.f48903a);
            }
            if (abstractC0459aA instanceof a.AbstractC0459a.C0460a) {
                return C7246i.this.b1().a(InterfaceC6084a.b.D.C1821b.f48894a);
            }
            if (abstractC0459aA instanceof a.AbstractC0459a.d) {
                return C7246i.this.Z0().a(com.ui.wifiman.model.android.permissions.a.BLUETOOTH);
            }
            if (abstractC0459aA instanceof a.AbstractC0459a.b) {
                return C7246i.this.b1().a(InterfaceC6084a.b.D.e.f48900a);
            }
            if (abstractC0459aA instanceof a.AbstractC0459a.c) {
                return C7246i.this.Z0().a(com.ui.wifiman.model.android.permissions.a.LOCATION_FINE);
            }
            if (!(abstractC0459aA instanceof a.AbstractC0459a.e) && !(abstractC0459aA instanceof a.AbstractC0459a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.h(abstractC5912bM, "complete(...)");
            return abstractC5912bM;
        }
    }

    public C7246i(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f57732g = di2;
        org.kodein.type.i iVarE = org.kodein.type.s.e(new M().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, t.class), null);
        th.l[] lVarArr = f57721N;
        this.f57733h = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = org.kodein.type.s.e(new N().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57734i = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6084a.class), null).a(this, lVarArr[1]);
        org.kodein.type.i iVarE3 = org.kodein.type.s.e(new O().getSuperType());
        AbstractC6492s.g(iVarE3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57735j = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE3, InterfaceC8209b.class), null).a(this, lVarArr[2]);
        org.kodein.type.i iVarE4 = org.kodein.type.s.e(new P().getSuperType());
        AbstractC6492s.g(iVarE4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57736k = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE4, Zc.f.class), null).a(this, lVarArr[3]);
        org.kodein.type.i iVarE5 = org.kodein.type.s.e(new Q().getSuperType());
        AbstractC6492s.g(iVarE5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57737l = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE5, Dc.e.class), null).a(this, lVarArr[4]);
        org.kodein.type.i iVarE6 = org.kodein.type.s.e(new R().getSuperType());
        AbstractC6492s.g(iVarE6, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57738m = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE6, w.class), null).a(this, lVarArr[5]);
        org.kodein.type.i iVarE7 = org.kodein.type.s.e(new S().getSuperType());
        AbstractC6492s.g(iVarE7, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57739n = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE7, r8.c.class), null).a(this, lVarArr[6]);
        org.kodein.type.i iVarE8 = org.kodein.type.s.e(new T().getSuperType());
        AbstractC6492s.g(iVarE8, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57740o = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE8, InterfaceC8324d.class), null).a(this, lVarArr[7]);
        org.kodein.type.i iVarE9 = org.kodein.type.s.e(new U().getSuperType());
        AbstractC6492s.g(iVarE9, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57741p = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE9, wc.h.class), null).a(this, lVarArr[8]);
        org.kodein.type.i iVarE10 = org.kodein.type.s.e(new H().getSuperType());
        AbstractC6492s.g(iVarE10, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57742q = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE10, q.class), null).a(this, lVarArr[9]);
        org.kodein.type.i iVarE11 = org.kodein.type.s.e(new I().getSuperType());
        AbstractC6492s.g(iVarE11, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57743r = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE11, q8.c.class), null).a(this, lVarArr[10]);
        org.kodein.type.i iVarE12 = org.kodein.type.s.e(new J().getSuperType());
        AbstractC6492s.g(iVarE12, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57744s = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE12, com.ui.wifiman.model.android.permissions.d.class), null).a(this, lVarArr[11]);
        org.kodein.type.i iVarE13 = org.kodein.type.s.e(new K().getSuperType());
        AbstractC6492s.g(iVarE13, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57745t = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE13, InterfaceC7283a.class), null).a(this, lVarArr[12]);
        org.kodein.type.i iVarE14 = org.kodein.type.s.e(new L().getSuperType());
        AbstractC6492s.g(iVarE14, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f57746u = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE14, Cc.n.class), null).a(this, lVarArr[13]);
        Comparator comparatorThenComparing = new B(false).thenComparing(new C(false));
        AbstractC6492s.h(comparatorThenComparing, "thenComparing(...)");
        this.f57747v = comparatorThenComparing;
        Comparator comparatorThenComparing2 = new D(false).thenComparing(comparatorThenComparing);
        AbstractC6492s.h(comparatorThenComparing2, "thenComparing(...)");
        this.f57748w = comparatorThenComparing2;
        Comparator comparatorThenComparing3 = new G(false, true).thenComparing(comparatorThenComparing);
        AbstractC6492s.h(comparatorThenComparing3, "thenComparing(...)");
        this.f57749x = comparatorThenComparing3;
        Comparator comparatorThenComparing4 = new E(false).reversed().thenComparing(comparatorThenComparing);
        AbstractC6492s.h(comparatorThenComparing4, "thenComparing(...)");
        this.f57750y = comparatorThenComparing4;
        Comparator comparatorThenComparing5 = new F(false).thenComparing(comparatorThenComparing);
        AbstractC6492s.h(comparatorThenComparing5, "thenComparing(...)");
        this.f57751z = comparatorThenComparing5;
        gg.i iVarI2 = gg.i.v(a1().b(), R0().a().N0(C7260o.f57786a), C7261p.f57787a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f57723A = iVarI2;
        gg.i iVarI22 = iVarI2.I1(new C7250d()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f57724B = iVarI22;
        gg.i iVarI23 = gg.i.s(Y0().b(), V0().f(), X0().getState().N0(C7257l.f57781a), U0().b(), T0().a(), new C7258m()).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f57725C = iVarI23;
        gg.i iVarI24 = gg.i.p(R0().a().N0(C7251e.f57772a).W(), S0().a(wc.f.BLE_AND_CLASSIC), Q0().f(), Z0().b().N0(C7252f.f57773a), Z0().b().N0(C7253g.f57774a), W0().a(), P0().b(), T0().a(), new C7254h()).X(C2033i.f57777a).I1(C7255j.f57778a).o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f57726D = iVarI24;
        gg.i iVarW = X0().getState().N0(C7267v.f57795a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f57727E = AbstractC8661g.d0(this, iVarW, EnumC4076c.WIFI, false, null, 6, null);
        gg.i iVarV = gg.i.v(iVarI2, R0().a().N0(V.f57760a).W(), W.f57761a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        this.f57728F = AbstractC8661g.h0(this, iVarV, Le.c.LAN, null, 2, null);
        gg.i iVarW2 = iVarI22.N0(C7259n.f57785a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f57729G = AbstractC8661g.d0(this, iVarW2, a.c.f11595a, false, null, 6, null);
        gg.i iVarW3 = iVarI22.N0(new C7256k()).W();
        AbstractC6492s.h(iVarW3, "distinctUntilChanged(...)");
        this.f57730H = AbstractC8661g.d0(this, iVarW3, new C2706g(AbstractC3689v.l()), false, null, 6, null);
        gg.i iVarN0 = Y0().a().N0(C7262q.f57789a);
        b.a aVar = b.a.f11596a;
        gg.i iVarI1 = iVarN0.q1(Yg.z.a(aVar, aVar), C7263r.f57790a).W().I1(C7264s.f57791a);
        AbstractC6492s.h(iVarI1, "switchMap(...)");
        this.f57731I = AbstractC8661g.d0(this, iVarI1, aVar, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2706g N0(AbstractC7248b.c cVar, Le.c cVar2, boolean z10, Comparator comparator, InterfaceC6835l interfaceC6835l) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC2557a interfaceC2557a : cVar.b()) {
            if (z10) {
                com.ui.wifiman.model.vendor.d dVarC = interfaceC2557a.c();
                if ((dVarC instanceof d.c) && ((d.c) dVarC).c() == d.EnumC1510d.UBIQUITI) {
                    arrayList.add(interfaceC2557a);
                }
            }
            arrayList2.add(interfaceC2557a);
        }
        AbstractC3689v.B(arrayList, comparator);
        AbstractC3689v.B(arrayList2, comparator);
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList.isEmpty()) {
            String str = "ubnt" + cVar2.name();
            d.b bVar = new d.b(com.ubnt.usurvey.R.string.discovery_group_ubiquiti_format, AbstractC3689v.e(Integer.valueOf(arrayList.size())));
            C2706g.a.C0194a.AbstractC0195a.C0196a c0196a = new C2706g.a.C0194a.AbstractC0195a.C0196a(Pe.a.f18599a.s());
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object objInvoke = interfaceC6835l.invoke(it.next());
                if (objInvoke != null) {
                    arrayList4.add(objInvoke);
                }
            }
            arrayList3.add(new C2706g.a.C0194a(str, bVar, c0196a, arrayList4));
        }
        if (!arrayList2.isEmpty()) {
            String str2 = "other" + cVar2.name();
            d.b bVar2 = new d.b((!z10 || arrayList.isEmpty()) ? com.ubnt.usurvey.R.string.discovery_group_devices_format : com.ubnt.usurvey.R.string.discovery_group_other_format, AbstractC3689v.e(Integer.valueOf(arrayList2.size())));
            C2706g.a.C0194a.AbstractC0195a.C0196a c0196a2 = arrayList.isEmpty() ? new C2706g.a.C0194a.AbstractC0195a.C0196a(Pe.a.f18599a.s()) : null;
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object objInvoke2 = interfaceC6835l.invoke(it2.next());
                if (objInvoke2 != null) {
                    arrayList5.add(objInvoke2);
                }
            }
            arrayList3.add(new C2706g.a.C0194a(str2, bVar2, c0196a2, arrayList5));
        }
        return new C2706g(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8209b O0() {
        return (InterfaceC8209b) this.f57735j.getValue();
    }

    private final q P0() {
        return (q) this.f57742q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q8.c Q0() {
        return (q8.c) this.f57743r.getValue();
    }

    private final InterfaceC8324d R0() {
        return (InterfaceC8324d) this.f57740o.getValue();
    }

    private final wc.h S0() {
        return (wc.h) this.f57741p.getValue();
    }

    private final Cc.n T0() {
        return (Cc.n) this.f57746u.getValue();
    }

    private final w U0() {
        return (w) this.f57738m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r8.c V0() {
        return (r8.c) this.f57739n.getValue();
    }

    private final InterfaceC7283a W0() {
        return (InterfaceC7283a) this.f57745t.getValue();
    }

    private final Zc.f X0() {
        return (Zc.f) this.f57736k.getValue();
    }

    private final Dc.e Y0() {
        return (Dc.e) this.f57737l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wifiman.model.android.permissions.d Z0() {
        return (com.ui.wifiman.model.android.permissions.d) this.f57744s.getValue();
    }

    private final t a1() {
        return (t) this.f57733h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a b1() {
        return (InterfaceC6084a) this.f57734i.getValue();
    }

    private final void c1() {
        C8658d c8658d = C8658d.f66727a;
        c8658d.e(d1(C8658d.c(c8658d, this, null, new InterfaceC6824a() { // from class: p8.g
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return C7246i.e1(this.f57718a);
            }
        }, 1, null)), this);
    }

    private static final gg.i d1(C8658d.a aVar) {
        return aVar.c(null, f57721N[14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.i e1(C7246i c7246i) {
        gg.i iVarC0 = c7246i.Y0().a().N0(C7265t.f57793a).W().L1(c7246i.new C7266u()).c0();
        AbstractC6492s.h(iVarC0, "toFlowable(...)");
        return iVarC0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s f1(Le.c cVar, s it) {
        EnumC5806c enumC5806c;
        AbstractC6492s.i(it, "it");
        int i10 = C7249c.f57769a[cVar.ordinal()];
        if (i10 == 1) {
            enumC5806c = EnumC5806c.LAN;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC5806c = EnumC5806c.BLUETOOTH;
        }
        return it.a(enumC5806c);
    }

    @Override // org.kodein.di.c
    /* renamed from: d */
    public DI getDi() {
        return this.f57732g;
    }

    @Override // ye.AbstractC8661g
    public void l0() {
        c1();
    }

    @Override // Le.d
    public Li.N n0() {
        return this.f57730H;
    }

    @Override // Le.d
    public Li.N o0() {
        return this.f57729G;
    }

    @Override // Le.d
    public Li.N p0() {
        return this.f57731I;
    }

    @Override // Le.d
    public Li.N q0() {
        return this.f57727E;
    }

    @Override // Le.d
    public Li.N r0() {
        return this.f57728F;
    }

    @Override // Le.d
    public void s0(final Le.c content) {
        AbstractC6492s.i(content, "content");
        C8658d.f66727a.d(a1().a(new InterfaceC6835l() { // from class: p8.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7246i.f1(content, (s) obj);
            }
        }), this);
    }

    @Override // Le.d
    public void t0(String id2) {
        AbstractC6492s.i(id2, "id");
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f57723A.o0().t(new C7268w());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Le.d
    public void u0(String id2) {
        AbstractC6492s.i(id2, "id");
        Z7.b.h("Discovery Home - device clicked " + id2, null, 2, null);
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bK = this.f57724B.o0().u(new x(id2)).k(new y());
        AbstractC6492s.h(abstractC5912bK, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bK, this);
    }

    @Override // Le.d
    public void v0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f57724B.o0().t(new z());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Le.d
    public void w0() {
        C8658d c8658d = C8658d.f66727a;
        AbstractC5912b abstractC5912bT = this.f57724B.o0().t(A.f57752a);
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        c8658d.d(abstractC5912bT, this);
    }

    @Override // Le.d
    public void x0() {
        C8658d.f66727a.d(Y0().clear(), this);
    }

    @Override // Le.d
    public void y0(String query) {
        AbstractC6492s.i(query, "query");
        V0().g(query);
        Q0().g(query);
    }
}
