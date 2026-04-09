package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class te0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16793a;

    /* renamed from: b, reason: collision with root package name */
    public int f16794b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16795c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16796d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f16797e;

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i4 = this.f16793a + 1;
        long[] jArr = (long[]) this.f16795c;
        int length = jArr.length;
        if (i4 > length) {
            int i10 = length * 2;
            long[] jArr2 = new long[i10];
            int[] iArr = new int[i10];
            zj.m.P(jArr, jArr2, 0, 0, jArr.length);
            zj.m.Q(0, 0, 14, (int[]) this.f16796d, iArr);
            this.f16795c = jArr2;
            this.f16796d = iArr;
        }
        int i11 = this.f16793a;
        this.f16793a = i11 + 1;
        int length2 = ((int[]) this.f16797e).length;
        if (this.f16794b >= length2) {
            int i12 = length2 * 2;
            ?? r22 = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 + 1;
                r22[i13] = i14;
                i13 = i14;
            }
            zj.m.Q(0, 0, 14, (int[]) this.f16797e, r22);
            this.f16797e = r22;
        }
        int i15 = this.f16794b;
        int[] iArr2 = (int[]) this.f16797e;
        this.f16794b = iArr2[i15];
        long[] jArr3 = (long[]) this.f16795c;
        jArr3[i11] = j;
        ((int[]) this.f16796d)[i11] = i15;
        iArr2[i15] = i11;
        while (i11 > 0) {
            int i16 = ((i11 + 1) >> 1) - 1;
            if (nk.k.g(jArr3[i16], j) <= 0) {
                break;
            }
            c(i16, i11);
            i11 = i16;
        }
        return i15;
    }

    public void b(int i4) {
        int i10 = this.f16794b;
        boolean z3 = false;
        if (i4 >= 0 && i4 < i10) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        x2.a.a("lineIndex(" + i4 + ") is out of bounds [0, " + i10 + ')');
    }

    public void c(int i4, int i10) {
        long[] jArr = (long[]) this.f16795c;
        int[] iArr = (int[]) this.f16796d;
        int[] iArr2 = (int[]) this.f16797e;
        long j = jArr[i4];
        jArr[i4] = jArr[i10];
        jArr[i10] = j;
        int i11 = iArr[i4];
        int i12 = iArr[i10];
        iArr[i4] = i12;
        iArr[i10] = i11;
        iArr2[i12] = i4;
        iArr2[i11] = i10;
    }

    public JSONObject d() throws JSONException, PackageManager.NameNotFoundException {
        String strO;
        String strEncodeToString;
        int i4 = this.f16794b;
        int i10 = this.f16793a;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f16796d;
        Context context = (Context) this.f16795c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            ya.b0 b0Var = ya.f0.f37440l;
            Context context2 = (Context) ub.b.a(context).f27058a;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        ya.f0 f0Var = ua.j.C.f35261c;
        Drawable applicationIcon = null;
        try {
            strO = ya.f0.O(context);
        } catch (RemoteException unused2) {
            strO = null;
        }
        jSONObject.put("adMobAppId", strO);
        if (((String) this.f16797e).isEmpty()) {
            try {
                j1.q qVarA = ub.b.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = (Context) qVarA.f27058a;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i10, i4);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i4, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f16797e = strEncodeToString;
        }
        if (!((String) this.f16797e).isEmpty()) {
            jSONObject.put("icon", (String) this.f16797e);
            jSONObject.put("iconWidthPx", i10);
            jSONObject.put("iconHeightPx", i4);
        }
        return jSONObject;
    }
}
