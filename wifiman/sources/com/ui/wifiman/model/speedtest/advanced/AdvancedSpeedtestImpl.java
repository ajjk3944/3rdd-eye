package com.ui.wifiman.model.speedtest.advanced;

import Cd.j;
import Ka.f;
import Vd.c;
import Yg.J;
import Yg.v;
import Yg.z;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.speedtest.advanced.AdvancedSpeedtestImpl;
import com.ui.wifiman.model.speedtest.advanced.a;
import com.ui.wifiman.model.speedtest.advanced.b;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.model.ubiquiti.console.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fe.AbstractC5818i;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import java.util.ArrayList;
import kg.InterfaceC6465b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import l9.C6556a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import pd.s;
import td.AbstractC8079a;
import td.AbstractC8081c;
import td.InterfaceC8082d;
import ud.InterfaceC8160a;
import vd.InterfaceC8213a;
import wd.InterfaceC8330f;
import yd.InterfaceC8652a;
import zd.InterfaceC8730a;

/* loaded from: classes4.dex */
public final class AdvancedSpeedtestImpl extends AbstractC8079a implements com.ui.wifiman.model.speedtest.advanced.a {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8730a f42882c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8652a f42883d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8330f f42884e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8213a f42885f;

    /* renamed from: g, reason: collision with root package name */
    private final Sd.d f42886g;

    /* renamed from: h, reason: collision with root package name */
    private f.a f42887h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f42888i;

    /* renamed from: j, reason: collision with root package name */
    private final s f42889j;

    private static abstract class Error extends RuntimeException implements Wc.d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error$GatewayConsoleSessionUnavailable;", "Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GatewayConsoleSessionUnavailable extends Error {
            public GatewayConsoleSessionUnavailable() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42890a;

