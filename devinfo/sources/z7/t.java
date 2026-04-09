package z7;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f38096a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38097b = true;

    public t(Appendable appendable) {
        this.f38096a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c9) throws IOException {
        boolean z3 = this.f38097b;
        Appendable appendable = this.f38096a;
        if (z3) {
            this.f38097b = false;
            appendable.append("  ");
        }
        this.f38097b = c9 == '\n';
        appendable.append(c9);
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
    public final Appendable append(CharSequence charSequence, int i4, int i10) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z3 = this.f38097b;
        Appendable appendable = this.f38096a;
        boolean z10 = false;
        if (z3) {
            this.f38097b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z10 = true;
        }
        this.f38097b = z10;
        appendable.append(charSequence, i4, i10);
        return this;
    }
}
