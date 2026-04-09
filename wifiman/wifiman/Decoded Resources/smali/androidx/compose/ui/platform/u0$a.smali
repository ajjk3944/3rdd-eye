.class final Landroidx/compose/ui/platform/u0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/u0;-><init>(Lp0/c;Lm0/H0;Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/u0;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/u0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/u0$a;->a:Landroidx/compose/ui/platform/u0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/u0$a;->a:Landroidx/compose/ui/platform/u0;

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v1

    invoke-interface {v1}, Lo0/d;->d()Lm0/n0;

    move-result-object v1

    invoke-static {v0}, Landroidx/compose/ui/platform/u0;->l(Landroidx/compose/ui/platform/u0;)Lmh/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->g()Lp0/c;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/u0$a;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