        static {
            int[] iArr = new int[b.EnumC1419b.values().length];
            try {
                iArr[b.EnumC1419b.CONSOLE_LATENCY_CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_DOWNLOAD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_UPLOAD_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.EnumC1419b.CONSOLE_UPLOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.EnumC1419b.EVALUATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.EnumC1419b.DOWNLOAD_SETUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.EnumC1419b.DOWNLOAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.EnumC1419b.UPLOAD_SETUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.EnumC1419b.UPLOAD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_SAVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_REPORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.EnumC1419b.RESULT_UPDATE_WITH_REPORT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[b.EnumC1419b.END.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f42890a = iArr;
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42891a;

        b(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42891a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            gg.i iVarF;
            AbstractC6492s.i(c6556a, "<destruct>");
            Td.a aVar = (Td.a) c6556a.a();
            if (aVar != null && !e.b.h(aVar.d(), this.f42891a.u().a())) {
                gg.i iVarK0 = gg.i.k0(new Error.GatewayConsoleSessionUnavailable());
                AbstractC6492s.h(iVarK0, "error(...)");
                return iVarK0;
            }
            if (aVar != null && (iVarF = aVar.f()) != null) {
                return iVarF;
            }
            gg.i iVarK02 = gg.i.k0(new Error.GatewayConsoleSessionUnavailable());
            AbstractC6492s.h(iVarK02, "error(...)");
            return iVarK02;
        }
    }

    static final class c implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f42892a = new c();

        c() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(Vd.c it) {
            AbstractC6492s.i(it, "it");
            return it.d() == c.b.FINISHED;
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42893a;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f42894a;

            static {
                int[] iArr = new int[c.b.values().length];
                try {
                    iArr[c.b.LATENCY_CHECK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.b.DOWNLOAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.b.UPLOAD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.b.FINISHED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f42894a = iArr;
            }
        }

        d(N n10) {
            this.f42893a = n10;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(com.ui.wifiman.model.speedtest.advanced.b r23, Vd.c r24) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.speedtest.advanced.AdvancedSpeedtestImpl.d.apply(com.ui.wifiman.model.speedtest.advanced.b, Vd.c):com.ui.wifiman.model.speedtest.advanced.b");
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42895a;

        e(N n10) {
            this.f42895a = n10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable err) {
            com.ui.wifiman.model.speedtest.advanced.b bVarJ;
            AbstractC6492s.i(err, "err");
            if (!(err instanceof UnifiConsoleConnectionError)) {
                if (!(err instanceof Error.GatewayConsoleSessionUnavailable)) {
                    return gg.i.k0(err);
                }
                com.ui.wifiman.model.speedtest.advanced.b bVar = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                return gg.i.K0(bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : new Speedtest.f.a.C1417a(err), (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null));
            }
            if (!(((com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a).o() instanceof Speedtest.f.a)) {
                com.ui.wifiman.model.speedtest.advanced.b bVar2 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar2.j((65289 & 1) != 0 ? bVar2.f42922a : null, (65289 & 2) != 0 ? bVar2.f42923b : null, (65289 & 4) != 0 ? bVar2.f42924c : new Speedtest.f.a.C1417a(err), (65289 & 8) != 0 ? bVar2.f42925d : null, (65289 & 16) != 0 ? bVar2.f42926e : null, (65289 & 32) != 0 ? bVar2.f42927f : null, (65289 & 64) != 0 ? bVar2.f42928g : null, (65289 & 128) != 0 ? bVar2.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar2.f42930i : null, (65289 & 512) != 0 ? bVar2.f42931j : null, (65289 & 1024) != 0 ? bVar2.f42932k : null, (65289 & 2048) != 0 ? bVar2.f42933l : null, (65289 & 4096) != 0 ? bVar2.f42934m : null, (65289 & 8192) != 0 ? bVar2.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar2.f42936o : null, (65289 & 32768) != 0 ? bVar2.f42937p : null);
            } else if (!(((com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a).m() instanceof Speedtest.f.a)) {
                com.ui.wifiman.model.speedtest.advanced.b bVar3 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar3.j((65289 & 1) != 0 ? bVar3.f42922a : null, (65289 & 2) != 0 ? bVar3.f42923b : null, (65289 & 4) != 0 ? bVar3.f42924c : null, (65289 & 8) != 0 ? bVar3.f42925d : null, (65289 & 16) != 0 ? bVar3.f42926e : new Speedtest.f.a.C1417a(err), (65289 & 32) != 0 ? bVar3.f42927f : null, (65289 & 64) != 0 ? bVar3.f42928g : null, (65289 & 128) != 0 ? bVar3.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar3.f42930i : null, (65289 & 512) != 0 ? bVar3.f42931j : null, (65289 & 1024) != 0 ? bVar3.f42932k : null, (65289 & 2048) != 0 ? bVar3.f42933l : null, (65289 & 4096) != 0 ? bVar3.f42934m : null, (65289 & 8192) != 0 ? bVar3.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar3.f42936o : null, (65289 & 32768) != 0 ? bVar3.f42937p : null);
            } else if (!(((com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a).l() instanceof Speedtest.f.a)) {
                com.ui.wifiman.model.speedtest.advanced.b bVar4 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar4.j((65289 & 1) != 0 ? bVar4.f42922a : null, (65289 & 2) != 0 ? bVar4.f42923b : null, (65289 & 4) != 0 ? bVar4.f42924c : null, (65289 & 8) != 0 ? bVar4.f42925d : null, (65289 & 16) != 0 ? bVar4.f42926e : null, (65289 & 32) != 0 ? bVar4.f42927f : new Speedtest.f.a.C1417a(err), (65289 & 64) != 0 ? bVar4.f42928g : null, (65289 & 128) != 0 ? bVar4.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar4.f42930i : null, (65289 & 512) != 0 ? bVar4.f42931j : null, (65289 & 1024) != 0 ? bVar4.f42932k : null, (65289 & 2048) != 0 ? bVar4.f42933l : null, (65289 & 4096) != 0 ? bVar4.f42934m : null, (65289 & 8192) != 0 ? bVar4.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar4.f42936o : null, (65289 & 32768) != 0 ? bVar4.f42937p : null);
            } else if (!(((com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a).q() instanceof Speedtest.f.a)) {
                com.ui.wifiman.model.speedtest.advanced.b bVar5 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar5.j((65289 & 1) != 0 ? bVar5.f42922a : null, (65289 & 2) != 0 ? bVar5.f42923b : null, (65289 & 4) != 0 ? bVar5.f42924c : null, (65289 & 8) != 0 ? bVar5.f42925d : null, (65289 & 16) != 0 ? bVar5.f42926e : null, (65289 & 32) != 0 ? bVar5.f42927f : null, (65289 & 64) != 0 ? bVar5.f42928g : new Speedtest.f.a.C1417a(err), (65289 & 128) != 0 ? bVar5.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar5.f42930i : null, (65289 & 512) != 0 ? bVar5.f42931j : null, (65289 & 1024) != 0 ? bVar5.f42932k : null, (65289 & 2048) != 0 ? bVar5.f42933l : null, (65289 & 4096) != 0 ? bVar5.f42934m : null, (65289 & 8192) != 0 ? bVar5.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar5.f42936o : null, (65289 & 32768) != 0 ? bVar5.f42937p : null);
            } else if (((com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a).p() instanceof Speedtest.f.a) {
                com.ui.wifiman.model.speedtest.advanced.b bVar6 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar6.j((65289 & 1) != 0 ? bVar6.f42922a : null, (65289 & 2) != 0 ? bVar6.f42923b : null, (65289 & 4) != 0 ? bVar6.f42924c : null, (65289 & 8) != 0 ? bVar6.f42925d : null, (65289 & 16) != 0 ? bVar6.f42926e : null, (65289 & 32) != 0 ? bVar6.f42927f : null, (65289 & 64) != 0 ? bVar6.f42928g : null, (65289 & 128) != 0 ? bVar6.f42929h : new Speedtest.f.a.C1417a(err), (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar6.f42930i : null, (65289 & 512) != 0 ? bVar6.f42931j : null, (65289 & 1024) != 0 ? bVar6.f42932k : null, (65289 & 2048) != 0 ? bVar6.f42933l : null, (65289 & 4096) != 0 ? bVar6.f42934m : null, (65289 & 8192) != 0 ? bVar6.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar6.f42936o : null, (65289 & 32768) != 0 ? bVar6.f42937p : null);
            } else {
                com.ui.wifiman.model.speedtest.advanced.b bVar7 = (com.ui.wifiman.model.speedtest.advanced.b) this.f42895a.f51689a;
                bVarJ = bVar7.j((65289 & 1) != 0 ? bVar7.f42922a : null, (65289 & 2) != 0 ? bVar7.f42923b : null, (65289 & 4) != 0 ? bVar7.f42924c : null, (65289 & 8) != 0 ? bVar7.f42925d : null, (65289 & 16) != 0 ? bVar7.f42926e : null, (65289 & 32) != 0 ? bVar7.f42927f : null, (65289 & 64) != 0 ? bVar7.f42928g : null, (65289 & 128) != 0 ? bVar7.f42929h : new Speedtest.f.a.C1417a(err), (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar7.f42930i : null, (65289 & 512) != 0 ? bVar7.f42931j : null, (65289 & 1024) != 0 ? bVar7.f42932k : null, (65289 & 2048) != 0 ? bVar7.f42933l : null, (65289 & 4096) != 0 ? bVar7.f42934m : null, (65289 & 8192) != 0 ? bVar7.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar7.f42936o : null, (65289 & 32768) != 0 ? bVar7.f42937p : null);
            }
            return gg.i.K0(bVarJ);
        }
    }

    static final class f implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42896a = new f();

        f() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yg.s apply(Yg.s sVar, com.ui.wifiman.model.speedtest.advanced.b bVar) {
            return z.a((com.ui.wifiman.model.speedtest.advanced.b) sVar.c(), bVar);
        }
    }

    static final class g implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42898a;

            a(com.ui.wifiman.model.speedtest.advanced.b bVar) {
                this.f42898a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42898a;
                return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : new Speedtest.f.c(bVar.e().b()), (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42899a;

            b(com.ui.wifiman.model.speedtest.advanced.b bVar) {
                this.f42899a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42899a;
                return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : it, (65289 & 32) != 0 ? bVar.f42927f : new Speedtest.f.b(), (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42900a;

            c(com.ui.wifiman.model.speedtest.advanced.b bVar) {
                this.f42900a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42900a;
                return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : it, (65289 & 128) != 0 ? bVar.f42929h : new Speedtest.f.b(), (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Yg.s sVar) {
            com.ui.wifiman.model.speedtest.advanced.b bVar = (com.ui.wifiman.model.speedtest.advanced.b) sVar.a();
            com.ui.wifiman.model.speedtest.advanced.b bVar2 = (com.ui.wifiman.model.speedtest.advanced.b) sVar.c();
            ArrayList arrayList = new ArrayList();
            AdvancedSpeedtestImpl advancedSpeedtestImpl = AdvancedSpeedtestImpl.this;
            if ((bVar2.e() instanceof Speedtest.f.a) && !(bVar.e() instanceof Speedtest.f.a)) {
                gg.i iVarN0 = InterfaceC8730a.C2389a.a(advancedSpeedtestImpl.f42882c, null, 1, null).N0(new a(bVar2));
                AbstractC6492s.h(iVarN0, "map(...)");
                arrayList.add(iVarN0);
            }
            if ((bVar2.m() instanceof Speedtest.f.a) && !(bVar.m() instanceof Speedtest.f.a)) {
                gg.i iVarN02 = InterfaceC8730a.C2389a.a(advancedSpeedtestImpl.f42882c, null, 1, null).N0(new b(bVar2));
                AbstractC6492s.h(iVarN02, "map(...)");
                arrayList.add(iVarN02);
            }
            if ((bVar2.q() instanceof Speedtest.f.a) && !(bVar.q() instanceof Speedtest.f.a)) {
                gg.i iVarN03 = InterfaceC8730a.C2389a.a(advancedSpeedtestImpl.f42882c, null, 1, null).N0(new c(bVar2));
                AbstractC6492s.h(iVarN03, "map(...)");
                arrayList.add(iVarN03);
            }
            gg.i iVarK0 = gg.i.K0(bVar2);
            AbstractC6492s.h(iVarK0, "just(...)");
            arrayList.add(iVarK0);
            return gg.i.z(arrayList);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f42901a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.ui.wifiman.model.speedtest.advanced.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f42903c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return AdvancedSpeedtestImpl.this.new h(this.f42903c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f42901a;
            if (i10 == 0) {
                v.b(obj);
                f.a aVar = AdvancedSpeedtestImpl.this.f42887h;
                String strA = Cd.j.f2592a.a(this.f42903c.u().b(), 8901);
                this.f42901a = 1;
                obj = aVar.b(strA, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            La.e eVar = (La.e) obj;
            Long lB = eVar.b();
            if (lB != null) {
                int iLongValue = (int) lB.longValue();
                Long lA = eVar.a();
                return new Speedtest.f.a.c(new j.d(iLongValue, lA != null ? kotlin.coroutines.jvm.internal.b.d((int) lA.longValue()) : null, eVar.d()));
            }
            throw new UiSpeedtestLib.Error.IO("Server " + this.f42903c.u().b() + " unreachable");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f42904a = new i();

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            return err instanceof UiSpeedtestLib.Error ? gg.z.z(new Speedtest.f.a.C1417a(td.f.a((UiSpeedtestLib.Error) err))) : gg.z.p(err);
        }
    }

    public static final class j extends AbstractC8081c {

        /* renamed from: c, reason: collision with root package name */
        private final String f42905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.C1418a f42906d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdvancedSpeedtestImpl f42907e;

        public static final class a implements C {
            public a() {
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    interfaceC5910A.onSuccess(j.this.c());
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        j(a.C1418a c1418a, AdvancedSpeedtestImpl advancedSpeedtestImpl) {
            this.f42906d = c1418a;
            this.f42907e = advancedSpeedtestImpl;
            this.f42905c = "Advanced Speedtest " + c1418a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC5912b o(AdvancedSpeedtestImpl advancedSpeedtestImpl, com.ui.wifiman.model.speedtest.advanced.b it) {
            AbstractC6492s.i(it, "it");
            if (it.b() != null) {
                return advancedSpeedtestImpl.f42885f.a(new InterfaceC8213a.C2254a(it, 0L, 2, null));
            }
            AbstractC5912b abstractC5912bM = AbstractC5912b.m();
            AbstractC6492s.f(abstractC5912bM);
            return abstractC5912bM;
        }

        @Override // td.AbstractC8081c
        protected String d() {
            return this.f42905c;
        }

        @Override // td.AbstractC8081c
        protected gg.z e() {
            gg.z zVarI = gg.z.i(new a());
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public com.ui.wifiman.model.speedtest.advanced.b c() {
            return com.ui.wifiman.model.speedtest.advanced.b.f42921r.a(this.f42906d);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean g(com.ui.wifiman.model.speedtest.advanced.b state) {
            AbstractC6492s.i(state, "state");
            return state.c();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // td.AbstractC8081c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public gg.i j(com.ui.wifiman.model.speedtest.advanced.b state) {
            AbstractC6492s.i(state, "state");
            gg.i iVarQ = this.f42907e.q(state);
            final AdvancedSpeedtestImpl advancedSpeedtestImpl = this.f42907e;
            return n9.c.c(iVarQ, new InterfaceC6835l() { // from class: sd.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return AdvancedSpeedtestImpl.j.o(advancedSpeedtestImpl, (com.ui.wifiman.model.speedtest.advanced.b) obj);
                }
            });
        }
    }

    static final class k implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42909a;

        k(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42909a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42909a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : it, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class l implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42910a;

        l(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42910a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42910a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : it, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42911a;

        m(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42911a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42911a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : it, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42912a;

        n(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42912a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42912a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : it, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42913a;

        o(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42913a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42913a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : it, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42914a;

        p(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42914a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42914a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : it, (65289 & 32768) != 0 ? bVar.f42937p : null);
        }
    }

    static final class q implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42915a;

        q(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42915a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
            AbstractC6492s.i(it, "it");
            com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42915a;
            return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : null, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : it);
        }
    }

    static final class r implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42917b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.advanced.b f42918a;

            a(com.ui.wifiman.model.speedtest.advanced.b bVar) {
                this.f42918a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wifiman.model.speedtest.advanced.b apply(Speedtest.f it) {
                AbstractC6492s.i(it, "it");
                com.ui.wifiman.model.speedtest.advanced.b bVar = this.f42918a;
                return bVar.j((65289 & 1) != 0 ? bVar.f42922a : null, (65289 & 2) != 0 ? bVar.f42923b : null, (65289 & 4) != 0 ? bVar.f42924c : null, (65289 & 8) != 0 ? bVar.f42925d : null, (65289 & 16) != 0 ? bVar.f42926e : null, (65289 & 32) != 0 ? bVar.f42927f : null, (65289 & 64) != 0 ? bVar.f42928g : null, (65289 & 128) != 0 ? bVar.f42929h : null, (65289 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? bVar.f42930i : null, (65289 & 512) != 0 ? bVar.f42931j : null, (65289 & 1024) != 0 ? bVar.f42932k : null, (65289 & 2048) != 0 ? bVar.f42933l : null, (65289 & 4096) != 0 ? bVar.f42934m : null, (65289 & 8192) != 0 ? bVar.f42935n : it, (65289 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? bVar.f42936o : null, (65289 & 32768) != 0 ? bVar.f42937p : null);
            }
        }

        r(com.ui.wifiman.model.speedtest.advanced.b bVar) {
            this.f42917b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(W7.b ratesCache) {
            AbstractC6492s.i(ratesCache, "ratesCache");
            return AdvancedSpeedtestImpl.this.f42883d.b(this.f42917b, ratesCache).N0(new a(this.f42917b));
        }
    }

    public AdvancedSpeedtestImpl(InterfaceC8730a actionTimeDivider, InterfaceC8652a recorder, InterfaceC8330f reporter, InterfaceC8213a errorProcessor, Sd.d localConsoleService, InterfaceC8160a statsCache, InterfaceC8082d speedtestApiFactory) {
        AbstractC6492s.i(actionTimeDivider, "actionTimeDivider");
        AbstractC6492s.i(recorder, "recorder");
        AbstractC6492s.i(reporter, "reporter");
        AbstractC6492s.i(errorProcessor, "errorProcessor");
        AbstractC6492s.i(localConsoleService, "localConsoleService");
        AbstractC6492s.i(statsCache, "statsCache");
        AbstractC6492s.i(speedtestApiFactory, "speedtestApiFactory");
        this.f42882c = actionTimeDivider;
        this.f42883d = recorder;
        this.f42884e = reporter;
        this.f42885f = errorProcessor;
        this.f42886g = localConsoleService;
        this.f42887h = speedtestApiFactory.a();
        gg.i iVarI2 = statsCache.a().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42888i = iVarI2;
        this.f42889j = s.LOCAL;
    }

    private final gg.i j(final com.ui.wifiman.model.speedtest.advanced.b bVar) {
        N n10 = new N();
        n10.f51689a = bVar;
        gg.i iVarB = this.f42886g.b().I1(new b(bVar)).R1(c.f42892a).s1(new kg.q() { // from class: sd.c
            @Override // kg.q
            public final Object get() {
                return AdvancedSpeedtestImpl.k(bVar);
            }
        }, new d(n10)).f1(new e(n10)).z1(bVar).s1(new kg.q() { // from class: sd.d
            @Override // kg.q
            public final Object get() {
                return AdvancedSpeedtestImpl.l(bVar);
            }
        }, f.f42896a).B(new g());
        AbstractC6492s.h(iVarB, "concatMap(...)");
        return iVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.model.speedtest.advanced.b k(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s l(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        return z.a(bVar, bVar);
    }

    private final gg.i m(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        f.a aVar = this.f42887h;
        a.C1418a c1418aU = bVar.u();
        Object objB = bVar.t().b();
        if (objB != null) {
            return td.g.a(aVar.a(o(c1418aU, (j.d) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    private final gg.i n(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        gg.i iVarZ1 = Qi.l.c(null, new h(bVar, null), 1, null).O(Gg.a.d()).E(Gg.a.a()).F(i.f42904a).W().z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    private final f.c.b o(a.C1418a c1418a, j.d dVar) {
        String strA0 = c1418a.b().a0();
        AbstractC6492s.h(strA0, "toNormalizedString(...)");
        return new f.c.b(strA0, 8901, dVar.b(), false, dVar.c(), 8, null);
    }

    private final AbstractC8081c p(a.C1418a c1418a) {
        return new j(c1418a, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i q(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        switch (a.f42890a[bVar.r().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return j(bVar);
            case 6:
                gg.i iVarN0 = n(bVar).N0(new k(bVar));
                AbstractC6492s.h(iVarN0, "map(...)");
                return iVarN0;
            case 7:
                gg.i iVarN02 = InterfaceC8730a.C2389a.a(this.f42882c, null, 1, null).N0(new l(bVar));
                AbstractC6492s.h(iVarN02, "map(...)");
                return iVarN02;
            case 8:
                gg.i iVarN03 = b(m(bVar)).N0(new m(bVar));
                AbstractC6492s.h(iVarN03, "map(...)");
                return iVarN03;
            case 9:
                gg.i iVarN04 = InterfaceC8730a.C2389a.a(this.f42882c, null, 1, null).N0(new n(bVar));
                AbstractC6492s.h(iVarN04, "map(...)");
                return iVarN04;
            case 10:
                gg.i iVarN05 = b(t(bVar)).N0(new o(bVar));
                AbstractC6492s.h(iVarN05, "map(...)");
                return iVarN05;
            case 11:
                return r(bVar);
            case 12:
                gg.i iVarN06 = this.f42884e.a(new InterfaceC8330f.a(bVar, 0L, 2, null)).N0(new p(bVar));
                AbstractC6492s.h(iVarN06, "map(...)");
                return iVarN06;
            case 13:
                gg.i iVarN07 = this.f42883d.a(bVar).N0(new q(bVar));
                AbstractC6492s.h(iVarN07, "map(...)");
                return iVarN07;
            case 14:
                gg.i iVarJ0 = gg.i.j0();
                AbstractC6492s.h(iVarJ0, "empty(...)");
                return iVarJ0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final gg.i r(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        gg.i iVarW = this.f42888i.o0().w(new r(bVar));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    private final gg.i t(com.ui.wifiman.model.speedtest.advanced.b bVar) {
        f.a aVar = this.f42887h;
        a.C1418a c1418aU = bVar.u();
        Object objB = bVar.t().b();
        if (objB != null) {
            return td.g.a(aVar.d(o(c1418aU, (j.d) objB)));
        }
        throw new IllegalStateException("Server evaluation should be done at this point");
    }

    @Override // com.ui.wifiman.model.speedtest.Speedtest
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public gg.i a(a.C1418a params) {
        AbstractC6492s.i(params, "params");
        gg.i iVarF = p(params).f();
        AbstractC5912b abstractC5912bE0 = this.f42888i.E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        gg.i iVarI2 = AbstractC5818i.a(iVarF, abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        return iVarI2;
    }
}
