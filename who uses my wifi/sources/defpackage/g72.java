package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class g72 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ gi1 g;

    public /* synthetic */ g72(gi1 gi1Var, int i) {
        this.f = i;
        this.g = gi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strConcat;
        switch (this.f) {
            case 0:
                gi1 gi1Var = this.g;
                gi1Var.getClass();
                ((Executor) gi1Var.i).execute(new g72(gi1Var, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                gi1 gi1Var2 = this.g;
                Application application = (Application) gi1Var2.f;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    if (applicationIcon == null) {
                        strConcat = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    mo1 mo1Var = (mo1) gi1Var2.m;
                    for (String str : mo1Var.a().keySet()) {
                        jSONObject2.put(str, mo1Var.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((bw1) gi1Var2.l).g.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
