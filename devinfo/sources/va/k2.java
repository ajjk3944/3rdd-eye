package va;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k2 implements w4.l {

    /* renamed from: a, reason: collision with root package name */
    public final String f36130a;

    @Override // w4.l
    public boolean d(CharSequence charSequence, int i4, int i10, w4.s sVar) {
        if (!TextUtils.equals(charSequence.subSequence(i4, i10), this.f36130a)) {
            return true;
        }
        sVar.f36462c = (sVar.f36462c & 3) | 4;
        return false;
    }

    @Override // w4.l
    public Object c() {
        return this;
    }
}
