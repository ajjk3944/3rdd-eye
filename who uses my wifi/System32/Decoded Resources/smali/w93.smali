.class public final Lw93;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lop2;
.implements Lbn2;
.implements Lqp2;


# instance fields
.field public final f:Lda3;

.field public final g:Laa3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lda3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lw93;->f:Lda3;

    .line 5
    .line 6
    const/16 p2, 0xd

    .line 7
    .line 8
    invoke-static {p1, p2}, Laa3;->l(Landroid/content/Context;I)Laa3;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lw93;->g:Laa3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Ln02;->d:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iget-object v1, p0, Lw93;->g:Laa3;

    .line 17
    .line 18
    invoke-interface {v1, v0}, Laa3;->b(Z)Laa3;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lw93;->f:Lda3;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lda3;->a(Laa3;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    sget-object v0, Ln02;->d:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lw93;->g:Laa3;

    .line 16
    .line 17
    invoke-interface {v0}, Laa3;->a()Laa3;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final s(Lnx2;)V
    .locals 1

    .line 1
    sget-object v0, Ln02;->d:Lso1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lnx2;->a()Lr2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lr2;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lw93;->g:Laa3;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {v0, p1}, Laa3;->b(Z)Laa3;

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lw93;->f:Lda3;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lda3;->a(Laa3;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 0

    .line 1
    return-void
.end method
