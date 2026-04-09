.class final Landroidx/compose/ui/graphics/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/graphics/e;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:Landroidx/compose/ui/graphics/e;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/graphics/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/e$b;->a:Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/ui/graphics/e$b;->b:Landroidx/compose/ui/graphics/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 8

    iget-object v1, p0, Landroidx/compose/ui/graphics/e$b;->a:Landroidx/compose/ui/layout/t;

    iget-object v0, p0, Landroidx/compose/ui/graphics/e$b;->b:Landroidx/compose/ui/graphics/e;

    invoke-static {v0}, Landroidx/compose/ui/graphics/e;->D2(Landroidx/compose/ui/graphics/e;)Lmh/l;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/t$a;->v(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFLmh/l;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/graphics/e$b;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
