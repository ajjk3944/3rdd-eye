package M3;

import L0.I;
import L0.S;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;
import t4.C5606d;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f4175a;

    /* renamed from: b, reason: collision with root package name */
    public int f4176b;

    /* renamed from: c, reason: collision with root package name */
    public int f4177c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4178d;

    public d() {
        if (C5606d.f46404d == null) {
            C5606d.f46404d = new C5606d(24);
        }
    }

    public int a(int i) {
        if (i < this.f4177c) {
            return ((ByteBuffer) this.f4178d).getShort(this.f4176b + i);
        }
        return 0;
    }

    public void b() {
        int i = this.f4177c;
        View view = (View) this.f4178d;
        int top = i - (view.getTop() - this.f4175a);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f4176b));
    }
}
