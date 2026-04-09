package q6;

/* compiled from: StoredValueDeclarationException.kt */
/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5492a extends RuntimeException {
    public C5492a(int i, IllegalArgumentException illegalArgumentException, String str) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : illegalArgumentException);
    }
}
