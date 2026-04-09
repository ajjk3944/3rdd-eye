package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xa {
    public static final xa f;
    public static final xa g;
    public static final xa h;
    public static final xa i;
    public static final xa j;
    public static final xa k;
    public static final xa l;
    public static final /* synthetic */ xa[] m;

    /* JADX INFO: Fake field, exist only in values array */
    xa EF1;

    static {
        xa xaVar = new xa("CLEAR", 0);
        xa xaVar2 = new xa("SRC", 1);
        xa xaVar3 = new xa("DST", 2);
        xa xaVar4 = new xa("SRC_OVER", 3);
        xa xaVar5 = new xa("DST_OVER", 4);
        xa xaVar6 = new xa("SRC_IN", 5);
        xa xaVar7 = new xa("DST_IN", 6);
        xa xaVar8 = new xa("SRC_OUT", 7);
        xa xaVar9 = new xa("DST_OUT", 8);
        xa xaVar10 = new xa("SRC_ATOP", 9);
        xa xaVar11 = new xa("DST_ATOP", 10);
        xa xaVar12 = new xa("XOR", 11);
        xa xaVar13 = new xa("PLUS", 12);
        f = xaVar13;
        xa xaVar14 = new xa("MODULATE", 13);
        g = xaVar14;
        xa xaVar15 = new xa("SCREEN", 14);
        h = xaVar15;
        xa xaVar16 = new xa("OVERLAY", 15);
        i = xaVar16;
        xa xaVar17 = new xa("DARKEN", 16);
        j = xaVar17;
        xa xaVar18 = new xa("LIGHTEN", 17);
        k = xaVar18;
        xa xaVar19 = new xa("COLOR_DODGE", 18);
        xa xaVar20 = new xa("COLOR_BURN", 19);
        xa xaVar21 = new xa("HARD_LIGHT", 20);
        xa xaVar22 = new xa("SOFT_LIGHT", 21);
        xa xaVar23 = new xa("DIFFERENCE", 22);
        xa xaVar24 = new xa("EXCLUSION", 23);
        xa xaVar25 = new xa("MULTIPLY", 24);
        l = xaVar25;
        m = new xa[]{xaVar, xaVar2, xaVar3, xaVar4, xaVar5, xaVar6, xaVar7, xaVar8, xaVar9, xaVar10, xaVar11, xaVar12, xaVar13, xaVar14, xaVar15, xaVar16, xaVar17, xaVar18, xaVar19, xaVar20, xaVar21, xaVar22, xaVar23, xaVar24, xaVar25, new xa("HUE", 25), new xa("SATURATION", 26), new xa("COLOR", 27), new xa("LUMINOSITY", 28)};
    }

    public static xa valueOf(String str) {
        return (xa) Enum.valueOf(xa.class, str);
    }

    public static xa[] values() {
        return (xa[]) m.clone();
    }
}
