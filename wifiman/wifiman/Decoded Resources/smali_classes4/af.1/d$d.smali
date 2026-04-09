.class final Laf/d$d;
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
.field public static final a:Laf/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/d$d;

    invoke-direct {v0}, Laf/d$d;-><init>()V

    sput-object v0, Laf/d$d;->a:Laf/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$d;->j()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Z)LYg/J;
    .locals 0

    invoke-static {p0}, Laf/d$d;->n(Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$d;->l()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$d;->i()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()LYg/J;
    .locals 1

    invoke-static {}, Laf/d$d;->k()LYg/J;

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
    .locals 18

    move-object/from16 v7, p1

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speed.component.ComposableSingletons$SpeedTabSpeedtestCardUiKt.lambda-4.<anonymous> (SpeedTabSpeedtestCardUi.kt:458)"

    const v3, 0x5c2576db

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v1, Laf/e0$a$a$b;

    new-instance v12, Ls9/d$c;

    const-string v2, "Jun 25, 2020 at 1:26 PM"

    invoke-direct {v12, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v13, Ls9/d$c;

    const-string v2, "Internet \u00e2\u0086\u0092  iPhone"

    invoke-direct {v13, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v14, Ls9/d$c;

    const-string v2, "140 Mbps 150Mbps"

    invoke-direct {v14, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v15, Ls9/d$c;

    const-string v2, "20 ms"

    invoke-direct {v15, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v2, Laf/e0;->a:Laf/e0;

    invoke-virtual {v2}, Laf/e0;->a()Lhf/h;

    move-result-object v16

    invoke-virtual {v2}, Laf/e0;->b()Lhf/h;

    move-result-object v17

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v17}, Laf/e0$a$a$b;-><init>(Ljava/lang/Boolean;ZLs9/d;Ls9/d;Ls9/d;Ls9/d;Ls9/d;Lhf/h;Lhf/h;)V

    const v2, 0x70a72c98

    invoke-interface {v7, v2}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    new-instance v2, Laf/o;

    invoke-direct {v2}, Laf/o;-><init>()V

    invoke-interface {v7, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v4, 0x70a72318

    invoke-interface {v7, v4}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_4

    new-instance v4, Laf/p;

    invoke-direct {v4}, Laf/p;-><init>()V

    invoke-interface {v7, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v5, 0x70a727f8

    invoke-interface {v7, v5}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v5, v6, :cond_5

    new-instance v5, Laf/q;

    invoke-direct {v5}, Laf/q;-><init>()V

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v6, 0x70a731d8

    invoke-interface {v7, v6}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_6

    new-instance v6, Laf/r;

    invoke-direct {v6}, Laf/r;-><init>()V

    invoke-interface {v7, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v8, 0x70a736d8

    invoke-interface {v7, v8}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_7

    new-instance v8, Laf/s;

    invoke-direct {v8}, Laf/s;-><init>()V

    invoke-interface {v7, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v9, 0x1b6d86

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v7, p1

    move v8, v9

    invoke-static/range {v0 .. v8}, Laf/m0;->q(Landroidx/compose/ui/e;Laf/e0$a;Lmh/a;Lmh/a;Lmh/a;Lmh/a;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_8

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

    invoke-virtual {p0, p1, p2}, Laf/d$d;->h(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
