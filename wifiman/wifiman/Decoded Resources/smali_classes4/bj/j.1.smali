.class public final Lbj/j;
.super Lbj/h;
.source "SourceFile"


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Lbj/o;Z)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lbj/h;-><init>(Lbj/o;)V

    iput-boolean p2, p0, Lbj/j;->c:Z

    return-void
.end method


# virtual methods
.method public e(B)V
    .locals 1

    iget-boolean v0, p0, Lbj/j;->c:Z

    invoke-static {p1}, LYg/A;->b(B)B

    move-result p1

    invoke-static {p1}, LYg/A;->g(B)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbj/h;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 1

    iget-boolean v0, p0, Lbj/j;->c:Z

    invoke-static {p1}, LYg/C;->b(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toUnsignedString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbj/h;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public j(J)V
    .locals 1

    iget-boolean v0, p0, Lbj/j;->c:Z

    invoke-static {p1, p2}, LYg/E;->b(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbj/h;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public l(S)V
    .locals 1

    iget-boolean v0, p0, Lbj/j;->c:Z

    invoke-static {p1}, LYg/H;->b(S)S

    move-result p1

    invoke-static {p1}, LYg/H;->g(S)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lbj/h;->k(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
