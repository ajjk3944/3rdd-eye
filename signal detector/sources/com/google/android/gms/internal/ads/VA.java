package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class VA extends XA {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VA(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.f11962f = i;
        this.f11963g = obj;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final int a(int i) {
        switch (this.f11962f) {
            case 0:
                CharSequence charSequence = this.f12400c;
                int length = charSequence.length();
                AbstractC0582Jp.l0(i, length);
                while (i < length) {
                    if (((MA) this.f11963g).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((C1014cu) this.f11963g).f13695b;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final int b(int i) {
        switch (this.f11962f) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((C1014cu) this.f11963g).f13695b).end();
        }
    }
}
