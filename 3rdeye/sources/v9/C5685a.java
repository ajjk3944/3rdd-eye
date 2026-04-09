package v9;

import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: Progressions.kt */
/* renamed from: v9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5685a implements Iterable<Character>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final char f47088b;

    /* renamed from: c, reason: collision with root package name */
    public final char f47089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47090d = 1;

    public C5685a(char c10, char c11) {
        this.f47088b = c10;
        this.f47089c = (char) B7.d.p(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new C5686b(this.f47088b, this.f47089c, this.f47090d);
    }
}
