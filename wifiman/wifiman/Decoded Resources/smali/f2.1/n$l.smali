.class final Lf2/n$l;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;->O(Landroid/content/Intent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/r;

.field final synthetic b:Lf2/n;


# direct methods
.method constructor <init>(Lf2/r;Lf2/n;)V
    .locals 0

    iput-object p1, p0, Lf2/n$l;->a:Lf2/r;

    iput-object p2, p0, Lf2/n$l;->b:Lf2/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/z;)V
    .locals 4

    const-string v0, "$this$navOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/n$l$a;->a:Lf2/n$l$a;

    invoke-virtual {p1, v0}, Lf2/z;->a(Lmh/l;)V

    iget-object v0, p0, Lf2/n$l;->a:Lf2/r;

    instance-of v1, v0, Lf2/t;

    if-eqz v1, :cond_3

    sget-object v1, Lf2/r;->k:Lf2/r$a;

    invoke-virtual {v1, v0}, Lf2/r$a;->c(Lf2/r;)Lzi/j;

    move-result-object v0

    iget-object v1, p0, Lf2/n$l;->b:Lf2/n;

    invoke-interface {v0}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf2/r;

    invoke-virtual {v1}, Lf2/n;->G()Lf2/r;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lf2/r;->v()Lf2/t;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    invoke-static {}, Lf2/n;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lf2/t;->q:Lf2/t$a;

    iget-object v1, p0, Lf2/n$l;->b:Lf2/n;

    invoke-virtual {v1}, Lf2/n;->I()Lf2/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf2/t$a;->b(Lf2/t;)Lf2/r;

    move-result-object v0

    invoke-virtual {v0}, Lf2/r;->s()I

    move-result v0

    sget-object v1, Lf2/n$l$b;->a:Lf2/n$l$b;

    invoke-virtual {p1, v0, v1}, Lf2/z;->c(ILmh/l;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/z;

    invoke-virtual {p0, p1}, Lf2/n$l;->a(Lf2/z;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
