.class final LN/C0$f$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/C0$f;->a(LC0/U;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/f0;

.field final synthetic b:LC0/U;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Ljava/lang/Integer;

.field final synthetic f:Lmh/q;


# direct methods
.method constructor <init>(Lz/f0;LC0/U;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lmh/q;)V
    .locals 0

    iput-object p1, p0, LN/C0$f$b;->a:Lz/f0;

    iput-object p2, p0, LN/C0$f$b;->b:LC0/U;

    iput-object p3, p0, LN/C0$f$b;->c:Ljava/util/List;

    iput-object p4, p0, LN/C0$f$b;->d:Ljava/util/List;

    iput-object p5, p0, LN/C0$f$b;->e:Ljava/lang/Integer;

    iput-object p6, p0, LN/C0$f$b;->f:Lmh/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:510)"

    const v2, -0x22056fd1

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LN/C0$f$b;->a:Lz/f0;

    iget-object v0, p0, LN/C0$f$b;->b:LC0/U;

    invoke-static {p2, v0}, Lz/h0;->f(Lz/f0;LY0/d;)Lz/N;

    move-result-object p2

    iget-object v0, p0, LN/C0$f$b;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Lz/N;->d()F

    move-result v0

    goto :goto_1

    :cond_3
    int-to-float v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    :goto_1
    iget-object v2, p0, LN/C0$f$b;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, LN/C0$f$b;->e:Ljava/lang/Integer;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, LN/C0$f$b;->b:LC0/U;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v3, v2}, LY0/d;->x(I)F

    move-result v2

    goto :goto_3

    :cond_5
    :goto_2
    invoke-interface {p2}, Lz/N;->c()F

    move-result v2

    :goto_3
    iget-object v3, p0, LN/C0$f$b;->b:LC0/U;

    invoke-interface {v3}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v3

    invoke-static {p2, v3}, Landroidx/compose/foundation/layout/o;->g(Lz/N;LY0/t;)F

    move-result v3

    iget-object v4, p0, LN/C0$f$b;->b:LC0/U;

    invoke-interface {v4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    invoke-static {p2, v4}, Landroidx/compose/foundation/layout/o;->f(Lz/N;LY0/t;)F

    move-result p2

    invoke-static {v3, v0, p2, v2}, Landroidx/compose/foundation/layout/o;->d(FFFF)Lz/N;

    move-result-object p2

    iget-object v0, p0, LN/C0$f$b;->f:Lmh/q;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p2, p1, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/C0$f$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
