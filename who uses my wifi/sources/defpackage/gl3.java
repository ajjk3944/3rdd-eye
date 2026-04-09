package defpackage;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gl3 extends jl3 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl3(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.jl3
    public final int a(int i) {
        switch (this.k) {
            case 0:
                CharSequence charSequence = this.h;
                int length = charSequence.length();
                zt0.f0(i, length);
                while (i < length) {
                    if (((yk3) this.l).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((ci3) this.l).g;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // defpackage.jl3
    public final int b(int i) {
        switch (this.k) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((ci3) this.l).g).end();
        }
    }
}
