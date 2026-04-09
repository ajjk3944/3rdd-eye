package com.ui.product.firmware;

import Ha.a;
import Yg.m;
import Yg.n;
import com.ui.product.firmware.UiFirmwareBoard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import th.d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u0001:\f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u000b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "AirMax", "AirFiber", "Wave", "EdgeMax", "Unms", "Uisp", "AirCube", "UFiber", "SunMax", "WiFiman", "Unknown", "Companion", "Lcom/ui/product/firmware/UiFirmwareBoard$AirCube;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;", "Lcom/ui/product/firmware/UiFirmwareBoard$SunMax;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave;", "Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiFirmwareBoard implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final m values$delegate = n.b(new InterfaceC6824a() { // from class: Da.a
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return UiFirmwareBoard.values_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirCube;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "ACB", "Lcom/ui/product/firmware/UiFirmwareBoard$AirCube$ACB;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AirCube extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirCube$ACB;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirCube;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ACB extends AirCube {
            public static final ACB INSTANCE = new ACB();

            private ACB() {
                super("acb", null);
            }
        }

        public /* synthetic */ AirCube(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private AirCube(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "AF5XHD", "AFLTU", "AFLTUPTP", "AFLTUROCKET", "GP", "GMP", "AF60", "XR", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF5XHD;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF60;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTU;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUPTP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUROCKET;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GMP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$XR;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AirFiber extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF5XHD;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AF5XHD extends AirFiber {
            public static final AF5XHD INSTANCE = new AF5XHD();

            private AF5XHD() {
                super("af5xhd", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AF60;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AF60 extends AirFiber {
            public static final AF60 INSTANCE = new AF60();

            private AF60() {
                super("af60", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTU;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AFLTU extends AirFiber {
            public static final AFLTU INSTANCE = new AFLTU();

            private AFLTU() {
                super("afltu", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUPTP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AFLTUPTP extends AirFiber {
            public static final AFLTUPTP INSTANCE = new AFLTUPTP();

            private AFLTUPTP() {
                super("afltu-ptp", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$AFLTUROCKET;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AFLTUROCKET extends AirFiber {
            public static final AFLTUROCKET INSTANCE = new AFLTUROCKET();

            private AFLTUROCKET() {
                super("aflturocket", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GMP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GMP extends AirFiber {
            public static final GMP INSTANCE = new GMP();

            private GMP() {
                super("gmp", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$GP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GP extends AirFiber {
            public static final GP INSTANCE = new GP();

            private GP() {
                super("gp", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber$XR;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class XR extends AirFiber {
            public static final XR INSTANCE = new XR();

            private XR() {
                super("xr", null);
            }
        }

        public /* synthetic */ AirFiber(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private AirFiber(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "<init>", "()V", "M", "AC", "AX", "GigaBeam", "AirGateway", "Installer", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$GigaBeam;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$Installer;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AirMax extends UiFirmwareBoard {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "<init>", "()V", "Gen1", "Gen2", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class AC extends AirMax {

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "XC", "WA", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1$WA;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1$XC;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class Gen1 extends AC {
                private final String id;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1$WA;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class WA extends Gen1 {
                    public static final WA INSTANCE = new WA();

                    private WA() {
                        super("wa", null);
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1$XC;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen1;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class XC extends Gen1 {
                    public static final XC INSTANCE = new XC();

                    private XC() {
                        super("xc", null);
                    }
                }

                public /* synthetic */ Gen1(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                @Override // com.ui.product.firmware.UiFirmwareBoard
                public String getId() {
                    return this.id;
                }

                private Gen1(String str) {
                    super(null);
                    this.id = str;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "XC", "WA", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2$WA;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2$XC;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class Gen2 extends AC {
                private final String id;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2$WA;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class WA extends Gen2 {
                    public static final WA INSTANCE = new WA();

                    private WA() {
                        super("2wa", null);
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2$XC;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AC$Gen2;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class XC extends Gen2 {
                    public static final XC INSTANCE = new XC();

                    private XC() {
                        super("2xc", null);
                    }
                }

                public /* synthetic */ Gen2(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                @Override // com.ui.product.firmware.UiFirmwareBoard
                public String getId() {
                    return this.id;
                }

                private Gen2(String str) {
                    super(null);
                    this.id = str;
                }
            }

            public /* synthetic */ AC(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AC() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "LBE", "RAX", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX$LBE;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX$RAX;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class AX extends AirMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX$LBE;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class LBE extends AX {
                public static final LBE INSTANCE = new LBE();

                private LBE() {
                    super("lbe", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX$RAX;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AX;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class RAX extends AX {
                public static final RAX INSTANCE = new RAX();

                private RAX() {
                    super("rax", null);
                }
            }

            public /* synthetic */ AX(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private AX(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "AirGW", "AirGWP", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway$AirGW;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway$AirGWP;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class AirGateway extends AirMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway$AirGW;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AirGW extends AirGateway {
                public static final AirGW INSTANCE = new AirGW();

                private AirGW() {
                    super("airgw", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway$AirGWP;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$AirGateway;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AirGWP extends AirGateway {
                public static final AirGWP INSTANCE = new AirGWP();

                private AirGWP() {
                    super("airgwp", null);
                }
            }

            public /* synthetic */ AirGateway(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private AirGateway(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$GigaBeam;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "GBE", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$GigaBeam$GBE;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class GigaBeam extends AirMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$GigaBeam$GBE;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$GigaBeam;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class GBE extends GigaBeam {
                public static final GBE INSTANCE = new GBE();

                private GBE() {
                    super("gbe", null);
                }
            }

            public /* synthetic */ GigaBeam(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private GigaBeam(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$Installer;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "UBI", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$Installer$UBI;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Installer extends AirMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$Installer$UBI;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$Installer;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UBI extends Installer {
                public static final UBI INSTANCE = new UBI();

                private UBI() {
                    super("ubi", null);
                }
            }

            public /* synthetic */ Installer(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Installer(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "XW", "XM", "TI", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$TI;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$XM;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$XW;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class M extends AirMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$TI;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class TI extends M {
                public static final TI INSTANCE = new TI();

                private TI() {
                    super("ti", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$XM;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class XM extends M {
                public static final XM INSTANCE = new XM();

                private XM() {
                    super("xm", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M$XW;", "Lcom/ui/product/firmware/UiFirmwareBoard$AirMax$M;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class XW extends M {
                public static final XW INSTANCE = new XW();

                private XW() {
                    super("xw", null);
                }
            }

            public /* synthetic */ M(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private M(String str) {
                super(null);
                this.id = str;
            }
        }

        public /* synthetic */ AirMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AirMax() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Companion;", "", "<init>", "()V", "", "id", "Lcom/ui/product/firmware/UiFirmwareBoard;", "fromId", "(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwareBoard;", "", "values$delegate", "LYg/m;", "getValues", "()Ljava/util/List;", "values", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UiFirmwareBoard fromId(String id2) {
            Object next;
            AbstractC6492s.i(id2, "id");
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((UiFirmwareBoard) next).getId(), id2)) {
                    break;
                }
            }
            UiFirmwareBoard uiFirmwareBoard = (UiFirmwareBoard) next;
            return uiFirmwareBoard == null ? new Unknown(id2) : uiFirmwareBoard;
        }

        public final List<UiFirmwareBoard> getValues() {
            return (List) UiFirmwareBoard.values$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "<init>", "()V", "Router", "Switch", "Power", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class EdgeMax extends UiFirmwareBoard {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "EP", "EPX", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power$EP;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power$EPX;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Power extends EdgeMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power$EP;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class EP extends Power {
                public static final EP INSTANCE = new EP();

                private EP() {
                    super("EP", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power$EPX;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Power;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class EPX extends Power {
                public static final EPX INSTANCE = new EPX();

                private EPX() {
                    super("EPX", null);
                }
            }

            public /* synthetic */ Power(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Power(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "E50", "E100", "E200", "E300", "E1000", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E100;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E1000;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E200;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E300;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E50;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Router extends EdgeMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E100;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class E100 extends Router {
                public static final E100 INSTANCE = new E100();

                private E100() {
                    super("e100", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E1000;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class E1000 extends Router {
                public static final E1000 INSTANCE = new E1000();

                private E1000() {
                    super("e1000", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E200;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class E200 extends Router {
                public static final E200 INSTANCE = new E200();

                private E200() {
                    super("e200", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E300;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class E300 extends Router {
                public static final E300 INSTANCE = new E300();

                private E300() {
                    super("e300", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router$E50;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class E50 extends Router {
                public static final E50 INSTANCE = new E50();

                private E50() {
                    super("e50", null);
                }
            }

            public /* synthetic */ Router(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Router(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "ESWH", "ESGH", "ESX", "ESXP", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESGH;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESWH;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESX;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESXP;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Switch extends EdgeMax {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESGH;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ESGH extends Switch {
                public static final ESGH INSTANCE = new ESGH();

                private ESGH() {
                    super("esgh", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESWH;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ESWH extends Switch {
                public static final ESWH INSTANCE = new ESWH();

                private ESWH() {
                    super("eswh", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESX;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ESX extends Switch {
                public static final ESX INSTANCE = new ESX();

                private ESX() {
                    super("esx", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch$ESXP;", "Lcom/ui/product/firmware/UiFirmwareBoard$EdgeMax$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ESXP extends Switch {
                public static final ESXP INSTANCE = new ESXP();

                private ESXP() {
                    super("esxp", null);
                }
            }

            public /* synthetic */ Switch(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Switch(String str) {
                super(null);
                this.id = str;
            }
        }

        public /* synthetic */ EdgeMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EdgeMax() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$SunMax;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "SbLite", "Lcom/ui/product/firmware/UiFirmwareBoard$SunMax$SbLite;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SunMax extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$SunMax$SbLite;", "Lcom/ui/product/firmware/UiFirmwareBoard$SunMax;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SbLite extends SunMax {
            public static final SbLite INSTANCE = new SbLite();

            private SbLite() {
                super("sb-lite", null);
            }
        }

        public /* synthetic */ SunMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private SunMax(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Olt", "Onu", "UISPFIBEROLTXGS", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Olt;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Onu;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$UISPFIBEROLTXGS;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UFiber extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Olt;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Olt extends UFiber {
            public static final Olt INSTANCE = new Olt();

            private Olt() {
                super("uf-olt", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$Onu;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Onu extends UFiber {
            public static final Onu INSTANCE = new Onu();

            private Onu() {
                super("uf-onu", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$UFiber$UISPFIBEROLTXGS;", "Lcom/ui/product/firmware/UiFirmwareBoard$UFiber;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UISPFIBEROLTXGS extends UFiber {
            public static final UISPFIBEROLTXGS INSTANCE = new UISPFIBEROLTXGS();

            private UISPFIBEROLTXGS() {
                super("UISPFIBEROLTXGS", null);
            }
        }

        public /* synthetic */ UFiber(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private UFiber(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "<init>", "()V", "Switch", "Power", "Router", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Power;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Uisp extends UiFirmwareBoard {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Power;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "P", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Power$P;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Power extends Uisp {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Power$P;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Power;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class P extends Power {
                public static final P INSTANCE = new P();

                private P() {
                    super("uispp", null);
                }
            }

            public /* synthetic */ Power(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Power(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "R", "AlpineV2", "AlpineV2R", "Mt7621", "Cn91xxr", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$AlpineV2;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$AlpineV2R;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$Cn91xxr;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$Mt7621;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$R;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Router extends Uisp {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$AlpineV2;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AlpineV2 extends Router {
                public static final AlpineV2 INSTANCE = new AlpineV2();

                private AlpineV2() {
                    super("alpinev2", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$AlpineV2R;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AlpineV2R extends Router {
                public static final AlpineV2R INSTANCE = new AlpineV2R();

                private AlpineV2R() {
                    super("alpinev2r", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$Cn91xxr;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Cn91xxr extends Router {
                public static final Cn91xxr INSTANCE = new Cn91xxr();

                private Cn91xxr() {
                    super("cn91xxr", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$Mt7621;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Mt7621 extends Router {
                public static final Mt7621 INSTANCE = new Mt7621();

                private Mt7621() {
                    super("mt7621", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router$R;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Router;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class R extends Router {
                public static final R INSTANCE = new R();

                private R() {
                    super("uispr", null);
                }
            }

            public /* synthetic */ Router(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Router(String str) {
                super(null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "S", "SPro", "O", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$O;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$S;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$SPro;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Switch extends Uisp {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$O;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class O extends Switch {
                public static final O INSTANCE = new O();

                private O() {
                    super("uispo", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$S;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class S extends Switch {
                public static final S INSTANCE = new S();

                private S() {
                    super("uisps", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch$SPro;", "Lcom/ui/product/firmware/UiFirmwareBoard$Uisp$Switch;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class SPro extends Switch {
                public static final SPro INSTANCE = new SPro();

                private SPro() {
                    super("uispspro", null);
                }
            }

            public /* synthetic */ Switch(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Switch(String str) {
                super(null);
                this.id = str;
            }
        }

        public /* synthetic */ Uisp(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Uisp() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unknown;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends UiFirmwareBoard {
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String id2) {
            super(null);
            AbstractC6492s.i(id2, "id");
            this.id = id2;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = unknown.id;
            }
            return unknown.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Unknown copy(String id2) {
            AbstractC6492s.i(id2, "id");
            return new Unknown(id2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && AbstractC6492s.d(this.id, ((Unknown) other).id);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Unknown(id=" + this.id + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Router", "Switch", "Lte", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Switch;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Unms extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "LL", "L", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte$L;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte$LL;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Lte extends Unms {
            private final String id;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte$L;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class L extends Lte {
                public static final L INSTANCE = new L();

                private L() {
                    super("unmslte", null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte$LL;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Lte;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class LL extends Lte {
                public static final LL INSTANCE = new LL();

                private LL() {
                    super("ll", null);
                }
            }

            public /* synthetic */ Lte(String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }

            @Override // com.ui.product.firmware.UiFirmwareBoard.Unms, com.ui.product.firmware.UiFirmwareBoard
            public String getId() {
                return this.id;
            }

            private Lte(String str) {
                super(str, null);
                this.id = str;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Router;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Router extends Unms {
            public static final Router INSTANCE = new Router();

            private Router() {
                super("unmsr", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Unms$Switch;", "Lcom/ui/product/firmware/UiFirmwareBoard$Unms;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Switch extends Unms {
            public static final Switch INSTANCE = new Switch();

            private Switch() {
                super("unmss", null);
            }
        }

        public /* synthetic */ Unms(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private Unms(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Wave;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "MGMP", "GMC", "MW", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave$GMC;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave$MGMP;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave$MW;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Wave extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Wave$GMC;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class GMC extends Wave {
            public static final GMC INSTANCE = new GMC();

            private GMC() {
                super("gmc", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Wave$MGMP;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MGMP extends Wave {
            public static final MGMP INSTANCE = new MGMP();

            private MGMP() {
                super("mgmp", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$Wave$MW;", "Lcom/ui/product/firmware/UiFirmwareBoard$Wave;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MW extends Wave {
            public static final MW INSTANCE = new MW();

            private MW() {
                super("mw", null);
            }
        }

        public /* synthetic */ Wave(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private Wave(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman;", "Lcom/ui/product/firmware/UiFirmwareBoard;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Wizard", "Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman$Wizard;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WiFiman extends UiFirmwareBoard {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman$Wizard;", "Lcom/ui/product/firmware/UiFirmwareBoard$WiFiman;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Wizard extends WiFiman {
            public static final Wizard INSTANCE = new Wizard();

            private Wizard() {
                super("WiFiMan-Wizard", null);
            }
        }

        public /* synthetic */ WiFiman(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwareBoard
        public String getId() {
            return this.id;
        }

        private WiFiman(String str) {
            super(null);
            this.id = str;
        }
    }

    public /* synthetic */ UiFirmwareBoard(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final UiFirmwareBoard fromId(String str) {
        return INSTANCE.fromId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List values_delegate$lambda$1() {
        List listA = a.a(O.b(UiFirmwareBoard.class));
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            UiFirmwareBoard uiFirmwareBoard = (UiFirmwareBoard) ((d) it.next()).B();
            if (uiFirmwareBoard != null) {
                arrayList.add(uiFirmwareBoard);
            }
        }
        return arrayList;
    }

    public abstract String getId();

    private UiFirmwareBoard() {
    }
}
