package j3;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface i {
    void a();

    void b(ViewGroup viewGroup, String str);

    void c(String str);

    void d(String str, String str2);

    void e(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void f(MBSplashShowListener mBSplashShowListener);

    void g(ViewGroup viewGroup);

    void onDestroy();

    void setExtraInfo(JSONObject jSONObject);
}
