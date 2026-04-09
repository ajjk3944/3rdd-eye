package l8;

import android.app.Application;
import android.content.SharedPreferences;
import c9.C2077A;
import c9.C2092m;
import c9.C2097r;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.toto.WeightedValueParameter;
import i9.InterfaceC4463a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import l8.a;
import m8.C5335a;
import n8.f;
import o8.C5433b;
import w9.i;
import y9.n;

/* compiled from: Configuration.kt */
/* loaded from: classes3.dex */
public final class b implements l8.a {
    public static final d i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f43907j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap<String, String> f43908k;

    /* renamed from: a, reason: collision with root package name */
    public final f f43909a;

    /* renamed from: b, reason: collision with root package name */
    public final PremiumHelperConfiguration f43910b;

    /* renamed from: c, reason: collision with root package name */
    public final C5433b f43911c;

    /* renamed from: f, reason: collision with root package name */
    public final p8.c f43914f;

    /* renamed from: g, reason: collision with root package name */
    public final l8.a f43915g;

    /* renamed from: d, reason: collision with root package name */
    public final r8.d f43912d = new r8.d("PremiumHelper");

    /* renamed from: e, reason: collision with root package name */
    public final C5335a f43913e = new C5335a();

    /* renamed from: h, reason: collision with root package name */
    public final c f43916h = new c();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Configuration.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADMOB = new a("ADMOB", 0);
        public static final a APPLOVIN = new a("APPLOVIN", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{ADMOB, APPLOVIN};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Configuration.kt */
    /* renamed from: l8.b$b, reason: collision with other inner class name */
    public static final class EnumC0492b {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ EnumC0492b[] $VALUES;
        public static final EnumC0492b SESSION = new EnumC0492b("SESSION", 0);
        public static final EnumC0492b GLOBAL = new EnumC0492b("GLOBAL", 1);

        private static final /* synthetic */ EnumC0492b[] $values() {
            return new EnumC0492b[]{SESSION, GLOBAL};
        }

        static {
            EnumC0492b[] enumC0492bArr$values = $values();
            $VALUES = enumC0492bArr$values;
            $ENTRIES = com.google.gson.internal.c.l(enumC0492bArr$values);
        }

        private EnumC0492b(String str, int i) {
        }

        public static InterfaceC4463a<EnumC0492b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0492b valueOf(String str) {
            return (EnumC0492b) Enum.valueOf(EnumC0492b.class, str);
        }

        public static EnumC0492b[] values() {
            return (EnumC0492b[]) $VALUES.clone();
        }
    }

    /* compiled from: Configuration.kt */
    public static final class c implements l8.a {
        @Override // l8.a
        public final <T> T a(l8.a aVar, String key, T t10) {
            l.f(aVar, "<this>");
            l.f(key, "key");
            return t10;
        }

        @Override // l8.a
        public final boolean b(String key) {
            l.f(key, "key");
            return true;
        }

        @Override // l8.a
        public final boolean c(String str, boolean z10) {
            return a.C0491a.a(this, str, z10);
        }

        @Override // l8.a
        public final String d() {
            return "DEFAULT";
        }

        @Override // l8.a
        public final Map<String, String> e() {
            b.i.getClass();
            return b.f43908k;
        }
    }

    /* compiled from: Configuration.kt */
    public static final class d {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Configuration.kt */
    public static final class e {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e THUMBSUP = new e("THUMBSUP", 0);
        public static final e STARS = new e("STARS", 1);
        public static final e SMILES = new e("SMILES", 2);

        private static final /* synthetic */ e[] $values() {
            return new e[]{THUMBSUP, STARS, SMILES};
        }

        static {
            e[] eVarArr$values = $values();
            $VALUES = eVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(eVarArr$values);
        }

        private e(String str, int i) {
        }

        public static InterfaceC4463a<e> getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    static {
        q qVar = new q(b.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        f43907j = new i[]{qVar};
        i = new d();
        f43908k = new HashMap<>();
    }

    public b(Application application, f fVar, PremiumHelperConfiguration premiumHelperConfiguration, C5433b c5433b) {
        this.f43909a = fVar;
        this.f43910b = premiumHelperConfiguration;
        this.f43911c = c5433b;
        this.f43914f = new p8.c(application);
        this.f43915g = premiumHelperConfiguration.repository();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l8.a
    public final <T> T a(l8.a aVar, String key, T t10) {
        l.f(aVar, "<this>");
        l.f(key, "key");
        l8.a aVarI = i(key);
        Object objA = aVar.a(aVarI, key, t10);
        if (objA != 0) {
            t10 = objA;
        }
        r8.c cVarA = this.f43912d.a(this, f43907j[0]);
        String strD = aVarI.d();
        StringBuilder sb = new StringBuilder("[PH CONFIGURATION] ");
        sb.append(key);
        sb.append(" = ");
        sb.append(t10);
        sb.append(" from [");
        cVarA.a(B4.f.c(sb, strD, "]"), new Object[0]);
        return t10;
    }

    @Override // l8.a
    public final boolean b(String key) {
        l.f(key, "key");
        return !(i(key) instanceof c);
    }

    @Override // l8.a
    public final boolean c(String str, boolean z10) {
        return a.C0491a.a(this, str, z10);
    }

    @Override // l8.a
    public final String d() {
        return "Premium Helper";
    }

    @Override // l8.a
    public final Map<String, String> e() {
        return f43908k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof l8.c
            if (r0 == 0) goto L13
            r0 = r10
            l8.c r0 = (l8.c) r0
            int r1 = r0.f43923r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43923r = r1
            goto L18
        L13:
            l8.c r0 = new l8.c
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f43921p
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43923r
            r3 = 2
            r4 = 1
            r5 = 10
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.StringBuilder r1 = r0.f43920o
            java.lang.StringBuilder r2 = r0.f43919n
            java.lang.StringBuilder r3 = r0.f43918m
            l8.b r0 = r0.f43917l
            b9.n.b(r10)
            goto L9b
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3d:
            java.lang.StringBuilder r2 = r0.f43920o
            java.lang.StringBuilder r4 = r0.f43919n
            java.lang.StringBuilder r6 = r0.f43918m
            l8.b r7 = r0.f43917l
            b9.n.b(r10)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L78
        L4c:
            b9.n.b(r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            m8.a r10 = r9.f43913e
            java.lang.String r10 = r10.toString()
            r2.append(r10)
            java.lang.String r10 = "\n\nPreferences\n"
            r2.append(r10)
            r0.f43917l = r9
            r0.f43918m = r2
            r0.f43919n = r2
            r0.f43920o = r2
            r0.f43923r = r4
            p8.c r10 = r9.f43914f
            java.lang.Object r10 = r10.f(r0)
            if (r10 != r1) goto L75
            goto L97
        L75:
            r7 = r9
            r4 = r2
            r6 = r4
        L78:
            java.lang.String r10 = (java.lang.String) r10
            r4.append(r10)
            r4.append(r5)
            java.lang.String r10 = "Remote Config\n"
            r2.append(r10)
            n8.f r10 = r7.f43909a
            r0.f43917l = r7
            r0.f43918m = r6
            r0.f43919n = r2
            r0.f43920o = r2
            r0.f43923r = r3
            java.lang.Object r10 = r10.f(r0)
            if (r10 != r1) goto L98
        L97:
            return r1
        L98:
            r1 = r2
            r3 = r6
            r0 = r7
        L9b:
            java.lang.String r10 = (java.lang.String) r10
            r1.append(r10)
            r1.append(r5)
            java.lang.String r10 = "Testy\n"
            r2.append(r10)
            o8.b r10 = r0.f43911c
            java.lang.String r10 = r10.toString()
            r2.append(r10)
            java.lang.String r10 = "\nApp Config\n"
            r2.append(r10)
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r10 = r0.f43910b
            java.lang.String r10 = r10.toString()
            r2.append(r10)
            r2.append(r5)
            java.lang.String r10 = r3.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.f(h9.c):java.lang.Object");
    }

    public final int g(int[] iArr, l8.d<Integer> dVar) {
        int iIntValue = ((Number) h(dVar)).intValue();
        return iIntValue < iArr.length ? iArr[iIntValue] : iArr[0];
    }

    public final <T> T h(l8.d<T> param) {
        l.f(param, "param");
        return (T) a(this, param.f43924a, param.f43925b);
    }

    public final l8.a i(String str) {
        boolean z10 = (l.b(str, i8.d.f38567k0.f43924a) || l.b(str, i8.d.f38568l.f43924a)) ? false : true;
        if (this.f43910b.isDebugMode()) {
            C5335a c5335a = this.f43913e;
            if (c5335a.b(str)) {
                return c5335a;
            }
        }
        C5433b c5433b = this.f43911c;
        if (c5433b.b(str)) {
            return c5433b;
        }
        if (z10 && l()) {
            p8.c cVar = this.f43914f;
            if (cVar.b(str)) {
                return cVar;
            }
        }
        if (z10) {
            f fVar = this.f43909a;
            if (fVar.b(str)) {
                return fVar;
            }
        }
        l8.a aVar = this.f43915g;
        return aVar.b(str) ? aVar : this.f43916h;
    }

    public final int j() {
        Integer numValueOf;
        PremiumHelperConfiguration premiumHelperConfiguration = this.f43910b;
        if (premiumHelperConfiguration.getRelaunchPremiumActivityLayout().length == 0) {
            numValueOf = null;
        } else {
            int[] relaunchPremiumActivityLayout = premiumHelperConfiguration.getRelaunchPremiumActivityLayout();
            l8.d<Integer> PH_RELAUNCH_LAYOUT_VARIANT = i8.d.f38540T;
            l.e(PH_RELAUNCH_LAYOUT_VARIANT, "PH_RELAUNCH_LAYOUT_VARIANT");
            numValueOf = Integer.valueOf(g(relaunchPremiumActivityLayout, PH_RELAUNCH_LAYOUT_VARIANT));
        }
        return numValueOf != null ? numValueOf.intValue() : R.layout.activity_premium;
    }

    public final int k() {
        Integer numValueOf;
        PremiumHelperConfiguration premiumHelperConfiguration = this.f43910b;
        if (premiumHelperConfiguration.getRelaunchOneTimeActivityLayout().length == 0) {
            numValueOf = null;
        } else {
            int[] relaunchOneTimeActivityLayout = premiumHelperConfiguration.getRelaunchOneTimeActivityLayout();
            l8.d<Integer> PH_RELAUNCH_ONETIME_LAYOUT_VARIANT = i8.d.f38541U;
            l.e(PH_RELAUNCH_ONETIME_LAYOUT_VARIANT, "PH_RELAUNCH_ONETIME_LAYOUT_VARIANT");
            numValueOf = Integer.valueOf(g(relaunchOneTimeActivityLayout, PH_RELAUNCH_ONETIME_LAYOUT_VARIANT));
        }
        return numValueOf != null ? numValueOf.intValue() : R.layout.activity_premium;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r3 = this;
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r0 = r3.f43910b
            boolean r0 = r0.isDebugMode()
            if (r0 == 0) goto L15
            l8.d<java.lang.Boolean> r0 = i8.d.f38567k0
            java.lang.String r0 = r0.f43924a
            m8.a r1 = r3.f43913e
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L15
            goto L24
        L15:
            l8.d<java.lang.Boolean> r0 = i8.d.f38567k0
            java.lang.String r0 = r0.f43924a
            l8.a r1 = r3.f43915g
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L22
            goto L24
        L22:
            l8.b$c r1 = r3.f43916h
        L24:
            l8.d<java.lang.Boolean> r0 = i8.d.f38567k0
            java.lang.String r2 = r0.f43924a
            T r0 = r0.f43925b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r0 = r1.c(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.b.l():boolean");
    }

    public final boolean m(String str, List list) {
        p8.c cVar = this.f43914f;
        cVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WeightedValueParameter) it.next()).getName());
        }
        HashSet hashSet = new HashSet(C2077A.l(C2092m.T(arrayList, 12)));
        C2097r.E0(arrayList, hashSet);
        SharedPreferences sharedPreferences = cVar.f45300a;
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (!l.b((String) obj, "x-country")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str2 = (String) next;
            l.c(str2);
            if (!n.T(str2, "_hash")) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!hashSet.contains((String) next2)) {
                arrayList4.add(next2);
            }
        }
        List<String> listG0 = C2097r.G0(arrayList4);
        boolean z10 = !listG0.isEmpty();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("x-country", str);
        for (String str3 : listG0) {
            editorEdit.remove(str3);
            editorEdit.remove(p8.c.g(str3));
        }
        editorEdit.apply();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list2) {
            if (!n.U(((WeightedValueParameter) obj2).getName(), i8.d.f38567k0.f43924a, true)) {
                arrayList5.add(obj2);
            }
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            WeightedValueParameter weightedValueParameter = (WeightedValueParameter) it4.next();
            int iHash = weightedValueParameter.hash();
            String name = weightedValueParameter.getName();
            Integer numValueOf = sharedPreferences.contains(p8.c.g(name)) ? Integer.valueOf(sharedPreferences.getInt(p8.c.g(name), -1)) : null;
            if (numValueOf == null || iHash != numValueOf.intValue()) {
                String strPickRandomValue = weightedValueParameter.pickRandomValue();
                if (strPickRandomValue != null) {
                    String name2 = weightedValueParameter.getName();
                    int iHash2 = weightedValueParameter.hash();
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    editorEdit2.putString(name2, strPickRandomValue);
                    editorEdit2.putInt(p8.c.g(name2), iHash2);
                    editorEdit2.apply();
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
