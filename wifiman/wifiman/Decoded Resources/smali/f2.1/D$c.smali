.class final Lf2/D$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/D;->e(Ljava/util/List;Lf2/y;Lf2/D$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/D;

.field final synthetic b:Lf2/y;


# direct methods
.method constructor <init>(Lf2/D;Lf2/y;Lf2/D$a;)V
    .locals 0

    iput-object p1, p0, Lf2/D$c;->a:Lf2/D;

    iput-object p2, p0, Lf2/D$c;->b:Lf2/y;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;)Lf2/k;
    .locals 5

    const-string v0, "backStackEntry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    return-object v1

    :cond_1
    iget-object v2, p0, Lf2/D$c;->a:Lf2/D;

    invoke-virtual {p1}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object v3

    iget-object v4, p0, Lf2/D$c;->b:Lf2/y;

    invoke-virtual {v2, v0, v3, v4, v1}, Lf2/D;->d(Lf2/r;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)Lf2/r;

    move-result-object v2

    if-nez v2, :cond_2

    move-object p1, v1

    goto :goto_1

    :cond_2
    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lf2/D$c;->a:Lf2/D;

    invoke-virtual {v0}, Lf2/D;->b()Lf2/F;

    move-result-object v0

    invoke-virtual {p1}, Lf2/k;->d()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v2, p1}, Lf2/r;->g(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lf2/F;->a(Lf2/r;Landroid/os/Bundle;)Lf2/k;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    invoke-virtual {p0, p1}, Lf2/D$c;->a(Lf2/k;)Lf2/k;

    move-result-object p1

    return-object p1
.end method
