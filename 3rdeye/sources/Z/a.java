package Z;

import N7.G8;
import Z.l;
import g0.C4356c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: AudioSettings.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Integer> f13893a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* compiled from: AudioSettings.java */
    /* renamed from: Z.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0204a {
        public final l a() {
            l.a aVar = (l.a) this;
            if (!"".isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(""));
            }
            l lVar = new l(aVar.f13950a.intValue(), aVar.f13951b.intValue(), aVar.f13952c.intValue(), aVar.f13953d.intValue());
            String strS = lVar.f13946b == -1 ? " audioSource" : "";
            if (lVar.f13947c <= 0) {
                strS = strS.concat(" sampleRate");
            }
            if (lVar.f13948d <= 0) {
                strS = G8.s(strS, " channelCount");
            }
            if (lVar.f13949e == -1) {
                strS = G8.s(strS, " audioFormat");
            }
            if (strS.isEmpty()) {
                return lVar;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strS));
        }
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        int iA = a();
        int iD = d();
        A2.l.k("Invalid channel count: " + iD, iD > 0);
        if (iA == 2) {
            return iD * 2;
        }
        if (iA == 3) {
            return iD;
        }
        if (iA != 4) {
            if (iA == 21) {
                return iD * 3;
            }
            if (iA != 22) {
                throw new IllegalArgumentException(C4356c.h(iA, "Invalid audio encoding: "));
            }
        }
        return iD * 4;
    }

    public abstract int d();

    public abstract int e();
}
