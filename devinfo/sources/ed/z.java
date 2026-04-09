package ed;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.liuzh.deviceinfo.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f23388a;

    /* renamed from: b, reason: collision with root package name */
    public d f23389b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f23390c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f23391d = new d[10];

    public static z b(d dVar) {
        z zVar = new z();
        zVar.a(StateSet.WILD_CARD, dVar);
        return zVar;
    }

    public final void a(int[] iArr, d dVar) {
        int i4 = this.f23388a;
        if (i4 == 0 || iArr.length == 0) {
            this.f23389b = dVar;
        }
        int[][] iArr2 = this.f23390c;
        if (i4 >= iArr2.length) {
            int i10 = i4 + 10;
            int[][] iArr3 = new int[i10][];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.f23390c = iArr3;
            d[] dVarArr = new d[i10];
            System.arraycopy(this.f23391d, 0, dVarArr, 0, i4);
            this.f23391d = dVarArr;
        }
        int[][] iArr4 = this.f23390c;
        int i11 = this.f23388a;
        iArr4[i11] = iArr;
        this.f23391d[i11] = dVar;
        this.f23388a = i11 + 1;
    }

    public final d c(int[] iArr) {
        int i4;
        int[][] iArr2 = this.f23390c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i4 = -1;
            if (i11 >= this.f23388a) {
                i11 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f23390c;
            while (true) {
                if (i10 >= this.f23388a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i10], iArr3)) {
                    i4 = i10;
                    break;
                }
                i10++;
            }
            i11 = i4;
        }
        return i11 < 0 ? this.f23389b : this.f23391d[i11];
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
                Resources resources = context.getResources();
                int[] iArr = ic.a.E;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d dVarD = o.d(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i4 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i11 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i4] = attributeNameResource;
                        i4 = i11;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i4), dVarD);
            }
        }
    }
}
