.class final Landroidx/compose/ui/layout/x$c;
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

    iput-object p1, p0, Landroidx/compose/ui/layout/x$c;->a:Landroidx/compose/ui/layout/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;Lmh/p;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/x$c;->a:Landroidx/compose/ui/layout/x;

    invoke-static {v0}, Landroidx/compose/ui/layout/x;->b(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/h;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/compose/ui/layout/h;->u(Lmh/p;)LC0/C;

    move-result-object p2

    invoke-virtual {p1, p2}, LE0/G;->i(LC0/C;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, Lmh/p;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/x$c;->a(LE0/G;Lmh/p;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
