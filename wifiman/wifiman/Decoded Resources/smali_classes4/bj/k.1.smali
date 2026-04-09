.class public final Lbj/k;
.super Lbj/h;
.source "SourceFile"


# instance fields
.field private final c:Laj/b;

.field private d:I


# direct methods
.method public constructor <init>(Lbj/o;Laj/b;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lbj/h;-><init>(Lbj/o;)V

    iput-object p2, p0, Lbj/k;->c:Laj/b;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbj/h;->o(Z)V

    iget v1, p0, Lbj/k;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Lbj/k;->d:I

    return-void
.end method

.method public c()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lbj/h;->o(Z)V

    const-string v1, "\n"

    invoke-virtual {p0, v1}, Lbj/h;->k(Ljava/lang/String;)V

    iget v1, p0, Lbj/k;->d:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lbj/k;->c:Laj/b;

    invoke-virtual {v2}, Laj/b;->e()Laj/g;

    move-result-object v2

    invoke-virtual {v2}, Laj/g;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lbj/h;->k(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    invoke-virtual {p0}, Lbj/h;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lbj/h;->o(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbj/k;->c()V

    :goto_0
    return-void
.end method

.method public p()V
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lbj/h;->f(C)V

    return-void
.end method

.method public q()V
    .locals 1

    iget v0, p0, Lbj/k;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbj/k;->d:I

    return-void
.end method
