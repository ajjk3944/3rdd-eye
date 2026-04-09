.class final Lz/v$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/v;->m(Lz/x;LC0/B;LC0/B;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/v;

.field final synthetic b:Lz/x;


# direct methods
.method constructor <init>(Lz/v;Lz/x;)V
    .locals 0

    iput-object p1, p0, Lz/v$b;->a:Lz/v;

    iput-object p2, p0, Lz/v$b;->b:Lz/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lz/v$b;->b:Lz/x;

    invoke-interface {v0, p1}, Lz/x;->h(Landroidx/compose/ui/layout/t;)I

    move-result v1

    invoke-interface {v0, p1}, Lz/x;->k(Landroidx/compose/ui/layout/t;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lz/v$b;->a:Lz/v;

    invoke-static {v1, v0}, Lo/j;->b(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/j;->a(J)Lo/j;

    move-result-object v0

    invoke-static {v2, v0}, Lz/v;->d(Lz/v;Lo/j;)V

    iget-object v0, p0, Lz/v$b;->a:Lz/v;

    invoke-static {v0, p1}, Lz/v;->c(Lz/v;Landroidx/compose/ui/layout/t;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t;

    invoke-virtual {p0, p1}, Lz/v$b;->a(Landroidx/compose/ui/layout/t;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
