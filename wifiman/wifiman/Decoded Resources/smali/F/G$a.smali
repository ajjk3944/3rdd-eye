.class final LF/G$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/G;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LF/G;


# direct methods
.method constructor <init>(Ljava/util/List;LF/G;)V
    .locals 0

    iput-object p1, p0, LF/G$a;->a:Ljava/util/List;

    iput-object p2, p0, LF/G$a;->b:LF/G;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 12

    iget-object v0, p0, LF/G$a;->a:Ljava/util/List;

    iget-object v1, p0, LF/G$a;->b:LF/G;

    invoke-static {v1}, LF/G;->a(LF/G;)Lmh/a;

    move-result-object v1

    invoke-static {v0, v1}, LF/g;->h(Ljava/util/List;Lmh/a;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYg/s;

    invoke-virtual {v3}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmh/a;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY0/n;

    invoke-virtual {v3}, LY0/n;->n()J

    move-result-wide v3

    :goto_1
    move-wide v7, v3

    goto :goto_2

    :cond_0
    sget-object v3, LY0/n;->b:LY0/n$a;

    invoke-virtual {v3}, LY0/n$a;->a()J

    move-result-wide v3

    goto :goto_1

    :goto_2
    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LF/G$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
