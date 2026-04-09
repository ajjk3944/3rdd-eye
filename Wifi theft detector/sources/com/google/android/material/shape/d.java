package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import j4.l;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f11053a;

    /* renamed from: b, reason: collision with root package name */
    public g5.d f11054b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f11055c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public g5.d[] f11056d = new g5.d[10];

    public static d b(Context context, TypedArray typedArray, int i10, g5.d dVar) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return c(a.m(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return c(a.m(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                d dVar2 = new d();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    dVar2.i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return dVar2;
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
            return c(dVar);
        }
    }

    public static d c(g5.d dVar) {
        d dVar2 = new d();
        dVar2.a(StateSet.WILD_CARD, dVar);
        return dVar2;
    }

    public final void a(int[] iArr, g5.d dVar) {
        int i10 = this.f11053a;
        if (i10 == 0 || iArr.length == 0) {
            this.f11054b = dVar;
        }
        if (i10 >= this.f11055c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f11055c;
        int i11 = this.f11053a;
        iArr2[i11] = iArr;
        this.f11056d[i11] = dVar;
        this.f11053a = i11 + 1;
    }

    public g5.d d(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f11054b : this.f11056d[iG];
    }

    public g5.d e() {
        return this.f11054b;
    }

    public final void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f11055c, 0, iArr, 0, i10);
        this.f11055c = iArr;
        g5.d[] dVarArr = new g5.d[i11];
        System.arraycopy(this.f11056d, 0, dVarArr, 0, i10);
        this.f11056d = dVarArr;
    }

    public final int g(int[] iArr) {
        int[][] iArr2 = this.f11055c;
        for (int i10 = 0; i10 < this.f11053a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean h() {
        return this.f11053a > 1;
    }

    public final void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, l.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, l.ShapeAppearance, 0, 0);
                g5.d dVarM = a.m(typedArrayObtainAttributes, l.ShapeAppearance_cornerSize, new g5.a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != j4.b.cornerSize) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), dVarM);
            }
        }
    }
}
