package f5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8595a;

    /* renamed from: b, reason: collision with root package name */
    public Exception f8596b;

    /* renamed from: c, reason: collision with root package name */
    public long f8597c;

    public final void a(Exception exc) throws Exception {
        switch (this.f8595a) {
            case 0:
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f8596b == null) {
                    this.f8596b = exc;
                    this.f8597c = 100 + jElapsedRealtime;
                }
                if (jElapsedRealtime >= this.f8597c) {
                    Exception exc2 = this.f8596b;
                    if (exc2 != exc) {
                        exc2.addSuppressed(exc);
                    }
                    Exception exc3 = this.f8596b;
                    this.f8596b = null;
                    throw exc3;
                }
                return;
            default:
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (this.f8596b == null) {
                    this.f8596b = exc;
                    this.f8597c = 100 + jElapsedRealtime2;
                }
                if (jElapsedRealtime2 >= this.f8597c) {
                    Exception exc4 = this.f8596b;
                    if (exc4 != exc) {
                        exc4.addSuppressed(exc);
                    }
                    Exception exc5 = this.f8596b;
                    this.f8596b = null;
                    throw exc5;
                }
                return;
        }
    }
}
