package b0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4562a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f4563b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f4564c = -1;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f4565d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f4566e = new SparseArray();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4567a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f4568b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f4569c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4570d;

        public a(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f4569c = -1;
            this.f4570d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.State_android_id) {
                    this.f4567a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4567a);
                } else if (index == d.State_constraints) {
                    this.f4569c = typedArrayObtainStyledAttributes.getResourceId(index, this.f4569c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4569c);
                    context.getResources().getResourceName(this.f4569c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f4570d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f4568b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f4568b.size(); i10++) {
                if (((b) this.f4568b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f4571a;

        /* renamed from: b, reason: collision with root package name */
        public float f4572b;

        /* renamed from: c, reason: collision with root package name */
        public float f4573c;

        /* renamed from: d, reason: collision with root package name */
        public float f4574d;

        /* renamed from: e, reason: collision with root package name */
        public int f4575e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4576f;

        public b(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.f4571a = Float.NaN;
            this.f4572b = Float.NaN;
            this.f4573c = Float.NaN;
            this.f4574d = Float.NaN;
            this.f4575e = -1;
            this.f4576f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), d.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.Variant_constraints) {
                    this.f4575e = typedArrayObtainStyledAttributes.getResourceId(index, this.f4575e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f4575e);
                    context.getResources().getResourceName(this.f4575e);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        this.f4576f = true;
                    }
                } else if (index == d.Variant_region_heightLessThan) {
                    this.f4574d = typedArrayObtainStyledAttributes.getDimension(index, this.f4574d);
                } else if (index == d.Variant_region_heightMoreThan) {
                    this.f4572b = typedArrayObtainStyledAttributes.getDimension(index, this.f4572b);
                } else if (index == d.Variant_region_widthLessThan) {
                    this.f4573c = typedArrayObtainStyledAttributes.getDimension(index, this.f4573c);
                } else if (index == d.Variant_region_widthMoreThan) {
                    this.f4571a = typedArrayObtainStyledAttributes.getDimension(index, this.f4571a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f4571a) && f10 < this.f4571a) {
                return false;
            }
            if (!Float.isNaN(this.f4572b) && f11 < this.f4572b) {
                return false;
            }
            if (Float.isNaN(this.f4573c) || f10 <= this.f4573c) {
                return Float.isNaN(this.f4574d) || f11 <= this.f4574d;
            }
            return false;
        }
    }

    public f(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        b(context, xmlPullParser);
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = (a) this.f4565d.get(i11);
        if (aVar == null) {
            return i11;
        }
        int i12 = 0;
        if (f10 != -1.0f && f11 != -1.0f) {
            ArrayList arrayList = aVar.f4568b;
            int size = arrayList.size();
            b bVar = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                b bVar2 = (b) obj;
                if (bVar2.a(f10, f11)) {
                    if (i10 != bVar2.f4575e) {
                        bVar = bVar2;
                    }
                }
            }
            return bVar != null ? bVar.f4575e : aVar.f4569c;
        }
        if (aVar.f4569c != i10) {
            ArrayList arrayList2 = aVar.f4568b;
            int size2 = arrayList2.size();
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                if (i10 == ((b) obj2).f4575e) {
                }
            }
            return aVar.f4569c;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = b0.d.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = b0.d.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.f4562a
            int r4 = r0.getResourceId(r4, r5)
            r8.f4562a = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto Laa
            if (r0 == 0) goto L9b
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L4c
            if (r0 == r5) goto L3c
            goto L9e
        L3c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L9e
            goto Laa
        L48:
            r9 = move-exception
            goto La3
        L4a:
            r9 = move-exception
            goto La7
        L4c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            switch(r7) {
                case 80204913: goto L73;
                case 1301459538: goto L69;
                case 1382829617: goto L62;
                case 1901439077: goto L58;
                default: goto L57;
            }     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        L57:
            goto L7d
        L58:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r5
            goto L7e
        L62:
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            goto L7e
        L69:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r2
            goto L7e
        L73:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r6
            goto L7e
        L7d:
            r3 = -1
        L7e:
            if (r3 == r6) goto L8e
            if (r3 == r5) goto L83
            goto L9e
        L83:
            b0.f$b r0 = new b0.f$b     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r1 == 0) goto L9e
            r1.a(r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L9e
        L8e:
            b0.f$a r1 = new b0.f$a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.SparseArray r0 = r8.f4565d     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r3 = r1.f4567a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.put(r3, r1)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L9e
        L9b:
            r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        L9e:
            int r0 = r10.next()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L2d
        La3:
            r9.printStackTrace()
            goto Laa
        La7:
            r9.printStackTrace()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int c(int i10, int i11, int i12) {
        return d(-1, i10, i11, i12);
    }

    public int d(int i10, int i11, float f10, float f11) {
        int iB;
        if (i10 == i11) {
            a aVar = i11 == -1 ? (a) this.f4565d.valueAt(0) : (a) this.f4565d.get(this.f4563b);
            if (aVar == null) {
                return -1;
            }
            return ((this.f4564c == -1 || !((b) aVar.f4568b.get(i10)).a(f10, f11)) && i10 != (iB = aVar.b(f10, f11))) ? iB == -1 ? aVar.f4569c : ((b) aVar.f4568b.get(iB)).f4575e : i10;
        }
        a aVar2 = (a) this.f4565d.get(i11);
        if (aVar2 == null) {
            return -1;
        }
        int iB2 = aVar2.b(f10, f11);
        return iB2 == -1 ? aVar2.f4569c : ((b) aVar2.f4568b.get(iB2)).f4575e;
    }
}
