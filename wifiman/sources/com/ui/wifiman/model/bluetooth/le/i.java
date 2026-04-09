package com.ui.wifiman.model.bluetooth.le;

import com.ui.wifiman.model.bluetooth.le.i;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f42575a = new i();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final int characteristic;
        private final Integer dataFormat;
        private final InterfaceC6835l formatter;
        public static final a NAME = new a("NAME", 0, 10752, null, new InterfaceC6835l() { // from class: yc.l
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$0(obj);
            }
        });
        public static final a MODEL_NUMBER = new a("MODEL_NUMBER", 1, 10788, null, new InterfaceC6835l() { // from class: yc.m
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$1(obj);
            }
        });
        public static final a MANUFACTURER = new a("MANUFACTURER", 2, 10793, null, new InterfaceC6835l() { // from class: yc.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$2(obj);
            }
        });
        public static final a BATTERY_LEVEL = new a("BATTERY_LEVEL", 3, 10777, 17, new InterfaceC6835l() { // from class: yc.o
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$3(obj);
            }
        });
        public static final a SERIAL_NUMBER = new a("SERIAL_NUMBER", 4, 10789, null, new InterfaceC6835l() { // from class: yc.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$4(obj);
            }
        });
        public static final a FIRMWARE_REVISION = new a("FIRMWARE_REVISION", 5, 10790, null, new InterfaceC6835l() { // from class: yc.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.a._init_$lambda$5(obj);
            }
        });

        private static final /* synthetic */ a[] $values() {
            return new a[]{NAME, MODEL_NUMBER, MANUFACTURER, BATTERY_LEVEL, SERIAL_NUMBER, FIRMWARE_REVISION};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, int i11, Integer num, InterfaceC6835l interfaceC6835l) {
            this.characteristic = i11;
            this.dataFormat = num;
            this.formatter = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$0(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$1(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$2(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$3(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj + " %";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$4(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$5(Object obj) {
            AbstractC6492s.i(obj, "<this>");
            return obj.toString();
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int getCharacteristic() {
            return this.characteristic;
        }

        public final Integer getDataFormat() {
            return this.dataFormat;
        }

        public final InterfaceC6835l getFormatter() {
            return this.formatter;
        }
    }

    private i() {
    }

    public final UUID a(int i10) {
        String string = Integer.toString(i10, AbstractC6507a.a(16));
        AbstractC6492s.h(string, "toString(...)");
        UUID uuidFromString = UUID.fromString(string + "-0000-1000-8000-00805f9b34fb");
        AbstractC6492s.h(uuidFromString, "fromString(...)");
        return uuidFromString;
    }

    public final UUID b(a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        return a(aVar.getCharacteristic());
    }
}
