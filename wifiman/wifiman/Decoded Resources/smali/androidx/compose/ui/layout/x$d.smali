.class final Landroidx/compose/ui/layout/x$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/x;-><init>(Landroidx/compose/ui/layout/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/x;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;Landroidx/compose/ui/layout/x;)V
    .locals 2

    iget-object p2, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    invoke-virtual {p1}, LE0/G;->r0()Landroidx/compose/ui/layout/h;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/layout/h;

    iget-object v1, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    invoke-static {v1}, Landroidx/compose/ui/layout/x;->a(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/y;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroidx/compose/ui/layout/h;-><init>(LE0/G;Landroidx/compose/ui/layout/y;)V

    invoke-virtual {p1, v0}, LE0/G;->J1(Landroidx/compose/ui/layout/h;)V

    :cond_0
    invoke-static {p2, v0}, Landroidx/compose/ui/layout/x;->c(Landroidx/compose/ui/layout/x;Landroidx/compose/ui/layout/h;)V

    iget-object p1, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    invoke-static {p1}, Landroidx/compose/ui/layout/x;->b(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/layout/h;->B()V

    iget-object p1, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    invoke-static {p1}, Landroidx/compose/ui/layout/x;->b(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/h;

    move-result-object p1

    iget-object p2, p0, Landroidx/compose/ui/layout/x$d;->a:Landroidx/compose/ui/layout/x;

    invoke-static {p2}, Landroidx/compose/ui/layout/x;->a(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/compose/ui/layout/h;->J(Landroidx/compose/ui/layout/y;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, Landroidx/compose/ui/layout/x;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/x$d;->a(LE0/G;Landroidx/compose/ui/layout/x;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
