.class final Lkf/o$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf/o$a$a;->a(ZLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkf/b;

.field final synthetic b:Lxe/f$b;

.field final synthetic c:Lkf/a;

.field final synthetic d:LT/z1;


# direct methods
.method constructor <init>(Lkf/b;Lxe/f$b;Lkf/a;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lkf/o$a$a$a;->a:Lkf/b;

    iput-object p2, p0, Lkf/o$a$a$a;->b:Lxe/f$b;

    iput-object p3, p0, Lkf/o$a$a$a;->c:Lkf/a;

    iput-object p4, p0, Lkf/o$a$a$a;->d:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lkf/o$a$a$a;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(ZLT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v15, p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v15, v1}, LT/l;->c(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsUi.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultsUi.kt:58)"

    const v5, -0x1172f3da

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/16 v3, 0x36

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_7

    const v1, -0x8823874

    invoke-interface {v15, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v5, v6, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v19, LL9/d$b;->b:LL9/d$b;

    iget-object v4, v0, Lkf/o$a$a$a;->a:Lkf/b;

    const v5, 0x314644d4

    invoke-interface {v15, v5}, LT/l;->U(I)V

    invoke-interface {v15, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_5

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_6

    :cond_5
    new-instance v7, Lkf/o$a$a$a$a;

    invoke-direct {v7, v4}, Lkf/o$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v15, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    sget v4, Lm8/c;->y3:I

    invoke-static {v4, v15, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    move-object v4, v7

    check-cast v4, Lmh/a;

    new-instance v5, Lkf/o$a$a$a$b;

    iget-object v7, v0, Lkf/o$a$a$a;->a:Lkf/b;

    invoke-direct {v5, v7}, Lkf/o$a$a$a$b;-><init>(Lkf/b;)V

    const v7, 0x43b4fdfb

    invoke-static {v7, v6, v5, v15, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v3, LL9/d$b;->c:I

    shl-int/lit8 v3, v3, 0x6

    or-int/lit16 v3, v3, 0x6000

    move/from16 v16, v3

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v3, v19

    move-object v0, v15

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object/from16 v0, p0

    goto/16 :goto_3

    :cond_7
    move-object v0, v15

    const v1, -0x873a930

    invoke-interface {v0, v1}, LT/l;->U(I)V

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v1, v5, v6, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v15, LL9/d$a;->b:LL9/d$a;

    sget v4, Lm8/c;->y3:I

    invoke-static {v4, v0, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    const v4, 0x3146bc5f

    invoke-interface {v0, v4}, LT/l;->U(I)V

    move-object v14, v0

    move-object/from16 v0, p0

    iget-object v4, v0, Lkf/o$a$a$a;->b:Lxe/f$b;

    invoke-interface {v14, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lkf/o$a$a$a;->b:Lxe/f$b;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_8

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_9

    :cond_8
    new-instance v7, Lkf/n;

    invoke-direct {v7, v5}, Lkf/n;-><init>(Lxe/f$b;)V

    invoke-interface {v14, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v4, v7

    check-cast v4, Lmh/a;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    new-instance v5, Lkf/o$a$a$a$c;

    iget-object v7, v0, Lkf/o$a$a$a;->c:Lkf/a;

    iget-object v8, v0, Lkf/o$a$a$a;->d:LT/z1;

    invoke-direct {v5, v7, v8}, Lkf/o$a$a$a$c;-><init>(Lkf/a;LT/z1;)V

    const v7, -0x4de419ee

    invoke-static {v7, v6, v5, v14, v3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v3, LL9/d$a;->c:I

    shl-int/lit8 v3, v3, 0x6

    or-int/lit16 v3, v3, 0x6000

    move/from16 v16, v3

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    move v14, v3

    move-object v3, v15

    move-object/from16 v15, p2

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lkf/o$a$a$a;->b(ZLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
