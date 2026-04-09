package C;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import x.AbstractC2984e;
import y.AbstractC3006a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1006d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f1007e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f1008f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1009a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1010b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1011c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1007e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1008f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i3 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (A.f.y(strTrim)) {
                    HashMap map = constraintLayout.f5053m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f5053m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static j d(Context context, AttributeSet attributeSet, boolean z6) {
        int i;
        int i3;
        j jVar = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6 ? r.f1014c : r.f1012a);
        m mVar = jVar.f910b;
        n nVar = jVar.f913e;
        l lVar = jVar.f911c;
        k kVar = jVar.f912d;
        int[] iArr = f1006d;
        String[] strArr = AbstractC3006a.f24204a;
        SparseIntArray sparseIntArray = f1007e;
        if (z6) {
            i iVar = new i();
            iVar.f898a = new int[10];
            iVar.f899b = new int[10];
            iVar.f900c = 0;
            iVar.f901d = new int[10];
            iVar.f902e = new float[10];
            iVar.f903f = 0;
            iVar.f904g = new int[5];
            iVar.f905h = new String[5];
            iVar.i = 0;
            iVar.f906j = new int[4];
            iVar.f907k = new boolean[4];
            iVar.f908l = 0;
            lVar.getClass();
            kVar.getClass();
            nVar.getClass();
            int i6 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i6 < indexCount; indexCount = i3) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                int i7 = i6;
                switch (f1008f.get(index)) {
                    case 2:
                        i3 = indexCount;
                        iVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f924I));
                        continue;
                        i6 = i7 + 1;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i3 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i3 = indexCount;
                        iVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i6 = i7 + 1;
                    case 6:
                        i3 = indexCount;
                        iVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f918C));
                        break;
                    case 7:
                        i3 = indexCount;
                        iVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f919D));
                        break;
                    case 8:
                        i3 = indexCount;
                        iVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f925J));
                        break;
                    case 11:
                        i3 = indexCount;
                        iVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f930P));
                        break;
                    case 12:
                        i3 = indexCount;
                        iVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f931Q));
                        break;
                    case 13:
                        i3 = indexCount;
                        iVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.M));
                        break;
                    case 14:
                        i3 = indexCount;
                        iVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f929O));
                        break;
                    case 15:
                        i3 = indexCount;
                        iVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f932R));
                        break;
                    case 16:
                        i3 = indexCount;
                        iVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f928N));
                        break;
                    case 17:
                        i3 = indexCount;
                        iVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f946d));
                        break;
                    case 18:
                        i3 = indexCount;
                        iVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kVar.f948e));
                        break;
                    case 19:
                        i3 = indexCount;
                        iVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, kVar.f950f));
                        break;
                    case 20:
                        i3 = indexCount;
                        iVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, kVar.f976w));
                        break;
                    case 21:
                        i3 = indexCount;
                        iVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f944c));
                        break;
                    case 22:
                        i3 = indexCount;
                        iVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, mVar.f989a)]);
                        break;
                    case 23:
                        i3 = indexCount;
                        iVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, kVar.f943b));
                        break;
                    case 24:
                        i3 = indexCount;
                        iVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f921F));
                        break;
                    case 27:
                        i3 = indexCount;
                        iVar.b(27, typedArrayObtainStyledAttributes.getInt(index, kVar.f920E));
                        break;
                    case 28:
                        i3 = indexCount;
                        iVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f922G));
                        break;
                    case 31:
                        i3 = indexCount;
                        iVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f926K));
                        break;
                    case 34:
                        i3 = indexCount;
                        iVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f923H));
                        break;
                    case 37:
                        i3 = indexCount;
                        iVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, kVar.f977x));
                        break;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        i3 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f909a);
                        jVar.f909a = resourceId;
                        iVar.b(38, resourceId);
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                        i3 = indexCount;
                        iVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, kVar.f935U));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                        i3 = indexCount;
                        iVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, kVar.f934T));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                        i3 = indexCount;
                        iVar.b(41, typedArrayObtainStyledAttributes.getInt(index, kVar.f936V));
                        break;
                    case 42:
                        i3 = indexCount;
                        iVar.b(42, typedArrayObtainStyledAttributes.getInt(index, kVar.f937W));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                        i3 = indexCount;
                        iVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, mVar.f991c));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                        i3 = indexCount;
                        iVar.d(44, true);
                        iVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1005m));
                        break;
                    case 45:
                        i3 = indexCount;
                        iVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, nVar.f995b));
                        break;
                    case 46:
                        i3 = indexCount;
                        iVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, nVar.f996c));
                        break;
                    case 47:
                        i3 = indexCount;
                        iVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, nVar.f997d));
                        break;
                    case 48:
                        i3 = indexCount;
                        iVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, nVar.f998e));
                        break;
                    case 49:
                        i3 = indexCount;
                        iVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, nVar.f999f));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        i3 = indexCount;
                        iVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1000g));
                        break;
                    case 51:
                        i3 = indexCount;
                        iVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, nVar.i));
                        break;
                    case 52:
                        i3 = indexCount;
                        iVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1002j));
                        break;
                    case 53:
                        i3 = indexCount;
                        iVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, nVar.f1003k));
                        break;
                    case 54:
                        i3 = indexCount;
                        iVar.b(54, typedArrayObtainStyledAttributes.getInt(index, kVar.f938X));
                        break;
                    case 55:
                        i3 = indexCount;
                        iVar.b(55, typedArrayObtainStyledAttributes.getInt(index, kVar.f939Y));
                        break;
                    case 56:
                        i3 = indexCount;
                        iVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f940Z));
                        break;
                    case 57:
                        i3 = indexCount;
                        iVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f942a0));
                        break;
                    case 58:
                        i3 = indexCount;
                        iVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.b0));
                        break;
                    case 59:
                        i3 = indexCount;
                        iVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f945c0));
                        break;
                    case 60:
                        i3 = indexCount;
                        iVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, nVar.f994a));
                        break;
                    case 62:
                        i3 = indexCount;
                        iVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f916A));
                        break;
                    case 63:
                        i3 = indexCount;
                        iVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, kVar.f917B));
                        break;
                    case 64:
                        i3 = indexCount;
                        iVar.b(64, f(typedArrayObtainStyledAttributes, index, lVar.f981a));
                        break;
                    case 65:
                        i3 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            iVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            iVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i3 = indexCount;
                        iVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i3 = indexCount;
                        iVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, lVar.f985e));
                        break;
                    case 68:
                        i3 = indexCount;
                        iVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, mVar.f992d));
                        break;
                    case 69:
                        i3 = indexCount;
                        iVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i3 = indexCount;
                        iVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i3 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i3 = indexCount;
                        iVar.b(72, typedArrayObtainStyledAttributes.getInt(index, kVar.f951f0));
                        break;
                    case 73:
                        i3 = indexCount;
                        iVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f953g0));
                        break;
                    case 74:
                        i3 = indexCount;
                        iVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i3 = indexCount;
                        iVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f966n0));
                        break;
                    case 76:
                        i3 = indexCount;
                        iVar.b(76, typedArrayObtainStyledAttributes.getInt(index, lVar.f983c));
                        break;
                    case 77:
                        i3 = indexCount;
                        iVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i3 = indexCount;
                        iVar.b(78, typedArrayObtainStyledAttributes.getInt(index, mVar.f990b));
                        break;
                    case 79:
                        i3 = indexCount;
                        iVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, lVar.f984d));
                        break;
                    case 80:
                        i3 = indexCount;
                        iVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f962l0));
                        break;
                    case 81:
                        i3 = indexCount;
                        iVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f964m0));
                        break;
                    case 82:
                        i3 = indexCount;
                        iVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, lVar.f982b));
                        break;
                    case 83:
                        i3 = indexCount;
                        iVar.b(83, f(typedArrayObtainStyledAttributes, index, nVar.f1001h));
                        break;
                    case 84:
                        i3 = indexCount;
                        iVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, lVar.f987g));
                        break;
                    case 85:
                        i3 = indexCount;
                        iVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, lVar.f986f));
                        break;
                    case 86:
                        i3 = indexCount;
                        int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            lVar.i = resourceId2;
                            iVar.b(89, resourceId2);
                            if (lVar.i != -1) {
                                iVar.b(88, -2);
                                break;
                            }
                        } else if (i8 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            lVar.f988h = string;
                            iVar.c(90, string);
                            if (lVar.f988h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                lVar.i = resourceId3;
                                iVar.b(89, resourceId3);
                                iVar.b(88, -2);
                                break;
                            } else {
                                iVar.b(88, -1);
                                break;
                            }
                        } else {
                            iVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, lVar.i));
                            break;
                        }
                        break;
                    case 87:
                        i3 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i3 = indexCount;
                        iVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f927L));
                        break;
                    case 94:
                        i3 = indexCount;
                        iVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kVar.f933S));
                        break;
                    case 95:
                        i3 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i3 = indexCount;
                        g(iVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i3 = indexCount;
                        iVar.b(97, typedArrayObtainStyledAttributes.getInt(index, kVar.f968o0));
                        break;
                    case 98:
                        i3 = indexCount;
                        int i9 = B.a.f517G;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            jVar.f909a = typedArrayObtainStyledAttributes.getResourceId(index, jVar.f909a);
                            break;
                        }
                    case 99:
                        i3 = indexCount;
                        iVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, kVar.f952g));
                        break;
                }
                i6 = i7 + 1;
            }
        } else {
            int i10 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i10 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        lVar.getClass();
                        kVar.getClass();
                        nVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        kVar.f969p = f(typedArrayObtainStyledAttributes, index2, kVar.f969p);
                        continue;
                        i10++;
                    case 2:
                        i = indexCount2;
                        kVar.f924I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f924I);
                        continue;
                        i10++;
                    case 3:
                        i = indexCount2;
                        kVar.f967o = f(typedArrayObtainStyledAttributes, index2, kVar.f967o);
                        continue;
                        i10++;
                    case 4:
                        i = indexCount2;
                        kVar.f965n = f(typedArrayObtainStyledAttributes, index2, kVar.f965n);
                        continue;
                        i10++;
                    case 5:
                        i = indexCount2;
                        kVar.f978y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i10++;
                    case 6:
                        i = indexCount2;
                        kVar.f918C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f918C);
                        continue;
                        i10++;
                    case 7:
                        i = indexCount2;
                        kVar.f919D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f919D);
                        continue;
                        i10++;
                    case 8:
                        i = indexCount2;
                        kVar.f925J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f925J);
                        continue;
                        i10++;
                    case 9:
                        i = indexCount2;
                        kVar.f975v = f(typedArrayObtainStyledAttributes, index2, kVar.f975v);
                        continue;
                        i10++;
                    case 10:
                        i = indexCount2;
                        kVar.f974u = f(typedArrayObtainStyledAttributes, index2, kVar.f974u);
                        continue;
                        i10++;
                    case 11:
                        i = indexCount2;
                        kVar.f930P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f930P);
                        continue;
                        i10++;
                    case 12:
                        i = indexCount2;
                        kVar.f931Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f931Q);
                        continue;
                        i10++;
                    case 13:
                        i = indexCount2;
                        kVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.M);
                        continue;
                        i10++;
                    case 14:
                        i = indexCount2;
                        kVar.f929O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f929O);
                        continue;
                        i10++;
                    case 15:
                        i = indexCount2;
                        kVar.f932R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f932R);
                        continue;
                        i10++;
                    case 16:
                        i = indexCount2;
                        kVar.f928N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f928N);
                        continue;
                        i10++;
                    case 17:
                        i = indexCount2;
                        kVar.f946d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f946d);
                        continue;
                        i10++;
                    case 18:
                        i = indexCount2;
                        kVar.f948e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f948e);
                        continue;
                        i10++;
                    case 19:
                        i = indexCount2;
                        kVar.f950f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f950f);
                        continue;
                        i10++;
                    case 20:
                        i = indexCount2;
                        kVar.f976w = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f976w);
                        continue;
                        i10++;
                    case 21:
                        i = indexCount2;
                        kVar.f944c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f944c);
                        continue;
                        i10++;
                    case 22:
                        i = indexCount2;
                        int i11 = typedArrayObtainStyledAttributes.getInt(index2, mVar.f989a);
                        mVar.f989a = i11;
                        mVar.f989a = iArr[i11];
                        continue;
                        i10++;
                    case 23:
                        i = indexCount2;
                        kVar.f943b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, kVar.f943b);
                        continue;
                        i10++;
                    case 24:
                        i = indexCount2;
                        kVar.f921F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f921F);
                        continue;
                        i10++;
                    case 25:
                        i = indexCount2;
                        kVar.f954h = f(typedArrayObtainStyledAttributes, index2, kVar.f954h);
                        continue;
                        i10++;
                    case 26:
                        i = indexCount2;
                        kVar.i = f(typedArrayObtainStyledAttributes, index2, kVar.i);
                        continue;
                        i10++;
                    case 27:
                        i = indexCount2;
                        kVar.f920E = typedArrayObtainStyledAttributes.getInt(index2, kVar.f920E);
                        continue;
                        i10++;
                    case 28:
                        i = indexCount2;
                        kVar.f922G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f922G);
                        continue;
                        i10++;
                    case 29:
                        i = indexCount2;
                        kVar.f957j = f(typedArrayObtainStyledAttributes, index2, kVar.f957j);
                        continue;
                        i10++;
                    case 30:
                        i = indexCount2;
                        kVar.f959k = f(typedArrayObtainStyledAttributes, index2, kVar.f959k);
                        continue;
                        i10++;
                    case 31:
                        i = indexCount2;
                        kVar.f926K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f926K);
                        continue;
                        i10++;
                    case 32:
                        i = indexCount2;
                        kVar.f972s = f(typedArrayObtainStyledAttributes, index2, kVar.f972s);
                        continue;
                        i10++;
                    case 33:
                        i = indexCount2;
                        kVar.f973t = f(typedArrayObtainStyledAttributes, index2, kVar.f973t);
                        continue;
                        i10++;
                    case 34:
                        i = indexCount2;
                        kVar.f923H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f923H);
                        continue;
                        i10++;
                    case 35:
                        i = indexCount2;
                        kVar.f963m = f(typedArrayObtainStyledAttributes, index2, kVar.f963m);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                        i = indexCount2;
                        kVar.f961l = f(typedArrayObtainStyledAttributes, index2, kVar.f961l);
                        continue;
                        i10++;
                    case 37:
                        i = indexCount2;
                        kVar.f977x = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f977x);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        i = indexCount2;
                        jVar.f909a = typedArrayObtainStyledAttributes.getResourceId(index2, jVar.f909a);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                        i = indexCount2;
                        kVar.f935U = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f935U);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                        i = indexCount2;
                        kVar.f934T = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f934T);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                        i = indexCount2;
                        kVar.f936V = typedArrayObtainStyledAttributes.getInt(index2, kVar.f936V);
                        continue;
                        i10++;
                    case 42:
                        i = indexCount2;
                        kVar.f937W = typedArrayObtainStyledAttributes.getInt(index2, kVar.f937W);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                        i = indexCount2;
                        mVar.f991c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f991c);
                        continue;
                        i10++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                        i = indexCount2;
                        nVar.f1004l = true;
                        nVar.f1005m = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1005m);
                        continue;
                        i10++;
                    case 45:
                        i = indexCount2;
                        nVar.f995b = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f995b);
                        continue;
                        i10++;
                    case 46:
                        i = indexCount2;
                        nVar.f996c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f996c);
                        continue;
                        i10++;
                    case 47:
                        i = indexCount2;
                        nVar.f997d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f997d);
                        continue;
                        i10++;
                    case 48:
                        i = indexCount2;
                        nVar.f998e = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f998e);
                        continue;
                        i10++;
                    case 49:
                        i = indexCount2;
                        nVar.f999f = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f999f);
                        continue;
                        i10++;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        i = indexCount2;
                        nVar.f1000g = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1000g);
                        continue;
                        i10++;
                    case 51:
                        i = indexCount2;
                        nVar.i = typedArrayObtainStyledAttributes.getDimension(index2, nVar.i);
                        continue;
                        i10++;
                    case 52:
                        i = indexCount2;
                        nVar.f1002j = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1002j);
                        continue;
                        i10++;
                    case 53:
                        i = indexCount2;
                        nVar.f1003k = typedArrayObtainStyledAttributes.getDimension(index2, nVar.f1003k);
                        continue;
                        i10++;
                    case 54:
                        i = indexCount2;
                        kVar.f938X = typedArrayObtainStyledAttributes.getInt(index2, kVar.f938X);
                        continue;
                        i10++;
                    case 55:
                        i = indexCount2;
                        kVar.f939Y = typedArrayObtainStyledAttributes.getInt(index2, kVar.f939Y);
                        continue;
                        i10++;
                    case 56:
                        i = indexCount2;
                        kVar.f940Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f940Z);
                        continue;
                        i10++;
                    case 57:
                        i = indexCount2;
                        kVar.f942a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f942a0);
                        continue;
                        i10++;
                    case 58:
                        i = indexCount2;
                        kVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.b0);
                        continue;
                        i10++;
                    case 59:
                        i = indexCount2;
                        kVar.f945c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f945c0);
                        continue;
                        i10++;
                    case 60:
                        i = indexCount2;
                        nVar.f994a = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f994a);
                        continue;
                        i10++;
                    case 61:
                        i = indexCount2;
                        kVar.f979z = f(typedArrayObtainStyledAttributes, index2, kVar.f979z);
                        continue;
                        i10++;
                    case 62:
                        i = indexCount2;
                        kVar.f916A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f916A);
                        continue;
                        i10++;
                    case 63:
                        i = indexCount2;
                        kVar.f917B = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f917B);
                        continue;
                        i10++;
                    case 64:
                        i = indexCount2;
                        lVar.f981a = f(typedArrayObtainStyledAttributes, index2, lVar.f981a);
                        continue;
                        i10++;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            i10++;
                        }
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        continue;
                        i10++;
                    case 67:
                        i = indexCount2;
                        lVar.f985e = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f985e);
                        break;
                    case 68:
                        i = indexCount2;
                        mVar.f992d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f992d);
                        break;
                    case 69:
                        i = indexCount2;
                        kVar.f947d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        kVar.f949e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        kVar.f951f0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f951f0);
                        break;
                    case 73:
                        i = indexCount2;
                        kVar.f953g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f953g0);
                        break;
                    case 74:
                        i = indexCount2;
                        kVar.f958j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        kVar.f966n0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f966n0);
                        break;
                    case 76:
                        i = indexCount2;
                        lVar.f983c = typedArrayObtainStyledAttributes.getInt(index2, lVar.f983c);
                        break;
                    case 77:
                        i = indexCount2;
                        kVar.f960k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        mVar.f990b = typedArrayObtainStyledAttributes.getInt(index2, mVar.f990b);
                        break;
                    case 79:
                        i = indexCount2;
                        lVar.f984d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f984d);
                        break;
                    case 80:
                        i = indexCount2;
                        kVar.f962l0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f962l0);
                        break;
                    case 81:
                        i = indexCount2;
                        kVar.f964m0 = typedArrayObtainStyledAttributes.getBoolean(index2, kVar.f964m0);
                        break;
                    case 82:
                        i = indexCount2;
                        lVar.f982b = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f982b);
                        break;
                    case 83:
                        i = indexCount2;
                        nVar.f1001h = f(typedArrayObtainStyledAttributes, index2, nVar.f1001h);
                        break;
                    case 84:
                        i = indexCount2;
                        lVar.f987g = typedArrayObtainStyledAttributes.getInteger(index2, lVar.f987g);
                        break;
                    case 85:
                        i = indexCount2;
                        lVar.f986f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f986f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i12 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i12 == 1) {
                            lVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i12 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            lVar.f988h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, lVar.i);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        kVar.f970q = f(typedArrayObtainStyledAttributes, index2, kVar.f970q);
                        break;
                    case 92:
                        i = indexCount2;
                        kVar.f971r = f(typedArrayObtainStyledAttributes, index2, kVar.f971r);
                        break;
                    case 93:
                        i = indexCount2;
                        kVar.f927L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f927L);
                        break;
                    case 94:
                        i = indexCount2;
                        kVar.f933S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, kVar.f933S);
                        break;
                    case 95:
                        i = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i10++;
                    case 96:
                        i = indexCount2;
                        g(kVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        kVar.f968o0 = typedArrayObtainStyledAttributes.getInt(index2, kVar.f968o0);
                        break;
                }
                i10++;
            }
            if (kVar.f958j0 != null) {
                kVar.f956i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i, int i3) {
        int resourceId = typedArray.getResourceId(i, i3);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f5 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f5 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f5 / f2);
                            } else {
                                Math.abs(f2 / f5);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f823G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap map;
        String resourceEntryName;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = oVar.f1011c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (oVar.f1010b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        j jVar = (j) map2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            m mVar = jVar.f910b;
                            k kVar = jVar.f912d;
                            n nVar = jVar.f913e;
                            if (childAt instanceof a) {
                                kVar.f955h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(kVar.f951f0);
                                aVar.setMargin(kVar.f953g0);
                                aVar.setAllowsGoneWidget(kVar.f966n0);
                                int[] iArr = kVar.f956i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = kVar.f958j0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        kVar.f956i0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap map3 = jVar.f914f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                b bVar = (b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strL = !bVar.f802a ? A.f.l("set", str2) : str2;
                                int i6 = i3;
                                try {
                                    int iC = AbstractC2984e.c(bVar.f803b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (iC) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(bVar.f804c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(bVar.f805d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(bVar.f808g));
                                            break;
                                        case 3:
                                            map = map3;
                                            Method method = cls.getMethod(strL, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f808g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            map = map3;
                                            cls.getMethod(strL, CharSequence.class).invoke(childAt, bVar.f806e);
                                            break;
                                        case 5:
                                            map = map3;
                                            cls.getMethod(strL, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f807f));
                                            break;
                                        case 6:
                                            map = map3;
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(bVar.f805d));
                                            break;
                                        case 7:
                                            map = map3;
                                            try {
                                                cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(bVar.f804c));
                                            } catch (IllegalAccessException e6) {
                                                e = e6;
                                                StringBuilder sbQ = AbstractC1135f5.q(" Custom Attribute \"", str2, "\" not found on ");
                                                sbQ.append(cls.getName());
                                                Log.e("TransitionLayout", sbQ.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i3 = i6;
                                                map3 = map;
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strL);
                                                hashSet2 = hashSet3;
                                                i3 = i6;
                                                map3 = map;
                                            } catch (InvocationTargetException e8) {
                                                e = e8;
                                                StringBuilder sbQ2 = AbstractC1135f5.q(" Custom Attribute \"", str2, "\" not found on ");
                                                sbQ2.append(cls.getName());
                                                Log.e("TransitionLayout", sbQ2.toString());
                                                e.printStackTrace();
                                                hashSet2 = hashSet3;
                                                i3 = i6;
                                                map3 = map;
                                            }
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e9) {
                                    e = e9;
                                    map = map3;
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                    map = map3;
                                } catch (InvocationTargetException e11) {
                                    e = e11;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i6;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i3;
                            childAt.setLayoutParams(eVar);
                            if (mVar.f990b == 0) {
                                childAt.setVisibility(mVar.f989a);
                            }
                            childAt.setAlpha(mVar.f991c);
                            childAt.setRotation(nVar.f994a);
                            childAt.setRotationX(nVar.f995b);
                            childAt.setRotationY(nVar.f996c);
                            childAt.setScaleX(nVar.f997d);
                            childAt.setScaleY(nVar.f998e);
                            if (nVar.f1001h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f1001h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f999f)) {
                                    childAt.setPivotX(nVar.f999f);
                                }
                                if (!Float.isNaN(nVar.f1000g)) {
                                    childAt.setPivotY(nVar.f1000g);
                                }
                            }
                            childAt.setTranslationX(nVar.i);
                            childAt.setTranslationY(nVar.f1002j);
                            childAt.setTranslationZ(nVar.f1003k);
                            if (nVar.f1004l) {
                                childAt.setElevation(nVar.f1005m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i3 = i + 1;
                oVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            oVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) map2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f912d;
                if (kVar2.f955h0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.f809a = new int[32];
                    aVar2.f815g = new HashMap();
                    aVar2.f811c = context;
                    aVar2.h(null);
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = kVar2.f956i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = kVar2.f958j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            kVar2.f956i0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(kVar2.f951f0);
                    aVar2.setMargin(kVar2.f953g0);
                    e eVarG = ConstraintLayout.g();
                    aVar2.k();
                    jVar2.a(eVarG);
                    constraintLayout.addView(aVar2, eVarG);
                }
                if (kVar2.f941a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e eVarG2 = ConstraintLayout.g();
                    jVar2.a(eVarG2);
                    constraintLayout.addView(guideline, eVarG2);
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof c) {
                ((c) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = oVar.f1011c;
        map3.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.f1010b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) map3.get(Integer.valueOf(id));
            if (jVar == null) {
                i = childCount;
                map = map3;
            } else {
                m mVar = jVar.f910b;
                k kVar = jVar.f912d;
                n nVar = jVar.f913e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = oVar.f1009a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i6 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                e.printStackTrace();
                                childCount = i6;
                                map3 = map2;
                            } catch (NoSuchMethodException e7) {
                                e = e7;
                                e.printStackTrace();
                                childCount = i6;
                                map3 = map2;
                            } catch (InvocationTargetException e8) {
                                e = e8;
                                e.printStackTrace();
                                childCount = i6;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        map2 = map3;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        map2 = map3;
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        map2 = map3;
                    }
                    childCount = i6;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                jVar.f914f = map4;
                jVar.f909a = id;
                kVar.f954h = eVar.f849e;
                kVar.i = eVar.f851f;
                kVar.f957j = eVar.f853g;
                kVar.f959k = eVar.f855h;
                kVar.f961l = eVar.i;
                kVar.f963m = eVar.f858j;
                kVar.f965n = eVar.f860k;
                kVar.f967o = eVar.f862l;
                kVar.f969p = eVar.f864m;
                kVar.f970q = eVar.f866n;
                kVar.f971r = eVar.f868o;
                kVar.f972s = eVar.f874s;
                kVar.f973t = eVar.f875t;
                kVar.f974u = eVar.f876u;
                kVar.f975v = eVar.f877v;
                kVar.f976w = eVar.f821E;
                kVar.f977x = eVar.f822F;
                kVar.f978y = eVar.f823G;
                kVar.f979z = eVar.f870p;
                kVar.f916A = eVar.f872q;
                kVar.f917B = eVar.f873r;
                kVar.f918C = eVar.f835T;
                kVar.f919D = eVar.f836U;
                kVar.f920E = eVar.f837V;
                kVar.f950f = eVar.f845c;
                kVar.f946d = eVar.f842a;
                kVar.f948e = eVar.f844b;
                kVar.f943b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f944c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.f921F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.f922G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.f923H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.f924I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.f927L = eVar.f820D;
                kVar.f934T = eVar.f825I;
                kVar.f935U = eVar.f824H;
                kVar.f937W = eVar.f827K;
                kVar.f936V = eVar.f826J;
                kVar.f962l0 = eVar.f838W;
                kVar.f964m0 = eVar.f839X;
                kVar.f938X = eVar.f828L;
                kVar.f939Y = eVar.M;
                kVar.f940Z = eVar.f831P;
                kVar.f942a0 = eVar.f832Q;
                kVar.b0 = eVar.f829N;
                kVar.f945c0 = eVar.f830O;
                kVar.f947d0 = eVar.f833R;
                kVar.f949e0 = eVar.f834S;
                kVar.f960k0 = eVar.f840Y;
                kVar.f928N = eVar.f879x;
                kVar.f930P = eVar.f881z;
                kVar.M = eVar.f878w;
                kVar.f929O = eVar.f880y;
                kVar.f932R = eVar.f817A;
                kVar.f931Q = eVar.f818B;
                kVar.f933S = eVar.f819C;
                kVar.f968o0 = eVar.f841Z;
                kVar.f925J = eVar.getMarginEnd();
                kVar.f926K = eVar.getMarginStart();
                mVar.f989a = childAt.getVisibility();
                mVar.f991c = childAt.getAlpha();
                nVar.f994a = childAt.getRotation();
                nVar.f995b = childAt.getRotationX();
                nVar.f996c = childAt.getRotationY();
                nVar.f997d = childAt.getScaleX();
                nVar.f998e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f999f = pivotX;
                    nVar.f1000g = pivotY;
                }
                nVar.i = childAt.getTranslationX();
                nVar.f1002j = childAt.getTranslationY();
                nVar.f1003k = childAt.getTranslationZ();
                if (nVar.f1004l) {
                    nVar.f1005m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f966n0 = aVar.getAllowsGoneWidget();
                    kVar.f956i0 = aVar.getReferencedIds();
                    kVar.f951f0 = aVar.getType();
                    kVar.f953g0 = aVar.getMargin();
                }
            }
            i3++;
            oVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    j jVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        jVarD.f912d.f941a = true;
                    }
                    this.f1011c.put(Integer.valueOf(jVarD.f909a), jVarD);
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }
}
