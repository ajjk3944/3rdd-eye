package Ae;

import android.net.Uri;
import f2.C5506e;
import java.util.List;
import kotlin.text.t;

/* loaded from: classes4.dex */
public interface p {

    public interface a extends p {

        /* renamed from: Ae.p$a$a, reason: collision with other inner class name */
        public static final class C0028a {
            public static String a(a aVar) {
                String strL = aVar.l();
                List<C5506e> listJ = aVar.j();
                if (listJ.isEmpty()) {
                    listJ = null;
                }
                String str = "";
                if (listJ != null) {
                    Uri.Builder builder = new Uri.Builder();
                    for (C5506e c5506e : listJ) {
                        builder.appendQueryParameter(c5506e.c(), "{" + Uri.encode(c5506e.c()) + "}");
                    }
                    String query = builder.build().getQuery();
                    if (query != null) {
                        String str2 = t.m0(query) ? null : query;
                        if (str2 != null) {
                            String str3 = "/?" + str2;
                            if (str3 != null) {
                                str = str3;
                            }
                        }
                    }
                }
                return strL + str;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String b(Ae.p.a r5, java.lang.Object r6) {
                /*
                    java.util.List r0 = r5.j()
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r0 = r0.iterator()
                Lf:
                    boolean r2 = r0.hasNext()
                    r3 = 0
                    if (r2 == 0) goto L34
                    java.lang.Object r2 = r0.next()
                    f2.e r2 = (f2.C5506e) r2
                    java.lang.String r4 = r2.c()
                    java.lang.String r4 = r5.k(r6, r4)
                    if (r4 == 0) goto L2e
                    java.lang.String r2 = r2.c()
                    Yg.s r3 = Yg.z.a(r2, r4)
                L2e:
                    if (r3 == 0) goto Lf
                    r1.add(r3)
                    goto Lf
                L34:
                    boolean r6 = r1.isEmpty()
                    if (r6 != 0) goto L3b
                    goto L3c
                L3b:
                    r1 = r3
                L3c:
                    android.net.Uri$Builder r6 = new android.net.Uri$Builder
                    r6.<init>()
                    if (r1 == 0) goto L67
                    java.util.Iterator r0 = r1.iterator()
                L47:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L67
                    java.lang.Object r1 = r0.next()
                    Yg.s r1 = (Yg.s) r1
                    java.lang.Object r2 = r1.a()
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object r1 = r1.c()
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r1 = android.net.Uri.encode(r1)
                    r6.appendQueryParameter(r2, r1)
                    goto L47
                L67:
                    java.lang.String r5 = r5.l()
                    android.net.Uri r6 = r6.build()
                    java.lang.String r6 = r6.getQuery()
                    if (r6 == 0) goto L91
                    boolean r0 = kotlin.text.t.m0(r6)
                    if (r0 != 0) goto L7c
                    r3 = r6
                L7c:
                    if (r3 == 0) goto L91
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r0 = "/?"
                    r6.append(r0)
                    r6.append(r3)
                    java.lang.String r6 = r6.toString()
                    if (r6 != 0) goto L93
                L91:
                    java.lang.String r6 = ""
                L93:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r5)
                    r0.append(r6)
                    java.lang.String r5 = r0.toString()
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ae.p.a.C0028a.b(Ae.p$a, java.lang.Object):java.lang.String");
            }
        }

        List j();

        String k(Object obj, String str);

        String l();
    }

    public interface b extends p {
    }

    String a();
}
