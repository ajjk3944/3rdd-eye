package com.ui.wifiman.model.wmw;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C5969a f44109a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f44110b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44111c;

        /* renamed from: d, reason: collision with root package name */
        private final EnumC1533a f44112d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.ui.wifiman.model.wmw.d$a$a, reason: collision with other inner class name */
        public static final class EnumC1533a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC1533a[] $VALUES;
            public static final EnumC1533a ADOPTED = new EnumC1533a("ADOPTED", 0);
            public static final EnumC1533a ADOPTED_BY_OTHER = new EnumC1533a("ADOPTED_BY_OTHER", 1);
            public static final EnumC1533a FREE = new EnumC1533a("FREE", 2);

            private static final /* synthetic */ EnumC1533a[] $values() {
                return new EnumC1533a[]{ADOPTED, ADOPTED_BY_OTHER, FREE};
            }

            static {
                EnumC1533a[] enumC1533aArr$values = $values();
                $VALUES = enumC1533aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC1533aArr$values);
            }

            private EnumC1533a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static EnumC1533a valueOf(String str) {
                return (EnumC1533a) Enum.valueOf(EnumC1533a.class, str);
            }

            public static EnumC1533a[] values() {
                return (EnumC1533a[]) $VALUES.clone();
            }
        }

        public a(C5969a mac, C5969a bleMac, String str, EnumC1533a adoptionState) {
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(bleMac, "bleMac");
            AbstractC6492s.i(adoptionState, "adoptionState");
            this.f44109a = mac;
            this.f44110b = bleMac;
            this.f44111c = str;
            this.f44112d = adoptionState;
        }

        public final C5969a a() {
            return this.f44110b;
        }

        public final C5969a b() {
            return this.f44109a;
        }

        public final String c() {
            return this.f44111c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC6492s.d(aVar.f44109a, this.f44109a) && AbstractC6492s.d(aVar.f44111c, this.f44111c) && aVar.f44112d == this.f44112d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f44109a.hashCode();
        }
    }

    gg.i a();
}
