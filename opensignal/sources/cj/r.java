package cj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.opensignal.sdk.data.task.TaskSdkService;

/* loaded from: classes.dex */
public final class r {
    public static Intent a(Context context, Bundle bundle) {
        br.l.e(context, "context");
        Intent intent = new Intent(context, (Class<?>) TaskSdkService.class);
        intent.putExtras(bundle);
        return intent;
    }
}
