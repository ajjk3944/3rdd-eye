.class final LN/J0$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/J0$a;->a(Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/S;


# direct methods
.method constructor <init>(LN/H0;LN/S;)V
    .locals 0

    iput-object p2, p0, LN/J0$a$b;->a:LN/S;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LN/J0$a$b;->a:LN/S;

    invoke-virtual {v0}, LN/S;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LN/J0$a$b;->a:LN/S;

    invoke-virtual {v0}, LN/S;->b()Ljava/util/List;

    move-result-object v0

    new-instance v2, LN/J0$a$b$a;

    invoke-direct {v2, v1}, LN/J0$a$b$a;-><init>(LN/H0;)V

    invoke-static {v0, v2}, LZg/v;->K(Ljava/util/List;Lmh/l;)Z

    iget-object v0, p0, LN/J0$a$b;->a:LN/S;

    invoke-virtual {v0}, LN/S;->c()LT/J0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/J0;->invalidate()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/J0$a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
