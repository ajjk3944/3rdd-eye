package hf;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y implements j4.m {

    /* renamed from: a, reason: collision with root package name */
    public String f10732a;

    public y(String str, int i10) {
        switch (i10) {
            case 3:
                str.getClass();
                this.f10732a = str;
                break;
            default:
                this.f10732a = str;
                break;
        }
    }

    @Override // j4.m
    public boolean a(CharSequence charSequence, int i10, int i11, j4.u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f10732a)) {
            return true;
        }
        uVar.f13247c = (uVar.f13247c & 3) | 4;
        return false;
    }

    public void c(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f10732a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // j4.m
    public Object b() {
        return this;
    }
}
