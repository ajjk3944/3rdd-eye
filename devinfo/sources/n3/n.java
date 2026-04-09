package n3;

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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import je.u;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f29714d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f29715e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f29716f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f29717a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29718b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29719c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29715e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f29716f = sparseIntArray2;
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
        sparseIntArray.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 7);
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
        sparseIntArray.append(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 16);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 14);
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
        sparseIntArray.append(AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(AppLovinMediationAdapter.ERROR_CHILD_USER, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 97);
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
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 84);
        sparseIntArray2.append(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i4 = 0;
        int i10 = 0;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            Object obj = null;
            try {
                iIntValue = p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, FacebookMediationAdapter.KEY_ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (a0.g.C(strTrim)) {
                    HashMap map = constraintLayout.f867m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f867m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i10] = iIntValue;
            i4++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z3) {
        int i4;
        int i10;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? q.f29722c : q.f29720a);
        l lVar = iVar.f29645b;
        m mVar = iVar.f29648e;
        k kVar = iVar.f29646c;
        j jVar = iVar.f29647d;
        int[] iArr = f29714d;
        String[] strArr = j3.a.f27363a;
        SparseIntArray sparseIntArray = f29715e;
        if (z3) {
            h hVar = new h();
            hVar.f29634a = new int[10];
            hVar.f29635b = new int[10];
            hVar.f29636c = 0;
            hVar.f29637d = new int[10];
            hVar.f29638e = new float[10];
            hVar.f29639f = 0;
            hVar.g = new int[5];
            hVar.f29640h = new String[5];
            hVar.f29641i = 0;
            hVar.j = new int[4];
            hVar.f29642k = new boolean[4];
            hVar.f29643l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i11 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i11 < indexCount; indexCount = i10) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = i11;
                switch (f29716f.get(index)) {
                    case 2:
                        i10 = indexCount;
                        hVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        continue;
                        i11 = i12 + 1;
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
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i10 = indexCount;
                        hVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i11 = i12 + 1;
                    case 6:
                        i10 = indexCount;
                        hVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        i10 = indexCount;
                        hVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        i10 = indexCount;
                        hVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        i10 = indexCount;
                        hVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        i10 = indexCount;
                        hVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        i10 = indexCount;
                        hVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        i10 = indexCount;
                        hVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        i10 = indexCount;
                        hVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        i10 = indexCount;
                        hVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        i10 = indexCount;
                        hVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f29657d));
                        break;
                    case 18:
                        i10 = indexCount;
                        hVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f29659e));
                        break;
                    case 19:
                        i10 = indexCount;
                        hVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, jVar.f29661f));
                        break;
                    case 20:
                        i10 = indexCount;
                        hVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, jVar.f29686w));
                        break;
                    case 21:
                        i10 = indexCount;
                        hVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f29655c));
                        break;
                    case 22:
                        i10 = indexCount;
                        hVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f29698a)]);
                        break;
                    case 23:
                        i10 = indexCount;
                        hVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f29653b));
                        break;
                    case 24:
                        i10 = indexCount;
                        hVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        i10 = indexCount;
                        hVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        i10 = indexCount;
                        hVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 31:
                        i10 = indexCount;
                        hVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 34:
                        i10 = indexCount;
                        hVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case 37:
                        i10 = indexCount;
                        hVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, jVar.f29687x));
                        break;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        i10 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f29644a);
                        iVar.f29644a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                        i10 = indexCount;
                        hVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, jVar.U));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                        i10 = indexCount;
                        hVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, jVar.T));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                        i10 = indexCount;
                        hVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 42:
                        i10 = indexCount;
                        hVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                        i10 = indexCount;
                        hVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, lVar.f29700c));
                        break;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                        i10 = indexCount;
                        hVar.d(44, true);
                        hVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, mVar.f29713m));
                        break;
                    case 45:
                        i10 = indexCount;
                        hVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, mVar.f29704b));
                        break;
                    case 46:
                        i10 = indexCount;
                        hVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, mVar.f29705c));
                        break;
                    case 47:
                        i10 = indexCount;
                        hVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, mVar.f29706d));
                        break;
                    case 48:
                        i10 = indexCount;
                        hVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, mVar.f29707e));
                        break;
                    case 49:
                        i10 = indexCount;
                        hVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, mVar.f29708f));
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        i10 = indexCount;
                        hVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, mVar.g));
                        break;
                    case 51:
                        i10 = indexCount;
                        hVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, mVar.f29710i));
                        break;
                    case 52:
                        i10 = indexCount;
                        hVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, mVar.j));
                        break;
                    case 53:
                        i10 = indexCount;
                        hVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, mVar.f29711k));
                        break;
                    case 54:
                        i10 = indexCount;
                        hVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        i10 = indexCount;
                        hVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        i10 = indexCount;
                        hVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        i10 = indexCount;
                        hVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f29652a0));
                        break;
                    case 58:
                        i10 = indexCount;
                        hVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f29654b0));
                        break;
                    case 59:
                        i10 = indexCount;
                        hVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f29656c0));
                        break;
                    case 60:
                        i10 = indexCount;
                        hVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, mVar.f29703a));
                        break;
                    case 62:
                        i10 = indexCount;
                        hVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        i10 = indexCount;
                        hVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, jVar.B));
                        break;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        i10 = indexCount;
                        hVar.b(64, f(typedArrayObtainStyledAttributes, index, kVar.f29690a));
                        break;
                    case 65:
                        i10 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        } else {
                            hVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i10 = indexCount;
                        hVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i10 = indexCount;
                        hVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, kVar.f29694e));
                        break;
                    case 68:
                        i10 = indexCount;
                        hVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, lVar.f29701d));
                        break;
                    case 69:
                        i10 = indexCount;
                        hVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i10 = indexCount;
                        hVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i10 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount;
                        hVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jVar.f29662f0));
                        break;
                    case 73:
                        i10 = indexCount;
                        hVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f29663g0));
                        break;
                    case 74:
                        i10 = indexCount;
                        hVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i10 = indexCount;
                        hVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f29676n0));
                        break;
                    case 76:
                        i10 = indexCount;
                        hVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.f29692c));
                        break;
                    case 77:
                        i10 = indexCount;
                        hVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i10 = indexCount;
                        hVar.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.f29699b));
                        break;
                    case 79:
                        i10 = indexCount;
                        hVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, kVar.f29693d));
                        break;
                    case 80:
                        i10 = indexCount;
                        hVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f29672l0));
                        break;
                    case 81:
                        i10 = indexCount;
                        hVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f29674m0));
                        break;
                    case 82:
                        i10 = indexCount;
                        hVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.f29691b));
                        break;
                    case 83:
                        i10 = indexCount;
                        hVar.b(83, f(typedArrayObtainStyledAttributes, index, mVar.f29709h));
                        break;
                    case 84:
                        i10 = indexCount;
                        hVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.g));
                        break;
                    case 85:
                        i10 = indexCount;
                        hVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, kVar.f29695f));
                        break;
                    case 86:
                        i10 = indexCount;
                        int i13 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i13 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.f29697i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.f29697i != -1) {
                                hVar.b(88, -2);
                                break;
                            }
                        } else if (i13 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.f29696h = string;
                            hVar.c(90, string);
                            if (kVar.f29696h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.f29697i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                                break;
                            } else {
                                hVar.b(88, -1);
                                break;
                            }
                        } else {
                            hVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.f29697i));
                            break;
                        }
                        break;
                    case 87:
                        i10 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i10 = indexCount;
                        hVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        i10 = indexCount;
                        hVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        i10 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i10 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i10 = indexCount;
                        hVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jVar.f29678o0));
                        break;
                    case 98:
                        i10 = indexCount;
                        int i14 = m3.a.f28874q;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.f29644a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f29644a);
                            break;
                        }
                    case 99:
                        i10 = indexCount;
                        hVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, jVar.g));
                        break;
                }
                i11 = i12 + 1;
            }
        } else {
            int i15 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i15 < indexCount2; indexCount2 = i4) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i4 = indexCount2;
                        jVar.f29679p = f(typedArrayObtainStyledAttributes, index2, jVar.f29679p);
                        continue;
                        i15++;
                    case 2:
                        i4 = indexCount2;
                        jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                        i15++;
                    case 3:
                        i4 = indexCount2;
                        jVar.f29677o = f(typedArrayObtainStyledAttributes, index2, jVar.f29677o);
                        continue;
                        i15++;
                    case 4:
                        i4 = indexCount2;
                        jVar.f29675n = f(typedArrayObtainStyledAttributes, index2, jVar.f29675n);
                        continue;
                        i15++;
                    case 5:
                        i4 = indexCount2;
                        jVar.f29688y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i15++;
                    case 6:
                        i4 = indexCount2;
                        jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                        i15++;
                    case 7:
                        i4 = indexCount2;
                        jVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        continue;
                        i15++;
                    case 8:
                        i4 = indexCount2;
                        jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                        i15++;
                    case 9:
                        i4 = indexCount2;
                        jVar.f29685v = f(typedArrayObtainStyledAttributes, index2, jVar.f29685v);
                        continue;
                        i15++;
                    case 10:
                        i4 = indexCount2;
                        jVar.f29684u = f(typedArrayObtainStyledAttributes, index2, jVar.f29684u);
                        continue;
                        i15++;
                    case 11:
                        i4 = indexCount2;
                        jVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                        i15++;
                    case 12:
                        i4 = indexCount2;
                        jVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                        i15++;
                    case 13:
                        i4 = indexCount2;
                        jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                        i15++;
                    case 14:
                        i4 = indexCount2;
                        jVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                        i15++;
                    case 15:
                        i4 = indexCount2;
                        jVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        continue;
                        i15++;
                    case 16:
                        i4 = indexCount2;
                        jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                        i15++;
                    case 17:
                        i4 = indexCount2;
                        jVar.f29657d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f29657d);
                        continue;
                        i15++;
                    case 18:
                        i4 = indexCount2;
                        jVar.f29659e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f29659e);
                        continue;
                        i15++;
                    case 19:
                        i4 = indexCount2;
                        jVar.f29661f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f29661f);
                        continue;
                        i15++;
                    case 20:
                        i4 = indexCount2;
                        jVar.f29686w = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f29686w);
                        continue;
                        i15++;
                    case 21:
                        i4 = indexCount2;
                        jVar.f29655c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f29655c);
                        continue;
                        i15++;
                    case 22:
                        i4 = indexCount2;
                        int i16 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f29698a);
                        lVar.f29698a = i16;
                        lVar.f29698a = iArr[i16];
                        continue;
                        i15++;
                    case 23:
                        i4 = indexCount2;
                        jVar.f29653b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f29653b);
                        continue;
                        i15++;
                    case 24:
                        i4 = indexCount2;
                        jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                        i15++;
                    case 25:
                        i4 = indexCount2;
                        jVar.f29664h = f(typedArrayObtainStyledAttributes, index2, jVar.f29664h);
                        continue;
                        i15++;
                    case 26:
                        i4 = indexCount2;
                        jVar.f29666i = f(typedArrayObtainStyledAttributes, index2, jVar.f29666i);
                        continue;
                        i15++;
                    case 27:
                        i4 = indexCount2;
                        jVar.E = typedArrayObtainStyledAttributes.getInt(index2, jVar.E);
                        continue;
                        i15++;
                    case 28:
                        i4 = indexCount2;
                        jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                        i15++;
                    case 29:
                        i4 = indexCount2;
                        jVar.j = f(typedArrayObtainStyledAttributes, index2, jVar.j);
                        continue;
                        i15++;
                    case 30:
                        i4 = indexCount2;
                        jVar.f29669k = f(typedArrayObtainStyledAttributes, index2, jVar.f29669k);
                        continue;
                        i15++;
                    case 31:
                        i4 = indexCount2;
                        jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        continue;
                        i15++;
                    case 32:
                        i4 = indexCount2;
                        jVar.f29682s = f(typedArrayObtainStyledAttributes, index2, jVar.f29682s);
                        continue;
                        i15++;
                    case 33:
                        i4 = indexCount2;
                        jVar.f29683t = f(typedArrayObtainStyledAttributes, index2, jVar.f29683t);
                        continue;
                        i15++;
                    case 34:
                        i4 = indexCount2;
                        jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                        i15++;
                    case 35:
                        i4 = indexCount2;
                        jVar.f29673m = f(typedArrayObtainStyledAttributes, index2, jVar.f29673m);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                        i4 = indexCount2;
                        jVar.f29671l = f(typedArrayObtainStyledAttributes, index2, jVar.f29671l);
                        continue;
                        i15++;
                    case 37:
                        i4 = indexCount2;
                        jVar.f29687x = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f29687x);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                        i4 = indexCount2;
                        iVar.f29644a = typedArrayObtainStyledAttributes.getResourceId(index2, iVar.f29644a);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                        i4 = indexCount2;
                        jVar.U = typedArrayObtainStyledAttributes.getFloat(index2, jVar.U);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
                        i4 = indexCount2;
                        jVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                        i4 = indexCount2;
                        jVar.V = typedArrayObtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                        i15++;
                    case 42:
                        i4 = indexCount2;
                        jVar.W = typedArrayObtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                        i4 = indexCount2;
                        lVar.f29700c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f29700c);
                        continue;
                        i15++;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                        i4 = indexCount2;
                        mVar.f29712l = true;
                        mVar.f29713m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f29713m);
                        continue;
                        i15++;
                    case 45:
                        i4 = indexCount2;
                        mVar.f29704b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f29704b);
                        continue;
                        i15++;
                    case 46:
                        i4 = indexCount2;
                        mVar.f29705c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f29705c);
                        continue;
                        i15++;
                    case 47:
                        i4 = indexCount2;
                        mVar.f29706d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f29706d);
                        continue;
                        i15++;
                    case 48:
                        i4 = indexCount2;
                        mVar.f29707e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f29707e);
                        continue;
                        i15++;
                    case 49:
                        i4 = indexCount2;
                        mVar.f29708f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f29708f);
                        continue;
                        i15++;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        i4 = indexCount2;
                        mVar.g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.g);
                        continue;
                        i15++;
                    case 51:
                        i4 = indexCount2;
                        mVar.f29710i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f29710i);
                        continue;
                        i15++;
                    case 52:
                        i4 = indexCount2;
                        mVar.j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.j);
                        continue;
                        i15++;
                    case 53:
                        i4 = indexCount2;
                        mVar.f29711k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f29711k);
                        continue;
                        i15++;
                    case 54:
                        i4 = indexCount2;
                        jVar.X = typedArrayObtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                        i15++;
                    case 55:
                        i4 = indexCount2;
                        jVar.Y = typedArrayObtainStyledAttributes.getInt(index2, jVar.Y);
                        continue;
                        i15++;
                    case 56:
                        i4 = indexCount2;
                        jVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                        i15++;
                    case 57:
                        i4 = indexCount2;
                        jVar.f29652a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f29652a0);
                        continue;
                        i15++;
                    case 58:
                        i4 = indexCount2;
                        jVar.f29654b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f29654b0);
                        continue;
                        i15++;
                    case 59:
                        i4 = indexCount2;
                        jVar.f29656c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f29656c0);
                        continue;
                        i15++;
                    case 60:
                        i4 = indexCount2;
                        mVar.f29703a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f29703a);
                        continue;
                        i15++;
                    case 61:
                        i4 = indexCount2;
                        jVar.f29689z = f(typedArrayObtainStyledAttributes, index2, jVar.f29689z);
                        continue;
                        i15++;
                    case 62:
                        i4 = indexCount2;
                        jVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        continue;
                        i15++;
                    case 63:
                        i4 = indexCount2;
                        jVar.B = typedArrayObtainStyledAttributes.getFloat(index2, jVar.B);
                        continue;
                        i15++;
                    case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                        i4 = indexCount2;
                        kVar.f29690a = f(typedArrayObtainStyledAttributes, index2, kVar.f29690a);
                        continue;
                        i15++;
                    case 65:
                        i4 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            i15++;
                        }
                    case 66:
                        i4 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i15++;
                    case 67:
                        i4 = indexCount2;
                        kVar.f29694e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f29694e);
                        break;
                    case 68:
                        i4 = indexCount2;
                        lVar.f29701d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f29701d);
                        break;
                    case 69:
                        i4 = indexCount2;
                        jVar.f29658d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i4 = indexCount2;
                        jVar.f29660e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i4 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount2;
                        jVar.f29662f0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f29662f0);
                        break;
                    case 73:
                        i4 = indexCount2;
                        jVar.f29663g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f29663g0);
                        break;
                    case 74:
                        i4 = indexCount2;
                        jVar.f29668j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i4 = indexCount2;
                        jVar.f29676n0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f29676n0);
                        break;
                    case 76:
                        i4 = indexCount2;
                        kVar.f29692c = typedArrayObtainStyledAttributes.getInt(index2, kVar.f29692c);
                        break;
                    case 77:
                        i4 = indexCount2;
                        jVar.f29670k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i4 = indexCount2;
                        lVar.f29699b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f29699b);
                        break;
                    case 79:
                        i4 = indexCount2;
                        kVar.f29693d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f29693d);
                        break;
                    case 80:
                        i4 = indexCount2;
                        jVar.f29672l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f29672l0);
                        break;
                    case 81:
                        i4 = indexCount2;
                        jVar.f29674m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f29674m0);
                        break;
                    case 82:
                        i4 = indexCount2;
                        kVar.f29691b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f29691b);
                        break;
                    case 83:
                        i4 = indexCount2;
                        mVar.f29709h = f(typedArrayObtainStyledAttributes, index2, mVar.f29709h);
                        break;
                    case 84:
                        i4 = indexCount2;
                        kVar.g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.g);
                        break;
                    case 85:
                        i4 = indexCount2;
                        kVar.f29695f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f29695f);
                        break;
                    case 86:
                        i4 = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i17 == 1) {
                            kVar.f29697i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i17 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f29696h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f29697i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.f29697i);
                            break;
                        }
                        break;
                    case 87:
                        i4 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i4 = indexCount2;
                        jVar.f29680q = f(typedArrayObtainStyledAttributes, index2, jVar.f29680q);
                        break;
                    case 92:
                        i4 = indexCount2;
                        jVar.f29681r = f(typedArrayObtainStyledAttributes, index2, jVar.f29681r);
                        break;
                    case 93:
                        i4 = indexCount2;
                        jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        break;
                    case 94:
                        i4 = indexCount2;
                        jVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        break;
                    case 95:
                        i4 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i15++;
                    case 96:
                        i4 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i4 = indexCount2;
                        jVar.f29678o0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f29678o0);
                        break;
                }
                i15++;
            }
            if (jVar.f29668j0 != null) {
                jVar.f29667i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i4, int i10) {
        int resourceId = typedArray.getResourceId(i4, i10);
        return resourceId == -1 ? typedArray.getInt(i4, -1) : resourceId;
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
        throw new UnsupportedOperationException("Method not decompiled: n3.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(d dVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i4 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i4 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
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
                            if (i4 == 1) {
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
        dVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i4;
        HashMap map;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f29719c;
        HashSet hashSet2 = new HashSet(map2.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f29718b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        i iVar = (i) map2.get(Integer.valueOf(id2));
                        if (iVar != null) {
                            l lVar = iVar.f29645b;
                            j jVar = iVar.f29647d;
                            m mVar = iVar.f29648e;
                            if (childAt instanceof Barrier) {
                                jVar.f29665h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(jVar.f29662f0);
                                barrier.setMargin(jVar.f29663g0);
                                barrier.setAllowsGoneWidget(jVar.f29676n0);
                                int[] iArr = jVar.f29667i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = jVar.f29668j0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        jVar.f29667i0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            d dVar = (d) childAt.getLayoutParams();
                            dVar.a();
                            iVar.a(dVar);
                            HashMap map3 = iVar.f29649f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                a aVar = (a) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strT = !aVar.f29566a ? u.t("set", str2) : str2;
                                int i11 = i10;
                                try {
                                    int iC = i3.e.c(aVar.f29567b);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (iC) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(aVar.f29568c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strT, cls2).invoke(childAt, Float.valueOf(aVar.f29569d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(aVar.g));
                                            break;
                                        case 3:
                                            map = map3;
                                            Method method = cls.getMethod(strT, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            map = map3;
                                            cls.getMethod(strT, CharSequence.class).invoke(childAt, aVar.f29570e);
                                            break;
                                        case 5:
                                            map = map3;
                                            cls.getMethod(strT, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f29571f));
                                            break;
                                        case 6:
                                            map = map3;
                                            cls.getMethod(strT, cls2).invoke(childAt, Float.valueOf(aVar.f29569d));
                                            break;
                                        case 7:
                                            map = map3;
                                            try {
                                                cls.getMethod(strT, cls3).invoke(childAt, Integer.valueOf(aVar.f29568c));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbA = d.h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA.append(cls.getName());
                                                Log.e("TransitionLayout", sbA.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                map3 = map;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strT, e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                map3 = map;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder sbA2 = d.h.A(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA2.append(cls.getName());
                                                Log.e("TransitionLayout", sbA2.toString(), e);
                                                hashSet2 = hashSet3;
                                                i10 = i11;
                                                map3 = map;
                                            }
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
                                i10 = i11;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i4 = i10;
                            childAt.setLayoutParams(dVar);
                            if (lVar.f29699b == 0) {
                                childAt.setVisibility(lVar.f29698a);
                            }
                            childAt.setAlpha(lVar.f29700c);
                            childAt.setRotation(mVar.f29703a);
                            childAt.setRotationX(mVar.f29704b);
                            childAt.setRotationY(mVar.f29705c);
                            childAt.setScaleX(mVar.f29706d);
                            childAt.setScaleY(mVar.f29707e);
                            if (mVar.f29709h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f29709h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f29708f)) {
                                    childAt.setPivotX(mVar.f29708f);
                                }
                                if (!Float.isNaN(mVar.g)) {
                                    childAt.setPivotY(mVar.g);
                                }
                            }
                            childAt.setTranslationX(mVar.f29710i);
                            childAt.setTranslationY(mVar.j);
                            childAt.setTranslationZ(mVar.f29711k);
                            if (mVar.f29712l) {
                                childAt.setElevation(mVar.f29713m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i4 = i10;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i10 = i4 + 1;
                nVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i4 = i10;
            i10 = i4 + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            i iVar2 = (i) map2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f29647d;
                if (jVar2.f29665h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = jVar2.f29667i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = jVar2.f29668j0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            jVar2.f29667i0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(jVar2.f29662f0);
                    barrier2.setMargin(jVar2.f29663g0);
                    d dVarA = ConstraintLayout.a();
                    barrier2.i();
                    iVar2.a(dVarA);
                    constraintLayout.addView(barrier2, dVarA);
                }
                if (jVar2.f29651a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    d dVarA2 = ConstraintLayout.a();
                    iVar2.a(dVarA2);
                    constraintLayout.addView(guideline, dVarA2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof b) {
                ((b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i4;
        HashMap map;
        int i10;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f29719c;
        map2.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            d dVar = (d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (nVar.f29718b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id2))) {
                map2.put(Integer.valueOf(id2), new i());
            }
            i iVar = (i) map2.get(Integer.valueOf(id2));
            if (iVar == null) {
                i4 = childCount;
                map = map2;
                i10 = i11;
            } else {
                l lVar = iVar.f29645b;
                j jVar = iVar.f29647d;
                m mVar = iVar.f29648e;
                i4 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i10 = i11;
                HashMap map4 = nVar.f29717a;
                for (String str : map4.keySet()) {
                    a aVar = (a) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        StringBuilder sbA = d.h.A(" Custom Attribute \"", str, "\" not found on ");
                        sbA.append(cls.getName());
                        Log.e("TransitionLayout", sbA.toString(), e2);
                    } catch (NoSuchMethodException e10) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
                    } catch (InvocationTargetException e11) {
                        StringBuilder sbA2 = d.h.A(" Custom Attribute \"", str, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString(), e11);
                    }
                    map4 = map5;
                }
                iVar.f29649f = map3;
                iVar.f29644a = id2;
                jVar.f29664h = dVar.f29587e;
                jVar.f29666i = dVar.f29589f;
                jVar.j = dVar.g;
                jVar.f29669k = dVar.f29592h;
                jVar.f29671l = dVar.f29594i;
                jVar.f29673m = dVar.j;
                jVar.f29675n = dVar.f29597k;
                jVar.f29677o = dVar.f29599l;
                jVar.f29679p = dVar.f29601m;
                jVar.f29680q = dVar.f29603n;
                jVar.f29681r = dVar.f29605o;
                jVar.f29682s = dVar.f29611s;
                jVar.f29683t = dVar.f29612t;
                jVar.f29684u = dVar.f29613u;
                jVar.f29685v = dVar.f29614v;
                jVar.f29686w = dVar.E;
                jVar.f29687x = dVar.F;
                jVar.f29688y = dVar.G;
                jVar.f29689z = dVar.f29607p;
                jVar.A = dVar.f29609q;
                jVar.B = dVar.f29610r;
                jVar.C = dVar.T;
                jVar.D = dVar.U;
                jVar.E = dVar.V;
                jVar.f29661f = dVar.f29583c;
                jVar.f29657d = dVar.f29579a;
                jVar.f29659e = dVar.f29581b;
                jVar.f29653b = ((ViewGroup.MarginLayoutParams) dVar).width;
                jVar.f29655c = ((ViewGroup.MarginLayoutParams) dVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                jVar.L = dVar.D;
                jVar.T = dVar.I;
                jVar.U = dVar.H;
                jVar.W = dVar.K;
                jVar.V = dVar.J;
                jVar.f29672l0 = dVar.W;
                jVar.f29674m0 = dVar.X;
                jVar.X = dVar.L;
                jVar.Y = dVar.M;
                jVar.Z = dVar.P;
                jVar.f29652a0 = dVar.Q;
                jVar.f29654b0 = dVar.N;
                jVar.f29656c0 = dVar.O;
                jVar.f29658d0 = dVar.R;
                jVar.f29660e0 = dVar.S;
                jVar.f29670k0 = dVar.Y;
                jVar.N = dVar.f29616x;
                jVar.P = dVar.f29618z;
                jVar.M = dVar.f29615w;
                jVar.O = dVar.f29617y;
                jVar.R = dVar.A;
                jVar.Q = dVar.B;
                jVar.S = dVar.C;
                jVar.f29678o0 = dVar.Z;
                jVar.J = dVar.getMarginEnd();
                jVar.K = dVar.getMarginStart();
                lVar.f29698a = childAt.getVisibility();
                lVar.f29700c = childAt.getAlpha();
                mVar.f29703a = childAt.getRotation();
                mVar.f29704b = childAt.getRotationX();
                mVar.f29705c = childAt.getRotationY();
                mVar.f29706d = childAt.getScaleX();
                mVar.f29707e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f29708f = pivotX;
                    mVar.g = pivotY;
                }
                mVar.f29710i = childAt.getTranslationX();
                mVar.j = childAt.getTranslationY();
                mVar.f29711k = childAt.getTranslationZ();
                if (mVar.f29712l) {
                    mVar.f29713m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    jVar.f29676n0 = barrier.getAllowsGoneWidget();
                    jVar.f29667i0 = barrier.getReferencedIds();
                    jVar.f29662f0 = barrier.getType();
                    jVar.f29663g0 = barrier.getMargin();
                }
            }
            i11 = i10 + 1;
            nVar = this;
            childCount = i4;
            map2 = map;
        }
    }

    public final void e(int i4, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.f29647d.f29651a = true;
                    }
                    this.f29719c.put(Integer.valueOf(iVarD.f29644a), iVarD);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e2);
        } catch (XmlPullParserException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i4, e10);
        }
    }
}
