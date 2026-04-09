package me;

import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.Q;
import Zg.U;
import Zg.d0;
import android.net.wifi.ScanResult;
import android.os.Build;
import com.ubnt.usurvey.wifi.WifiMcs;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.EnumC6457b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6512f;
import me.C6806E;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import sh.C7972g;
import zi.AbstractC8783m;

/* renamed from: me.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6806E implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Map f53970a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: me.E$a */
    static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final b coordinates;

        /* renamed from: id, reason: collision with root package name */
        private final int f53971id;
        private final int idExt;
        private final Integer length;
        public static final a HT_RATES = new a("HT_RATES", 0, 1, 0, null);
        public static final a HT_RATES_EXTENDED = new a("HT_RATES_EXTENDED", 1, 50, 0, null);
        public static final a QBSS_LOAD = new a("QBSS_LOAD", 2, 11, 0, 5);
        public static final a ERP = new a("ERP", 3, 42, 0, 1);
        public static final a TRANSMIT_POWER = new a("TRANSMIT_POWER", 4, 35, 0, 2);
        public static final a HT_CAPABILITIES = new a("HT_CAPABILITIES", 5, 45, 0, 26);
        public static final a VHT_CAPABILITIES = new a("VHT_CAPABILITIES", 6, 191, 0, 12);
        public static final a HE_CAPABILITIES = new a("HE_CAPABILITIES", 7, 255, 35, null);
        public static final a EHT_OPERATION = new a("EHT_OPERATION", 8, 255, 106, null);
        public static final a EHT_CAPABILITIES = new a("EHT_CAPABILITIES", 9, 255, 108, null);

        private static final /* synthetic */ a[] $values() {
            return new a[]{HT_RATES, HT_RATES_EXTENDED, QBSS_LOAD, ERP, TRANSMIT_POWER, HT_CAPABILITIES, VHT_CAPABILITIES, HE_CAPABILITIES, EHT_OPERATION, EHT_CAPABILITIES};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, int i11, int i12, Integer num) {
            this.f53971id = i11;
            this.idExt = i12;
            this.length = num;
            this.coordinates = new b(i11, Integer.valueOf(i12), num);
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

        public final b getCoordinates() {
            return this.coordinates;
        }

        public final int getId() {
            return this.f53971id;
        }

        public final int getIdExt() {
            return this.idExt;
        }

        public final Integer getLength() {
            return this.length;
        }
    }

    /* renamed from: me.E$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f53972a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f53973b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f53974c;

        public b(int i10, Integer num, Integer num2) {
            this.f53972a = i10;
            this.f53973b = num;
            this.f53974c = num2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f53972a == bVar.f53972a && AbstractC6492s.d(this.f53973b, bVar.f53973b) && AbstractC6492s.d(this.f53974c, bVar.f53974c);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f53972a) * 31;
            Integer num = this.f53973b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f53974c;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "BeaconElementId(tag=" + this.f53972a + ", idExt=" + this.f53973b + ", length=" + this.f53974c + ")";
        }
    }

    /* renamed from: me.E$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final a f53975a;

        /* renamed from: b, reason: collision with root package name */
        private final ByteBuffer f53976b;

        public c(a tag, ByteBuffer byteArray) {
            AbstractC6492s.i(tag, "tag");
            AbstractC6492s.i(byteArray, "byteArray");
            this.f53975a = tag;
            this.f53976b = byteArray;
        }

        public final ByteBuffer a() {
            return this.f53976b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f53975a == cVar.f53975a && AbstractC6492s.d(this.f53976b, cVar.f53976b);
        }

        public int hashCode() {
            return (this.f53975a.hashCode() * 31) + this.f53976b.hashCode();
        }

        public String toString() {
            return "BeaconElementWrapper(tag=" + this.f53975a + ", byteArray=" + this.f53976b + ")";
        }
    }

    /* renamed from: me.E$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53977a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f53978b;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53977a = iArr;
            int[] iArr2 = new int[S8.a.values().length];
            try {
                iArr2[S8.a.f20354A.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[S8.a.f20355B.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[S8.a.f20356G.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[S8.a.f20357N.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[S8.a.AC.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[S8.a.AX.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[S8.a.BE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[S8.a.AD.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            f53978b = iArr2;
        }
    }

    public C6806E(ScanResult scanResult) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field field;
        Field field2;
        AbstractC6492s.i(scanResult, "scanResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map mapU = U.u(AbstractC8783m.N(AbstractC3689v.d0(a.getEntries()), new InterfaceC6835l() { // from class: me.C
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C6806E.p((C6806E.a) obj);
            }
        }));
        HashSet hashSetY = AbstractC8783m.Y(AbstractC8783m.N(AbstractC8783m.C(AbstractC3689v.d0(a.getEntries()), new InterfaceC6835l() { // from class: me.D
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C6806E.q((C6806E.a) obj));
            }
        }), new InterfaceC6835l() { // from class: me.y
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Integer.valueOf(C6806E.r((C6806E.a) obj));
            }
        }));
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                List informationElements = scanResult.getInformationElements();
                if (informationElements != null) {
                    Iterator it = informationElements.iterator();
                    while (it.hasNext()) {
                        ScanResult.InformationElement informationElementA = u.a(it.next());
                        int id2 = informationElementA.getId();
                        int idExt = informationElementA.getIdExt();
                        ByteBuffer bytes = informationElementA.getBytes();
                        AbstractC6492s.h(bytes, "getBytes(...)");
                        o(mapU, hashSetY, linkedHashMap, id2, idExt, bytes);
                    }
                    J j10 = J.f24997a;
                }
            } catch (NullPointerException unused) {
                Z7.b.j("Failed to read information elements", null, null, 6, null);
                J j11 = J.f24997a;
            }
        } else {
            try {
                Field declaredField = ScanResult.class.getDeclaredField("informationElements");
                AbstractC6492s.h(declaredField, "getDeclaredField(...)");
                Object obj = declaredField.get(scanResult);
                Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
                if (objArr != null) {
                    Iterator itA = AbstractC6477c.a(objArr);
                    Field declaredField2 = null;
                    Field declaredField3 = null;
                    Field declaredField4 = null;
                    boolean z10 = false;
                    while (itA.hasNext()) {
                        Object next = itA.next();
                        if (!z10) {
                            declaredField2 = next.getClass().getDeclaredField("id");
                            try {
                                declaredField3 = next.getClass().getDeclaredField("idExt");
                            } catch (NoSuchFieldException unused2) {
                                declaredField3 = null;
                            }
                            declaredField4 = next.getClass().getDeclaredField("bytes");
                            z10 = true;
                        }
                        boolean z11 = z10;
                        Field field3 = declaredField2;
                        Field field4 = declaredField3;
                        Field field5 = declaredField4;
                        if (field3 == null) {
                            AbstractC6492s.v("idField");
                            field = null;
                        } else {
                            field = field3;
                        }
                        Object obj2 = field.get(next);
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        if (num == null) {
                            break;
                        }
                        int iIntValue = num.intValue();
                        Object obj3 = field4 != null ? field4.get(next) : null;
                        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        if (field5 == null) {
                            AbstractC6492s.v("bytesField");
                            field2 = null;
                        } else {
                            field2 = field5;
                        }
                        Object obj4 = field2.get(next);
                        byte[] bArr = obj4 instanceof byte[] ? (byte[]) obj4 : null;
                        if (bArr == null) {
                            break;
                        }
                        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
                        AbstractC6492s.h(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
                        o(mapU, hashSetY, linkedHashMap, iIntValue, iIntValue2, byteBufferAsReadOnlyBuffer);
                        z10 = z11;
                        declaredField2 = field3;
                        declaredField4 = field5;
                        declaredField3 = field4;
                    }
                }
            } catch (ExceptionInInitializerError e10) {
                Z7.b.e("Information Elements Reflection failed", e10, null, 4, null);
            } catch (IllegalAccessException e11) {
                Z7.b.e("Information Elements Reflection failed", e11, null, 4, null);
            } catch (IllegalArgumentException e12) {
                Z7.b.e("Information Elements Reflection failed", e12, null, 4, null);
            } catch (NullPointerException e13) {
                Z7.b.e("Information Elements Reflection failed", e13, null, 4, null);
            }
        }
        this.f53970a = linkedHashMap;
    }

    private final WifiMcs A(c cVar, int i10, InterfaceC6839p interfaceC6839p) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.position(2);
        byteBufferAllocate.put(cVar.a().get(i10 + 1));
        byteBufferAllocate.put(cVar.a().get(i10));
        byteBufferAllocate.rewind();
        int i11 = byteBufferAllocate.getInt();
        Iterator it = C7972g.f61622d.a(14, 0, -2).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            WifiMcs wifiMcs = (WifiMcs) interfaceC6839p.invoke(Integer.valueOf(((3 << iD) & i11) >>> iD), Integer.valueOf((iD / 2) + 1));
            if (wifiMcs != null) {
                return wifiMcs;
            }
        }
        return null;
    }

    private final Set B(c cVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cVar.a().rewind();
        Iterator it = AbstractC7978m.s(0, cVar.a().remaining()).iterator();
        while (it.hasNext()) {
            ((Q) it).d();
            linkedHashSet.add(W7.a.f23676b.d((Yg.A.b(cVar.a().get()) & 126) >>> 1));
        }
        return linkedHashSet;
    }

    private final Set C() {
        Set setB = d0.b();
        c cVar = (c) this.f53970a.get(a.HE_CAPABILITIES);
        if (cVar != null) {
            cVar.a().rewind();
            if ((Yg.A.b(cVar.a().get(0)) & 4) > 0) {
                setB.add(S8.d.MHZ_160);
            }
        }
        c cVar2 = (c) this.f53970a.get(a.EHT_CAPABILITIES);
        if (cVar2 != null) {
            cVar2.a().rewind();
            if ((Yg.A.b(cVar2.a().get(2)) & 2) > 0) {
                setB.add(S8.d.MHZ_320);
            }
        }
        return d0.a(setB);
    }

    private final Set D() {
        c cVar = (c) this.f53970a.get(a.VHT_CAPABILITIES);
        if (cVar == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cVar.a().rewind();
        byte b10 = Yg.A.b(cVar.a().get());
        if ((b10 & 8) > 0) {
            linkedHashSet.add(S8.d.MHZ_160);
        }
        if ((b10 & 4) <= 0) {
            return linkedHashSet;
        }
        linkedHashSet.add(S8.d.MHZ_80_80);
        return linkedHashSet;
    }

    private static final void o(Map map, HashSet hashSet, Map map2, int i10, int i11, ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        a aVar = (a) map.get(new b(i10, Integer.valueOf(i11), hashSet.contains(Integer.valueOf(i10)) ? null : Integer.valueOf(byteBuffer.remaining())));
        if (aVar != null) {
            map2.put(aVar, new c(aVar, byteBuffer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s p(a it) {
        AbstractC6492s.i(it, "it");
        return Yg.z.a(it.getCoordinates(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(a it) {
        AbstractC6492s.i(it, "it");
        return it.getLength() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(a it) {
        AbstractC6492s.i(it, "it");
        return it.getId();
    }

    private final WifiMcs s(c cVar, int i10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put(cVar.a().get(i10 + 3));
        byteBufferAllocate.put(cVar.a().get(i10 + 2));
        byteBufferAllocate.put(cVar.a().get(i10 + 1));
        byteBufferAllocate.put(cVar.a().get(i10));
        byteBufferAllocate.rewind();
        int i11 = byteBufferAllocate.getInt();
        int iHighestOneBit = Integer.highestOneBit(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= 32) {
                i13 = 0;
                break;
            }
            if ((iHighestOneBit >>> i13) == 1) {
                i12 = (i13 / 8) + 1;
                break;
            }
            i13++;
        }
        if (i12 != 0) {
            try {
                return pe.c.f57878a.a(EnumC6457b.HT, i13, i12);
            } catch (IllegalArgumentException e10) {
                throw new IllegalStateException("Failed to get MCS", e10);
            }
        }
        throw new IllegalStateException("Failed to parse HT MCS: " + i11);
    }

    private final WifiMcs t(c cVar, Set set) {
        int i10 = 14;
        if ((14 > cVar.a().limit() || !set.contains(S8.d.MHZ_160)) && !set.contains(S8.d.MHZ_80_80)) {
            i10 = 11;
        }
        int i11 = i10 + 3;
        if (i11 <= cVar.a().limit() && set.contains(S8.d.MHZ_320)) {
            i10 = i11;
        }
        if (i10 + 3 <= cVar.a().limit()) {
            return z(cVar, i10, new InterfaceC6839p() { // from class: me.B
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return C6806E.u(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
        }
        byte[] bArr = new byte[cVar.a().limit()];
        cVar.a().get(bArr);
        Z7.b.f(new IllegalStateException("Failed to read EHT MCS: " + AbstractC6512f.u(bArr, null, 1, null)), null, 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WifiMcs u(int i10, int i11) {
        Integer num = (i10 == 0 || i10 == 1) ? 9 : (i10 == 2 || i10 == 3) ? 11 : (i10 == 4 || i10 == 5) ? 13 : null;
        if (num == null) {
            return null;
        }
        try {
            return pe.c.f57878a.a(EnumC6457b.EHT, num.intValue(), i11);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("Failed to get MCS", e10);
        }
    }

    private final WifiMcs v(c cVar, int i10) {
        return A(cVar, i10, new InterfaceC6839p() { // from class: me.z
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C6806E.w(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WifiMcs w(int i10, int i11) {
        Integer num = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : 11 : 9 : 7;
        if (num == null) {
            return null;
        }
        try {
            return pe.c.f57878a.a(EnumC6457b.HE, num.intValue(), i11);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("Failed to get MCS", e10);
        }
    }

    private final WifiMcs x(c cVar, int i10) {
        return A(cVar, i10, new InterfaceC6839p() { // from class: me.A
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C6806E.y(((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WifiMcs y(int i10, int i11) {
        Integer num = (i10 == 0 || i10 == 1 || i10 == 2) ? 9 : null;
        if (num == null) {
            return null;
        }
        try {
            return pe.c.f57878a.a(EnumC6457b.VHT, num.intValue(), i11);
        } catch (IllegalArgumentException e10) {
            throw new IllegalStateException("Failed to get MCS", e10);
        }
    }

    private final WifiMcs z(c cVar, int i10, InterfaceC6839p interfaceC6839p) {
        WifiMcs wifiMcs;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.position(1);
        byteBufferAllocate.put(cVar.a().get(i10 + 2));
        byteBufferAllocate.put(cVar.a().get(i10 + 1));
        byteBufferAllocate.put(cVar.a().get(i10));
        byteBufferAllocate.rewind();
        int i11 = byteBufferAllocate.getInt();
        Iterator it = C7972g.f61622d.a(5, 0, -1).iterator();
        while (it.hasNext()) {
            int iD = ((Q) it).d();
            int i12 = (i11 << (28 - (iD * 4))) >> 28;
            if (i12 > 0 && (wifiMcs = (WifiMcs) interfaceC6839p.invoke(Integer.valueOf(iD), Integer.valueOf(i12))) != null) {
                return wifiMcs;
            }
        }
        return null;
    }

    @Override // me.q
    public Boolean a() {
        c cVar = (c) this.f53970a.get(a.EHT_OPERATION);
        if (cVar == null) {
            return null;
        }
        cVar.a().rewind();
        if (cVar.a().remaining() >= 6) {
            return Boolean.valueOf((Yg.A.b(cVar.a().get(5)) & 4) > 0);
        }
        return null;
    }

    @Override // me.q
    public Integer b() {
        c cVar = (c) this.f53970a.get(a.QBSS_LOAD);
        if (cVar == null) {
            return null;
        }
        byte[] bArr = new byte[4];
        cVar.a().get(bArr, 0, 2);
        AbstractC3682n.O0(bArr);
        return Integer.valueOf(ByteBuffer.wrap(bArr).getInt());
    }

    @Override // me.q
    public Set c() {
        Set setB;
        Set setB2;
        Set setB3 = d0.b();
        c cVar = (c) this.f53970a.get(a.HT_RATES);
        if (cVar != null && (setB2 = B(cVar)) != null) {
            setB3.addAll(setB2);
        }
        c cVar2 = (c) this.f53970a.get(a.HT_RATES_EXTENDED);
        if (cVar2 != null && (setB = B(cVar2)) != null) {
            setB3.addAll(setB);
        }
        return d0.a(setB3);
    }

    @Override // me.q
    public Float d() {
        if (((c) this.f53970a.get(a.QBSS_LOAD)) != null) {
            return Float.valueOf((Yg.A.b(r0.a().get(2)) & 255) / 255.0f);
        }
        return null;
    }

    @Override // me.q
    public Set e(S8.a ieeeMode, S8.c band) {
        AbstractC6492s.i(ieeeMode, "ieeeMode");
        AbstractC6492s.i(band, "band");
        switch (d.f53978b[ieeeMode.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return d0.c(S8.d.MHZ_20);
            case 4:
                return d0.i(S8.d.MHZ_20, S8.d.MHZ_40);
            case 5:
            case 6:
            case 7:
                int i10 = d.f53977a[band.ordinal()];
                if (i10 == 1) {
                    return d0.i(S8.d.MHZ_20, S8.d.MHZ_40);
                }
                if (i10 == 2) {
                    Set setB = d0.b();
                    setB.add(S8.d.MHZ_20);
                    setB.add(S8.d.MHZ_40);
                    setB.add(S8.d.MHZ_80);
                    Set setD = D();
                    if (setD != null) {
                        setB.addAll(setD);
                    }
                    return d0.a(setB);
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Set setB2 = d0.b();
                setB2.add(S8.d.MHZ_20);
                setB2.add(S8.d.MHZ_40);
                setB2.add(S8.d.MHZ_80);
                Set setC = C();
                if (setC != null) {
                    setB2.addAll(setC);
                }
                return d0.a(setB2);
            case 8:
                return d0.e();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // me.q
    public WifiMcs f(Set supportedChannelWidthSet) {
        WifiMcs wifiMcsX;
        AbstractC6492s.i(supportedChannelWidthSet, "supportedChannelWidthSet");
        try {
            c cVar = (c) this.f53970a.get(a.EHT_CAPABILITIES);
            if (cVar != null) {
                return t(cVar, supportedChannelWidthSet);
            }
            c cVar2 = (c) this.f53970a.get(a.HE_CAPABILITIES);
            if (cVar2 != null) {
                if (cVar2.a().remaining() < 18) {
                    return null;
                }
                return v(cVar2, 17);
            }
            c cVar3 = (c) this.f53970a.get(a.VHT_CAPABILITIES);
            if (cVar3 != null && (wifiMcsX = x(cVar3, 4)) != null) {
                return wifiMcsX;
            }
            c cVar4 = (c) this.f53970a.get(a.HT_CAPABILITIES);
            if (cVar4 != null) {
                return s(cVar4, 3);
            }
            return null;
        } catch (WifiMcs.InvalidWifiMcs unused) {
            Z7.b.e("Mcs parsing failed", null, null, 6, null);
            return null;
        } catch (IllegalStateException e10) {
            Z7.b.j("Mcs parsing failed", e10, null, 4, null);
            return null;
        }
    }

    @Override // me.q
    public S8.a g(S8.c band, Set supportedHtRates) {
        Object next;
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(supportedHtRates, "supportedHtRates");
        if (this.f53970a.get(a.EHT_OPERATION) != null) {
            return S8.a.BE;
        }
        if (this.f53970a.get(a.HE_CAPABILITIES) != null) {
            return S8.a.AX;
        }
        if (band != S8.c.GHZ_2_4 && this.f53970a.get(a.VHT_CAPABILITIES) != null) {
            return S8.a.AC;
        }
        if (this.f53970a.get(a.HT_CAPABILITIES) != null) {
            return S8.a.f20357N;
        }
        if (this.f53970a.get(a.ERP) != null) {
            return S8.a.f20356G;
        }
        int i10 = d.f53977a[band.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return S8.a.f20357N;
            }
            if (i10 == 3) {
                return S8.a.AX;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (supportedHtRates.isEmpty()) {
            return S8.a.f20355B;
        }
        Iterator it = supportedHtRates.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((W7.a) next).d() < 24) {
                break;
            }
        }
        return next != null ? S8.a.f20354A : S8.a.f20356G;
    }

    @Override // me.q
    public Integer h() {
        c cVar = (c) this.f53970a.get(a.TRANSMIT_POWER);
        if (cVar == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(cVar.a().get(0));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }
}
