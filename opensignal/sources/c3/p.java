package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3288d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f3289e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f3290f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3291a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3292b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3293c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3289e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3290f = sparseIntArray2;
        sparseIntArray.append(s.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(s.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(s.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(s.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(s.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(s.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(s.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(s.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(s.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(s.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(s.Constraint_android_orientation, 27);
        sparseIntArray.append(s.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(s.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(s.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(s.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(s.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(s.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(s.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(s.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(s.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(s.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(s.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(s.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(s.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(s.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(s.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(s.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(s.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(s.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(s.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(s.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(s.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(s.Constraint_android_layout_width, 23);
        sparseIntArray.append(s.Constraint_android_layout_height, 21);
        sparseIntArray.append(s.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(s.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(s.Constraint_android_visibility, 22);
        sparseIntArray.append(s.Constraint_android_alpha, 43);
        sparseIntArray.append(s.Constraint_android_elevation, 44);
        sparseIntArray.append(s.Constraint_android_rotationX, 45);
        sparseIntArray.append(s.Constraint_android_rotationY, 46);
        sparseIntArray.append(s.Constraint_android_rotation, 60);
        sparseIntArray.append(s.Constraint_android_scaleX, 47);
        sparseIntArray.append(s.Constraint_android_scaleY, 48);
        sparseIntArray.append(s.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(s.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(s.Constraint_android_translationX, 51);
        sparseIntArray.append(s.Constraint_android_translationY, 52);
        sparseIntArray.append(s.Constraint_android_translationZ, 53);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(s.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(s.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(s.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(s.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(s.Constraint_transitionEasing, 65);
        sparseIntArray.append(s.Constraint_drawPath, 66);
        sparseIntArray.append(s.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(s.Constraint_motionStagger, 79);
        sparseIntArray.append(s.Constraint_android_id, 38);
        sparseIntArray.append(s.Constraint_motionProgress, 68);
        sparseIntArray.append(s.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(s.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(s.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(s.Constraint_chainUseRtl, 71);
        sparseIntArray.append(s.Constraint_barrierDirection, 72);
        sparseIntArray.append(s.Constraint_barrierMargin, 73);
        sparseIntArray.append(s.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(s.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(s.Constraint_pathMotionArc, 76);
        sparseIntArray.append(s.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(s.Constraint_visibilityMode, 78);
        sparseIntArray.append(s.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(s.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(s.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(s.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(s.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(s.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(s.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(s.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(s.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(s.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(s.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(s.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(s.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(s.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(s.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(s.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(s.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(s.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(s.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(s.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(s.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(s.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(s.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(s.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(s.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(s.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(s.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(s.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(s.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(s.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(s.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(s.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(s.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(s.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(s.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(s.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(s.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(s.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(s.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(s.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(s.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(s.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(s.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(s.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(s.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(s.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(s.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int[] e(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = r.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.I;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.I.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static k f(Context context, AttributeSet attributeSet, boolean z10) {
        int i10;
        int i11;
        k kVar = new k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? s.ConstraintOverride : s.Constraint);
        n nVar = kVar.f3218b;
        o oVar = kVar.f3221e;
        m mVar = kVar.f3219c;
        l lVar = kVar.f3220d;
        int[] iArr = f3288d;
        String[] strArr = y2.a.f25817a;
        SparseIntArray sparseIntArray = f3289e;
        if (z10) {
            j jVar = new j();
            jVar.f3207a = new int[10];
            jVar.f3208b = new int[10];
            jVar.f3209c = 0;
            jVar.f3210d = new int[10];
            jVar.f3211e = new float[10];
            jVar.f3212f = 0;
            jVar.f3213g = new int[5];
            jVar.f3214h = new String[5];
            jVar.f3215i = 0;
            jVar.j = new int[4];
            jVar.k = new boolean[4];
            jVar.f3216l = 0;
            mVar.getClass();
            lVar.getClass();
            oVar.getClass();
            int i12 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i11) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = i12;
                switch (f3290f.get(index)) {
                    case 2:
                        i11 = indexCount;
                        jVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.I));
                        continue;
                        i12 = i13 + 1;
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
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i11 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        e0.p("ConstraintSet", sb2.toString());
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        i11 = indexCount;
                        jVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i12 = i13 + 1;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i11 = indexCount;
                        jVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.C));
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        i11 = indexCount;
                        jVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.D));
                        break;
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        i11 = indexCount;
                        jVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.J));
                        break;
                    case 11:
                        i11 = indexCount;
                        jVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.P));
                        break;
                    case 12:
                        i11 = indexCount;
                        jVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.Q));
                        break;
                    case 13:
                        i11 = indexCount;
                        jVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.M));
                        break;
                    case 14:
                        i11 = indexCount;
                        jVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.O));
                        break;
                    case 15:
                        i11 = indexCount;
                        jVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.R));
                        break;
                    case 16:
                        i11 = indexCount;
                        jVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.N));
                        break;
                    case 17:
                        i11 = indexCount;
                        jVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f3230d));
                        break;
                    case 18:
                        i11 = indexCount;
                        jVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, lVar.f3232e));
                        break;
                    case 19:
                        i11 = indexCount;
                        jVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, lVar.f3234f));
                        break;
                    case 20:
                        i11 = indexCount;
                        jVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, lVar.f3259w));
                        break;
                    case 21:
                        i11 = indexCount;
                        jVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f3228c));
                        break;
                    case 22:
                        i11 = indexCount;
                        jVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, nVar.f3272a)]);
                        break;
                    case 23:
                        i11 = indexCount;
                        jVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, lVar.f3226b));
                        break;
                    case 24:
                        i11 = indexCount;
                        jVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.F));
                        break;
                    case 27:
                        i11 = indexCount;
                        jVar.b(27, typedArrayObtainStyledAttributes.getInt(index, lVar.E));
                        break;
                    case 28:
                        i11 = indexCount;
                        jVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.G));
                        break;
                    case 31:
                        i11 = indexCount;
                        jVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.K));
                        break;
                    case 34:
                        i11 = indexCount;
                        jVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.H));
                        break;
                    case 37:
                        i11 = indexCount;
                        jVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, lVar.f3260x));
                        break;
                    case 38:
                        i11 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, kVar.f3217a);
                        kVar.f3217a = resourceId;
                        jVar.b(38, resourceId);
                        break;
                    case 39:
                        i11 = indexCount;
                        jVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, lVar.U));
                        break;
                    case 40:
                        i11 = indexCount;
                        jVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, lVar.T));
                        break;
                    case 41:
                        i11 = indexCount;
                        jVar.b(41, typedArrayObtainStyledAttributes.getInt(index, lVar.V));
                        break;
                    case 42:
                        i11 = indexCount;
                        jVar.b(42, typedArrayObtainStyledAttributes.getInt(index, lVar.W));
                        break;
                    case 43:
                        i11 = indexCount;
                        jVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, nVar.f3274c));
                        break;
                    case 44:
                        i11 = indexCount;
                        jVar.d(44, true);
                        jVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, oVar.f3287m));
                        break;
                    case 45:
                        i11 = indexCount;
                        jVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, oVar.f3278b));
                        break;
                    case 46:
                        i11 = indexCount;
                        jVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, oVar.f3279c));
                        break;
                    case 47:
                        i11 = indexCount;
                        jVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, oVar.f3280d));
                        break;
                    case 48:
                        i11 = indexCount;
                        jVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, oVar.f3281e));
                        break;
                    case 49:
                        i11 = indexCount;
                        jVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, oVar.f3282f));
                        break;
                    case 50:
                        i11 = indexCount;
                        jVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, oVar.f3283g));
                        break;
                    case 51:
                        i11 = indexCount;
                        jVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, oVar.f3285i));
                        break;
                    case 52:
                        i11 = indexCount;
                        jVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, oVar.j));
                        break;
                    case 53:
                        i11 = indexCount;
                        jVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, oVar.k));
                        break;
                    case 54:
                        i11 = indexCount;
                        jVar.b(54, typedArrayObtainStyledAttributes.getInt(index, lVar.X));
                        break;
                    case 55:
                        i11 = indexCount;
                        jVar.b(55, typedArrayObtainStyledAttributes.getInt(index, lVar.Y));
                        break;
                    case 56:
                        i11 = indexCount;
                        jVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.Z));
                        break;
                    case 57:
                        i11 = indexCount;
                        jVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f3225a0));
                        break;
                    case 58:
                        i11 = indexCount;
                        jVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f3227b0));
                        break;
                    case 59:
                        i11 = indexCount;
                        jVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f3229c0));
                        break;
                    case 60:
                        i11 = indexCount;
                        jVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, oVar.f3277a));
                        break;
                    case 62:
                        i11 = indexCount;
                        jVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.A));
                        break;
                    case 63:
                        i11 = indexCount;
                        jVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, lVar.B));
                        break;
                    case 64:
                        i11 = indexCount;
                        jVar.b(64, h(typedArrayObtainStyledAttributes, index, mVar.f3263a));
                        break;
                    case 65:
                        i11 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            jVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            jVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i11 = indexCount;
                        jVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i11 = indexCount;
                        jVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, mVar.f3267e));
                        break;
                    case 68:
                        i11 = indexCount;
                        jVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, nVar.f3275d));
                        break;
                    case 69:
                        i11 = indexCount;
                        jVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i11 = indexCount;
                        jVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i11 = indexCount;
                        e0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i11 = indexCount;
                        jVar.b(72, typedArrayObtainStyledAttributes.getInt(index, lVar.f3235f0));
                        break;
                    case 73:
                        i11 = indexCount;
                        jVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.f3237g0));
                        break;
                    case 74:
                        i11 = indexCount;
                        jVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i11 = indexCount;
                        jVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, lVar.f3249n0));
                        break;
                    case 76:
                        i11 = indexCount;
                        jVar.b(76, typedArrayObtainStyledAttributes.getInt(index, mVar.f3265c));
                        break;
                    case 77:
                        i11 = indexCount;
                        jVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i11 = indexCount;
                        jVar.b(78, typedArrayObtainStyledAttributes.getInt(index, nVar.f3273b));
                        break;
                    case 79:
                        i11 = indexCount;
                        jVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, mVar.f3266d));
                        break;
                    case 80:
                        i11 = indexCount;
                        jVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, lVar.f3245l0));
                        break;
                    case 81:
                        i11 = indexCount;
                        jVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, lVar.f3247m0));
                        break;
                    case 82:
                        i11 = indexCount;
                        jVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, mVar.f3264b));
                        break;
                    case 83:
                        i11 = indexCount;
                        jVar.b(83, h(typedArrayObtainStyledAttributes, index, oVar.f3284h));
                        break;
                    case 84:
                        i11 = indexCount;
                        jVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, mVar.f3269g));
                        break;
                    case 85:
                        i11 = indexCount;
                        jVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, mVar.f3268f));
                        break;
                    case 86:
                        i11 = indexCount;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            mVar.f3271i = resourceId2;
                            jVar.b(89, resourceId2);
                            if (mVar.f3271i != -1) {
                                jVar.b(88, -2);
                                break;
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            mVar.f3270h = string;
                            jVar.c(90, string);
                            if (mVar.f3270h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                mVar.f3271i = resourceId3;
                                jVar.b(89, resourceId3);
                                jVar.b(88, -2);
                                break;
                            } else {
                                jVar.b(88, -1);
                                break;
                            }
                        } else {
                            jVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, mVar.f3271i));
                            break;
                        }
                        break;
                    case 87:
                        i11 = indexCount;
                        e0.p("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i11 = indexCount;
                        jVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.L));
                        break;
                    case 94:
                        i11 = indexCount;
                        jVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, lVar.S));
                        break;
                    case 95:
                        i11 = indexCount;
                        i(jVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i11 = indexCount;
                        i(jVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i11 = indexCount;
                        jVar.b(97, typedArrayObtainStyledAttributes.getInt(index, lVar.f3251o0));
                        break;
                    case 98:
                        i11 = indexCount;
                        int i15 = b3.a.M;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            kVar.f3217a = typedArrayObtainStyledAttributes.getResourceId(index, kVar.f3217a);
                            break;
                        }
                    case 99:
                        i11 = indexCount;
                        jVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, lVar.f3236g));
                        break;
                }
                i12 = i13 + 1;
            }
        } else {
            int i16 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i16 < indexCount2; indexCount2 = i10) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i16);
                if (index2 != s.Constraint_android_id && s.Constraint_android_layout_marginStart != index2 && s.Constraint_android_layout_marginEnd != index2) {
                    mVar.getClass();
                    lVar.getClass();
                    oVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i10 = indexCount2;
                        lVar.f3252p = h(typedArrayObtainStyledAttributes, index2, lVar.f3252p);
                        continue;
                        i16++;
                    case 2:
                        i10 = indexCount2;
                        lVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.I);
                        continue;
                        i16++;
                    case 3:
                        i10 = indexCount2;
                        lVar.f3250o = h(typedArrayObtainStyledAttributes, index2, lVar.f3250o);
                        continue;
                        i16++;
                    case 4:
                        i10 = indexCount2;
                        lVar.f3248n = h(typedArrayObtainStyledAttributes, index2, lVar.f3248n);
                        continue;
                        i16++;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        i10 = indexCount2;
                        lVar.f3261y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i16++;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i10 = indexCount2;
                        lVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lVar.C);
                        continue;
                        i16++;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        i10 = indexCount2;
                        lVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lVar.D);
                        continue;
                        i16++;
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        i10 = indexCount2;
                        lVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.J);
                        continue;
                        i16++;
                    case 9:
                        i10 = indexCount2;
                        lVar.f3258v = h(typedArrayObtainStyledAttributes, index2, lVar.f3258v);
                        continue;
                        i16++;
                    case 10:
                        i10 = indexCount2;
                        lVar.f3257u = h(typedArrayObtainStyledAttributes, index2, lVar.f3257u);
                        continue;
                        i16++;
                    case 11:
                        i10 = indexCount2;
                        lVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.P);
                        continue;
                        i16++;
                    case 12:
                        i10 = indexCount2;
                        lVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.Q);
                        continue;
                        i16++;
                    case 13:
                        i10 = indexCount2;
                        lVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.M);
                        continue;
                        i16++;
                    case 14:
                        i10 = indexCount2;
                        lVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.O);
                        continue;
                        i16++;
                    case 15:
                        i10 = indexCount2;
                        lVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.R);
                        continue;
                        i16++;
                    case 16:
                        i10 = indexCount2;
                        lVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.N);
                        continue;
                        i16++;
                    case 17:
                        i10 = indexCount2;
                        lVar.f3230d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f3230d);
                        continue;
                        i16++;
                    case 18:
                        i10 = indexCount2;
                        lVar.f3232e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, lVar.f3232e);
                        continue;
                        i16++;
                    case 19:
                        i10 = indexCount2;
                        lVar.f3234f = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f3234f);
                        continue;
                        i16++;
                    case 20:
                        i10 = indexCount2;
                        lVar.f3259w = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f3259w);
                        continue;
                        i16++;
                    case 21:
                        i10 = indexCount2;
                        lVar.f3228c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, lVar.f3228c);
                        continue;
                        i16++;
                    case 22:
                        i10 = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.getInt(index2, nVar.f3272a);
                        nVar.f3272a = i17;
                        nVar.f3272a = iArr[i17];
                        continue;
                        i16++;
                    case 23:
                        i10 = indexCount2;
                        lVar.f3226b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, lVar.f3226b);
                        continue;
                        i16++;
                    case 24:
                        i10 = indexCount2;
                        lVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.F);
                        continue;
                        i16++;
                    case 25:
                        i10 = indexCount2;
                        lVar.f3238h = h(typedArrayObtainStyledAttributes, index2, lVar.f3238h);
                        continue;
                        i16++;
                    case 26:
                        i10 = indexCount2;
                        lVar.f3240i = h(typedArrayObtainStyledAttributes, index2, lVar.f3240i);
                        continue;
                        i16++;
                    case 27:
                        i10 = indexCount2;
                        lVar.E = typedArrayObtainStyledAttributes.getInt(index2, lVar.E);
                        continue;
                        i16++;
                    case 28:
                        i10 = indexCount2;
                        lVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.G);
                        continue;
                        i16++;
                    case 29:
                        i10 = indexCount2;
                        lVar.j = h(typedArrayObtainStyledAttributes, index2, lVar.j);
                        continue;
                        i16++;
                    case 30:
                        i10 = indexCount2;
                        lVar.k = h(typedArrayObtainStyledAttributes, index2, lVar.k);
                        continue;
                        i16++;
                    case 31:
                        i10 = indexCount2;
                        lVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.K);
                        continue;
                        i16++;
                    case 32:
                        i10 = indexCount2;
                        lVar.f3255s = h(typedArrayObtainStyledAttributes, index2, lVar.f3255s);
                        continue;
                        i16++;
                    case 33:
                        i10 = indexCount2;
                        lVar.f3256t = h(typedArrayObtainStyledAttributes, index2, lVar.f3256t);
                        continue;
                        i16++;
                    case 34:
                        i10 = indexCount2;
                        lVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.H);
                        continue;
                        i16++;
                    case 35:
                        i10 = indexCount2;
                        lVar.f3246m = h(typedArrayObtainStyledAttributes, index2, lVar.f3246m);
                        continue;
                        i16++;
                    case 36:
                        i10 = indexCount2;
                        lVar.f3244l = h(typedArrayObtainStyledAttributes, index2, lVar.f3244l);
                        continue;
                        i16++;
                    case 37:
                        i10 = indexCount2;
                        lVar.f3260x = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f3260x);
                        continue;
                        i16++;
                    case 38:
                        i10 = indexCount2;
                        kVar.f3217a = typedArrayObtainStyledAttributes.getResourceId(index2, kVar.f3217a);
                        continue;
                        i16++;
                    case 39:
                        i10 = indexCount2;
                        lVar.U = typedArrayObtainStyledAttributes.getFloat(index2, lVar.U);
                        continue;
                        i16++;
                    case 40:
                        i10 = indexCount2;
                        lVar.T = typedArrayObtainStyledAttributes.getFloat(index2, lVar.T);
                        continue;
                        i16++;
                    case 41:
                        i10 = indexCount2;
                        lVar.V = typedArrayObtainStyledAttributes.getInt(index2, lVar.V);
                        continue;
                        i16++;
                    case 42:
                        i10 = indexCount2;
                        lVar.W = typedArrayObtainStyledAttributes.getInt(index2, lVar.W);
                        continue;
                        i16++;
                    case 43:
                        i10 = indexCount2;
                        nVar.f3274c = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f3274c);
                        continue;
                        i16++;
                    case 44:
                        i10 = indexCount2;
                        oVar.f3286l = true;
                        oVar.f3287m = typedArrayObtainStyledAttributes.getDimension(index2, oVar.f3287m);
                        continue;
                        i16++;
                    case 45:
                        i10 = indexCount2;
                        oVar.f3278b = typedArrayObtainStyledAttributes.getFloat(index2, oVar.f3278b);
                        continue;
                        i16++;
                    case 46:
                        i10 = indexCount2;
                        oVar.f3279c = typedArrayObtainStyledAttributes.getFloat(index2, oVar.f3279c);
                        continue;
                        i16++;
                    case 47:
                        i10 = indexCount2;
                        oVar.f3280d = typedArrayObtainStyledAttributes.getFloat(index2, oVar.f3280d);
                        continue;
                        i16++;
                    case 48:
                        i10 = indexCount2;
                        oVar.f3281e = typedArrayObtainStyledAttributes.getFloat(index2, oVar.f3281e);
                        continue;
                        i16++;
                    case 49:
                        i10 = indexCount2;
                        oVar.f3282f = typedArrayObtainStyledAttributes.getDimension(index2, oVar.f3282f);
                        continue;
                        i16++;
                    case 50:
                        i10 = indexCount2;
                        oVar.f3283g = typedArrayObtainStyledAttributes.getDimension(index2, oVar.f3283g);
                        continue;
                        i16++;
                    case 51:
                        i10 = indexCount2;
                        oVar.f3285i = typedArrayObtainStyledAttributes.getDimension(index2, oVar.f3285i);
                        continue;
                        i16++;
                    case 52:
                        i10 = indexCount2;
                        oVar.j = typedArrayObtainStyledAttributes.getDimension(index2, oVar.j);
                        continue;
                        i16++;
                    case 53:
                        i10 = indexCount2;
                        oVar.k = typedArrayObtainStyledAttributes.getDimension(index2, oVar.k);
                        continue;
                        i16++;
                    case 54:
                        i10 = indexCount2;
                        lVar.X = typedArrayObtainStyledAttributes.getInt(index2, lVar.X);
                        continue;
                        i16++;
                    case 55:
                        i10 = indexCount2;
                        lVar.Y = typedArrayObtainStyledAttributes.getInt(index2, lVar.Y);
                        continue;
                        i16++;
                    case 56:
                        i10 = indexCount2;
                        lVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.Z);
                        continue;
                        i16++;
                    case 57:
                        i10 = indexCount2;
                        lVar.f3225a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.f3225a0);
                        continue;
                        i16++;
                    case 58:
                        i10 = indexCount2;
                        lVar.f3227b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.f3227b0);
                        continue;
                        i16++;
                    case 59:
                        i10 = indexCount2;
                        lVar.f3229c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.f3229c0);
                        continue;
                        i16++;
                    case 60:
                        i10 = indexCount2;
                        oVar.f3277a = typedArrayObtainStyledAttributes.getFloat(index2, oVar.f3277a);
                        continue;
                        i16++;
                    case 61:
                        i10 = indexCount2;
                        lVar.f3262z = h(typedArrayObtainStyledAttributes, index2, lVar.f3262z);
                        continue;
                        i16++;
                    case 62:
                        i10 = indexCount2;
                        lVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.A);
                        continue;
                        i16++;
                    case 63:
                        i10 = indexCount2;
                        lVar.B = typedArrayObtainStyledAttributes.getFloat(index2, lVar.B);
                        continue;
                        i16++;
                    case 64:
                        i10 = indexCount2;
                        mVar.f3263a = h(typedArrayObtainStyledAttributes, index2, mVar.f3263a);
                        continue;
                        i16++;
                    case 65:
                        i10 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            mVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            mVar.getClass();
                            i16++;
                        }
                    case 66:
                        i10 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        mVar.getClass();
                        continue;
                        i16++;
                    case 67:
                        i10 = indexCount2;
                        mVar.f3267e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f3267e);
                        break;
                    case 68:
                        i10 = indexCount2;
                        nVar.f3275d = typedArrayObtainStyledAttributes.getFloat(index2, nVar.f3275d);
                        break;
                    case 69:
                        i10 = indexCount2;
                        lVar.f3231d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i10 = indexCount2;
                        lVar.f3233e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i10 = indexCount2;
                        e0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount2;
                        lVar.f3235f0 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f3235f0);
                        break;
                    case 73:
                        i10 = indexCount2;
                        lVar.f3237g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.f3237g0);
                        break;
                    case 74:
                        i10 = indexCount2;
                        lVar.f3242j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i10 = indexCount2;
                        lVar.f3249n0 = typedArrayObtainStyledAttributes.getBoolean(index2, lVar.f3249n0);
                        break;
                    case 76:
                        i10 = indexCount2;
                        mVar.f3265c = typedArrayObtainStyledAttributes.getInt(index2, mVar.f3265c);
                        break;
                    case 77:
                        i10 = indexCount2;
                        lVar.f3243k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i10 = indexCount2;
                        nVar.f3273b = typedArrayObtainStyledAttributes.getInt(index2, nVar.f3273b);
                        break;
                    case 79:
                        i10 = indexCount2;
                        mVar.f3266d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f3266d);
                        break;
                    case 80:
                        i10 = indexCount2;
                        lVar.f3245l0 = typedArrayObtainStyledAttributes.getBoolean(index2, lVar.f3245l0);
                        break;
                    case 81:
                        i10 = indexCount2;
                        lVar.f3247m0 = typedArrayObtainStyledAttributes.getBoolean(index2, lVar.f3247m0);
                        break;
                    case 82:
                        i10 = indexCount2;
                        mVar.f3264b = typedArrayObtainStyledAttributes.getInteger(index2, mVar.f3264b);
                        break;
                    case 83:
                        i10 = indexCount2;
                        oVar.f3284h = h(typedArrayObtainStyledAttributes, index2, oVar.f3284h);
                        break;
                    case 84:
                        i10 = indexCount2;
                        mVar.f3269g = typedArrayObtainStyledAttributes.getInteger(index2, mVar.f3269g);
                        break;
                    case 85:
                        i10 = indexCount2;
                        mVar.f3268f = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f3268f);
                        break;
                    case 86:
                        i10 = indexCount2;
                        int i18 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i18 == 1) {
                            mVar.f3271i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i18 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            mVar.f3270h = string2;
                            if (string2.indexOf("/") > 0) {
                                mVar.f3271i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, mVar.f3271i);
                            break;
                        }
                        break;
                    case 87:
                        i10 = indexCount2;
                        e0.p("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        e0.p("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i10 = indexCount2;
                        lVar.f3253q = h(typedArrayObtainStyledAttributes, index2, lVar.f3253q);
                        break;
                    case 92:
                        i10 = indexCount2;
                        lVar.f3254r = h(typedArrayObtainStyledAttributes, index2, lVar.f3254r);
                        break;
                    case 93:
                        i10 = indexCount2;
                        lVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.L);
                        break;
                    case 94:
                        i10 = indexCount2;
                        lVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, lVar.S);
                        break;
                    case 95:
                        i10 = indexCount2;
                        i(lVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i16++;
                    case 96:
                        i10 = indexCount2;
                        i(lVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i10 = indexCount2;
                        lVar.f3251o0 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f3251o0);
                        break;
                }
                i16++;
            }
            if (lVar.f3242j0 != null) {
                lVar.f3241i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return kVar;
    }

    public static int h(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.p.i(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void j(f fVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
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
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        fVar.G = str;
    }

    public static String k(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return "baseline";
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "start";
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i10;
        HashMap map;
        String resourceEntryName;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = pVar.f3293c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                e0.p("ConstraintSet", sb2.toString());
            } else {
                if (pVar.f3292b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && map2.containsKey(Integer.valueOf(id2))) {
                    hashSet2.remove(Integer.valueOf(id2));
                    k kVar = (k) map2.get(Integer.valueOf(id2));
                    if (kVar != null) {
                        n nVar = kVar.f3218b;
                        l lVar = kVar.f3220d;
                        o oVar = kVar.f3221e;
                        if (childAt instanceof Barrier) {
                            lVar.f3239h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(lVar.f3235f0);
                            barrier.setMargin(lVar.f3237g0);
                            barrier.setAllowsGoneWidget(lVar.f3249n0);
                            int[] iArr = lVar.f3241i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = lVar.f3242j0;
                                if (str != null) {
                                    int[] iArrE = e(barrier, str);
                                    lVar.f3241i0 = iArrE;
                                    barrier.setReferencedIds(iArrE);
                                }
                            }
                        }
                        f fVar = (f) childAt.getLayoutParams();
                        fVar.a();
                        kVar.a(fVar);
                        HashMap map3 = kVar.f3222f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map3.keySet()) {
                            b bVar = (b) map3.get(str2);
                            HashSet hashSet3 = hashSet2;
                            String strP = !bVar.f3136a ? c7.a.p("set", str2) : str2;
                            int i12 = i11;
                            try {
                                int iOrdinal = bVar.f3137b.ordinal();
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (iOrdinal) {
                                    case 0:
                                        map = map3;
                                        cls.getMethod(strP, cls3).invoke(childAt, Integer.valueOf(bVar.f3138c));
                                        break;
                                    case 1:
                                        map = map3;
                                        cls.getMethod(strP, cls2).invoke(childAt, Float.valueOf(bVar.f3139d));
                                        break;
                                    case 2:
                                        map = map3;
                                        cls.getMethod(strP, cls3).invoke(childAt, Integer.valueOf(bVar.f3142g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strP, Drawable.class);
                                        map = map3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f3142g);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            StringBuilder sbU = c7.a.u(" Custom Attribute \"", str2, "\" not found on ");
                                            sbU.append(cls.getName());
                                            e0.c("TransitionLayout", sbU.toString(), e);
                                            hashSet2 = hashSet3;
                                            i11 = i12;
                                            map3 = map;
                                        } catch (NoSuchMethodException e10) {
                                            e = e10;
                                            e0.c("TransitionLayout", cls.getName() + " must have a method " + strP, e);
                                            hashSet2 = hashSet3;
                                            i11 = i12;
                                            map3 = map;
                                        } catch (InvocationTargetException e11) {
                                            e = e11;
                                            StringBuilder sbU2 = c7.a.u(" Custom Attribute \"", str2, "\" not found on ");
                                            sbU2.append(cls.getName());
                                            e0.c("TransitionLayout", sbU2.toString(), e);
                                            hashSet2 = hashSet3;
                                            i11 = i12;
                                            map3 = map;
                                        }
                                    case 4:
                                        cls.getMethod(strP, CharSequence.class).invoke(childAt, bVar.f3140e);
                                        map = map3;
                                        break;
                                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                                        cls.getMethod(strP, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f3141f));
                                        map = map3;
                                        break;
                                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                        cls.getMethod(strP, cls2).invoke(childAt, Float.valueOf(bVar.f3139d));
                                        map = map3;
                                        break;
                                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                        cls.getMethod(strP, cls3).invoke(childAt, Integer.valueOf(bVar.f3138c));
                                        map = map3;
                                        break;
                                    default:
                                        map = map3;
                                        break;
                                }
                            } catch (IllegalAccessException e12) {
                                e = e12;
                                map = map3;
                            } catch (NoSuchMethodException e13) {
                                e = e13;
                                map = map3;
                            } catch (InvocationTargetException e14) {
                                e = e14;
                                map = map3;
                            }
                            hashSet2 = hashSet3;
                            i11 = i12;
                            map3 = map;
                        }
                        hashSet = hashSet2;
                        i10 = i11;
                        childAt.setLayoutParams(fVar);
                        if (nVar.f3273b == 0) {
                            childAt.setVisibility(nVar.f3272a);
                        }
                        childAt.setAlpha(nVar.f3274c);
                        childAt.setRotation(oVar.f3277a);
                        childAt.setRotationX(oVar.f3278b);
                        childAt.setRotationY(oVar.f3279c);
                        childAt.setScaleX(oVar.f3280d);
                        childAt.setScaleY(oVar.f3281e);
                        if (oVar.f3284h != -1) {
                            if (((View) childAt.getParent()).findViewById(oVar.f3284h) != null) {
                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(oVar.f3282f)) {
                                childAt.setPivotX(oVar.f3282f);
                            }
                            if (!Float.isNaN(oVar.f3283g)) {
                                childAt.setPivotY(oVar.f3283g);
                            }
                        }
                        childAt.setTranslationX(oVar.f3285i);
                        childAt.setTranslationY(oVar.j);
                        childAt.setTranslationZ(oVar.k);
                        if (oVar.f3286l) {
                            childAt.setElevation(oVar.f3287m);
                        }
                    }
                }
                i11 = i10 + 1;
                pVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i10 = i11;
            i11 = i10 + 1;
            pVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            k kVar2 = (k) map2.get(num);
            if (kVar2 != null) {
                l lVar2 = kVar2.f3220d;
                if (lVar2.f3239h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = lVar2.f3241i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = lVar2.f3242j0;
                        if (str3 != null) {
                            int[] iArrE2 = e(barrier2, str3);
                            lVar2.f3241i0 = iArrE2;
                            barrier2.setReferencedIds(iArrE2);
                        }
                    }
                    barrier2.setType(lVar2.f3235f0);
                    barrier2.setMargin(lVar2.f3237g0);
                    f fVarG = ConstraintLayout.g();
                    barrier2.k();
                    kVar2.a(fVarG);
                    constraintLayout.addView(barrier2, fVarG);
                }
                if (lVar2.f3224a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    f fVarG2 = ConstraintLayout.g();
                    kVar2.a(fVarG2);
                    constraintLayout.addView(guideline, fVarG2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof c) {
                ((c) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(int i10, int i11) {
        k kVar;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f3293c;
        if (!map.containsKey(numValueOf) || (kVar = (k) map.get(Integer.valueOf(i10))) == null) {
            return;
        }
        l lVar = kVar.f3220d;
        switch (i11) {
            case 1:
                lVar.f3240i = -1;
                lVar.f3238h = -1;
                lVar.F = -1;
                lVar.M = Integer.MIN_VALUE;
                return;
            case 2:
                lVar.k = -1;
                lVar.j = -1;
                lVar.G = -1;
                lVar.O = Integer.MIN_VALUE;
                return;
            case 3:
                lVar.f3246m = -1;
                lVar.f3244l = -1;
                lVar.H = 0;
                lVar.N = Integer.MIN_VALUE;
                return;
            case 4:
                lVar.f3248n = -1;
                lVar.f3250o = -1;
                lVar.I = 0;
                lVar.P = Integer.MIN_VALUE;
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                lVar.f3252p = -1;
                lVar.f3253q = -1;
                lVar.f3254r = -1;
                lVar.L = 0;
                lVar.S = Integer.MIN_VALUE;
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                lVar.f3255s = -1;
                lVar.f3256t = -1;
                lVar.K = 0;
                lVar.R = Integer.MIN_VALUE;
                return;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.f3257u = -1;
                lVar.f3258v = -1;
                lVar.J = 0;
                lVar.Q = Integer.MIN_VALUE;
                return;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                lVar.B = -1.0f;
                lVar.A = -1;
                lVar.f3262z = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i10;
        HashMap map;
        int i11;
        p pVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = pVar.f3293c;
        map2.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (pVar.f3292b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id2))) {
                map2.put(Integer.valueOf(id2), new k());
            }
            k kVar = (k) map2.get(Integer.valueOf(id2));
            if (kVar == null) {
                i10 = childCount;
                map = map2;
                i11 = i12;
            } else {
                n nVar = kVar.f3218b;
                l lVar = kVar.f3220d;
                o oVar = kVar.f3221e;
                i10 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i11 = i12;
                HashMap map4 = pVar.f3291a;
                for (String str : map4.keySet()) {
                    b bVar = (b) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        StringBuilder sbU = c7.a.u(" Custom Attribute \"", str, "\" not found on ");
                        sbU.append(cls.getName());
                        e0.c("TransitionLayout", sbU.toString(), e4);
                    } catch (NoSuchMethodException e10) {
                        e0.c("TransitionLayout", cls.getName() + " must have a method " + str, e10);
                    } catch (InvocationTargetException e11) {
                        StringBuilder sbU2 = c7.a.u(" Custom Attribute \"", str, "\" not found on ");
                        sbU2.append(cls.getName());
                        e0.c("TransitionLayout", sbU2.toString(), e11);
                    }
                    map4 = map5;
                }
                kVar.f3222f = map3;
                kVar.f3217a = id2;
                lVar.f3238h = fVar.f3159e;
                lVar.f3240i = fVar.f3161f;
                lVar.j = fVar.f3163g;
                lVar.k = fVar.f3165h;
                lVar.f3244l = fVar.f3167i;
                lVar.f3246m = fVar.j;
                lVar.f3248n = fVar.k;
                lVar.f3250o = fVar.f3171l;
                lVar.f3252p = fVar.f3173m;
                lVar.f3253q = fVar.f3175n;
                lVar.f3254r = fVar.f3177o;
                lVar.f3255s = fVar.f3183s;
                lVar.f3256t = fVar.f3184t;
                lVar.f3257u = fVar.f3185u;
                lVar.f3258v = fVar.f3186v;
                lVar.f3259w = fVar.E;
                lVar.f3260x = fVar.F;
                lVar.f3261y = fVar.G;
                lVar.f3262z = fVar.f3179p;
                lVar.A = fVar.f3181q;
                lVar.B = fVar.f3182r;
                lVar.C = fVar.T;
                lVar.D = fVar.U;
                lVar.E = fVar.V;
                lVar.f3234f = fVar.f3155c;
                lVar.f3230d = fVar.f3151a;
                lVar.f3232e = fVar.f3153b;
                lVar.f3226b = ((ViewGroup.MarginLayoutParams) fVar).width;
                lVar.f3228c = ((ViewGroup.MarginLayoutParams) fVar).height;
                lVar.F = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                lVar.G = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                lVar.H = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                lVar.I = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                lVar.L = fVar.D;
                lVar.T = fVar.I;
                lVar.U = fVar.H;
                lVar.W = fVar.K;
                lVar.V = fVar.J;
                lVar.f3245l0 = fVar.W;
                lVar.f3247m0 = fVar.X;
                lVar.X = fVar.L;
                lVar.Y = fVar.M;
                lVar.Z = fVar.P;
                lVar.f3225a0 = fVar.Q;
                lVar.f3227b0 = fVar.N;
                lVar.f3229c0 = fVar.O;
                lVar.f3231d0 = fVar.R;
                lVar.f3233e0 = fVar.S;
                lVar.f3243k0 = fVar.Y;
                lVar.N = fVar.f3188x;
                lVar.P = fVar.f3190z;
                lVar.M = fVar.f3187w;
                lVar.O = fVar.f3189y;
                lVar.R = fVar.A;
                lVar.Q = fVar.B;
                lVar.S = fVar.C;
                lVar.f3251o0 = fVar.Z;
                lVar.J = fVar.getMarginEnd();
                lVar.K = fVar.getMarginStart();
                nVar.f3272a = childAt.getVisibility();
                nVar.f3274c = childAt.getAlpha();
                oVar.f3277a = childAt.getRotation();
                oVar.f3278b = childAt.getRotationX();
                oVar.f3279c = childAt.getRotationY();
                oVar.f3280d = childAt.getScaleX();
                oVar.f3281e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    oVar.f3282f = pivotX;
                    oVar.f3283g = pivotY;
                }
                oVar.f3285i = childAt.getTranslationX();
                oVar.j = childAt.getTranslationY();
                oVar.k = childAt.getTranslationZ();
                if (oVar.f3286l) {
                    oVar.f3287m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    lVar.f3249n0 = barrier.getAllowsGoneWidget();
                    lVar.f3241i0 = barrier.getReferencedIds();
                    lVar.f3235f0 = barrier.getType();
                    lVar.f3237g0 = barrier.getMargin();
                }
            }
            i12 = i11 + 1;
            pVar = this;
            childCount = i10;
            map2 = map;
        }
    }

    public final void d(int i10, int i11, int i12, int i13) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f3293c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i10), new k());
        }
        k kVar = (k) map.get(Integer.valueOf(i10));
        if (kVar == null) {
            return;
        }
        l lVar = kVar.f3220d;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    lVar.f3238h = i12;
                    lVar.f3240i = -1;
                    return;
                } else if (i13 == 2) {
                    lVar.f3240i = i12;
                    lVar.f3238h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + k(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    lVar.j = i12;
                    lVar.k = -1;
                    return;
                } else if (i13 == 2) {
                    lVar.k = i12;
                    lVar.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    lVar.f3244l = i12;
                    lVar.f3246m = -1;
                    lVar.f3252p = -1;
                    lVar.f3253q = -1;
                    lVar.f3254r = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                lVar.f3246m = i12;
                lVar.f3244l = -1;
                lVar.f3252p = -1;
                lVar.f3253q = -1;
                lVar.f3254r = -1;
                return;
            case 4:
                if (i13 == 4) {
                    lVar.f3250o = i12;
                    lVar.f3248n = -1;
                    lVar.f3252p = -1;
                    lVar.f3253q = -1;
                    lVar.f3254r = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                lVar.f3248n = i12;
                lVar.f3250o = -1;
                lVar.f3252p = -1;
                lVar.f3253q = -1;
                lVar.f3254r = -1;
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                if (i13 == 5) {
                    lVar.f3252p = i12;
                    lVar.f3250o = -1;
                    lVar.f3248n = -1;
                    lVar.f3244l = -1;
                    lVar.f3246m = -1;
                    return;
                }
                if (i13 == 3) {
                    lVar.f3253q = i12;
                    lVar.f3250o = -1;
                    lVar.f3248n = -1;
                    lVar.f3244l = -1;
                    lVar.f3246m = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
                lVar.f3254r = i12;
                lVar.f3250o = -1;
                lVar.f3248n = -1;
                lVar.f3244l = -1;
                lVar.f3246m = -1;
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i13 == 6) {
                    lVar.f3256t = i12;
                    lVar.f3255s = -1;
                    return;
                } else if (i13 == 7) {
                    lVar.f3255s = i12;
                    lVar.f3256t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                if (i13 == 7) {
                    lVar.f3258v = i12;
                    lVar.f3257u = -1;
                    return;
                } else if (i13 == 6) {
                    lVar.f3257u = i12;
                    lVar.f3258v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + k(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(k(i11) + " to " + k(i13) + " unknown");
        }
    }

    public final void g(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    k kVarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        kVarF.f3220d.f3224a = true;
                    }
                    this.f3293c.put(Integer.valueOf(kVarF.f3217a), kVarF);
                }
            }
        } catch (IOException e4) {
            e0.c("ConstraintSet", "Error parsing resource: " + i10, e4);
        } catch (XmlPullParserException e10) {
            e0.c("ConstraintSet", "Error parsing resource: " + i10, e10);
        }
    }
}
