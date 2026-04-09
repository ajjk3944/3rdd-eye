package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public CoderResult f20642a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20643b;

    public final int a(char c6, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c6)) {
            if (!charBuffer.hasRemaining()) {
                this.f20642a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c7 = charBuffer.get();
            if (Character.isLowSurrogate(c7)) {
                int codePoint = Character.toCodePoint(c6, c7);
                this.f20643b = true;
                this.f20642a = null;
                return codePoint;
            }
            this.f20642a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c6)) {
            this.f20642a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f20643b = false;
        this.f20642a = null;
        return c6;
    }

    public final int b(char c6, char[] cArr, int i, int i3) {
        if (!Character.isHighSurrogate(c6)) {
            if (Character.isLowSurrogate(c6)) {
                this.f20642a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f20643b = false;
            this.f20642a = null;
            return c6;
        }
        if (i3 - i < 2) {
            this.f20642a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c7 = cArr[i + 1];
        if (Character.isLowSurrogate(c7)) {
            int codePoint = Character.toCodePoint(c6, c7);
            this.f20643b = true;
            this.f20642a = null;
            return codePoint;
        }
        this.f20642a = CoderResult.malformedForLength(1);
        return -1;
    }
}
