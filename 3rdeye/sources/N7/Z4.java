package N7;

import D7.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFocus.kt */
/* loaded from: classes.dex */
public final class Z4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<N2> f7845a;

    /* renamed from: b, reason: collision with root package name */
    public final X2 f7846b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7847c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f7848d;

    /* renamed from: e, reason: collision with root package name */
    public final List<C1175g0> f7849e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f7850f;

    /* compiled from: DivFocus.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<String> f7851a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<String> f7852b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.b<String> f7853c;

        /* renamed from: d, reason: collision with root package name */
        public final A7.b<String> f7854d;

        /* renamed from: e, reason: collision with root package name */
        public final A7.b<String> f7855e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f7856f;

        public a() {
            this(null, null, null, null, null);
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1135d5 c1135d5 = (C1135d5) D7.a.f1071b.f6962z3.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            c1135d5.getClass();
            return C1135d5.d(c0011a, this);
        }

        public a(A7.b<String> bVar, A7.b<String> bVar2, A7.b<String> bVar3, A7.b<String> bVar4, A7.b<String> bVar5) {
            this.f7851a = bVar;
            this.f7852b = bVar2;
            this.f7853c = bVar3;
            this.f7854d = bVar4;
            this.f7855e = bVar5;
        }
    }

    public Z4() {
        this(null, null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.Z4 r9, A7.d r10, A7.d r11) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.Z4.a(N7.Z4, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iB;
        int iIntValue;
        int iB2;
        Integer num = this.f7850f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(Z4.class).hashCode();
        int iB3 = 0;
        List<N2> list = this.f7845a;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iB = 0;
            while (it.hasNext()) {
                iB += ((N2) it.next()).b();
            }
        } else {
            iB = 0;
        }
        int i = iHashCode + iB;
        X2 x22 = this.f7846b;
        int iB4 = i + (x22 != null ? x22.b() : 0);
        a aVar = this.f7847c;
        if (aVar != null) {
            Integer num2 = aVar.f7856f;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode2 = kotlin.jvm.internal.x.a(a.class).hashCode();
                A7.b<String> bVar = aVar.f7851a;
                int iHashCode3 = iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
                A7.b<String> bVar2 = aVar.f7852b;
                int iHashCode4 = iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
                A7.b<String> bVar3 = aVar.f7853c;
                int iHashCode5 = iHashCode4 + (bVar3 != null ? bVar3.hashCode() : 0);
                A7.b<String> bVar4 = aVar.f7854d;
                int iHashCode6 = iHashCode5 + (bVar4 != null ? bVar4.hashCode() : 0);
                A7.b<String> bVar5 = aVar.f7855e;
                int iHashCode7 = iHashCode6 + (bVar5 != null ? bVar5.hashCode() : 0);
                aVar.f7856f = Integer.valueOf(iHashCode7);
                iIntValue = iHashCode7;
            }
        } else {
            iIntValue = 0;
        }
        int i10 = iB4 + iIntValue;
        List<C1175g0> list2 = this.f7848d;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            iB2 = 0;
            while (it2.hasNext()) {
                iB2 += ((C1175g0) it2.next()).b();
            }
        } else {
            iB2 = 0;
        }
        int i11 = i10 + iB2;
        List<C1175g0> list3 = this.f7849e;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                iB3 += ((C1175g0) it3.next()).b();
            }
        }
        int i12 = i11 + iB3;
        this.f7850f = Integer.valueOf(i12);
        return i12;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1090a5) D7.a.f1071b.f6929w3.getValue()).b(D7.a.f1070a, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Z4(List<? extends N2> list, X2 x22, a aVar, List<C1175g0> list2, List<C1175g0> list3) {
        this.f7845a = list;
        this.f7846b = x22;
        this.f7847c = aVar;
        this.f7848d = list2;
        this.f7849e = list3;
    }
}
