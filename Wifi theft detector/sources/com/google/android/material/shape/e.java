package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.material.shape.a;
import j4.l;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f11057a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.shape.a f11058b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f11059c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.shape.a[] f11060d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11061e;

    /* renamed from: f, reason: collision with root package name */
    public final d f11062f;

    /* renamed from: g, reason: collision with root package name */
    public final d f11063g;

    /* renamed from: h, reason: collision with root package name */
    public final d f11064h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f11065a;

        /* renamed from: b, reason: collision with root package name */
        public com.google.android.material.shape.a f11066b;

        /* renamed from: c, reason: collision with root package name */
        public int[][] f11067c;

        /* renamed from: d, reason: collision with root package name */
        public com.google.android.material.shape.a[] f11068d;

        /* renamed from: e, reason: collision with root package name */
        public d f11069e;

        /* renamed from: f, reason: collision with root package name */
        public d f11070f;

        /* renamed from: g, reason: collision with root package name */
        public d f11071g;

        /* renamed from: h, reason: collision with root package name */
        public d f11072h;

        public b i(int[] iArr, com.google.android.material.shape.a aVar) {
            int i10 = this.f11065a;
            if (i10 == 0 || iArr.length == 0) {
                this.f11066b = aVar;
            }
            if (i10 >= this.f11067c.length) {
                l(i10, i10 + 10);
            }
            int[][] iArr2 = this.f11067c;
            int i11 = this.f11065a;
            iArr2[i11] = iArr;
            this.f11068d[i11] = aVar;
            this.f11065a = i11 + 1;
            return this;
        }

        public e j() {
            if (this.f11065a == 0) {
                return null;
            }
            return new e(this);
        }

        public final boolean k(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        public final void l(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f11067c, 0, iArr, 0, i10);
            this.f11067c = iArr;
            com.google.android.material.shape.a[] aVarArr = new com.google.android.material.shape.a[i11];
            System.arraycopy(this.f11068d, 0, aVarArr, 0, i10);
            this.f11068d = aVarArr;
        }

        public final void m() {
            this.f11066b = new com.google.android.material.shape.a();
            this.f11067c = new int[10][];
            this.f11068d = new com.google.android.material.shape.a[10];
        }

        public b n(d dVar, int i10) {
            if (k(i10, 1)) {
                this.f11069e = dVar;
            }
            if (k(i10, 2)) {
                this.f11070f = dVar;
            }
            if (k(i10, 4)) {
                this.f11071g = dVar;
            }
            if (k(i10, 8)) {
                this.f11072h = dVar;
            }
            return this;
        }

        public b(e eVar) {
            int i10 = eVar.f11057a;
            this.f11065a = i10;
            this.f11066b = eVar.f11058b;
            int[][] iArr = eVar.f11059c;
            int[][] iArr2 = new int[iArr.length][];
            this.f11067c = iArr2;
            this.f11068d = new com.google.android.material.shape.a[eVar.f11060d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(eVar.f11060d, 0, this.f11068d, 0, this.f11065a);
            this.f11069e = eVar.f11061e;
            this.f11070f = eVar.f11062f;
            this.f11071g = eVar.f11063g;
            this.f11072h = eVar.f11064h;
        }

        public b(com.google.android.material.shape.a aVar) {
            m();
            i(StateSet.WILD_CARD, aVar);
        }

        public b(Context context, int i10) throws Resources.NotFoundException {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            e.g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                m();
            }
        }
    }

    public static e b(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, l.MaterialShape) : theme.obtainStyledAttributes(attributeSet, l.MaterialShape, 0, 0);
                com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.b(context, typedArrayObtainAttributes.getResourceId(l.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(l.MaterialShape_shapeAppearanceOverlay, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != j4.b.shapeAppearance && attributeNameResource != j4.b.shapeAppearanceOverlay) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), aVarM);
            }
        }
    }

    public static int h(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public com.google.android.material.shape.a c(boolean z10) {
        if (!z10 || (this.f11061e == null && this.f11062f == null && this.f11063g == null && this.f11064h == null)) {
            return this.f11058b;
        }
        a.b bVarW = this.f11058b.w();
        d dVar = this.f11061e;
        if (dVar != null) {
            bVarW.E(dVar.e());
        }
        d dVar2 = this.f11062f;
        if (dVar2 != null) {
            bVarW.I(dVar2.e());
        }
        d dVar3 = this.f11063g;
        if (dVar3 != null) {
            bVarW.v(dVar3.e());
        }
        d dVar4 = this.f11064h;
        if (dVar4 != null) {
            bVarW.z(dVar4.e());
        }
        return bVarW.m();
    }

    public com.google.android.material.shape.a d(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        if (this.f11061e == null && this.f11062f == null && this.f11063g == null && this.f11064h == null) {
            return this.f11060d[iE];
        }
        a.b bVarW = this.f11060d[iE].w();
        d dVar = this.f11061e;
        if (dVar != null) {
            bVarW.E(dVar.d(iArr));
        }
        d dVar2 = this.f11062f;
        if (dVar2 != null) {
            bVarW.I(dVar2.d(iArr));
        }
        d dVar3 = this.f11063g;
        if (dVar3 != null) {
            bVarW.v(dVar3.d(iArr));
        }
        d dVar4 = this.f11064h;
        if (dVar4 != null) {
            bVarW.z(dVar4.d(iArr));
        }
        return bVarW.m();
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f11059c;
        for (int i10 = 0; i10 < this.f11057a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean f() {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        return this.f11057a > 1 || ((dVar = this.f11061e) != null && dVar.h()) || (((dVar2 = this.f11062f) != null && dVar2.h()) || (((dVar3 = this.f11063g) != null && dVar3.h()) || ((dVar4 = this.f11064h) != null && dVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    public e(b bVar) {
        this.f11057a = bVar.f11065a;
        this.f11058b = bVar.f11066b;
        this.f11059c = bVar.f11067c;
        this.f11060d = bVar.f11068d;
        this.f11061e = bVar.f11069e;
        this.f11062f = bVar.f11070f;
        this.f11063g = bVar.f11071g;
        this.f11064h = bVar.f11072h;
    }
}
