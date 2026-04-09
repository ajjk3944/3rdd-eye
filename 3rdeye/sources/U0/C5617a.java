package u0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: ConstraintLayoutStates.java */
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5617a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f46483a;

    /* renamed from: b, reason: collision with root package name */
    public int f46484b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f46485c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<C0537a> f46486d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.d> f46487e = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    public static class C0537a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46488a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f46489b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public final int f46490c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.constraintlayout.widget.d f46491d;

        public C0537a(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f46490c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f46506j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f46488a = typedArrayObtainStyledAttributes.getResourceId(index, this.f46488a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f46490c);
                    this.f46490c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f46491d = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: u0.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f46492a;

        /* renamed from: b, reason: collision with root package name */
        public final float f46493b;

        /* renamed from: c, reason: collision with root package name */
        public final float f46494c;

        /* renamed from: d, reason: collision with root package name */
        public final float f46495d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46496e;

        /* renamed from: f, reason: collision with root package name */
        public final androidx.constraintlayout.widget.d f46497f;

        public b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f46492a = Float.NaN;
            this.f46493b = Float.NaN;
            this.f46494c = Float.NaN;
            this.f46495d = Float.NaN;
            this.f46496e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f46508l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f46496e);
                    this.f46496e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f46497f = dVar;
                        dVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f46495d = typedArrayObtainStyledAttributes.getDimension(index, this.f46495d);
                } else if (index == 2) {
                    this.f46493b = typedArrayObtainStyledAttributes.getDimension(index, this.f46493b);
                } else if (index == 3) {
                    this.f46494c = typedArrayObtainStyledAttributes.getDimension(index, this.f46494c);
                } else if (index == 4) {
                    this.f46492a = typedArrayObtainStyledAttributes.getDimension(index, this.f46492a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f10, float f11) {
            float f12 = this.f46492a;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f46493b;
            if (!Float.isNaN(f13) && f11 < f13) {
                return false;
            }
            float f14 = this.f46494c;
            if (!Float.isNaN(f14) && f10 > f14) {
                return false;
            }
            float f15 = this.f46495d;
            return Float.isNaN(f15) || f11 <= f15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5617a(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f46484b = r0
            r7.f46485c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f46486d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f46487e = r1
            r7.f46483a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r1 = 0
        L25:
            r2 = 1
            if (r10 == r2) goto La7
            if (r10 == 0) goto L98
            r3 = 2
            if (r10 == r3) goto L2f
            goto L9b
        L2f:
            java.lang.String r10 = r9.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            int r4 = r10.hashCode()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L68;
                case 80204913: goto L5e;
                case 1382829617: goto L55;
                case 1657696882: goto L4b;
                case 1901439077: goto L3d;
                default: goto L3c;
            }     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L3c:
            goto L72
        L3d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r6
            goto L73
        L47:
            r8 = move-exception
            goto La0
        L49:
            r8 = move-exception
            goto La4
        L4b:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = 0
            goto L73
        L55:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            goto L73
        L5e:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r3
            goto L73
        L68:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r10 == 0) goto L72
            r2 = r5
            goto L73
        L72:
            r2 = r0
        L73:
            if (r2 == r3) goto L8b
            if (r2 == r6) goto L7e
            if (r2 == r5) goto L7a
            goto L9b
        L7a:
            r7.a(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L7e:
            u0.a$b r10 = new u0.a$b     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r10.<init>(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r1 == 0) goto L9b
            java.util.ArrayList<u0.a$b> r2 = r1.f46489b     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r2.add(r10)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L8b:
            u0.a$a r1 = new u0.a$a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            android.util.SparseArray<u0.a$a> r10 = r7.f46486d     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            int r2 = r1.f46488a     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r10.put(r2, r1)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L9b
        L98:
            r9.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L9b:
            int r10 = r9.next()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            goto L25
        La0:
            r8.printStackTrace()
            goto La7
        La4:
            r8.printStackTrace()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C5617a.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C5617a.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
