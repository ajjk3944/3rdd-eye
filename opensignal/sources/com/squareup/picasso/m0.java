package com.squareup.picasso;

import android.graphics.BitmapFactory;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class m0 {
    public static void a(int i10, int i11, int i12, int i13, BitmapFactory.Options options, k0 k0Var) {
        int iMin;
        double dFloor;
        if (i13 > i11 || i12 > i10) {
            if (i11 == 0) {
                dFloor = Math.floor(i12 / i10);
            } else if (i10 == 0) {
                dFloor = Math.floor(i13 / i11);
            } else {
                int iFloor = (int) Math.floor(i13 / i11);
                int iFloor2 = (int) Math.floor(i12 / i10);
                k0Var.getClass();
                iMin = Math.min(iFloor, iFloor2);
            }
            iMin = (int) dFloor;
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(k0 k0Var) {
        boolean zA = k0Var.a();
        if (!zA) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zA;
        return options;
    }

    public abstract boolean b(k0 k0Var);

    public int d() {
        return 0;
    }

    public abstract qb.p e(k0 k0Var);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }
}
