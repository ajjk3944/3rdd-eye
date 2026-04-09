.class public abstract LQ/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ/v$b;
    }
.end annotation


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LQ/v$a;->a:LQ/v$a;

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, LQ/v;->a:LT/H0;

    return-void
.end method

.method public static final a(LE/a;)LE/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/c;->c(F)LE/b;

    move-result-object v3

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/c;->c(F)LE/b;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LE/a;->d(LE/a;LE/b;LE/b;LE/b;LE/b;ILjava/lang/Object;)LE/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LQ/u;LS/e;)Lm0/i1;
    .locals 1

    sget-object v0, LQ/v$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    invoke-virtual {p0}, LQ/u;->e()LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    invoke-static {}, Lm0/c1;->a()Lm0/i1;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, LQ/u;->d()LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, LQ/u;->c()LE/a;

    move-result-object p0

    invoke-static {p0}, LQ/v;->e(LE/a;)LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, LQ/u;->c()LE/a;

    move-result-object p0

    invoke-static {p0}, LQ/v;->a(LE/a;)LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, LQ/u;->c()LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_6
    invoke-static {}, LE/h;->g()LE/g;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, LQ/u;->b()LE/a;

    move-result-object p0

    invoke-static {p0}, LQ/v;->e(LE/a;)LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0}, LQ/u;->b()LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0}, LQ/u;->a()LE/a;

    move-result-object p0

    invoke-static {p0}, LQ/v;->e(LE/a;)LE/a;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0}, LQ/u;->a()LE/a;

    move-result-object p0

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final c()LT/H0;
    .locals 1

    sget-object v0, LQ/v;->a:LT/H0;

    return-object v0
.end method

.method public static final d(LS/e;LT/l;I)Lm0/i1;
    .locals 3

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.<get-value> (Shapes.kt:191)"

    const v2, 0x611b333f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LQ/l;->a:LQ/l;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LQ/l;->b(LT/l;I)LQ/u;

    move-result-object p1

    invoke-static {p1, p0}, LQ/v;->b(LQ/u;LS/e;)Lm0/i1;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-object p0
.end method

.method public static final e(LE/a;)LE/a;
    .locals 9

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LE/c;->c(F)LE/b;

    move-result-object v6

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/c;->c(F)LE/b;

    move-result-object v5

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, LE/a;->d(LE/a;LE/b;LE/b;LE/b;LE/b;ILjava/lang/Object;)LE/a;

    move-result-object p0

    return-object p0
.end method
