package Y2;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Y2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0211m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0200b f4349b;

    public /* synthetic */ RunnableC0211m(C0200b c0200b, int i) {
        this.f4348a = i;
        this.f4349b = c0200b;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strConcat;
        switch (this.f4348a) {
            case 0:
                C0200b c0200b = this.f4349b;
                c0200b.getClass();
                ((Executor) c0200b.f4306e).execute(new RunnableC0211m(c0200b, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                C0200b c0200b2 = this.f4349b;
                Application application = (Application) c0200b2.f4303b;
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
                    C0204f c0204f = (C0204f) c0200b2.i;
                    for (String str : c0204f.a().keySet()) {
                        jSONObject2.put(str, c0204f.a().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((C0207i) c0200b2.f4309h).f4335g.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
