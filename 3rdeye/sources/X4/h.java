package x4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class h extends y4.f {

    /* renamed from: b, reason: collision with root package name */
    public final y4.g f47766b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f47767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f47768d;

    public h(i iVar, TaskCompletionSource taskCompletionSource) {
        y4.g gVar = new y4.g("OnRequestInstallCallback");
        this.f47768d = iVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f47766b = gVar;
        this.f47767c = taskCompletionSource;
    }
}
