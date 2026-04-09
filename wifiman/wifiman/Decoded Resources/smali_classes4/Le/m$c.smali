.class final LLe/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe/m;->c(Landroidx/compose/ui/e;ZLLe/d;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLe/d;


# direct methods
.method constructor <init>(LLe/d;)V
    .locals 0

    iput-object p1, p0, LLe/m$c;->a:LLe/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LLe/d;LMe/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LLe/m$c;->f(LLe/d;LMe/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LLe/d;LMe/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LLe/m$c;->e(LLe/d;LMe/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LLe/d;LMe/f;)LYg/J;
    .locals 0

    check-cast p1, LMe/g;

    invoke-virtual {p1}, LMe/g;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LLe/d;->u0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(LLe/d;LMe/f;)LYg/J;
    .locals 0

    check-cast p1, LMe/c;

    invoke-virtual {p1}, LMe/c;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LLe/d;->u0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/compose/ui/e;LMe/f;LT/l;I)V
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

    goto/16 :goto_8

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_7

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults.<anonymous>.<anonymous> (DiscoveryHomeResults.kt:66)"

    const v3, -0x276278ec

    invoke-static {v3, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of p4, p2, LMe/g;

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-eqz p4, :cond_c

    const p4, -0x37e00944

    invoke-interface {p3, p4}, LT/l;->U(I)V

    const p4, -0x37dffd7a

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LLe/m$c;->a:LLe/d;

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

    iget-object v0, p0, LLe/m$c;->a:LLe/d;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_a

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_b

    :cond_a
    new-instance v1, LLe/n;

    invoke-direct {v1, v0, p2}, LLe/n;-><init>(LLe/d;LMe/f;)V

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

    check-cast p2, LMe/g;

    invoke-static {p1, p2, p3, v3}, LMe/i;->b(Landroidx/compose/ui/e;LMe/g;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_7

    :cond_c
    instance-of p4, p2, LMe/c;

    if-eqz p4, :cond_12

    const p4, -0x37dfec9e

    invoke-interface {p3, p4}, LT/l;->U(I)V

    const p4, -0x37dfe01a

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LLe/m$c;->a:LLe/d;

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

    iget-object v0, p0, LLe/m$c;->a:LLe/d;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_f

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_10

    :cond_f
    new-instance v1, LLe/o;

    invoke-direct {v1, v0, p2}, LLe/o;-><init>(LLe/d;LMe/f;)V

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

    check-cast p2, LMe/c;

    invoke-static {p1, p2, p3, v3}, LMe/e;->b(Landroidx/compose/ui/e;LMe/c;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_8
    return-void

    :cond_12
    const p1, -0x37e00ef4

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LMe/f;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LLe/m$c;->c(Landroidx/compose/ui/e;LMe/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
