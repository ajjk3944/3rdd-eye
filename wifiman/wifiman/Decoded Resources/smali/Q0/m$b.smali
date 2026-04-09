.class final LQ0/m$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ0/m;->h(LQ0/S;)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ0/m;

.field final synthetic b:LQ0/S;


# direct methods
.method constructor <init>(LQ0/m;LQ0/S;)V
    .locals 0

    iput-object p1, p0, LQ0/m$b;->a:LQ0/m;

    iput-object p2, p0, LQ0/m$b;->b:LQ0/S;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;)LQ0/U;
    .locals 4

    iget-object v0, p0, LQ0/m$b;->a:LQ0/m;

    invoke-static {v0}, LQ0/m;->d(LQ0/m;)LQ0/r;

    move-result-object v0

    iget-object v1, p0, LQ0/m$b;->b:LQ0/S;

    iget-object v2, p0, LQ0/m$b;->a:LQ0/m;

    invoke-virtual {v2}, LQ0/m;->g()LQ0/G;

    move-result-object v2

    iget-object v3, p0, LQ0/m$b;->a:LQ0/m;

    invoke-static {v3}, LQ0/m;->c(LQ0/m;)Lmh/l;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, LQ0/r;->a(LQ0/S;LQ0/G;Lmh/l;Lmh/l;)LQ0/U;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LQ0/m$b;->a:LQ0/m;

    invoke-static {v0}, LQ0/m;->e(LQ0/m;)LQ0/F;

    move-result-object v0

    iget-object v1, p0, LQ0/m$b;->b:LQ0/S;

    iget-object v2, p0, LQ0/m$b;->a:LQ0/m;

    invoke-virtual {v2}, LQ0/m;->g()LQ0/G;

    move-result-object v2

    iget-object v3, p0, LQ0/m$b;->a:LQ0/m;

    invoke-static {v3}, LQ0/m;->c(LQ0/m;)Lmh/l;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, LQ0/F;->a(LQ0/S;LQ0/G;Lmh/l;Lmh/l;)LQ0/U;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not load font"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmh/l;

    invoke-virtual {p0, p1}, LQ0/m$b;->a(Lmh/l;)LQ0/U;

    move-result-object p1

    return-object p1
.end method
