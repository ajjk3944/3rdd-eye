package z5;

import java.io.IOException;
import java.util.Arrays;
import oe.e0;
import oe.f0;
import oe.h0;
import oe.s;
import oe.u0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f26686a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f26687b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f26688c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ga.c a(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = a5.a.v(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            oe.f0 r2 = oe.h0.f19336d
            oe.u0 r2 = oe.u0.f19383x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = a5.a.v(r0, r8)
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = z5.d.f26686a
            r8 = r8[r6]
            java.lang.String r8 = a5.a.q(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = z5.d.f26687b
            r8 = r8[r6]
            java.lang.String r8 = a5.a.q(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = z5.d.f26688c
            r8 = r8[r2]
            java.lang.String r8 = a5.a.q(r0, r8)
            if (r8 == 0) goto L90
            long r11 = java.lang.Long.parseLong(r8)
            z5.b r13 = new z5.b
            r15 = 0
            r17 = 0
            java.lang.String r14 = "image/jpeg"
            r13.<init>(r14, r15, r17)
            r2 = r13
            z5.b r9 = new z5.b
            java.lang.String r10 = "video/mp4"
            r13 = 0
            r9.<init>(r10, r11, r13)
            oe.u0 r2 = oe.h0.r(r2, r9)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            oe.f0 r2 = oe.h0.f19336d
            oe.u0 r2 = oe.u0.f19383x
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L35
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = a5.a.v(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            oe.u0 r2 = b(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = a5.a.v(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            oe.u0 r2 = b(r0, r2, r8)
        Lbc:
            boolean r8 = a5.a.u(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            ga.c r0 = new ga.c
            r0.<init>(r6, r2)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.k0 r0 = androidx.media3.common.k0.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.a(java.lang.String):ga.c");
    }

    public static u0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        f0 f0Var = h0.f19336d;
        s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (a5.a.v(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strQ = a5.a.q(xmlPullParser, strConcat3);
                String strQ2 = a5.a.q(xmlPullParser, strConcat4);
                String strQ3 = a5.a.q(xmlPullParser, strConcat5);
                String strQ4 = a5.a.q(xmlPullParser, strConcat6);
                if (strQ == null || strQ2 == null) {
                    return u0.f19383x;
                }
                b bVar = new b(strQ, strQ3 != null ? Long.parseLong(strQ3) : 0L, strQ4 != null ? Long.parseLong(strQ4) : 0L);
                int i11 = i10 + 1;
                if (objArrCopyOf.length < i11) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, e0.e(objArrCopyOf.length, i11));
                }
                objArrCopyOf[i10] = bVar;
                i10 = i11;
            }
        } while (!a5.a.u(xmlPullParser, strConcat2));
        return h0.k(i10, objArrCopyOf);
    }
}
