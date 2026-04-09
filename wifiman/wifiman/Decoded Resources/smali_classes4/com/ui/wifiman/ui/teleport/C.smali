.class public abstract Lcom/ui/wifiman/ui/teleport/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/ui/teleport/C$a;
    }
.end annotation


# direct methods
.method public static final a(Lcom/ui/wifiman/ui/teleport/y;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1e4ef605

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.color (TeleportTunnelCommons.kt:16)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$c;

    if-eqz p2, :cond_1

    const p0, 0x718b66e6

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->i()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    instance-of p2, p0, Lcom/ui/wifiman/ui/teleport/y$b;

    if-eqz p2, :cond_2

    const p0, 0x718b70e6

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->b()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_2
    instance-of p0, p0, Lcom/ui/wifiman/ui/teleport/y$a;

    if-eqz p0, :cond_4

    const p0, 0x718b7ae6

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0

    :cond_4
    const p0, 0x718b5be8

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lcom/ui/wifiman/ui/teleport/z;LT/l;I)J
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x30b81ca

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.color (TeleportTunnelCommons.kt:24)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/ui/wifiman/ui/teleport/C$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    if-eq p0, p2, :cond_4

    const/4 p2, 0x2

    if-eq p0, p2, :cond_3

    const/4 p2, 0x3

    if-eq p0, p2, :cond_2

    const/4 p2, 0x4

    if-ne p0, p2, :cond_1

    const p0, 0x718bb146

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->e()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p0, 0x718b8728

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    const p0, 0x718ba6a6

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->h()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_3
    const p0, 0x718b9c06

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$b;->g()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_0

    :cond_4
    const p0, 0x718b9166

    invoke-interface {p1, p0}, LT/l;->U(I)V

    sget-object p0, Lla/a;->a:Lla/a;

    sget p2, Lla/a;->b:I

    invoke-virtual {p0, p1, p2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a;->a()Lma/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lma/a$a;->d()Lr9/a$a;

    move-result-object p0

    invoke-virtual {p0}, Lr9/a$a;->f()J

    move-result-wide v0

    invoke-interface {p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->J()V

    return-wide v0
.end method

.method public static final c(Lcom/ui/wifiman/ui/teleport/z;LT/l;I)LT/z1;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p2

    const v2, 0x320d4f0b

    invoke-interface {v10, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.colorAnimated (TeleportTunnelCommons.kt:32)"

    invoke-static {v2, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const-string v2, "connectionState loading transition"

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v2, v10, v3, v4}, Lr/P;->c(Ljava/lang/String;LT/l;II)Lr/O;

    move-result-object v2

    if-eqz v0, :cond_1

    const v2, 0x31323e2c

    invoke-interface {v10, v2}, LT/l;->U(I)V

    and-int/lit8 v1, v1, 0xe

    invoke-static {v0, v10, v1}, Lcom/ui/wifiman/ui/teleport/C;->b(Lcom/ui/wifiman/ui/teleport/z;LT/l;I)J

    move-result-wide v0

    const/16 v6, 0x180

    const/16 v7, 0xa

    const/4 v2, 0x0

    const-string v3, "connection state loaded"

    const/4 v4, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v0 .. v7}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const v0, 0x3133abc1

    invoke-interface {v10, v0}, LT/l;->U(I)V

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->f()J

    move-result-wide v11

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v5

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, v10, v1}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->g()J

    move-result-wide v7

    const/16 v0, 0x3e8

    const/4 v1, 0x0

    invoke-static {v0, v4, v1, v3, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v11

    sget-object v12, Lr/b0;->Reverse:Lr/b0;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v11 .. v16}, Lr/j;->e(Lr/D;Lr/b0;JILjava/lang/Object;)Lr/N;

    move-result-object v9

    sget v0, Lr/O;->f:I

    or-int/lit16 v0, v0, 0x6030

    sget v1, Lr/N;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int v11, v0, v1

    const/4 v12, 0x0

    const-string v13, "connection state loading"

    move-object v0, v2

    move-wide v1, v5

    move-wide v3, v7

    move-object v5, v9

    move-object v6, v13

    move-object/from16 v7, p1

    move v8, v11

    move v9, v12

    invoke-static/range {v0 .. v9}, Lq/B;->a(Lr/O;JJLr/N;Ljava/lang/String;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    return-object v0
.end method

.method public static final d(Lcom/ui/wifiman/ui/teleport/z;)Ls9/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/ui/teleport/C$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->y4:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->U3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->S3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_3
    new-instance p0, Ls9/d$b;

    sget v0, Lm8/c;->T3:I

    invoke-direct {p0, v0}, Ls9/d$b;-><init>(I)V

    :goto_0
    return-object p0
.end method
