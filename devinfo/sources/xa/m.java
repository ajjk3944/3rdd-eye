package xa;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageButton f37073a;

    /* renamed from: b, reason: collision with root package name */
    public final i f37074b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.content.Context r7, com.google.android.gms.internal.ads.pl0 r8, xa.i r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.m.<init>(android.content.Context, com.google.android.gms.internal.ads.pl0, xa.i):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f37074b;
        if (iVar != null) {
            iVar.f37063w = 2;
            iVar.f37044b.finish();
        }
    }
}
