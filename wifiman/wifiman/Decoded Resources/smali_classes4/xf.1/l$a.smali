.class final Lxf/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxf/l;->b(Lxf/e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxf/e;


# direct methods
.method constructor <init>(Lxf/e;)V
    .locals 0

    iput-object p1, p0, Lxf/l$a;->a:Lxf/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxf/l$a;->c(Lxe/f$b;)LYg/J;

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
.method public final b(LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.ap.WifiAccessPointDetailUi.<anonymous> (WifiAccessPointDetailUi.kt:42)"

    const v4, 0x2484bcd2

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v1

    invoke-interface {v15, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxe/f$b;

    iget-object v2, v0, Lxf/l$a;->a:Lxf/e;

    invoke-virtual {v2}, Lxf/e;->r0()LLi/N;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v3, v15, v4, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxf/c;

    sget-object v6, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v7, 0x0

    invoke-static {v6, v7, v5, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    invoke-static {v3}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    instance-of v6, v2, Lxf/c$a;

    if-eqz v6, :cond_3

    const v7, 0x4668d9e

    invoke-interface {v15, v7}, LT/l;->U(I)V

    move-object v7, v2

    check-cast v7, Lxf/c$a;

    invoke-virtual {v7}, Lxf/c$a;->a()Ls9/d;

    move-result-object v7

    invoke-static {v7, v15, v4}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_1
    move-object v7, v4

    goto :goto_2

    :cond_3
    instance-of v7, v2, Lxf/c$b;

    if-eqz v7, :cond_9

    const v7, 0x46697e5

    invoke-interface {v15, v7}, LT/l;->U(I)V

    sget v7, Lm8/c;->P4:I

    invoke-static {v7, v15, v4}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_1

    :goto_2
    if-eqz v6, :cond_4

    const v2, 0x466b173

    invoke-interface {v15, v2}, LT/l;->U(I)V

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v8

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    :goto_3
    move-wide/from16 v19, v8

    goto :goto_4

    :cond_4
    instance-of v2, v2, Lxf/c$b;

    if-eqz v2, :cond_8

    const v2, 0x466bcb3

    invoke-interface {v15, v2}, LT/l;->U(I)V

    sget-object v2, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v2, v15, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v8

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    goto :goto_3

    :goto_4
    sget-object v6, LL9/d$a;->b:LL9/d$a;

    const v2, 0x466cb51

    invoke-interface {v15, v2}, LT/l;->U(I)V

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_5

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_6

    :cond_5
    new-instance v4, Lxf/k;

    invoke-direct {v4, v1}, Lxf/k;-><init>(Lxe/f$b;)V

    invoke-interface {v15, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v1, Lxf/l$a$a;

    iget-object v2, v0, Lxf/l$a;->a:Lxf/e;

    invoke-direct {v1, v2}, Lxf/l$a$a;-><init>(Lxf/e;)V

    const/16 v2, 0x36

    const v8, 0x5d2c5c2

    invoke-static {v8, v5, v1, v15, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v1, LL9/d$a;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit16 v1, v1, 0x6000

    move/from16 v16, v1

    const/16 v17, 0x0

    const/16 v18, 0x7c0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v1, v3

    move-object v2, v7

    move-object v3, v6

    move-wide/from16 v6, v19

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_5
    return-void

    :cond_8
    const v1, 0x466a528

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    const v1, 0x46681ed

    invoke-interface {v15, v1}, LT/l;->U(I)V

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lxf/l$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
