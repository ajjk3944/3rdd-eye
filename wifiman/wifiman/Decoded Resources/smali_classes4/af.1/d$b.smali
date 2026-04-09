.class final Laf/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Laf/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/d$b;

    invoke-direct {v0}, Laf/d$b;-><init>()V

    sput-object v0, Laf/d$b;->a:Laf/d$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$b;->k()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$b;->j()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Z)LYg/J;
    .locals 0

    invoke-static {p0}, Laf/d$b;->n(Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$b;->i()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$b;->l()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final i()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final j()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final k()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final l()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final n(Z)LYg/J;
    .locals 0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final h(LT/l;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedtestCardUiKt.lambda-2.<anonymous> (SpeedTabSpeedtestCardUi.kt:417)"

    const v2, -0x690dc47

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v4, Laf/e0$a$a$a;

    invoke-direct {v4, v2, v1, v2}, Laf/e0$a$a$a;-><init>(Ljava/lang/Boolean;ZLs9/d;)V

    const p2, -0x4310822a

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_3

    new-instance p2, Laf/e;

    invoke-direct {p2}, Laf/e;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v5, p2

    check-cast v5, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const p2, -0x43108baa

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_4

    new-instance p2, Laf/f;

    invoke-direct {p2}, Laf/f;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p2

    check-cast v6, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const p2, -0x431086ca

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_5

    new-instance p2, Laf/g;

    invoke-direct {p2}, Laf/g;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v7, p2

    check-cast v7, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const p2, -0x43107cea

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_6

    new-instance p2, Laf/h;

    invoke-direct {p2}, Laf/h;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v8, p2

    check-cast v8, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const p2, -0x431077ea

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_7

    new-instance p2, Laf/i;

    invoke-direct {p2}, Laf/i;-><init>()V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v9, p2

    check-cast v9, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const v11, 0x1b6db6

    move-object v10, p1

    invoke-static/range {v3 .. v11}, Laf/m0;->q(Landroidx/compose/ui/e;Laf/e0$a;Lmh/a;Lmh/a;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/d$b;->h(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
