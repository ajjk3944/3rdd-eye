package n3;

import n3.AbstractC5355a;

/* compiled from: Note.kt */
/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5355a<N extends AbstractC5355a<? extends N>> {

    /* compiled from: Note.kt */
    /* renamed from: n3.a$a, reason: collision with other inner class name */
    public enum EnumC0500a {
        Left,
        Top,
        Right,
        Bottom
    }

    /* compiled from: Note.kt */
    /* renamed from: n3.a$b */
    public enum b {
        TopIndicator,
        CenterIndicator,
        BottomIndicator,
        TopSpeedometer,
        CenterSpeedometer,
        QuarterSpeedometer
    }

    /* compiled from: Note.kt */
    /* renamed from: n3.a$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f44277a = 0;

        static {
            int[] iArr = new int[EnumC0500a.values().length];
            iArr[EnumC0500a.Left.ordinal()] = 1;
            iArr[EnumC0500a.Top.ordinal()] = 2;
            iArr[EnumC0500a.Right.ordinal()] = 3;
            iArr[EnumC0500a.Bottom.ordinal()] = 4;
        }
    }
}
