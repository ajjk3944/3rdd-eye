package defpackage;

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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ni {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
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

    public static int[] c(p9 p9Var, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = p9Var.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = xm0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && p9Var.isInEditMode() && (p9Var.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) p9Var.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.r;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.r.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static ii d(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        ii iiVar = new ii();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? zm0.c : zm0.a);
        String[] strArr = g82.f;
        li liVar = iiVar.b;
        mi miVar = iiVar.e;
        ki kiVar = iiVar.c;
        ji jiVar = iiVar.d;
        int[] iArr2 = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            hi hiVar = new hi();
            hiVar.a = new int[10];
            hiVar.b = new int[10];
            hiVar.c = 0;
            hiVar.d = new int[10];
            hiVar.e = new float[10];
            hiVar.f = 0;
            hiVar.g = new int[5];
            hiVar.h = new String[5];
            hiVar.i = 0;
            hiVar.j = new int[4];
            hiVar.k = new boolean[4];
            hiVar.l = 0;
            kiVar.getClass();
            jiVar.getClass();
            miVar.getClass();
            int i = 0;
            while (i < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                String[] strArr2 = strArr;
                switch (f.get(index)) {
                    case 2:
                        iArr = iArr2;
                        hiVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.I));
                        break;
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
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        iArr = iArr2;
                        break;
                    case 5:
                        iArr = iArr2;
                        hiVar.d(typedArrayObtainStyledAttributes.getString(index), 5);
                        break;
                    case 6:
                        iArr = iArr2;
                        hiVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jiVar.C));
                        break;
                    case 7:
                        iArr = iArr2;
                        hiVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jiVar.D));
                        break;
                    case 8:
                        iArr = iArr2;
                        hiVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.J));
                        break;
                    case 11:
                        iArr = iArr2;
                        hiVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.P));
                        break;
                    case 12:
                        iArr = iArr2;
                        hiVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.Q));
                        break;
                    case 13:
                        iArr = iArr2;
                        hiVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.M));
                        break;
                    case 14:
                        iArr = iArr2;
                        hiVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.O));
                        break;
                    case 15:
                        iArr = iArr2;
                        hiVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.R));
                        break;
                    case 16:
                        iArr = iArr2;
                        hiVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.N));
                        break;
                    case 17:
                        iArr = iArr2;
                        hiVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jiVar.d));
                        break;
                    case 18:
                        iArr = iArr2;
                        hiVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jiVar.e));
                        break;
                    case 19:
                        iArr = iArr2;
                        hiVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, jiVar.f));
                        break;
                    case 20:
                        iArr = iArr2;
                        hiVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, jiVar.w));
                        break;
                    case zy1.zzm /* 21 */:
                        iArr = iArr2;
                        hiVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jiVar.c));
                        break;
                    case 22:
                        iArr = iArr2;
                        hiVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, liVar.a)]);
                        break;
                    case 23:
                        iArr = iArr2;
                        hiVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jiVar.b));
                        break;
                    case 24:
                        iArr = iArr2;
                        hiVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.F));
                        break;
                    case 27:
                        iArr = iArr2;
                        hiVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jiVar.E));
                        break;
                    case 28:
                        iArr = iArr2;
                        hiVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.G));
                        break;
                    case 31:
                        iArr = iArr2;
                        hiVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.K));
                        break;
                    case 34:
                        iArr = iArr2;
                        hiVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.H));
                        break;
                    case 37:
                        iArr = iArr2;
                        hiVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, jiVar.x));
                        break;
                    case 38:
                        iArr = iArr2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iiVar.a);
                        iiVar.a = resourceId;
                        hiVar.b(38, resourceId);
                        break;
                    case 39:
                        iArr = iArr2;
                        hiVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, jiVar.U));
                        break;
                    case 40:
                        iArr = iArr2;
                        hiVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, jiVar.T));
                        break;
                    case 41:
                        iArr = iArr2;
                        hiVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jiVar.V));
                        break;
                    case 42:
                        iArr = iArr2;
                        hiVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jiVar.W));
                        break;
                    case 43:
                        iArr = iArr2;
                        hiVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, liVar.c));
                        break;
                    case 44:
                        iArr = iArr2;
                        hiVar.c(44, true);
                        hiVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, miVar.m));
                        break;
                    case 45:
                        iArr = iArr2;
                        hiVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, miVar.b));
                        break;
                    case 46:
                        iArr = iArr2;
                        hiVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, miVar.c));
                        break;
                    case 47:
                        iArr = iArr2;
                        hiVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, miVar.d));
                        break;
                    case 48:
                        iArr = iArr2;
                        hiVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, miVar.e));
                        break;
                    case 49:
                        iArr = iArr2;
                        hiVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, miVar.f));
                        break;
                    case 50:
                        iArr = iArr2;
                        hiVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, miVar.g));
                        break;
                    case 51:
                        iArr = iArr2;
                        hiVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, miVar.i));
                        break;
                    case 52:
                        iArr = iArr2;
                        hiVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, miVar.j));
                        break;
                    case 53:
                        iArr = iArr2;
                        hiVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, miVar.k));
                        break;
                    case 54:
                        iArr = iArr2;
                        hiVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jiVar.X));
                        break;
                    case 55:
                        iArr = iArr2;
                        hiVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jiVar.Y));
                        break;
                    case 56:
                        iArr = iArr2;
                        hiVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.Z));
                        break;
                    case 57:
                        iArr = iArr2;
                        hiVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.a0));
                        break;
                    case 58:
                        iArr = iArr2;
                        hiVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.b0));
                        break;
                    case 59:
                        iArr = iArr2;
                        hiVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.c0));
                        break;
                    case 60:
                        iArr = iArr2;
                        hiVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, miVar.a));
                        break;
                    case 62:
                        iArr = iArr2;
                        hiVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.A));
                        break;
                    case 63:
                        iArr = iArr2;
                        hiVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, jiVar.B));
                        break;
                    case 64:
                        iArr = iArr2;
                        hiVar.b(64, f(typedArrayObtainStyledAttributes, index, kiVar.a));
                        break;
                    case 65:
                        iArr = iArr2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            hiVar.d(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            hiVar.d(strArr2[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        iArr = iArr2;
                        hiVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        iArr = iArr2;
                        hiVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, kiVar.e));
                        break;
                    case 68:
                        iArr = iArr2;
                        hiVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, liVar.d));
                        break;
                    case 69:
                        iArr = iArr2;
                        hiVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        iArr = iArr2;
                        hiVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        iArr = iArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        iArr = iArr2;
                        hiVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jiVar.f0));
                        break;
                    case 73:
                        iArr = iArr2;
                        hiVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.g0));
                        break;
                    case 74:
                        iArr = iArr2;
                        hiVar.d(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        iArr = iArr2;
                        hiVar.c(75, typedArrayObtainStyledAttributes.getBoolean(index, jiVar.n0));
                        break;
                    case 76:
                        iArr = iArr2;
                        hiVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kiVar.c));
                        break;
                    case 77:
                        iArr = iArr2;
                        hiVar.d(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        iArr = iArr2;
                        hiVar.b(78, typedArrayObtainStyledAttributes.getInt(index, liVar.b));
                        break;
                    case 79:
                        iArr = iArr2;
                        hiVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, kiVar.d));
                        break;
                    case 80:
                        iArr = iArr2;
                        hiVar.c(80, typedArrayObtainStyledAttributes.getBoolean(index, jiVar.l0));
                        break;
                    case 81:
                        iArr = iArr2;
                        hiVar.c(81, typedArrayObtainStyledAttributes.getBoolean(index, jiVar.m0));
                        break;
                    case 82:
                        iArr = iArr2;
                        hiVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kiVar.b));
                        break;
                    case 83:
                        iArr = iArr2;
                        hiVar.b(83, f(typedArrayObtainStyledAttributes, index, miVar.h));
                        break;
                    case 84:
                        iArr = iArr2;
                        hiVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kiVar.g));
                        break;
                    case 85:
                        iArr = iArr2;
                        hiVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, kiVar.f));
                        break;
                    case 86:
                        iArr = iArr2;
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kiVar.i = resourceId2;
                            hiVar.b(89, resourceId2);
                            if (kiVar.i != -1) {
                                hiVar.b(88, -2);
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kiVar.h = string;
                            hiVar.d(string, 90);
                            if (kiVar.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kiVar.i = resourceId3;
                                hiVar.b(89, resourceId3);
                                hiVar.b(88, -2);
                            } else {
                                hiVar.b(88, -1);
                            }
                        } else {
                            hiVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kiVar.i));
                        }
                        break;
                    case 87:
                        iArr = iArr2;
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        iArr = iArr2;
                        hiVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.L));
                        break;
                    case 94:
                        iArr = iArr2;
                        hiVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jiVar.S));
                        break;
                    case 95:
                        iArr = iArr2;
                        g(hiVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        iArr = iArr2;
                        g(hiVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        iArr = iArr2;
                        hiVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jiVar.o0));
                        break;
                    case 98:
                        int i3 = ye0.v;
                        iArr = iArr2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            iiVar.a = typedArrayObtainStyledAttributes.getResourceId(index, iiVar.a);
                        }
                        break;
                    case 99:
                        hiVar.c(99, typedArrayObtainStyledAttributes.getBoolean(index, jiVar.g));
                        iArr = iArr2;
                        break;
                }
                i++;
                strArr = strArr2;
                iArr2 = iArr;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount2; i4++) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    kiVar.getClass();
                    jiVar.getClass();
                    miVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        jiVar.p = f(typedArrayObtainStyledAttributes, index2, jiVar.p);
                        break;
                    case 2:
                        jiVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.I);
                        break;
                    case 3:
                        jiVar.o = f(typedArrayObtainStyledAttributes, index2, jiVar.o);
                        break;
                    case 4:
                        jiVar.n = f(typedArrayObtainStyledAttributes, index2, jiVar.n);
                        break;
                    case 5:
                        jiVar.y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        jiVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jiVar.C);
                        break;
                    case 7:
                        jiVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jiVar.D);
                        break;
                    case 8:
                        jiVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.J);
                        break;
                    case 9:
                        jiVar.v = f(typedArrayObtainStyledAttributes, index2, jiVar.v);
                        break;
                    case 10:
                        jiVar.u = f(typedArrayObtainStyledAttributes, index2, jiVar.u);
                        break;
                    case 11:
                        jiVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.P);
                        break;
                    case 12:
                        jiVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.Q);
                        break;
                    case 13:
                        jiVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.M);
                        break;
                    case 14:
                        jiVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.O);
                        break;
                    case 15:
                        jiVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.R);
                        break;
                    case 16:
                        jiVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.N);
                        break;
                    case 17:
                        jiVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jiVar.d);
                        break;
                    case 18:
                        jiVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jiVar.e);
                        break;
                    case 19:
                        jiVar.f = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.f);
                        break;
                    case 20:
                        jiVar.w = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.w);
                        break;
                    case zy1.zzm /* 21 */:
                        jiVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jiVar.c);
                        break;
                    case 22:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, liVar.a);
                        liVar.a = i5;
                        liVar.a = iArr2[i5];
                        break;
                    case 23:
                        jiVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jiVar.b);
                        break;
                    case 24:
                        jiVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.F);
                        break;
                    case 25:
                        jiVar.h = f(typedArrayObtainStyledAttributes, index2, jiVar.h);
                        break;
                    case 26:
                        jiVar.i = f(typedArrayObtainStyledAttributes, index2, jiVar.i);
                        break;
                    case 27:
                        jiVar.E = typedArrayObtainStyledAttributes.getInt(index2, jiVar.E);
                        break;
                    case 28:
                        jiVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.G);
                        break;
                    case 29:
                        jiVar.j = f(typedArrayObtainStyledAttributes, index2, jiVar.j);
                        break;
                    case 30:
                        jiVar.k = f(typedArrayObtainStyledAttributes, index2, jiVar.k);
                        break;
                    case 31:
                        jiVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.K);
                        break;
                    case 32:
                        jiVar.s = f(typedArrayObtainStyledAttributes, index2, jiVar.s);
                        break;
                    case 33:
                        jiVar.t = f(typedArrayObtainStyledAttributes, index2, jiVar.t);
                        break;
                    case 34:
                        jiVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.H);
                        break;
                    case 35:
                        jiVar.m = f(typedArrayObtainStyledAttributes, index2, jiVar.m);
                        break;
                    case 36:
                        jiVar.l = f(typedArrayObtainStyledAttributes, index2, jiVar.l);
                        break;
                    case 37:
                        jiVar.x = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.x);
                        break;
                    case 38:
                        iiVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, iiVar.a);
                        break;
                    case 39:
                        jiVar.U = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.U);
                        break;
                    case 40:
                        jiVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.T);
                        break;
                    case 41:
                        jiVar.V = typedArrayObtainStyledAttributes.getInt(index2, jiVar.V);
                        break;
                    case 42:
                        jiVar.W = typedArrayObtainStyledAttributes.getInt(index2, jiVar.W);
                        break;
                    case 43:
                        liVar.c = typedArrayObtainStyledAttributes.getFloat(index2, liVar.c);
                        break;
                    case 44:
                        miVar.l = true;
                        miVar.m = typedArrayObtainStyledAttributes.getDimension(index2, miVar.m);
                        break;
                    case 45:
                        miVar.b = typedArrayObtainStyledAttributes.getFloat(index2, miVar.b);
                        break;
                    case 46:
                        miVar.c = typedArrayObtainStyledAttributes.getFloat(index2, miVar.c);
                        break;
                    case 47:
                        miVar.d = typedArrayObtainStyledAttributes.getFloat(index2, miVar.d);
                        break;
                    case 48:
                        miVar.e = typedArrayObtainStyledAttributes.getFloat(index2, miVar.e);
                        break;
                    case 49:
                        miVar.f = typedArrayObtainStyledAttributes.getDimension(index2, miVar.f);
                        break;
                    case 50:
                        miVar.g = typedArrayObtainStyledAttributes.getDimension(index2, miVar.g);
                        break;
                    case 51:
                        miVar.i = typedArrayObtainStyledAttributes.getDimension(index2, miVar.i);
                        break;
                    case 52:
                        miVar.j = typedArrayObtainStyledAttributes.getDimension(index2, miVar.j);
                        break;
                    case 53:
                        miVar.k = typedArrayObtainStyledAttributes.getDimension(index2, miVar.k);
                        break;
                    case 54:
                        jiVar.X = typedArrayObtainStyledAttributes.getInt(index2, jiVar.X);
                        break;
                    case 55:
                        jiVar.Y = typedArrayObtainStyledAttributes.getInt(index2, jiVar.Y);
                        break;
                    case 56:
                        jiVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.Z);
                        break;
                    case 57:
                        jiVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.a0);
                        break;
                    case 58:
                        jiVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.b0);
                        break;
                    case 59:
                        jiVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.c0);
                        break;
                    case 60:
                        miVar.a = typedArrayObtainStyledAttributes.getFloat(index2, miVar.a);
                        break;
                    case 61:
                        jiVar.z = f(typedArrayObtainStyledAttributes, index2, jiVar.z);
                        break;
                    case 62:
                        jiVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.A);
                        break;
                    case 63:
                        jiVar.B = typedArrayObtainStyledAttributes.getFloat(index2, jiVar.B);
                        break;
                    case 64:
                        kiVar.a = f(typedArrayObtainStyledAttributes, index2, kiVar.a);
                        break;
                    case 65:
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kiVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kiVar.getClass();
                            break;
                        }
                    case 66:
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kiVar.getClass();
                        break;
                    case 67:
                        kiVar.e = typedArrayObtainStyledAttributes.getFloat(index2, kiVar.e);
                        break;
                    case 68:
                        liVar.d = typedArrayObtainStyledAttributes.getFloat(index2, liVar.d);
                        break;
                    case 69:
                        jiVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        jiVar.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        jiVar.f0 = typedArrayObtainStyledAttributes.getInt(index2, jiVar.f0);
                        break;
                    case 73:
                        jiVar.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.g0);
                        break;
                    case 74:
                        jiVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        jiVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, jiVar.n0);
                        break;
                    case 76:
                        kiVar.c = typedArrayObtainStyledAttributes.getInt(index2, kiVar.c);
                        break;
                    case 77:
                        jiVar.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        liVar.b = typedArrayObtainStyledAttributes.getInt(index2, liVar.b);
                        break;
                    case 79:
                        kiVar.d = typedArrayObtainStyledAttributes.getFloat(index2, kiVar.d);
                        break;
                    case 80:
                        jiVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jiVar.l0);
                        break;
                    case 81:
                        jiVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jiVar.m0);
                        break;
                    case 82:
                        kiVar.b = typedArrayObtainStyledAttributes.getInteger(index2, kiVar.b);
                        break;
                    case 83:
                        miVar.h = f(typedArrayObtainStyledAttributes, index2, miVar.h);
                        break;
                    case 84:
                        kiVar.g = typedArrayObtainStyledAttributes.getInteger(index2, kiVar.g);
                        break;
                    case 85:
                        kiVar.f = typedArrayObtainStyledAttributes.getFloat(index2, kiVar.f);
                        break;
                    case 86:
                        int i6 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i6 == 1) {
                            kiVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i6 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kiVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                kiVar.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kiVar.i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        jiVar.q = f(typedArrayObtainStyledAttributes, index2, jiVar.q);
                        break;
                    case 92:
                        jiVar.r = f(typedArrayObtainStyledAttributes, index2, jiVar.r);
                        break;
                    case 93:
                        jiVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.L);
                        break;
                    case 94:
                        jiVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jiVar.S);
                        break;
                    case 95:
                        g(jiVar, typedArrayObtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(jiVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        jiVar.o0 = typedArrayObtainStyledAttributes.getInt(index2, jiVar.o0);
                        break;
                }
            }
            if (jiVar.j0 != null) {
                jiVar.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iiVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ci ciVar, String str) {
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
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        ciVar.G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap map;
        ni niVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = niVar.c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (niVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map2.containsKey(Integer.valueOf(id))) {
                    hashSet2.remove(Integer.valueOf(id));
                    ii iiVar = (ii) map2.get(Integer.valueOf(id));
                    if (iiVar != null) {
                        li liVar = iiVar.b;
                        ji jiVar = iiVar.d;
                        mi miVar = iiVar.e;
                        if (childAt instanceof p9) {
                            jiVar.h0 = 1;
                            p9 p9Var = (p9) childAt;
                            p9Var.setId(id);
                            p9Var.setType(jiVar.f0);
                            p9Var.setMargin(jiVar.g0);
                            p9Var.setAllowsGoneWidget(jiVar.n0);
                            int[] iArr = jiVar.i0;
                            if (iArr != null) {
                                p9Var.setReferencedIds(iArr);
                            } else {
                                String str2 = jiVar.j0;
                                if (str2 != null) {
                                    int[] iArrC = c(p9Var, str2);
                                    jiVar.i0 = iArrC;
                                    p9Var.setReferencedIds(iArrC);
                                }
                            }
                        }
                        ci ciVar = (ci) childAt.getLayoutParams();
                        ciVar.a();
                        iiVar.a(ciVar);
                        HashMap map3 = iiVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : map3.keySet()) {
                            xh xhVar = (xh) map3.get(str3);
                            HashSet hashSet3 = hashSet2;
                            if (xhVar.a) {
                                i2 = i3;
                                str = str3;
                            } else {
                                i2 = i3;
                                str = "set" + str3;
                            }
                            try {
                                int iS = ex0.s(xhVar.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iS) {
                                    case 0:
                                        map = map3;
                                        cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(xhVar.c));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(xhVar.d));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(xhVar.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(xhVar.g);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            i3 = i2;
                                            map3 = map;
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                            hashSet2 = hashSet3;
                                            i3 = i2;
                                            map3 = map;
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName(), e);
                                            hashSet2 = hashSet3;
                                            i3 = i2;
                                            map3 = map;
                                        }
                                    case 4:
                                        cls.getMethod(str, CharSequence.class).invoke(childAt, xhVar.e);
                                        map = map3;
                                        break;
                                    case 5:
                                        cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(xhVar.f));
                                        map = map3;
                                        break;
                                    case 6:
                                        cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(xhVar.d));
                                        map = map3;
                                        break;
                                    case 7:
                                        cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(xhVar.c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                map = map3;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                map = map3;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                map = map3;
                            }
                            hashSet2 = hashSet3;
                            i3 = i2;
                            map3 = map;
                        }
                        hashSet = hashSet2;
                        i = i3;
                        childAt.setLayoutParams(ciVar);
                        if (liVar.b == 0) {
                            childAt.setVisibility(liVar.a);
                        }
                        childAt.setAlpha(liVar.c);
                        childAt.setRotation(miVar.a);
                        childAt.setRotationX(miVar.b);
                        childAt.setRotationY(miVar.c);
                        childAt.setScaleX(miVar.d);
                        childAt.setScaleY(miVar.e);
                        if (miVar.h != -1) {
                            if (((View) childAt.getParent()).findViewById(miVar.h) != null) {
                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(miVar.f)) {
                                childAt.setPivotX(miVar.f);
                            }
                            if (!Float.isNaN(miVar.g)) {
                                childAt.setPivotY(miVar.g);
                            }
                        }
                        childAt.setTranslationX(miVar.i);
                        childAt.setTranslationY(miVar.j);
                        childAt.setTranslationZ(miVar.k);
                        if (miVar.l) {
                            childAt.setElevation(miVar.m);
                        }
                    }
                }
                i3 = i + 1;
                niVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            niVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ii iiVar2 = (ii) map2.get(num);
            if (iiVar2 != null) {
                ji jiVar2 = iiVar2.d;
                if (jiVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    p9 p9Var2 = new p9(context);
                    p9Var2.f = new int[32];
                    p9Var2.l = new HashMap();
                    p9Var2.h = context;
                    p9Var2.h(null);
                    p9Var2.setVisibility(8);
                    p9Var2.setId(num.intValue());
                    int[] iArr2 = jiVar2.i0;
                    if (iArr2 != null) {
                        p9Var2.setReferencedIds(iArr2);
                    } else {
                        String str4 = jiVar2.j0;
                        if (str4 != null) {
                            int[] iArrC2 = c(p9Var2, str4);
                            jiVar2.i0 = iArrC2;
                            p9Var2.setReferencedIds(iArrC2);
                        }
                    }
                    p9Var2.setType(jiVar2.f0);
                    p9Var2.setMargin(jiVar2.g0);
                    ci ciVarG = ConstraintLayout.g();
                    p9Var2.k();
                    iiVar2.a(ciVarG);
                    constraintLayout.addView(p9Var2, ciVarG);
                }
                if (jiVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ci ciVarG2 = ConstraintLayout.g();
                    iiVar2.a(ciVarG2);
                    constraintLayout.addView(guideline, ciVarG2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof ai) {
                ((ai) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        ni niVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = niVar.c;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ci ciVar = (ci) childAt.getLayoutParams();
            int id = childAt.getId();
            if (niVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new ii());
            }
            ii iiVar = (ii) map2.get(Integer.valueOf(id));
            if (iiVar == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                li liVar = iiVar.b;
                ji jiVar = iiVar.d;
                mi miVar = iiVar.e;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = niVar.a;
                for (String str : map4.keySet()) {
                    xh xhVar = (xh) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new xh(xhVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new xh(xhVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e4);
                    }
                    map4 = map5;
                }
                iiVar.f = map3;
                iiVar.a = id;
                jiVar.h = ciVar.e;
                jiVar.i = ciVar.f;
                jiVar.j = ciVar.g;
                jiVar.k = ciVar.h;
                jiVar.l = ciVar.i;
                jiVar.m = ciVar.j;
                jiVar.n = ciVar.k;
                jiVar.o = ciVar.l;
                jiVar.p = ciVar.m;
                jiVar.q = ciVar.n;
                jiVar.r = ciVar.o;
                jiVar.s = ciVar.s;
                jiVar.t = ciVar.t;
                jiVar.u = ciVar.u;
                jiVar.v = ciVar.v;
                jiVar.w = ciVar.E;
                jiVar.x = ciVar.F;
                jiVar.y = ciVar.G;
                jiVar.z = ciVar.p;
                jiVar.A = ciVar.q;
                jiVar.B = ciVar.r;
                jiVar.C = ciVar.T;
                jiVar.D = ciVar.U;
                jiVar.E = ciVar.V;
                jiVar.f = ciVar.c;
                jiVar.d = ciVar.a;
                jiVar.e = ciVar.b;
                jiVar.b = ((ViewGroup.MarginLayoutParams) ciVar).width;
                jiVar.c = ((ViewGroup.MarginLayoutParams) ciVar).height;
                jiVar.F = ((ViewGroup.MarginLayoutParams) ciVar).leftMargin;
                jiVar.G = ((ViewGroup.MarginLayoutParams) ciVar).rightMargin;
                jiVar.H = ((ViewGroup.MarginLayoutParams) ciVar).topMargin;
                jiVar.I = ((ViewGroup.MarginLayoutParams) ciVar).bottomMargin;
                jiVar.L = ciVar.D;
                jiVar.T = ciVar.I;
                jiVar.U = ciVar.H;
                jiVar.W = ciVar.K;
                jiVar.V = ciVar.J;
                jiVar.l0 = ciVar.W;
                jiVar.m0 = ciVar.X;
                jiVar.X = ciVar.L;
                jiVar.Y = ciVar.M;
                jiVar.Z = ciVar.P;
                jiVar.a0 = ciVar.Q;
                jiVar.b0 = ciVar.N;
                jiVar.c0 = ciVar.O;
                jiVar.d0 = ciVar.R;
                jiVar.e0 = ciVar.S;
                jiVar.k0 = ciVar.Y;
                jiVar.N = ciVar.x;
                jiVar.P = ciVar.z;
                jiVar.M = ciVar.w;
                jiVar.O = ciVar.y;
                jiVar.R = ciVar.A;
                jiVar.Q = ciVar.B;
                jiVar.S = ciVar.C;
                jiVar.o0 = ciVar.Z;
                jiVar.J = ciVar.getMarginEnd();
                jiVar.K = ciVar.getMarginStart();
                liVar.a = childAt.getVisibility();
                liVar.c = childAt.getAlpha();
                miVar.a = childAt.getRotation();
                miVar.b = childAt.getRotationX();
                miVar.c = childAt.getRotationY();
                miVar.d = childAt.getScaleX();
                miVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    miVar.f = pivotX;
                    miVar.g = pivotY;
                }
                miVar.i = childAt.getTranslationX();
                miVar.j = childAt.getTranslationY();
                miVar.k = childAt.getTranslationZ();
                if (miVar.l) {
                    miVar.m = childAt.getElevation();
                }
                if (childAt instanceof p9) {
                    p9 p9Var = (p9) childAt;
                    jiVar.n0 = p9Var.getAllowsGoneWidget();
                    jiVar.i0 = p9Var.getReferencedIds();
                    jiVar.f0 = p9Var.getType();
                    jiVar.g0 = p9Var.getMargin();
                }
            }
            i3 = i2 + 1;
            niVar = this;
            childCount = i;
            map2 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ii iiVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iiVarD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(iiVarD.a), iiVarD);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
