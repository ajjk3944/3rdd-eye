package c3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import io.sentry.android.core.e0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: p0, reason: collision with root package name */
    public static final SparseIntArray f3223p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3224a;

    /* renamed from: a0, reason: collision with root package name */
    public int f3225a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3226b;

    /* renamed from: b0, reason: collision with root package name */
    public int f3227b0;

    /* renamed from: c, reason: collision with root package name */
    public int f3228c;

    /* renamed from: c0, reason: collision with root package name */
    public int f3229c0;

    /* renamed from: d, reason: collision with root package name */
    public int f3230d;

    /* renamed from: d0, reason: collision with root package name */
    public float f3231d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3232e;

    /* renamed from: e0, reason: collision with root package name */
    public float f3233e0;

    /* renamed from: f, reason: collision with root package name */
    public float f3234f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3235f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3236g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3237g0;

    /* renamed from: h, reason: collision with root package name */
    public int f3238h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3239h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3240i;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f3241i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public String f3242j0;
    public int k;

    /* renamed from: k0, reason: collision with root package name */
    public String f3243k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3244l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f3245l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3246m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3247m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3248n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f3249n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3250o;

    /* renamed from: o0, reason: collision with root package name */
    public int f3251o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3252p;

    /* renamed from: q, reason: collision with root package name */
    public int f3253q;

    /* renamed from: r, reason: collision with root package name */
    public int f3254r;

    /* renamed from: s, reason: collision with root package name */
    public int f3255s;

    /* renamed from: t, reason: collision with root package name */
    public int f3256t;

    /* renamed from: u, reason: collision with root package name */
    public int f3257u;

    /* renamed from: v, reason: collision with root package name */
    public int f3258v;

    /* renamed from: w, reason: collision with root package name */
    public float f3259w;

    /* renamed from: x, reason: collision with root package name */
    public float f3260x;

    /* renamed from: y, reason: collision with root package name */
    public String f3261y;

    /* renamed from: z, reason: collision with root package name */
    public int f3262z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3223p0 = sparseIntArray;
        sparseIntArray.append(s.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(s.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(s.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(s.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(s.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(s.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(s.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(s.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(s.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(s.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(s.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(s.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(s.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(s.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(s.Layout_guidelineUseRtl, 90);
        sparseIntArray.append(s.Layout_android_orientation, 26);
        sparseIntArray.append(s.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(s.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(s.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(s.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(s.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(s.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(s.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(s.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(s.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(s.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(s.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(s.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(s.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(s.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(s.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(s.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(s.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(s.Layout_layout_constraintLeft_creator, 91);
        sparseIntArray.append(s.Layout_layout_constraintTop_creator, 91);
        sparseIntArray.append(s.Layout_layout_constraintRight_creator, 91);
        sparseIntArray.append(s.Layout_layout_constraintBottom_creator, 91);
        sparseIntArray.append(s.Layout_layout_constraintBaseline_creator, 91);
        sparseIntArray.append(s.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(s.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(s.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(s.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(s.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(s.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(s.Layout_android_layout_width, 22);
        sparseIntArray.append(s.Layout_android_layout_height, 21);
        sparseIntArray.append(s.Layout_layout_constraintWidth, 41);
        sparseIntArray.append(s.Layout_layout_constraintHeight, 42);
        sparseIntArray.append(s.Layout_layout_constrainedWidth, 87);
        sparseIntArray.append(s.Layout_layout_constrainedHeight, 88);
        sparseIntArray.append(s.Layout_layout_wrapBehaviorInParent, 76);
        sparseIntArray.append(s.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(s.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(s.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(s.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(s.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(s.Layout_chainUseRtl, 71);
        sparseIntArray.append(s.Layout_barrierDirection, 72);
        sparseIntArray.append(s.Layout_barrierMargin, 73);
        sparseIntArray.append(s.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(s.Layout_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(s.Layout_layout_constraintWidth_max, 84);
        sparseIntArray.append(s.Layout_layout_constraintWidth_min, 86);
        sparseIntArray.append(s.Layout_layout_constraintWidth_max, 83);
        sparseIntArray.append(s.Layout_layout_constraintHeight_min, 85);
        sparseIntArray.append(s.Layout_layout_constraintWidth, 87);
        sparseIntArray.append(s.Layout_layout_constraintHeight, 88);
        sparseIntArray.append(s.ConstraintLayout_Layout_layout_constraintTag, 89);
        sparseIntArray.append(s.Layout_guidelineUseRtl, 90);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f3223p0;
            int i11 = sparseIntArray.get(index);
            switch (i11) {
                case 1:
                    this.f3252p = p.h(typedArrayObtainStyledAttributes, index, this.f3252p);
                    break;
                case 2:
                    this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.f3250o = p.h(typedArrayObtainStyledAttributes, index, this.f3250o);
                    break;
                case 4:
                    this.f3248n = p.h(typedArrayObtainStyledAttributes, index, this.f3248n);
                    break;
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    this.f3261y = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.f3258v = p.h(typedArrayObtainStyledAttributes, index, this.f3258v);
                    break;
                case 10:
                    this.f3257u = p.h(typedArrayObtainStyledAttributes, index, this.f3257u);
                    break;
                case 11:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 12:
                    this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case 14:
                    this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 15:
                    this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 17:
                    this.f3230d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3230d);
                    break;
                case 18:
                    this.f3232e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3232e);
                    break;
                case 19:
                    this.f3234f = typedArrayObtainStyledAttributes.getFloat(index, this.f3234f);
                    break;
                case 20:
                    this.f3259w = typedArrayObtainStyledAttributes.getFloat(index, this.f3259w);
                    break;
                case 21:
                    this.f3228c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3228c);
                    break;
                case 22:
                    this.f3226b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f3226b);
                    break;
                case 23:
                    this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case 24:
                    this.f3238h = p.h(typedArrayObtainStyledAttributes, index, this.f3238h);
                    break;
                case 25:
                    this.f3240i = p.h(typedArrayObtainStyledAttributes, index, this.f3240i);
                    break;
                case 26:
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.j = p.h(typedArrayObtainStyledAttributes, index, this.j);
                    break;
                case 29:
                    this.k = p.h(typedArrayObtainStyledAttributes, index, this.k);
                    break;
                case 30:
                    this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 31:
                    this.f3255s = p.h(typedArrayObtainStyledAttributes, index, this.f3255s);
                    break;
                case 32:
                    this.f3256t = p.h(typedArrayObtainStyledAttributes, index, this.f3256t);
                    break;
                case 33:
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 34:
                    this.f3246m = p.h(typedArrayObtainStyledAttributes, index, this.f3246m);
                    break;
                case 35:
                    this.f3244l = p.h(typedArrayObtainStyledAttributes, index, this.f3244l);
                    break;
                case 36:
                    this.f3260x = typedArrayObtainStyledAttributes.getFloat(index, this.f3260x);
                    break;
                case 37:
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 38:
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                    break;
                case 39:
                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                    break;
                case 40:
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                    break;
                case 41:
                    p.i(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case 42:
                    p.i(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i11) {
                        case 61:
                            this.f3262z = p.h(typedArrayObtainStyledAttributes, index, this.f3262z);
                            break;
                        case 62:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    this.f3231d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f3233e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    e0.d("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f3235f0 = typedArrayObtainStyledAttributes.getInt(index, this.f3235f0);
                                    break;
                                case 73:
                                    this.f3237g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3237g0);
                                    break;
                                case 74:
                                    this.f3242j0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f3249n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3249n0);
                                    break;
                                case 76:
                                    this.f3251o0 = typedArrayObtainStyledAttributes.getInt(index, this.f3251o0);
                                    break;
                                case 77:
                                    this.f3253q = p.h(typedArrayObtainStyledAttributes, index, this.f3253q);
                                    break;
                                case 78:
                                    this.f3254r = p.h(typedArrayObtainStyledAttributes, index, this.f3254r);
                                    break;
                                case 79:
                                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.f3225a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3225a0);
                                    break;
                                case 84:
                                    this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.f3229c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3229c0);
                                    break;
                                case 86:
                                    this.f3227b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3227b0);
                                    break;
                                case 87:
                                    this.f3245l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3245l0);
                                    break;
                                case 88:
                                    this.f3247m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f3247m0);
                                    break;
                                case 89:
                                    this.f3243k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f3236g = typedArrayObtainStyledAttributes.getBoolean(index, this.f3236g);
                                    break;
                                case 91:
                                    e0.p("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    e0.p("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
