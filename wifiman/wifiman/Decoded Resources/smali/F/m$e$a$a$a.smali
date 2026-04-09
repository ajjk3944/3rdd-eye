.class public final LF/m$e$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$e$a$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:Lmh/l;

.field final synthetic c:LR0/Q;

.field final synthetic d:LR0/H;

.field final synthetic e:LY0/d;

.field final synthetic f:I


# direct methods
.method constructor <init>(LF/E;Lmh/l;LR0/Q;LR0/H;LY0/d;I)V
    .locals 0

    iput-object p1, p0, LF/m$e$a$a$a;->a:LF/E;

    iput-object p2, p0, LF/m$e$a$a$a;->b:Lmh/l;

    iput-object p3, p0, LF/m$e$a$a$a;->c:LR0/Q;

    iput-object p4, p0, LF/m$e$a$a$a;->d:LR0/H;

    iput-object p5, p0, LF/m$e$a$a$a;->e:LY0/d;

    iput p6, p0, LF/m$e$a$a$a;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 10

    sget-object p2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    iget-object v0, p0, LF/m$e$a$a$a;->a:LF/E;

    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {p2, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v4

    :try_start_0
    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF/j0;->f()LL0/M;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v2

    :goto_1
    sget-object v3, LF/W;->a:LF/W$a;

    iget-object v1, p0, LF/m$e$a$a$a;->a:LF/E;

    invoke-virtual {v1}, LF/E;->v()LF/S;

    move-result-object v4

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    move-wide v5, p3

    move-object v8, p2

    invoke-virtual/range {v3 .. v8}, LF/W$a;->d(LF/S;JLY0/t;LL0/M;)LYg/y;

    move-result-object p3

    invoke-virtual {p3}, LYg/y;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p3}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p3}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LL0/M;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, LF/m$e$a$a$a;->a:LF/E;

    new-instance v9, LF/j0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/j0;->b()LC0/r;

    move-result-object v2

    :cond_2
    move-object v6, v2

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, v9

    move-object v4, p3

    invoke-direct/range {v3 .. v8}, LF/j0;-><init>(LL0/M;LC0/r;LC0/r;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v9}, LF/E;->G(LF/j0;)V

    iget-object p2, p0, LF/m$e$a$a$a;->b:Lmh/l;

    invoke-interface {p2, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, LF/m$e$a$a$a;->a:LF/E;

    iget-object v0, p0, LF/m$e$a$a$a;->c:LR0/Q;

    iget-object v2, p0, LF/m$e$a$a$a;->d:LR0/H;

    invoke-static {p2, v0, v2}, LF/m;->j(LF/E;LR0/Q;LR0/H;)V

    :cond_3
    iget-object p2, p0, LF/m$e$a$a$a;->a:LF/E;

    iget-object v0, p0, LF/m$e$a$a$a;->e:LY0/d;

    iget v2, p0, LF/m$e$a$a$a;->f:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_4

    invoke-virtual {p3, v4}, LL0/M;->m(I)F

    move-result v2

    invoke-static {v2}, LF/T;->a(F)I

    move-result v4

    :cond_4
    invoke-interface {v0, v4}, LY0/d;->x(I)F

    move-result v0

    invoke-virtual {p2, v0}, LF/E;->H(F)V

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object p2

    invoke-virtual {p3}, LL0/M;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p2

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v0

    invoke-virtual {p3}, LL0/M;->k()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {v0, p3}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p3

    filled-new-array {p2, p3}, [LYg/s;

    move-result-object p2

    invoke-static {p2}, LZg/U;->k([LYg/s;)Ljava/util/Map;

    move-result-object p2

    sget-object p3, LF/m$e$a$a$a$a;->a:LF/m$e$a$a$a$a;

    invoke-interface {p1, p4, v1, p2, p3}, Landroidx/compose/ui/layout/m;->v1(IILjava/util/Map;Lmh/l;)LC0/D;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p2, v1, v4, v3}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 0

    iget-object p2, p0, LF/m$e$a$a$a;->a:LF/E;

    invoke-virtual {p2}, LF/E;->v()LF/S;

    move-result-object p2

    invoke-interface {p1}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object p1

    invoke-virtual {p2, p1}, LF/S;->m(LY0/t;)V

    iget-object p1, p0, LF/m$e$a$a$a;->a:LF/E;

    invoke-virtual {p1}, LF/E;->v()LF/S;

    move-result-object p1

    invoke-virtual {p1}, LF/S;->c()I

    move-result p1

    return p1
.end method
