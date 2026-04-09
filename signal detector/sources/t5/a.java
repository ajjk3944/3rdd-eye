package t5;

import java.util.Random;

/* loaded from: classes3.dex */
public abstract class a extends d {
    @Override // t5.d
    public final int a(int i) {
        return b().nextInt(i);
    }

    public abstract Random b();
}
