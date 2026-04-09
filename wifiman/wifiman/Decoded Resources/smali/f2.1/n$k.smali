.class final Lf2/n$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;->w(Ljava/util/List;Landroid/os/Bundle;Lf2/y;Lf2/D$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/J;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lkotlin/jvm/internal/L;

.field final synthetic d:Lf2/n;

.field final synthetic e:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/J;Ljava/util/List;Lkotlin/jvm/internal/L;Lf2/n;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lf2/n$k;->a:Lkotlin/jvm/internal/J;

    iput-object p2, p0, Lf2/n$k;->b:Ljava/util/List;

    iput-object p3, p0, Lf2/n$k;->c:Lkotlin/jvm/internal/L;

    iput-object p4, p0, Lf2/n$k;->d:Lf2/n;

    iput-object p5, p0, Lf2/n$k;->e:Landroid/os/Bundle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/k;)V
    .locals 4

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf2/n$k;->a:Lkotlin/jvm/internal/J;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    iget-object v0, p0, Lf2/n$k;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lf2/n$k;->b:Ljava/util/List;

    iget-object v3, p0, Lf2/n$k;->c:Lkotlin/jvm/internal/L;

    iget v3, v3, Lkotlin/jvm/internal/L;->a:I

    add-int/2addr v0, v1

    invoke-interface {v2, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lf2/n$k;->c:Lkotlin/jvm/internal/L;

    iput v0, v2, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :goto_0
    iget-object v0, p0, Lf2/n$k;->d:Lf2/n;

    invoke-virtual {p1}, Lf2/k;->f()Lf2/r;

    move-result-object v2

    iget-object v3, p0, Lf2/n$k;->e:Landroid/os/Bundle;

    invoke-static {v0, v2, v3, p1, v1}, Lf2/n;->b(Lf2/n;Lf2/r;Landroid/os/Bundle;Lf2/k;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/k;

    invoke-virtual {p0, p1}, Lf2/n$k;->a(Lf2/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
