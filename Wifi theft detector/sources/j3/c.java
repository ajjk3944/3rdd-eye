package j3;

import android.content.Context;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface c {
    void a(Context context, String str, String str2);

    void b(RewardVideoWithCodeListener rewardVideoWithCodeListener);

    void loadFromBid(String str);

    void playVideoMute(int i10);

    void setExtraInfo(JSONObject jSONObject);

    void showFromBid();
}
