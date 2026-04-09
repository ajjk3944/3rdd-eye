package q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import d5.C2273a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import r0.AbstractC2869a;
import u.AbstractC2939h;
import u.C2941j;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f23035j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f23036a;

    /* renamed from: b, reason: collision with root package name */
    public x f23037b;

    /* renamed from: c, reason: collision with root package name */
    public String f23038c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f23039d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f23040e;

    /* renamed from: f, reason: collision with root package name */
    public final C2941j f23041f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f23042g;

    /* renamed from: h, reason: collision with root package name */
    public int f23043h;
    public String i;

    static {
        new LinkedHashMap();
    }

    public v(L l2) {
        LinkedHashMap linkedHashMap = M.f22940b;
        this.f23036a = com.bumptech.glide.d.w(l2.getClass());
        this.f23040e = new ArrayList();
        this.f23041f = new C2941j();
        this.f23042g = new LinkedHashMap();
    }

    public final void a(s sVar) {
        ArrayList arrayListW = R2.a.w(d5.v.L(this.f23042g), new H5.g(2, sVar));
        if (arrayListW.isEmpty()) {
            this.f23040e.add(sVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + sVar.f23012a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListW).toString());
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f23042g;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C2793f c2793f = (C2793f) entry.getValue();
            c2793f.getClass();
            q5.i.e(str, "name");
            if (c2793f.f22962c) {
                c2793f.f22960a.e(bundle2, str, c2793f.f22963d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C2793f c2793f2 = (C2793f) entry2.getValue();
                c2793f2.getClass();
                J j6 = c2793f2.f22960a;
                q5.i.e(str2, "name");
                if (c2793f2.f22961b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        j6.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbQ = AbstractC1135f5.q("Wrong argument type for '", str2, "' in argument bundle. ");
                sbQ.append(j6.b());
                sbQ.append(" expected.");
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int[] c(q0.v r7) {
        /*
            r6 = this;
            d5.h r0 = new d5.h
            r0.<init>()
            r1 = r6
        L6:
            q0.x r2 = r1.f23037b
            if (r7 == 0) goto Ld
            q0.x r3 = r7.f23037b
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L22
            q0.x r3 = r7.f23037b
            q5.i.b(r3)
            int r4 = r1.f23043h
            r5 = 1
            q0.v r3 = r3.h(r4, r5)
            if (r3 != r1) goto L22
            r0.addFirst(r1)
            goto L36
        L22:
            if (r2 == 0) goto L2a
            int r3 = r2.f23049l
            int r4 = r1.f23043h
            if (r3 == r4) goto L2d
        L2a:
            r0.addFirst(r1)
        L2d:
            boolean r1 = q5.i.a(r2, r7)
            if (r1 == 0) goto L34
            goto L36
        L34:
            if (r2 != 0) goto L62
        L36:
            java.util.List r7 = d5.AbstractC2282j.j0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = d5.l.P(r7)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r7.next()
            q0.v r1 = (q0.v) r1
            int r1 = r1.f23043h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L47
        L5d:
            int[] r7 = d5.AbstractC2282j.i0(r0)
            return r7
        L62:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.v.c(q0.v):int[]");
    }

    public final C2792e d(int i) {
        C2941j c2941j = this.f23041f;
        C2792e c2792e = c2941j.g() == 0 ? null : (C2792e) c2941j.d(i);
        if (c2792e != null) {
            return c2792e;
        }
        x xVar = this.f23037b;
        if (xVar != null) {
            return xVar.d(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0250  */
    /* JADX WARN: Type inference failed for: r14v16, types: [c5.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, q0.s] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.regex.Matcher] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0.u e(o.a1 r29) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.v.e(o.a1):q0.u");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[EDGE_INSN: B:62:0x011a->B:46:0x011a BREAK  A[LOOP:2: B:30:0x00a7->B:65:?], EDGE_INSN: B:63:0x011a->B:46:0x011a BREAK  A[LOOP:2: B:30:0x00a7->B:65:?], EDGE_INSN: B:46:0x011a->B:47:0x011b BREAK  A[LOOP:3: B:38:0x00e7->B:69:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.v.equals(java.lang.Object):boolean");
    }

    public void f(Context context, AttributeSet attributeSet) {
        Object obj;
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2869a.f23324e);
        q5.i.d(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.f23043h = 0;
            this.f23038c = null;
        } else {
            if (y5.l.b0(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            this.f23043h = strConcat.hashCode();
            this.f23038c = null;
            a(new s(strConcat, null, null));
        }
        ArrayList arrayList = this.f23040e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            String str = ((s) obj).f23012a;
            String str2 = this.i;
            if (q5.i.a(str, str2 != null ? "android-app://androidx.navigation/".concat(str2) : "")) {
                break;
            }
        }
        q5.r.a(arrayList);
        arrayList.remove(obj);
        this.i = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.f23043h = resourceId;
            this.f23038c = null;
            this.f23038c = T2.g.o(context, resourceId);
        }
        this.f23039d = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f23043h * 31;
        String str = this.i;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.f23040e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            s sVar = (s) obj;
            int i6 = iHashCode * 31;
            String str2 = sVar.f23012a;
            int iHashCode2 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = sVar.f23013b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = sVar.f23014c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C2273a c2273aD = AbstractC2939h.d(this.f23041f);
        while (c2273aD.hasNext()) {
            C2792e c2792e = (C2792e) c2273aD.next();
            int i7 = ((iHashCode * 31) + c2792e.f22957a) * 31;
            B b5 = c2792e.f22958b;
            iHashCode = i7 + (b5 != null ? b5.hashCode() : 0);
            Bundle bundle = c2792e.f22959c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i8 = iHashCode * 31;
                    Bundle bundle2 = c2792e.f22959c;
                    q5.i.b(bundle2);
                    Object obj2 = bundle2.get(str5);
                    iHashCode = i8 + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        LinkedHashMap linkedHashMap = this.f23042g;
        for (String str6 : d5.v.L(linkedHashMap).keySet()) {
            int iHashCode4 = (str6.hashCode() + (iHashCode * 31)) * 31;
            Object obj3 = d5.v.L(linkedHashMap).get(str6);
            iHashCode = (obj3 != null ? obj3.hashCode() : 0) + iHashCode4;
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f23038c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f23043h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.i;
        if (str2 != null && !y5.l.b0(str2)) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.f23039d != null) {
            sb.append(" label=");
            sb.append(this.f23039d);
        }
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
