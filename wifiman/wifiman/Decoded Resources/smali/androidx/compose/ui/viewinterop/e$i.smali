.class final Landroidx/compose/ui/viewinterop/e$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->d(Lmh/l;LT/l;I)Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lmh/l;

.field final synthetic c:LT/q;

.field final synthetic d:Lc0/h;

.field final synthetic e:I

.field final synthetic f:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/content/Context;Lmh/l;LT/q;Lc0/h;ILandroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/e$i;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/e$i;->b:Lmh/l;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/e$i;->c:LT/q;

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/e$i;->d:Lc0/h;

    iput p5, p0, Landroidx/compose/ui/viewinterop/e$i;->e:I

    iput-object p6, p0, Landroidx/compose/ui/viewinterop/e$i;->f:Landroid/view/View;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LE0/G;
    .locals 8

    new-instance v7, Landroidx/compose/ui/viewinterop/i;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/e$i;->a:Landroid/content/Context;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/e$i;->b:Lmh/l;

    iget-object v3, p0, Landroidx/compose/ui/viewinterop/e$i;->c:LT/q;

    iget-object v4, p0, Landroidx/compose/ui/viewinterop/e$i;->d:Lc0/h;

    iget v5, p0, Landroidx/compose/ui/viewinterop/e$i;->e:I

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/e$i;->f:Landroid/view/View;

    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.node.Owner"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, LE0/m0;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;Lmh/l;LT/q;Lc0/h;ILE0/m0;)V

    invoke-virtual {v7}, Landroidx/compose/ui/viewinterop/c;->getLayoutNode()LE0/G;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/e$i;->a()LE0/G;

    move-result-object v0

    return-object v0
.end method
