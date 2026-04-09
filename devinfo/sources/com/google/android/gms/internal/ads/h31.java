package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h31 extends j31 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11693f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h31(CharSequence charSequence, Object obj, int i4) {
        super(charSequence);
        this.f11693f = i4;
        this.g = obj;
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final int a(int i4) {
        switch (this.f11693f) {
            case 0:
                CharSequence charSequence = this.f12617c;
                int length = charSequence.length();
                mq0.g0(i4, length);
                while (i4 < length) {
                    if (((y21) this.g).a(charSequence.charAt(i4))) {
                        return i4;
                    }
                    i4++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((rg0) this.g).f15651b;
                if (matcher.find(i4)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.j31
    public final int b(int i4) {
        switch (this.f11693f) {
            case 0:
                return i4 + 1;
            default:
                return ((Matcher) ((rg0) this.g).f15651b).end();
        }
    }
}
