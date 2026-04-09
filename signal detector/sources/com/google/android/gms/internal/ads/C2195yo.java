package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import android.view.View;
import e3.AbstractC2303a;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;
import t2.HandlerC2908D;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2195yo {

    /* renamed from: a, reason: collision with root package name */
    public int f17762a;

    /* renamed from: b, reason: collision with root package name */
    public int f17763b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17764c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17765d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f17766e;

    public C2195yo(Context context) {
        this.f17766e = "";
        this.f17764c = context;
        this.f17765d = context.getApplicationInfo();
        E9 e9 = H9.sa;
        C2841s c2841s = C2841s.f23267e;
        this.f17762a = ((Integer) c2841s.f23270c.a(e9)).intValue();
        this.f17763b = ((Integer) c2841s.f23270c.a(H9.ta)).intValue();
    }

    public void a(R.r0 r0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((R.a0) it.next()).f3300a.c() & 8) != 0) {
                ((View) this.f17765d).setTranslationY(AbstractC2303a.c(r3.f3300a.b(), this.f17763b, 0));
                return;
            }
        }
    }

    public JSONObject b() throws JSONException, PackageManager.NameNotFoundException {
        String strO;
        String strEncodeToString;
        int i = this.f17763b;
        int i3 = this.f17762a;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f17765d;
        Context context = (Context) this.f17764c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            HandlerC2908D handlerC2908D = C2911G.f23576l;
            Context context2 = R2.b.a(context).f2065b;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        C2911G c2911g = p2.j.f22785C.f22790c;
        Drawable applicationIcon = null;
        try {
            strO = C2911G.O(context);
        } catch (RemoteException unused2) {
            strO = null;
        }
        jSONObject.put("adMobAppId", strO);
        if (((String) this.f17766e).isEmpty()) {
            try {
                J2.i iVarA = R2.b.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = iVarA.f2065b;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i3, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f17766e = strEncodeToString;
        }
        if (!((String) this.f17766e).isEmpty()) {
            jSONObject.put("icon", (String) this.f17766e);
            jSONObject.put("iconWidthPx", i3);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    public C2195yo(View view) {
        this.f17766e = new int[2];
        this.f17765d = view;
    }
}
