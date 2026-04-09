package b0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4544a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f4545b;

    /* renamed from: c, reason: collision with root package name */
    public int f4546c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f4547d = -1;

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f4548e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f4549f = new SparseArray();

    /* renamed from: b0.a$a, reason: collision with other inner class name */
    public static class C0057a {

        /* renamed from: a, reason: collision with root package name */
        public int f4550a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f4551b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f4552c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f4553d;

        public C0057a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f4552c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.State_android_id) {
                    this.f4550a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4550a);
                } else if (index == d.State_constraints) {
                    this.f4552c = typedArrayObtainStyledAttributes.getResourceId(index, this.f4552c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4552c);
                    context.getResources().getResourceName(this.f4552c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f4553d = cVar;
                        cVar.n(context, this.f4552c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f4551b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f4551b.size(); i10++) {
                if (((b) this.f4551b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f4554a;

        /* renamed from: b, reason: collision with root package name */
        public float f4555b;

        /* renamed from: c, reason: collision with root package name */
        public float f4556c;

        /* renamed from: d, reason: collision with root package name */
        public float f4557d;

        /* renamed from: e, reason: collision with root package name */
        public int f4558e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.c f4559f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f4554a = Float.NaN;
            this.f4555b = Float.NaN;
            this.f4556c = Float.NaN;
            this.f4557d = Float.NaN;
            this.f4558e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.Variant_constraints) {
                    this.f4558e = typedArrayObtainStyledAttributes.getResourceId(index, this.f4558e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4558e);
                    context.getResources().getResourceName(this.f4558e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f4559f = cVar;
                        cVar.n(context, this.f4558e);
                    }
                } else if (index == d.Variant_region_heightLessThan) {
                    this.f4557d = typedArrayObtainStyledAttributes.getDimension(index, this.f4557d);
                } else if (index == d.Variant_region_heightMoreThan) {
                    this.f4555b = typedArrayObtainStyledAttributes.getDimension(index, this.f4555b);
                } else if (index == d.Variant_region_widthLessThan) {
                    this.f4556c = typedArrayObtainStyledAttributes.getDimension(index, this.f4556c);
                } else if (index == d.Variant_region_widthMoreThan) {
                    this.f4554a = typedArrayObtainStyledAttributes.getDimension(index, this.f4554a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f4554a) && f10 < this.f4554a) {
                return false;
            }
            if (!Float.isNaN(this.f4555b) && f11 < this.f4555b) {
                return false;
            }
            if (Float.isNaN(this.f4556c) || f10 <= this.f4556c) {
                return Float.isNaN(this.f4557d) || f11 <= this.f4557d;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout constraintLayout, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        this.f4544a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r8, int r9) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8d
            if (r0 == 0) goto L7e
            r3 = 2
            if (r0 == r3) goto L17
            goto L81
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L50;
                case 80204913: goto L46;
                case 1382829617: goto L3d;
                case 1657696882: goto L33;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L24:
            goto L5a
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r6
            goto L5b
        L2f:
            r8 = move-exception
            goto L86
        L31:
            r8 = move-exception
            goto L8a
        L33:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = 0
            goto L5b
        L3d:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            goto L5b
        L46:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r3
            goto L5b
        L50:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r5
            goto L5b
        L5a:
            r2 = -1
        L5b:
            if (r2 == r3) goto L71
            if (r2 == r6) goto L66
            if (r2 == r5) goto L62
            goto L81
        L62:
            r7.b(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L66:
            b0.a$b r0 = new b0.a$b     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r1 == 0) goto L81
            r1.a(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L71:
            b0.a$a r1 = new b0.a$a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            android.util.SparseArray r0 = r7.f4548e     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r2 = r1.f4550a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L7e:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L81:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto Ld
        L86:
            r8.printStackTrace()
            goto L8d
        L8a:
            r8.printStackTrace()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a.a(android.content.Context, int):void");
    }

    public final void b(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                cVar.D(context, xmlPullParser);
                this.f4549f.put(identifier, cVar);
                return;
            }
        }
    }

    public void d(int i10, float f10, float f11) {
        int iB;
        int i11 = this.f4546c;
        if (i11 == i10) {
            C0057a c0057a = i10 == -1 ? (C0057a) this.f4548e.valueAt(0) : (C0057a) this.f4548e.get(i11);
            int i12 = this.f4547d;
            if ((i12 == -1 || !((b) c0057a.f4551b.get(i12)).a(f10, f11)) && this.f4547d != (iB = c0057a.b(f10, f11))) {
                androidx.constraintlayout.widget.c cVar = iB == -1 ? this.f4545b : ((b) c0057a.f4551b.get(iB)).f4559f;
                if (iB != -1) {
                    int i13 = ((b) c0057a.f4551b.get(iB)).f4558e;
                }
                if (cVar == null) {
                    return;
                }
                this.f4547d = iB;
                cVar.i(this.f4544a);
                return;
            }
            return;
        }
        this.f4546c = i10;
        C0057a c0057a2 = (C0057a) this.f4548e.get(i10);
        int iB2 = c0057a2.b(f10, f11);
        androidx.constraintlayout.widget.c cVar2 = iB2 == -1 ? c0057a2.f4553d : ((b) c0057a2.f4551b.get(iB2)).f4559f;
        if (iB2 != -1) {
            int i14 = ((b) c0057a2.f4551b.get(iB2)).f4558e;
        }
        if (cVar2 != null) {
            this.f4547d = iB2;
            cVar2.i(this.f4544a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }

    public void c(b0.b bVar) {
    }
}
