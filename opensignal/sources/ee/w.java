package ee;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f8160a;

    /* renamed from: b, reason: collision with root package name */
    public d f8161b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f8162c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f8163d = new d[10];

    public static w b(d dVar) {
        w wVar = new w();
        wVar.a(StateSet.WILD_CARD, dVar);
        return wVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i10 = this.f8160a;
        if (i10 == 0 || iArr.length == 0) {
            this.f8161b = dVar;
        }
        int[][] iArr2 = this.f8162c;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11][];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f8162c = iArr3;
            d[] dVarArr = new d[i11];
            System.arraycopy(this.f8163d, 0, dVarArr, 0, i10);
            this.f8163d = dVarArr;
        }
        int[][] iArr4 = this.f8162c;
        int i12 = this.f8160a;
        iArr4[i12] = iArr;
        this.f8163d[i12] = dVar;
        this.f8160a = i12 + 1;
    }

    public final d c(int[] iArr) {
        int i10;
        int[][] iArr2 = this.f8162c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= this.f8160a) {
                i12 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            }
            i12++;
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f8162c;
            while (true) {
                if (i11 >= this.f8160a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            i12 = i10;
        }
        return i12 < 0 ? this.f8161b : this.f8163d[i12];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, ed.l.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, ed.l.ShapeAppearance, 0, 0);
                d dVarD = l.d(typedArrayObtainAttributes, ed.l.ShapeAppearance_cornerSize, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != ed.b.cornerSize) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), dVarD);
            }
        }
    }
}
