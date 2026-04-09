.class final Lcom/ui/wifiman/ui/component/network/B$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B;->k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/ui/wifiman/ui/component/network/B$b;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    check-cast v3, Lcom/ui/wifiman/ui/component/network/q$b;

    move-object v4, p4

    check-cast v4, LT/l;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/ui/wifiman/ui/component/network/B$b;->a(LA/c;FLcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final a(LA/c;FLcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V
    .locals 13

    move-object v0, p1

    move v1, p2

    move-object/from16 v2, p3

    move-object/from16 v7, p4

    move/from16 v3, p5

    const-string v4, "<this>"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "item"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    invoke-interface {v7, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v5, v3, 0x30

    if-nez v5, :cond_3

    invoke-interface {v7, p2}, LT/l;->g(F)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v3, 0x180

    if-nez v5, :cond_6

    and-int/lit16 v3, v3, 0x200

    if-nez v3, :cond_4

    invoke-interface {v7, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_4
    invoke-interface {v7, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v4, v3

    :cond_6
    and-int/lit16 v3, v4, 0x493

    const/16 v5, 0x492

    if-ne v3, v5, :cond_8

    invoke-interface/range {p4 .. p4}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface/range {p4 .. p4}, LT/l;->C()V

    move-object v10, p0

    goto :goto_7

    :cond_8
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, -0x1

    const-string v5, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:188)"

    const v6, 0x1b1be637

    invoke-static {v6, v4, v3, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, p2}, Landroidx/compose/foundation/layout/r;->s(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    move-object v10, p0

    iget-boolean v3, v10, Lcom/ui/wifiman/ui/component/network/B$b;->a:Z

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    const/4 v5, 0x0

    invoke-static {p1, v1, v5, v3, v5}, LA/c;->b(LA/c;Landroidx/compose/ui/e;Lr/H;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    goto :goto_6

    :cond_a
    move-object v0, v1

    :goto_6
    shr-int/lit8 v1, v4, 0x3

    and-int/lit8 v8, v1, 0x70

    const/16 v9, 0x3c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v1, p3

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v11

    move-object/from16 v7, p4

    invoke-static/range {v0 .. v9}, Lcom/ui/wifiman/ui/component/network/B;->s(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_7
    return-void
.end method
