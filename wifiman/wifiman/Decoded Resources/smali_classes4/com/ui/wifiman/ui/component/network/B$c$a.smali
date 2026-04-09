.class final Lcom/ui/wifiman/ui/component/network/B$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B$c;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:Lmh/r;

.field final synthetic c:Lmh/t;

.field final synthetic d:Lmh/s;

.field final synthetic e:Lmh/s;


# direct methods
.method constructor <init>(Lmh/q;Lmh/r;Lmh/t;Lmh/s;Lmh/s;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a;->a:Lmh/q;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a;->b:Lmh/r;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/B$c$a;->c:Lmh/t;

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/B$c$a;->d:Lmh/s;

    iput-object p5, p0, Lcom/ui/wifiman/ui/component/network/B$c$a;->e:Lmh/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous> (NetworkTopology.kt:209)"

    const v5, -0x1a212f07

    invoke-static {v5, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v4, v4, v11, v4, v3}, LA/C;->c(IILT/l;II)LA/B;

    move-result-object v12

    iget-object v3, v0, Lcom/ui/wifiman/ui/component/network/B$c$a;->a:Lmh/q;

    and-int/lit8 v1, v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v2, v11, v5}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/ui/wifiman/ui/component/network/q$c;

    iget-object v3, v0, Lcom/ui/wifiman/ui/component/network/B$c$a;->b:Lmh/r;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v2, v13, v11, v5}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/h;

    invoke-virtual {v3}, LY0/h;->s()F

    move-result v14

    invoke-interface {v13}, Lcom/ui/wifiman/ui/component/network/q$c;->c()Lmh/p;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v11, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->u()J

    move-result-wide v3

    const/16 v9, 0x180

    const/16 v10, 0xa

    const/4 v5, 0x0

    const-string v6, "connection"

    const/4 v7, 0x0

    move-object/from16 v8, p2

    invoke-static/range {v3 .. v10}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object v3

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v4

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v4

    new-instance v5, Lcom/ui/wifiman/ui/component/network/B$c$a$a;

    iget-object v6, v0, Lcom/ui/wifiman/ui/component/network/B$c$a;->d:Lmh/s;

    invoke-direct {v5, v14, v13, v6, v12}, Lcom/ui/wifiman/ui/component/network/B$c$a$a;-><init>(FLcom/ui/wifiman/ui/component/network/q$c;Lmh/s;LA/B;)V

    const v6, 0x49417439

    const/4 v7, 0x1

    const/16 v8, 0x36

    invoke-static {v6, v7, v5, v11, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v6, LT/I0;->i:I

    or-int/lit8 v9, v6, 0x30

    invoke-static {v4, v5, v11, v9}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, Ls/Q;->a()LT/H0;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v4

    new-instance v5, Lcom/ui/wifiman/ui/component/network/B$c$a$b;

    iget-object v9, v0, Lcom/ui/wifiman/ui/component/network/B$c$a;->e:Lmh/s;

    invoke-direct {v5, v12, v13, v9, v14}, Lcom/ui/wifiman/ui/component/network/B$c$a$b;-><init>(LA/B;Lcom/ui/wifiman/ui/component/network/q$c;Lmh/s;F)V

    const v9, -0x6ee3f59e

    invoke-static {v9, v7, v5, v11, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    or-int/lit8 v6, v6, 0x30

    invoke-static {v4, v5, v11, v6}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    iget-object v4, v0, Lcom/ui/wifiman/ui/component/network/B$c$a;->c:Lmh/t;

    invoke-static {v14}, LY0/h;->d(F)LY0/h;

    move-result-object v5

    invoke-interface {v3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v1, v4

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, p2

    invoke-interface/range {v1 .. v7}, Lmh/t;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/B$c$a;->a(Lz/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
