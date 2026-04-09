package N7;

import A7.b;
import N7.C1276n1;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAction.kt */
/* renamed from: N7.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175g0 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final C1223j4 f8253a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f8254b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f8255c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Uri> f8256d;

    /* renamed from: e, reason: collision with root package name */
    public final List<a> f8257e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f8258f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<Uri> f8259g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8260h;
    public final A7.b<b> i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1192h2 f8261j;

    /* renamed from: k, reason: collision with root package name */
    public final A7.b<Uri> f8262k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f8263l;

    /* compiled from: DivAction.kt */
    /* renamed from: N7.g0$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final C1175g0 f8264a;

        /* renamed from: b, reason: collision with root package name */
        public final List<C1175g0> f8265b;

        /* renamed from: c, reason: collision with root package name */
        public final A7.b<String> f8266c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f8267d;

        public a(C1175g0 c1175g0, List<C1175g0> list, A7.b<String> bVar) {
            this.f8264a = c1175g0;
            this.f8265b = list;
            this.f8266c = bVar;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((C1290o1) D7.a.f1071b.f6799k1.getValue()).b(D7.a.f1070a, this);
        }
    }

    /* compiled from: DivAction.kt */
    /* renamed from: N7.g0$b */
    public enum b {
        SELF("_self"),
        BLANK("_blank");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<b, String> TO_STRING = C0104b.f8269g;
        public static final p9.l<String, b> FROM_STRING = a.f8268g;

        /* compiled from: DivAction.kt */
        /* renamed from: N7.g0$b$a */
        public static final class a extends kotlin.jvm.internal.m implements p9.l<String, b> {

            /* renamed from: g, reason: collision with root package name */
            public static final a f8268g = new a(1);

            @Override // p9.l
            public final b invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                b bVar = b.SELF;
                if (value.equals(bVar.value)) {
                    return bVar;
                }
                b bVar2 = b.BLANK;
                if (value.equals(bVar2.value)) {
                    return bVar2;
                }
                return null;
            }
        }

        /* compiled from: DivAction.kt */
        /* renamed from: N7.g0$b$b, reason: collision with other inner class name */
        public static final class C0104b extends kotlin.jvm.internal.m implements p9.l<b, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0104b f8269g = new C0104b(1);

            @Override // p9.l
            public final String invoke(b bVar) {
                b value = bVar;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivAction.kt */
        /* renamed from: N7.g0$b$c */
        public static final class c {
        }

        b(String str) {
            this.value = str;
        }
    }

    static {
        new b.C0000b(Boolean.TRUE);
    }

    public C1175g0(C1223j4 c1223j4, A7.b<Boolean> isEnabled, A7.b<String> bVar, A7.b<Uri> bVar2, List<a> list, JSONObject jSONObject, A7.b<Uri> bVar3, String str, A7.b<b> bVar4, AbstractC1192h2 abstractC1192h2, A7.b<Uri> bVar5) {
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        this.f8253a = c1223j4;
        this.f8254b = isEnabled;
        this.f8255c = bVar;
        this.f8256d = bVar2;
        this.f8257e = list;
        this.f8258f = jSONObject;
        this.f8259g = bVar3;
        this.f8260h = str;
        this.i = bVar4;
        this.f8261j = abstractC1192h2;
        this.f8262k = bVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e A[LOOP:0: B:34:0x0092->B:75:0x011e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.C1175g0 r18, A7.d r19, A7.d r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1175g0.a(N7.g0, A7.d, A7.d):boolean");
    }

    public final int b() {
        int i;
        int iB;
        int iIntValue;
        Integer num = this.f8263l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1175g0.class).hashCode();
        C1223j4 c1223j4 = this.f8253a;
        int iHashCode2 = this.f8255c.hashCode() + this.f8254b.hashCode() + iHashCode + (c1223j4 != null ? c1223j4.b() : 0);
        A7.b<Uri> bVar = this.f8256d;
        int iHashCode3 = iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        List<a> list = this.f8257e;
        if (list != null) {
            i = 0;
            for (a aVar : list) {
                Integer num2 = aVar.f8267d;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int iHashCode4 = kotlin.jvm.internal.x.a(a.class).hashCode();
                    C1175g0 c1175g0 = aVar.f8264a;
                    int iB2 = iHashCode4 + (c1175g0 != null ? c1175g0.b() : 0);
                    List<C1175g0> list2 = aVar.f8265b;
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        iB = 0;
                        while (it.hasNext()) {
                            iB += ((C1175g0) it.next()).b();
                        }
                    } else {
                        iB = 0;
                    }
                    int iHashCode5 = iB2 + iB + aVar.f8266c.hashCode();
                    aVar.f8267d = Integer.valueOf(iHashCode5);
                    iIntValue = iHashCode5;
                }
                i += iIntValue;
            }
        } else {
            i = 0;
        }
        int i10 = iHashCode3 + i;
        JSONObject jSONObject = this.f8258f;
        int iHashCode6 = i10 + (jSONObject != null ? jSONObject.hashCode() : 0);
        A7.b<Uri> bVar2 = this.f8259g;
        int iHashCode7 = iHashCode6 + (bVar2 != null ? bVar2.hashCode() : 0);
        String str = this.f8260h;
        int iHashCode8 = iHashCode7 + (str != null ? str.hashCode() : 0);
        A7.b<b> bVar3 = this.i;
        int iHashCode9 = iHashCode8 + (bVar3 != null ? bVar3.hashCode() : 0);
        AbstractC1192h2 abstractC1192h2 = this.f8261j;
        int iB3 = iHashCode9 + (abstractC1192h2 != null ? abstractC1192h2.b() : 0);
        A7.b<Uri> bVar4 = this.f8262k;
        int iHashCode10 = iB3 + (bVar4 != null ? bVar4.hashCode() : 0);
        this.f8263l = Integer.valueOf(iHashCode10);
        return iHashCode10;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1276n1.b) D7.a.f1071b.f6766h1.getValue()).b(D7.a.f1070a, this);
    }
}
