package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z20 {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public Serializable e;

    public z20(Context context) {
        this.e = "";
        this.c = context;
        this.d = context.getApplicationInfo();
        iz1 iz1Var = mz1.V9;
        tw1 tw1Var = tw1.e;
        this.a = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        this.b = ((Integer) tw1Var.c.a(mz1.W9)).intValue();
    }

    public void a(o91 o91Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((a91) it.next()).a.c() & 8) != 0) {
                ((View) this.d).setTranslationY(r4.c(r3.a.b(), this.b, 0));
                return;
            }
        }
    }

    public JSONObject b() throws JSONException, PackageManager.NameNotFoundException {
        String strM;
        String strEncodeToString;
        int i = this.b;
        int i2 = this.a;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.d;
        Context context = (Context) this.c;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            i63 i63Var = lf4.l;
            Context context2 = za1.a(context).f;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        lf4 lf4Var = hg4.C.c;
        Drawable applicationIcon = null;
        try {
            strM = lf4.M(context);
        } catch (RemoteException unused2) {
            strM = null;
        }
        jSONObject.put("adMobAppId", strM);
        if (((String) this.e).isEmpty()) {
            try {
                zj0 zj0VarA = za1.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = zj0VarA.f;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i2, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = strEncodeToString;
        }
        if (!((String) this.e).isEmpty()) {
            jSONObject.put("icon", (String) this.e);
            jSONObject.put("iconWidthPx", i2);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    public z20(View view) {
        this.e = new int[2];
        this.d = view;
    }
}
