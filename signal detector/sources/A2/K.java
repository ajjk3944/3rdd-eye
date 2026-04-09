package A2;

import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.Ou;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f181d;

    public /* synthetic */ K(Object obj, boolean z6, boolean z7, int i) {
        this.f178a = i;
        this.f181d = obj;
        this.f179b = z6;
        this.f180c = z7;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f178a) {
            case 0:
                ((L) this.f181d).d(this.f179b, this.f180c);
                break;
            default:
                ((C0697Ql) ((Ou) this.f181d).f10271c).q(this.f179b, this.f180c);
                break;
        }
    }
}
