package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class si4 extends lq1 {
    public final xm3 h;

    public si4(String str, sn3 sn3Var) {
        super(str, null, false, 1);
        this.h = xm3.m(sn3Var);
    }

    @Override // defpackage.lq1, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        xm3 xm3Var = this.h;
        if (xm3Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(xm3Var);
        return ex0.l(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
