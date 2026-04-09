package j4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import k4.t;
import k4.v;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final k4.i f50126c = new k4.i("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    t f50127a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50128b;

    /* JADX WARN: Type inference failed for: r7v0, types: [j4.h] */
    public l(Context context) {
        this.f50128b = context.getPackageName();
        if (v.a(context)) {
            this.f50127a = new t(context, f50126c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), new Object() { // from class: j4.h
            }, null);
        }
    }

    public final Task a() {
        String str = this.f50128b;
        k4.i iVar = f50126c;
        iVar.c("requestInAppReview (%s)", str);
        if (this.f50127a == null) {
            iVar.a("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f50127a.s(new i(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
