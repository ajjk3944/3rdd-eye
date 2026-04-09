package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import j4.l;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class StateListSizeChange {

    /* renamed from: a, reason: collision with root package name */
    public int f10972a;

    /* renamed from: b, reason: collision with root package name */
    public a f10973b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f10974c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public a[] f10975d = new a[10];

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public b f10979a;

        public a(b bVar) {
            this.f10979a = bVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public SizeChangeType f10980a;

        /* renamed from: b, reason: collision with root package name */
        public float f10981b;

        public b(SizeChangeType sizeChangeType, float f10) {
            this.f10980a = sizeChangeType;
            this.f10981b = f10;
        }

        public int a(int i10) {
            SizeChangeType sizeChangeType = this.f10980a;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.f10981b * i10);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.f10981b;
            }
            return 0;
        }
    }

    public static StateListSizeChange b(Context context, TypedArray typedArray, int i10) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
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
                    stateListSizeChange.h(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
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
            return null;
        }
    }

    public final void a(int[] iArr, a aVar) {
        int i10 = this.f10972a;
        if (i10 == 0 || iArr.length == 0) {
            this.f10973b = aVar;
        }
        if (i10 >= this.f10974c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f10974c;
        int i11 = this.f10972a;
        iArr2[i11] = iArr;
        this.f10975d[i11] = aVar;
        this.f10972a = i11 + 1;
    }

    public int c(int i10) {
        float fMax;
        int i11 = -i10;
        for (int i12 = 0; i12 < this.f10972a; i12++) {
            b bVar = this.f10975d[i12].f10979a;
            SizeChangeType sizeChangeType = bVar.f10980a;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i11, bVar.f10981b);
            } else if (sizeChangeType == SizeChangeType.PERCENT) {
                fMax = Math.max(i11, i10 * bVar.f10981b);
            }
            i11 = (int) fMax;
        }
        return i11;
    }

    public final b d(TypedArray typedArray, int i10, b bVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new b(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new b(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return bVar;
    }

    public a e(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f10973b : this.f10975d[iG];
    }

    public final void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f10974c, 0, iArr, 0, i10);
        this.f10974c = iArr;
        a[] aVarArr = new a[i11];
        System.arraycopy(this.f10975d, 0, aVarArr, 0, i10);
        this.f10975d = aVarArr;
    }

    public final int g(int[] iArr) {
        int[][] iArr2 = this.f10974c;
        for (int i10 = 0; i10 < this.f10972a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    public final void h(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, l.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, l.StateListSizeChange, 0, 0);
                b bVarD = d(typedArrayObtainAttributes, l.StateListSizeChange_widthChange, null);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != j4.b.widthChange) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), new a(bVarD));
            }
        }
    }
}
