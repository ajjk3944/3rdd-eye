package fj;

import ej.C5481e;
import ej.h;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: fj.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5835b {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f47361a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.AbstractC5835b.c(byte[], int):int");
    }

    public static final void d(h hVar, C5481e buffer, int i10, int i11) {
        AbstractC6492s.i(hVar, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        buffer.write(hVar.n(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f47361a;
    }
}
