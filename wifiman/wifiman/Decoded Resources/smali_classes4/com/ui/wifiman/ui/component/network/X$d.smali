.class final Lcom/ui/wifiman/ui/component/network/X$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:J

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(Lmh/l;JLmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$d;->a:Lmh/l;

    iput-wide p2, p0, Lcom/ui/wifiman/ui/component/network/X$d;->b:J

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/X$d;->c:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/X$d;->c(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)LYg/J;
    .locals 0

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v1, p1

    check-cast v1, LA/c;

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result v2

    move-object v3, p3

    check-cast v3, Lcom/ui/wifiman/ui/component/network/M;

    move-object v4, p4

    check-cast v4, LT/l;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ui/wifiman/ui/component/network/X$d;->b(LA/c;FLcom/ui/wifiman/ui/component/network/M;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final b(LA/c;FLcom/ui/wifiman/ui/component/network/M;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v12, p4

    move/from16 v4, p5

    const-string v5, "$this$BaseNetworkTopology"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "item"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_1

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-interface {v12, v2}, LT/l;->g(F)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v4, v4, 0x180

    const/16 v6, 0x100

    if-nez v4, :cond_5

    invoke-interface {v12, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v5, v4

    :cond_5
    move v13, v5

    and-int/lit16 v4, v13, 0x493

    const/16 v5, 0x492

    if-ne v4, v5, :cond_7

    invoke-interface/range {p4 .. p4}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface/range {p4 .. p4}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, -0x1

    const-string v5, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:172)"

    const v7, 0x2871209a

    invoke-static {v7, v13, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/r;->s(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v14, 0x1

    invoke-static {v1, v2, v4, v14, v4}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lcom/ui/wifiman/ui/component/network/M;->c()Z

    move-result v7

    const v1, 0x4111ad86

    invoke-interface {v12, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lcom/ui/wifiman/ui/component/network/X$d;->a:Lmh/l;

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v2, v13, 0x380

    if-ne v2, v6, :cond_9

    move v2, v14

    goto :goto_5

    :cond_9
    const/4 v2, 0x0

    :goto_5
    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/ui/wifiman/ui/component/network/X$d;->a:Lmh/l;

    invoke-interface/range {p4 .. p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_a

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_b

    :cond_a
    new-instance v5, Lcom/ui/wifiman/ui/component/network/Z;

    invoke-direct {v5, v2, v3}, Lcom/ui/wifiman/ui/component/network/Z;-><init>(Lmh/l;Lcom/ui/wifiman/ui/component/network/M;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v8, v5

    check-cast v8, Lmh/a;

    invoke-interface/range {p4 .. p4}, LT/l;->J()V

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v9, p4

    invoke-static/range {v4 .. v11}, LM9/i;->f(Landroidx/compose/ui/e;Ly/m;FZLmh/a;LT/l;II)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/ui/component/network/b;->a:Lcom/ui/wifiman/ui/component/network/b;

    invoke-virtual {v2}, Lcom/ui/wifiman/ui/component/network/b;->a()Lmh/q;

    move-result-object v4

    new-instance v2, Lcom/ui/wifiman/ui/component/network/X$d$a;

    iget-object v5, v0, Lcom/ui/wifiman/ui/component/network/X$d;->c:Lmh/l;

    invoke-direct {v2, v5}, Lcom/ui/wifiman/ui/component/network/X$d$a;-><init>(Lmh/l;)V

    const/16 v5, 0x36

    const v6, -0x58a87946

    invoke-static {v6, v14, v2, v12, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    iget-wide v6, v0, Lcom/ui/wifiman/ui/component/network/X$d;->b:J

    shr-int/lit8 v2, v13, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/lit16 v9, v2, 0x6180

    const/16 v10, 0x8

    const/4 v8, 0x0

    move-object/from16 v2, p3

    move-object v3, v4

    move-object v4, v8

    move-object/from16 v8, p4

    invoke-static/range {v1 .. v10}, Lcom/ui/wifiman/ui/component/network/B;->s(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    :goto_6
    return-void
.end method
