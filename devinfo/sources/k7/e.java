package k7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f28061c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f28062a;

    /* renamed from: b, reason: collision with root package name */
    public f f28063b;

    public e(String... strArr) {
        this.f28062a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f28062a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L91
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L54
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L35
            java.lang.String r9 = "*"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L33
            goto L35
        L33:
            r9 = r2
            goto L36
        L35:
            r9 = r3
        L36:
            if (r1 != 0) goto L51
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
        L51:
            if (r9 == 0) goto L91
            goto L88
        L54:
            if (r1 != 0) goto L86
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L86
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L88
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L91
            int r8 = r0.size()
            int r8 = r8 - r3
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L91
            goto L88
        L86:
            if (r1 == 0) goto L89
        L88:
            return r3
        L89:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L92
        L91:
            return r2
        L92:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e.a(int, java.lang.String):boolean");
    }

    public final int b(int i4, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f28062a;
        if (((String) list.get(i4)).equals("**")) {
            return (i4 != list.size() - 1 && ((String) list.get(i4 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i4, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f28062a;
        if (i4 >= list.size()) {
            return false;
        }
        return ((String) list.get(i4)).equals(str) || ((String) list.get(i4)).equals("**") || ((String) list.get(i4)).equals("*");
    }

    public final boolean d(int i4, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f28062a;
        return i4 < list.size() - 1 || ((String) list.get(i4)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f28062a.equals(eVar.f28062a)) {
                return false;
            }
            f fVar = this.f28063b;
            f fVar2 = eVar.f28063b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f28062a.hashCode() * 31;
        f fVar = this.f28063b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f28062a);
        sb2.append(",resolved=");
        return d.h.x(sb2, this.f28063b != null, '}');
    }

    public e(e eVar) {
        this.f28062a = new ArrayList(eVar.f28062a);
        this.f28063b = eVar.f28063b;
    }
}
