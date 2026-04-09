.class final Lcom/ui/wifiman/ui/component/network/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/component/network/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/component/network/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/b$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/b$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/component/network/b$a;->a:Lcom/ui/wifiman/ui/component/network/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/ui/component/network/M;LT/l;I)V
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v3, "com.ui.wifiman.ui.component.network.ComposableSingletons$WifimanNetworkTopologyKt.lambda-1.<anonymous> (WifimanNetworkTopology.kt:182)"

    const v4, -0x795a8884

    invoke-static {v4, p3, v0, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v5, v3, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->b()Lz/c$f;

    move-result-object v4

    sget-object v5, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v5}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v5

    const/16 v6, 0x36

    invoke-static {v4, v5, p2, v6}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {p2, v5}, LT/j;->a(LT/l;I)I

    move-result v6

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v7

    invoke-static {p2, v3}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v3

    sget-object v8, LE0/g;->K:LE0/g$a;

    invoke-virtual {v8}, LE0/g$a;->a()Lmh/a;

    move-result-object v9

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v10

    if-nez v10, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {p2, v9}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {p2}, LT/l;->I()V

    :goto_2
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v9

    invoke-virtual {v8}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v9, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v9, v7, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v8}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v9}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v9}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v8}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v9, v3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/Z;->a:Lz/Z;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v3, v0, v4, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v3

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    invoke-static {v3, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/B;->v(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/component/network/M;->e()LAf/v;

    move-result-object p1

    const p3, 0x4cb37ca3    # 9.410281E7f

    invoke-interface {p2, p3}, LT/l;->U(I)V

    if-nez p1, :cond_9

    goto :goto_3

    :cond_9
    int-to-float p3, v1

    invoke-static {p3}, LY0/h;->j(F)F

    move-result p3

    invoke-static {v0, p3}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p3

    const/4 v1, 0x6

    invoke-static {p3, p2, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    new-instance p3, Ls9/b$a;

    invoke-interface {p1}, LDe/d;->e()I

    move-result v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p3

    invoke-direct/range {v3 .. v8}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float p1, v2

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v5

    const/16 v8, 0x1b0

    const/4 v9, 0x4

    move-object v7, p2

    invoke-static/range {v3 .. v9}, Lta/c;->c(Ls9/b;Landroidx/compose/ui/e;Lm0/v0;Ljava/lang/String;LT/l;II)V

    :goto_3
    invoke-interface {p2}, LT/l;->J()V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/component/network/M;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/b$a;->a(Lcom/ui/wifiman/ui/component/network/M;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
