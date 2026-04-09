.class final LC/s$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/s;->h(LB/x;ILC/r;IIIIIIJLw/q;Lf0/c$c;Lf0/c$b;ZJIILjava/util/List;Lx/j;LT/q0;LIi/N;Lmh/q;)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LT/q0;


# direct methods
.method constructor <init>(Ljava/util/List;LT/q0;)V
    .locals 0

    iput-object p1, p0, LC/s$a;->a:Ljava/util/List;

    iput-object p2, p0, LC/s$a;->b:LT/q0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 4

    iget-object v0, p0, LC/s$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/e;

    invoke-virtual {v3, p1}, LC/e;->h(Landroidx/compose/ui/layout/t$a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LC/s$a;->b:LT/q0;

    invoke-static {p1}, LB/M;->a(LT/q0;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LC/s$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
