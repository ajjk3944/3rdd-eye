package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public CoderResult f26032a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26033b;

    public final int a(char c9, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c9)) {
            if (!charBuffer.hasRemaining()) {
                this.f26032a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c10 = charBuffer.get();
            if (Character.isLowSurrogate(c10)) {
                int codePoint = Character.toCodePoint(c9, c10);
                this.f26033b = true;
                this.f26032a = null;
                return codePoint;
            }
            this.f26032a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c9)) {
            this.f26032a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f26033b = false;
        this.f26032a = null;
        return c9;
    }

    public final int b(char c9, char[] cArr, int i4, int i10) {
        if (!Character.isHighSurrogate(c9)) {
            if (Character.isLowSurrogate(c9)) {
                this.f26032a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f26033b = false;
            this.f26032a = null;
            return c9;
        }
        if (i10 - i4 < 2) {
            this.f26032a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c10 = cArr[i4 + 1];
        if (Character.isLowSurrogate(c10)) {
            int codePoint = Character.toCodePoint(c9, c10);
            this.f26033b = true;
            this.f26032a = null;
            return codePoint;
        }
        this.f26032a = CoderResult.malformedForLength(1);
        return -1;
    }
}
