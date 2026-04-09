.class final Lcom/ui/wifiman/ui/wifi/channel/f$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/wifi/channel/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/channel/f$a$b;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:107)"

    const v3, 0x10b1b1fe

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object v5, Lla/a;->a:Lla/a;

    sget v6, Lla/a;->b:I

    invoke-virtual {v5, p1, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v5

    invoke-virtual {v5}, Lra/a;->a()Lra/b;

    move-result-object v5

    invoke-virtual {v5}, Lra/b;->a()Lra/b$a$a;

    move-result-object v5

    invoke-virtual {v5}, Lra/b$a$a;->c()F

    move-result v5

    invoke-static {v4, v5, v0, v1, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v4, p0, Lcom/ui/wifiman/ui/wifi/channel/f$a$b;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->g()Lz/c$m;

    move-result-object v5

    sget-object v6, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v6}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v5, v6, p1, v7}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v5

    invoke-static {p1, v7}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v10

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v11

    if-nez v11, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {p1, v10}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v10

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v11

    invoke-static {v10, v5, v11}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v5

    invoke-static {v10, v8, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v5

    invoke-interface {v10}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_5

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v10, v6, v5}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v5

    invoke-static {v10, v1, v5}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/k;->a:Lz/k;

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/wifi/channel/c;->o0()LLi/N;

    move-result-object v1

    invoke-static {v1, v3, p1, v7, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBf/b;

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    invoke-static {p2, v5}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v5, p1, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {p2, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    invoke-virtual {v1}, LBf/b;->c()LS8/c;

    move-result-object v8

    invoke-static {v5, v8, p1, v6, v7}, LAf/A;->b(Landroidx/compose/ui/e;LS8/c;LT/l;II)V

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {p2, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, p1, v6}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {p2, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    const/16 v0, 0xa4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-static {p2, v1, p1, v6}, LBf/k;->e(Landroidx/compose/ui/e;LBf/b;LT/l;I)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/wifi/channel/f$a$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
