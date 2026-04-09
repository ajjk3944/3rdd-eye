package com.ui.product.firmware;

import Ha.a;
import Yg.m;
import Yg.n;
import com.ui.product.firmware.UiFirmwarePlatform;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\n\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform;", "Ljava/io/Serializable;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "AirCube", "AirMax", "AirFiber", "EdgeMax", "Uisp", "UFiber", "SunMax", "WiFiman", "Unknown", "Companion", "Lcom/ui/product/firmware/UiFirmwarePlatform$AirCube;", "Lcom/ui/product/firmware/UiFirmwarePlatform$AirFiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform$AirMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform$UFiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Unknown;", "Lcom/ui/product/firmware/UiFirmwarePlatform$WiFiman;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiFirmwarePlatform implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final m values$delegate = n.b(new InterfaceC6824a() { // from class: Da.b
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return UiFirmwarePlatform.values_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$AirCube;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AirCube extends UiFirmwarePlatform {
        public static final AirCube INSTANCE = new AirCube();
        private static final String id = "aircube";

        private AirCube() {
            super(null);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return id;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$AirFiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AirFiber extends UiFirmwarePlatform {
        public static final AirFiber INSTANCE = new AirFiber();
        private static final String id = "airfiber";

        private AirFiber() {
            super(null);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return id;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$AirMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AirMax extends UiFirmwarePlatform {
        public static final AirMax INSTANCE = new AirMax();
        private static final String id = "airmax";

        private AirMax() {
            super(null);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return id;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Companion;", "", "<init>", "()V", "", "id", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "fromId", "(Ljava/lang/String;)Lcom/ui/product/firmware/UiFirmwarePlatform;", "", "values$delegate", "LYg/m;", "getValues", "()Ljava/util/List;", "values", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UiFirmwarePlatform fromId(String id2) {
            Object next;
            AbstractC6492s.i(id2, "id");
            Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((UiFirmwarePlatform) next).getId(), id2)) {
                    break;
                }
            }
            UiFirmwarePlatform uiFirmwarePlatform = (UiFirmwarePlatform) next;
            return uiFirmwarePlatform == null ? new Unknown(id2) : uiFirmwarePlatform;
        }

        public final List<UiFirmwarePlatform> getValues() {
            return (List) UiFirmwarePlatform.values$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Power", "Router", "Switch", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Power;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Router;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Switch;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class EdgeMax extends UiFirmwarePlatform {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Power;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Power extends EdgeMax {
            public static final Power INSTANCE = new Power();

            private Power() {
                super("edgepower", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Router;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Router extends EdgeMax {
            public static final Router INSTANCE = new Router();

            private Router() {
                super("edgerouter", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax$Switch;", "Lcom/ui/product/firmware/UiFirmwarePlatform$EdgeMax;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Switch extends EdgeMax {
            public static final Switch INSTANCE = new Switch();

            private Switch() {
                super("edgeswitch", null);
            }
        }

        public /* synthetic */ EdgeMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return this.id;
        }

        private EdgeMax(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Solarbeam", "Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SunMax extends UiFirmwarePlatform {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax$Solarbeam;", "Lcom/ui/product/firmware/UiFirmwarePlatform$SunMax;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Solarbeam extends SunMax {
            public static final Solarbeam INSTANCE = new Solarbeam();

            private Solarbeam() {
                super("solarbeam", null);
            }
        }

        public /* synthetic */ SunMax(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return this.id;
        }

        private SunMax(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$UFiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UFiber extends UiFirmwarePlatform {
        public static final UFiber INSTANCE = new UFiber();
        private static final String id = "linux";

        private UFiber() {
            super(null);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return id;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "LTE", "Power", "Router", "Switch", "Fiber", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Fiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$LTE;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Power;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Router;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Switch;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Uisp extends UiFirmwarePlatform {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Fiber;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Fiber extends Uisp {
            public static final Fiber INSTANCE = new Fiber();

            private Fiber() {
                super("UFiber", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$LTE;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LTE extends Uisp {
            public static final LTE INSTANCE = new LTE();

            private LTE() {
                super("uisp-lte", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Power;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Power extends Uisp {
            public static final Power INSTANCE = new Power();

            private Power() {
                super("uisp-power", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Router;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Router extends Uisp {
            public static final Router INSTANCE = new Router();

            private Router() {
                super("uispr", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp$Switch;", "Lcom/ui/product/firmware/UiFirmwarePlatform$Uisp;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Switch extends Uisp {
            public static final Switch INSTANCE = new Switch();

            private Switch() {
                super("uisp-switch", null);
            }
        }

        public /* synthetic */ Uisp(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return this.id;
        }

        private Uisp(String str) {
            super(null);
            this.id = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$Unknown;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends UiFirmwarePlatform {
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

        @Override // com.ui.product.firmware.UiFirmwarePlatform
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$WiFiman;", "Lcom/ui/product/firmware/UiFirmwarePlatform;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Wizard", "Lcom/ui/product/firmware/UiFirmwarePlatform$WiFiman$Wizard;", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WiFiman extends UiFirmwarePlatform {
        private final String id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/product/firmware/UiFirmwarePlatform$WiFiman$Wizard;", "Lcom/ui/product/firmware/UiFirmwarePlatform$WiFiman;", "<init>", "()V", "product"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Wizard extends WiFiman {
            public static final Wizard INSTANCE = new Wizard();

            private Wizard() {
                super("MTK7931", null);
            }
        }

        public /* synthetic */ WiFiman(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ui.product.firmware.UiFirmwarePlatform
        public String getId() {
            return this.id;
        }

        private WiFiman(String str) {
            super(null);
            this.id = str;
        }
    }

    public /* synthetic */ UiFirmwarePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final UiFirmwarePlatform fromId(String str) {
        return INSTANCE.fromId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List values_delegate$lambda$1() {
        List listA = a.a(O.b(UiFirmwarePlatform.class));
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            UiFirmwarePlatform uiFirmwarePlatform = (UiFirmwarePlatform) ((d) it.next()).B();
            if (uiFirmwarePlatform != null) {
                arrayList.add(uiFirmwarePlatform);
            }
        }
        return arrayList;
    }

    public abstract String getId();

    private UiFirmwarePlatform() {
    }
}
