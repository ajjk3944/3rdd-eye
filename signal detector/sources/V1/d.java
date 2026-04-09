package V1;

import com.bytedance.sdk.openadsdk.core.sz.dg.xq;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public long f3846a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xq f3848c;

    public d(xq xqVar) {
        this.f3848c = xqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentPosition;
        xq xqVar = this.f3848c;
        if (((e) xqVar).ru != null) {
            try {
                if (!this.f3847b) {
                    o oVar = (o) ((e) xqVar).ru;
                    oVar.getClass();
                    try {
                        currentPosition = oVar.i.getCurrentPosition();
                    } catch (Throwable unused) {
                        currentPosition = 0;
                    }
                    ((e) xqVar).cf = Math.max(this.f3846a, currentPosition);
                }
                long unused2 = ((e) xqVar).cf;
            } catch (Throwable th) {
                th.toString();
            }
        }
        if (((e) xqVar).vk != null) {
            ((e) xqVar).vk.sendEmptyMessageDelayed(100, 0L);
        }
    }
}
