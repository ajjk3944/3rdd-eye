.class public abstract LF/V;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/i;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, LF/V$b;->a:LF/V$b;

    invoke-static {v0}, Lr/j;->f(Lmh/l;)Lr/T;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v0

    sput-object v0, LF/V;->a:Lr/i;

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LF/V;->b:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;LF/E;LR0/Q;LR0/H;Lm0/l0;Z)Landroidx/compose/ui/e;
    .locals 0

    if-eqz p5, :cond_0

    new-instance p5, LF/V$a;

    invoke-direct {p5, p4, p1, p2, p3}, LF/V$a;-><init>(Lm0/l0;LF/E;LR0/Q;LR0/H;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, p5, p1, p2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final b()F
    .locals 1

    sget v0, LF/V;->b:F

    return v0
.end method
