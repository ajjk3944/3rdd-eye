.class final LFf/i$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFf/i$b$a;->a(LFf/c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LFf/c;

.field final synthetic b:LFf/e;

.field final synthetic c:LGf/u;


# direct methods
.method constructor <init>(LFf/c;LFf/e;LGf/u;)V
    .locals 0

    iput-object p1, p0, LFf/i$b$a$a;->a:LFf/c;

    iput-object p2, p0, LFf/i$b$a$a;->b:LFf/e;

    iput-object p3, p0, LFf/i$b$a$a;->c:LGf/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LFf/e;LGf/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LFf/i$b$a$a;->h(LFf/e;LGf/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LFf/e;LGf/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LFf/i$b$a$a;->f(LFf/e;LGf/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LFf/e;LGf/i;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LFf/i$b$a$a;->i(LFf/e;LGf/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final f(LFf/e;LGf/i;)LYg/J;
    .locals 0

    check-cast p1, LGf/i$c;

    invoke-virtual {p1}, LGf/i$c;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LFf/e;->E0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(LFf/e;LGf/i;)LYg/J;
    .locals 0

    check-cast p1, LGf/i$c;

    invoke-virtual {p1}, LGf/i$c;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LFf/e;->E0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(LFf/e;LGf/i;)LYg/J;
    .locals 0

    check-cast p1, LGf/i$a;

    invoke-virtual {p1}, LGf/i$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LFf/e;->w0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final e(Landroidx/compose/ui/e;LGf/i;LT/l;I)V
    .locals 11

    const-string v0, "itemModifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    and-int/lit8 p4, p4, 0x40

    if-nez p4, :cond_2

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    goto :goto_2

    :cond_2
    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    :goto_2
    if-eqz p4, :cond_3

    move p4, v2

    goto :goto_3

    :cond_3
    const/16 p4, 0x10

    :goto_3
    or-int/2addr v0, p4

    :cond_4
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_6

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_a

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_7

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:230)"

    const v3, 0x8607ca9

    invoke-static {v3, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of p4, p2, LGf/i$c;

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_12

    const p4, 0x75ed6944

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LFf/i$b$a$a;->a:LFf/c;

    instance-of v4, p4, LFf/c$b;

    if-eqz v4, :cond_c

    const p4, -0x36009215

    invoke-interface {p3, p4}, LT/l;->U(I)V

    const p4, -0x36008268    # -2092979.0f

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    and-int/lit8 v4, v0, 0x70

    if-eq v4, v2, :cond_9

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_8

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    move v1, v3

    :cond_9
    :goto_5
    or-int/2addr p4, v1

    iget-object v0, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_a

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_b

    :cond_a
    new-instance v1, LFf/l;

    invoke-direct {v1, v0, p2}, LFf/l;-><init>(LFf/e;LGf/i;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v1

    check-cast v8, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p2, LGf/i$c;

    invoke-virtual {p2}, LGf/i$c;->a()LGf/j;

    move-result-object p2

    iget-object p4, p0, LFf/i$b$a$a;->c:LGf/u;

    invoke-static {p1, p2, p4, p3, v3}, LGf/t;->k(Landroidx/compose/ui/e;LGf/j;LGf/u;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_7

    :cond_c
    instance-of p4, p4, LFf/c$a;

    if-eqz p4, :cond_11

    const p4, -0x360064b1

    invoke-interface {p3, p4}, LT/l;->U(I)V

    const p4, -0x360054e8

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    and-int/lit8 v4, v0, 0x70

    if-eq v4, v2, :cond_e

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_d

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_6

    :cond_d
    move v1, v3

    :cond_e
    :goto_6
    or-int/2addr p4, v1

    iget-object v0, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_f

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_10

    :cond_f
    new-instance v1, LFf/m;

    invoke-direct {v1, v0, p2}, LFf/m;-><init>(LFf/e;LGf/i;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v8, v1

    check-cast v8, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p2, LGf/i$c;

    invoke-virtual {p2}, LGf/i$c;->a()LGf/j;

    move-result-object p2

    invoke-static {p1, p2, p3, v3}, LGf/t;->g(Landroidx/compose/ui/e;LGf/j;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_7
    invoke-interface {p3}, LT/l;->J()V

    goto/16 :goto_9

    :cond_11
    const p1, -0x36009982

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_12
    instance-of p4, p2, LGf/i$a;

    if-eqz p4, :cond_17

    const p4, -0x3600139b

    invoke-interface {p3, p4}, LT/l;->U(I)V

    const p4, -0x36000501

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    and-int/lit8 v4, v0, 0x70

    if-eq v4, v2, :cond_14

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_13

    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_8

    :cond_13
    move v1, v3

    :cond_14
    :goto_8
    or-int/2addr p4, v1

    iget-object v0, p0, LFf/i$b$a$a;->b:LFf/e;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_15

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_16

    :cond_15
    new-instance v1, LFf/n;

    invoke-direct {v1, v0, p2}, LFf/n;-><init>(LFf/e;LGf/i;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_16
    move-object v8, v1

    check-cast v8, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p2, LGf/i$a;

    invoke-virtual {p2}, LGf/i$a;->a()LGf/b;

    move-result-object p2

    invoke-static {p1, p2, p3, v3}, LGf/d;->b(Landroidx/compose/ui/e;LGf/b;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_9

    :cond_17
    instance-of p1, p2, LGf/i$b;

    if-eqz p1, :cond_19

    const p1, -0x35ffee6b

    invoke-interface {p3, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p4, v1, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p2, LGf/i$b;

    invoke-virtual {p2}, LGf/i$b;->a()Ls9/d;

    move-result-object p2

    const/4 p4, 0x6

    invoke-static {p1, p2, p3, p4}, LEe/F;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-static {}, LT/o;->P()V

    :cond_18
    :goto_a
    return-void

    :cond_19
    const p1, -0x36009f21

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LGf/i;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LFf/i$b$a$a;->e(Landroidx/compose/ui/e;LGf/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
