.class final LA/r$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/r;->e(ILA/u;IIIIIIFJZLjava/util/List;Lz/c$m;Lz/c$e;ZLY0/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLA/q;LIi/N;LT/q0;Lm0/H0;Lmh/q;)LA/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LA/t;

.field final synthetic c:Z

.field final synthetic d:LT/q0;


# direct methods
.method constructor <init>(Ljava/util/List;LA/t;ZLT/q0;)V
    .locals 0

    iput-object p1, p0, LA/r$b;->a:Ljava/util/List;

    iput-object p2, p0, LA/r$b;->b:LA/t;

    iput-boolean p3, p0, LA/r$b;->c:Z

    iput-object p4, p0, LA/r$b;->d:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 6

    iget-object v0, p0, LA/r$b;->a:Ljava/util/List;

    iget-object v1, p0, LA/r$b;->b:LA/t;

    iget-boolean v2, p0, LA/r$b;->c:Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LA/t;

    if-eq v5, v1, :cond_0

    invoke-virtual {v5, p1, v2}, LA/t;->r(Landroidx/compose/ui/layout/t$a;Z)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LA/r$b;->b:LA/t;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, LA/r$b;->c:Z

    invoke-virtual {v0, p1, v1}, LA/t;->r(Landroidx/compose/ui/layout/t$a;Z)V

    :cond_2
    iget-object p1, p0, LA/r$b;->d:LT/q0;

    invoke-static {p1}, LB/M;->a(LT/q0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LA/r$b;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
