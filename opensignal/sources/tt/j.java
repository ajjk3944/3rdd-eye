package tt;

import java.util.regex.Matcher;
import mq.e0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f23004a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f23005b;

    /* renamed from: c, reason: collision with root package name */
    public final s0.j f23006c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f23007d;

    public j(Matcher matcher, CharSequence charSequence) {
        br.l.e(charSequence, "input");
        this.f23004a = matcher;
        this.f23005b = charSequence;
        this.f23006c = new s0.j(1, this);
    }
}
