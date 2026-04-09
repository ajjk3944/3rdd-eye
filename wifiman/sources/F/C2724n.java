package F;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import org.snmp4j.mp.MPv3;
import w0.AbstractC8250d;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2724n {

    /* renamed from: a, reason: collision with root package name */
    private Integer f5592a;

    public final Integer a(KeyEvent keyEvent) {
        int iC = AbstractC8250d.c(keyEvent);
        if ((Integer.MIN_VALUE & iC) != 0) {
            this.f5592a = Integer.valueOf(iC & MPv3.MAX_MESSAGE_ID);
            return null;
        }
        Integer num = this.f5592a;
        if (num == null) {
            return Integer.valueOf(iC);
        }
        this.f5592a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iC));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        return num2 == null ? Integer.valueOf(iC) : num2;
    }
}
