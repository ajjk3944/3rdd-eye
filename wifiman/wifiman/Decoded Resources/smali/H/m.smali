.class public abstract LH/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LH/l;)V
    .locals 3

    invoke-virtual {p0}, LH/l;->r()LH/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, LH/f;->d()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, LH/g;->a(LH/f;II)V

    invoke-static {v0}, LH/g;->b(LH/f;)V

    invoke-virtual {p0, v0}, LH/l;->d(LH/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LH/l;->f()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, LH/l;->f()V

    throw v0
.end method

.method public static final b(Ljava/lang/String;JLT/l;II)LH/l;
    .locals 7

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const-string p0, ""

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide p1

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_2

    const/4 p5, -0x1

    const-string v0, "androidx.compose.foundation.text.input.rememberTextFieldState (TextFieldState.kt:620)"

    const v1, 0x431414ad

    invoke-static {v1, p4, p5, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 p5, 0x0

    new-array v0, p5, [Ljava/lang/Object;

    sget-object v1, LH/l$b;->a:LH/l$b;

    and-int/lit8 v2, p4, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-le v2, v3, :cond_3

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    and-int/lit8 v2, p4, 0x6

    if-ne v2, v3, :cond_5

    :cond_4
    move v2, v4

    goto :goto_0

    :cond_5
    move v2, p5

    :goto_0
    and-int/lit8 v3, p4, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/16 v5, 0x20

    if-le v3, v5, :cond_6

    invoke-interface {p3, p1, p2}, LT/l;->j(J)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    and-int/lit8 p4, p4, 0x30

    if-ne p4, v5, :cond_8

    :cond_7
    move p5, v4

    :cond_8
    or-int p4, v2, p5

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_9

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p5, p4, :cond_a

    :cond_9
    new-instance p5, LH/m$a;

    invoke-direct {p5, p0, p1, p2}, LH/m$a;-><init>(Ljava/lang/String;J)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v3, p5

    check-cast v3, Lmh/a;

    const/16 v5, 0x30

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v4, p3

    invoke-static/range {v0 .. v6}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH/l;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    return-object p0
.end method
