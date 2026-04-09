.class final LF/m0$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->k(Landroidx/compose/ui/e;LL0/d$c;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:LL0/d$c;


# direct methods
.method constructor <init>(LF/m0;LL0/d$c;)V
    .locals 0

    iput-object p1, p0, LF/m0$h;->a:LF/m0;

    iput-object p2, p0, LF/m0$h;->b:LL0/d$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 2

    iget-object v0, p0, LF/m0$h;->a:LF/m0;

    iget-object v1, p0, LF/m0$h;->b:LL0/d$c;

    invoke-static {v0, v1}, LF/m0;->h(LF/m0;LL0/d$c;)Lm0/i1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->I1(Lm0/i1;)V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->G(Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LF/m0$h;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
