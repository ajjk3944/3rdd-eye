.class final Li0/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/e;->D2(Li0/b;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/b;

.field final synthetic b:Li0/e;

.field final synthetic c:Lkotlin/jvm/internal/J;


# direct methods
.method constructor <init>(Li0/b;Li0/e;Lkotlin/jvm/internal/J;)V
    .locals 0

    iput-object p1, p0, Li0/e$b;->a:Li0/b;

    iput-object p2, p0, Li0/e$b;->b:Li0/e;

    iput-object p3, p0, Li0/e$b;->c:Lkotlin/jvm/internal/J;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li0/e;)LE0/z0;
    .locals 4

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LE0/z0;->SkipSubtreeAndContinueTraversal:LE0/z0;

    return-object p1

    :cond_0
    invoke-static {p1}, Li0/e;->F2(Li0/e;)Li0/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez v0, :cond_2

    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1}, Li0/e;->E2(Li0/e;)Lmh/l;

    move-result-object v0

    iget-object v3, p0, Li0/e$b;->a:Li0/b;

    invoke-interface {v0, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li0/g;

    invoke-static {p1, v0}, Li0/e;->H2(Li0/e;Li0/g;)V

    invoke-static {p1}, Li0/e;->F2(Li0/e;)Li0/g;

    move-result-object v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    iget-object v3, p0, Li0/e$b;->b:Li0/e;

    invoke-static {v3}, LE0/k;->n(LE0/j;)LE0/m0;

    move-result-object v3

    invoke-interface {v3}, LE0/m0;->getDragAndDropManager()Li0/c;

    move-result-object v3

    invoke-interface {v3, p1}, Li0/c;->b(Li0/d;)V

    :cond_4
    iget-object p1, p0, Li0/e$b;->c:Lkotlin/jvm/internal/J;

    iget-boolean v3, p1, Lkotlin/jvm/internal/J;->a:Z

    if-nez v3, :cond_5

    if-eqz v0, :cond_6

    :cond_5
    move v1, v2

    :cond_6
    iput-boolean v1, p1, Lkotlin/jvm/internal/J;->a:Z

    sget-object p1, LE0/z0;->ContinueTraversal:LE0/z0;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li0/e;

    invoke-virtual {p0, p1}, Li0/e$b;->a(Li0/e;)LE0/z0;

    move-result-object p1

    return-object p1
.end method
