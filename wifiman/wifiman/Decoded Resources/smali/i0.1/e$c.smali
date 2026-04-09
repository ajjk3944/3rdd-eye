.class final Li0/e$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/e;->y0(Li0/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/b;


# direct methods
.method constructor <init>(Li0/b;)V
    .locals 0

    iput-object p1, p0, Li0/e$c;->a:Li0/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li0/e;)LE0/z0;
    .locals 2

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->h1()Landroidx/compose/ui/e$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LE0/z0;->SkipSubtreeAndContinueTraversal:LE0/z0;

    return-object p1

    :cond_0
    invoke-static {p1}, Li0/e;->F2(Li0/e;)Li0/g;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Li0/e$c;->a:Li0/b;

    invoke-interface {v0, v1}, Li0/g;->y0(Li0/b;)V

    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Li0/e;->H2(Li0/e;Li0/g;)V

    invoke-static {p1, v0}, Li0/e;->G2(Li0/e;Li0/d;)V

    sget-object p1, LE0/z0;->ContinueTraversal:LE0/z0;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li0/e;

    invoke-virtual {p0, p1}, Li0/e$c;->a(Li0/e;)LE0/z0;

    move-result-object p1

    return-object p1
.end method
