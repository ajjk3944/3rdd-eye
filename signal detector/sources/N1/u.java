package n1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f22294a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22295b = true;

    public u(Appendable appendable) {
        this.f22294a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) throws IOException {
        boolean z6 = this.f22295b;
        Appendable appendable = this.f22294a;
        if (z6) {
            this.f22295b = false;
            appendable.append("  ");
        }
        this.f22295b = c6 == '\n';
        appendable.append(c6);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i3) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z6 = this.f22295b;
        Appendable appendable = this.f22294a;
        boolean z7 = false;
        if (z6) {
            this.f22295b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
            z7 = true;
        }
        this.f22295b = z7;
        appendable.append(charSequence, i, i3);
        return this;
    }
}
