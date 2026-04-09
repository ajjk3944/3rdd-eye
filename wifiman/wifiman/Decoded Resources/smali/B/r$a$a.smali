.class final LB/r$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/r$a;->c()Lmh/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/r;

.field final synthetic b:LB/r$a;


# direct methods
.method constructor <init>(LB/r;LB/r$a;)V
    .locals 0

    iput-object p1, p0, LB/r$a$a;->a:LB/r;

    iput-object p2, p0, LB/r$a$a;->b:LB/r$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    const v0, 0x53af4291

    const-string v2, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LB/r$a$a;->a:LB/r;

    invoke-virtual {p2}, LB/r;->d()Lmh/a;

    move-result-object p2

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, LB/t;

    iget-object p2, p0, LB/r$a$a;->b:LB/r$a;

    invoke-virtual {p2}, LB/r$a;->f()I

    move-result p2

    invoke-interface {v2}, LB/t;->a()I

    move-result v0

    if-ge p2, v0, :cond_4

    invoke-interface {v2, p2}, LB/t;->b(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LB/r$a$a;->b:LB/r$a;

    invoke-virtual {v3}, LB/r$a;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move v4, p2

    goto :goto_3

    :cond_4
    :goto_2
    iget-object p2, p0, LB/r$a$a;->b:LB/r$a;

    invoke-virtual {p2}, LB/r$a;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, p2}, LB/t;->c(Ljava/lang/Object;)I

    move-result p2

    if-eq p2, v1, :cond_3

    iget-object v0, p0, LB/r$a$a;->b:LB/r$a;

    invoke-static {v0, p2}, LB/r$a;->a(LB/r$a;I)V

    goto :goto_1

    :goto_3
    if-eq v4, v1, :cond_5

    const p2, -0x275e1e87

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LB/r$a$a;->a:LB/r;

    invoke-static {p2}, LB/r;->a(LB/r;)Lc0/e;

    move-result-object p2

    invoke-static {p2}, LB/T;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iget-object p2, p0, LB/r$a$a;->b:LB/r$a;

    invoke-virtual {p2}, LB/r$a;->g()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LB/T;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x0

    move-object v6, p1

    invoke-static/range {v2 .. v7}, LB/s;->b(LB/t;Ljava/lang/Object;ILjava/lang/Object;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_4

    :cond_5
    const p2, -0x275af3af

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_4
    iget-object p2, p0, LB/r$a$a;->b:LB/r$a;

    invoke-virtual {p2}, LB/r$a;->g()Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, LB/r$a$a;->b:LB/r$a;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LB/r$a$a;->b:LB/r$a;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, LB/r$a$a$a;

    invoke-direct {v2, v1}, LB/r$a$a$a;-><init>(LB/r$a;)V

    invoke-interface {p1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lmh/l;

    const/4 v0, 0x0

    invoke-static {p2, v2, p1, v0}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/r$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
