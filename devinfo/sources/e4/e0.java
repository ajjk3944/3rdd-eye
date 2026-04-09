package e4;

import android.adservices.topics.GetTopicsRequest;
import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e0 {
    public static GetTopicsRequest a(q5.b bVar) {
        nk.k.e(bVar, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(bVar.f32183a).build();
        nk.k.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public static GetTopicsRequest b(q5.b bVar) {
        nk.k.e(bVar, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName("com.google.android.gms.ads").build();
        nk.k.d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public static JobScheduler c(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        nk.k.d(jobSchedulerForNamespace, "forNamespace(...)");
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float e(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getAxisVelocity(i4);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int h(ViewConfiguration viewConfiguration, int i4, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i4, i10, i11);
    }

    public static int i(ViewConfiguration viewConfiguration, int i4, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i4, i10, i11);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean k(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void l(AccessibilityEvent accessibilityEvent, boolean z3) {
        accessibilityEvent.setAccessibilityDataSensitive(z3);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
    }

    public static void n(TextView textView, int i4, float f10) {
        textView.setLineHeight(i4, f10);
    }
}
