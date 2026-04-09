.class final Landroidx/compose/ui/window/b$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$f;->a:Landroidx/compose/ui/window/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/r;)V
    .locals 1

    invoke-interface {p1}, LC0/r;->a0()LC0/r;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/window/b$f;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/window/k;->v(LC0/r;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/r;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$f;->a(LC0/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
