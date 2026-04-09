package com.liuzh.deviceinfo.utilities;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import c0.f1;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final x f21307a = new x();

    public static Drawable a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static final Size[] b(CameraCharacteristics cameraCharacteristics) {
        Size[] sizeArrC = new Size[0];
        String str = Build.MANUFACTURER;
        if ("samsung".equalsIgnoreCase(str)) {
            sizeArrC = c(cameraCharacteristics, "samsung.android.scaler.availablePictureStreamConfigurations", 4);
        } else if (g()) {
            sizeArrC = c(cameraCharacteristics, "xiaomi.scaler.availableStreamConfigurations", 4);
            if (sizeArrC.length == 0) {
                sizeArrC = c(cameraCharacteristics, "com.xiaomi.scaler.availableSuperResolutionStreamConfigurations", 4);
            }
        } else if ("vivo".equalsIgnoreCase(str) || "iqoo".equalsIgnoreCase(str)) {
            sizeArrC = c(cameraCharacteristics, "com.vivo.sensorModeSizeList", 2);
            if (sizeArrC.length == 0) {
                sizeArrC = c(cameraCharacteristics, "com.vivo.image_sizes", 2);
            }
        } else if (f()) {
            sizeArrC = c(cameraCharacteristics, "com.transsion.availableHDStreamConfigurations", 4);
        }
        return sizeArrC.length == 0 ? c(cameraCharacteristics, "android.scaler.availableRawSizes", 2) : sizeArrC;
    }

    public static Size[] c(CameraCharacteristics cameraCharacteristics, String str, int i4) {
        Integer[] numArr;
        if (!wi.h.f36760e) {
            return new Size[0];
        }
        try {
            numArr = (Integer[]) cameraCharacteristics.get(f1.c(str));
        } catch (Throwable unused) {
            numArr = new Integer[0];
        }
        if (numArr == null || numArr.length < 2) {
            return new Size[0];
        }
        ArrayList arrayList = new ArrayList();
        if (i4 == 2) {
            for (int i10 = 0; i10 < numArr.length - 1; i10 += 2) {
                Integer num = numArr[i10];
                Integer num2 = numArr[i10 + 1];
                if (num != null && num2 != null) {
                    arrayList.add(new Size(num.intValue(), num2.intValue()));
                }
            }
        } else if (i4 == 4) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 3;
                if (i12 >= numArr.length) {
                    break;
                }
                Integer num3 = numArr[i11];
                Integer num4 = numArr[i11 + 1];
                Integer num5 = numArr[i11 + 2];
                Integer num6 = numArr[i12];
                if (num6 != null && num6.intValue() == 0 && num4 != null && num5 != null) {
                    arrayList.add(new Size(num4.intValue(), num5.intValue()));
                }
                i11 += 4;
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    public static boolean d() {
        String str = Build.MANUFACTURER;
        if ("huawei".equalsIgnoreCase(str) || "honor".equalsIgnoreCase(str)) {
            return true;
        }
        String str2 = Build.BRAND;
        return "huawei".equalsIgnoreCase(str2) || "honor".equalsIgnoreCase(str2);
    }

    public static boolean e() {
        String str = Build.MANUFACTURER;
        return "oppo".equalsIgnoreCase(str) || "realme".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str);
    }

    public static boolean f() {
        String str = Build.MANUFACTURER;
        return "TECNO".equalsIgnoreCase(str) || "INFINIX".equalsIgnoreCase(str) || "itel".equalsIgnoreCase(str);
    }

    public static boolean g() {
        String str = Build.MANUFACTURER;
        return "xiaomi".equalsIgnoreCase(str) || "redmi".equalsIgnoreCase(str) || "poco".equalsIgnoreCase(str);
    }

    public static String h(String str) throws NoSuchAlgorithmException {
        byte[] bytes = str.getBytes();
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("Md5");
                messageDigest.update(bytes);
                return String.format("%032x", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } catch (RuntimeException unused) {
            return "";
        }
    }

    public static p i(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str) || str.startsWith(" ")) {
            return null;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length != 6) {
            return null;
        }
        p pVar = new p();
        pVar.f21287a = strArrSplit[0];
        pVar.f21288b = strArrSplit[1];
        pVar.f21289c = strArrSplit[2];
        strArrSplit[3].split(",");
        try {
            Integer.parseInt(strArrSplit[4]);
        } catch (NumberFormatException unused) {
        }
        try {
            Integer.parseInt(strArrSplit[5]);
        } catch (NumberFormatException unused2) {
        }
        return pVar;
    }

    public static void j(final float f10, View... viewArr) {
        for (View view : viewArr) {
            view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.liuzh.deviceinfo.utilities.w
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z3) {
                    if (z3) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                        float f11 = f10;
                        viewPropertyAnimatorAnimate.scaleX(f11).scaleY(f11).start();
                    } else {
                        view2.animate().scaleX(1.0f).scaleY(1.0f).start();
                    }
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.requestLayout();
                        viewGroup.postInvalidate();
                    }
                }
            });
        }
    }

    public static void k(View... viewArr) {
        for (View view : viewArr) {
            view.setOnFocusChangeListener(f21307a);
        }
    }

    public static void l(Context context, String str) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
    }

    public static void m(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
