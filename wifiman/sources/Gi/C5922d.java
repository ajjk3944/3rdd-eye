package gi;

import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: gi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5922d {

    /* renamed from: a, reason: collision with root package name */
    private final String f47924a;

    /* renamed from: b, reason: collision with root package name */
    private Zh.c f47925b;

    private C5922d(String str) {
        if (str == null) {
            a(7);
        }
        this.f47924a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r9) {
        /*
            r0 = 5
            r1 = 3
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            switch(r9) {
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r9 == r1) goto L18
            if (r9 == r0) goto L18
            switch(r9) {
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                default: goto L16;
            }
        L16:
            r4 = r1
            goto L19
        L18:
            r4 = r3
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName"
            r6 = 0
            switch(r9) {
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L26;
                case 5: goto L2b;
                case 6: goto L26;
                case 7: goto L21;
                case 8: goto L2b;
                case 9: goto L2b;
                case 10: goto L2b;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L32
        L26:
            java.lang.String r7 = "fqName"
            r4[r6] = r7
            goto L32
        L2b:
            r4[r6] = r5
            goto L32
        L2e:
            java.lang.String r7 = "classId"
            r4[r6] = r7
        L32:
            java.lang.String r6 = "internalNameByClassId"
            java.lang.String r7 = "byFqNameWithoutInnerClasses"
            r8 = 1
            if (r9 == r1) goto L53
            if (r9 == r0) goto L50
            switch(r9) {
                case 8: goto L4b;
                case 9: goto L46;
                case 10: goto L41;
                default: goto L3e;
            }
        L3e:
            r4[r8] = r5
            goto L55
        L41:
            java.lang.String r5 = "getInternalName"
            r4[r8] = r5
            goto L55
        L46:
            java.lang.String r5 = "getPackageFqName"
            r4[r8] = r5
            goto L55
        L4b:
            java.lang.String r5 = "getFqNameForClassNameWithoutDollars"
            r4[r8] = r5
            goto L55
        L50:
            r4[r8] = r7
            goto L55
        L53:
            r4[r8] = r6
        L55:
            switch(r9) {
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L6c;
                case 4: goto L62;
                case 5: goto L6c;
                case 6: goto L62;
                case 7: goto L5d;
                case 8: goto L6c;
                case 9: goto L6c;
                case 10: goto L6c;
                default: goto L58;
            }
        L58:
            java.lang.String r5 = "byInternalName"
            r4[r3] = r5
            goto L6c
        L5d:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L6c
        L62:
            r4[r3] = r7
            goto L6c
        L65:
            r4[r3] = r6
            goto L6c
        L68:
            java.lang.String r5 = "byClassId"
            r4[r3] = r5
        L6c:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r9 == r1) goto L7d
            if (r9 == r0) goto L7d
            switch(r9) {
                case 8: goto L7d;
                case 9: goto L7d;
                case 10: goto L7d;
                default: goto L77;
            }
        L77:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L82
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L82:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.C5922d.a(int):void");
    }

    public static C5922d b(Zh.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new C5922d(h(bVar));
    }

    public static C5922d c(Zh.c cVar) {
        if (cVar == null) {
            a(4);
        }
        C5922d c5922d = new C5922d(cVar.b().replace('.', '/'));
        c5922d.f47925b = cVar;
        return c5922d;
    }

    public static C5922d d(String str) {
        if (str == null) {
            a(0);
        }
        return new C5922d(str);
    }

    public static String h(Zh.b bVar) {
        if (bVar == null) {
            a(2);
        }
        Zh.c cVarF = bVar.f();
        String strReplace = bVar.g().b().replace('.', '$');
        if (!cVarF.d()) {
            strReplace = cVarF.b().replace('.', '/') + MqttTopic.TOPIC_LEVEL_SEPARATOR + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public Zh.c e() {
        return new Zh.c(this.f47924a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47924a.equals(((C5922d) obj).f47924a);
    }

    public String f() {
        String str = this.f47924a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public Zh.c g() {
        int iLastIndexOf = this.f47924a.lastIndexOf(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        if (iLastIndexOf != -1) {
            return new Zh.c(this.f47924a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        Zh.c cVar = Zh.c.f25405c;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f47924a.hashCode();
    }

    public String toString() {
        return this.f47924a;
    }
}
