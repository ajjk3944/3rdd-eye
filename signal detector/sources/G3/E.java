package G3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.apm.insight.R;
import d3.AbstractC2266a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1528a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0150d f1529b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f1530c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0150d[] f1531d = new InterfaceC0150d[10];

    public static E b(InterfaceC0150d interfaceC0150d) {
        E e6 = new E();
        e6.a(StateSet.WILD_CARD, interfaceC0150d);
        return e6;
    }

    public final void a(int[] iArr, InterfaceC0150d interfaceC0150d) {
        int i = this.f1528a;
        if (i == 0 || iArr.length == 0) {
            this.f1529b = interfaceC0150d;
        }
        int[][] iArr2 = this.f1530c;
        if (i >= iArr2.length) {
            int i3 = i + 10;
            int[][] iArr3 = new int[i3][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f1530c = iArr3;
            InterfaceC0150d[] interfaceC0150dArr = new InterfaceC0150d[i3];
            System.arraycopy(this.f1531d, 0, interfaceC0150dArr, 0, i);
            this.f1531d = interfaceC0150dArr;
        }
        int[][] iArr4 = this.f1530c;
        int i6 = this.f1528a;
        iArr4[i6] = iArr;
        this.f1531d[i6] = interfaceC0150d;
        this.f1528a = i6 + 1;
    }

    public final InterfaceC0150d c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f1530c;
        int i3 = 0;
        int i6 = 0;
        while (true) {
            i = -1;
            if (i6 >= this.f1528a) {
                i6 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i6], iArr)) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f1530c;
            while (true) {
                if (i3 >= this.f1528a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i6 = i;
        }
        return i6 < 0 ? this.f1529b : this.f1531d[i6];
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
                int[] iArr = AbstractC2266a.f19735N;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC0150d interfaceC0150dD = o.d(typedArrayObtainAttributes, 5, new C0147a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i6 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i6;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i), interfaceC0150dD);
            }
        }
    }
}
