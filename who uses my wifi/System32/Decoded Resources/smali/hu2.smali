.class public final Lhu2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ll42;


# instance fields
.field public final f:Lgn2;

.field public final g:Lta2;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lgn2;La83;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhu2;->f:Lgn2;

    .line 5
    .line 6
    iget-object p1, p2, La83;->l:Lta2;

    .line 7
    .line 8
    iput-object p1, p0, Lhu2;->g:Lta2;

    .line 9
    .line 10
    iget-object p1, p2, La83;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, p0, Lhu2;->h:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p1, p2, La83;->k:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p1, p0, Lhu2;->i:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final T(Lta2;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhu2;->g:Lta2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object p1, v0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lta2;->f:Ljava/lang/String;

    .line 9
    .line 10
    iget p1, p1, Lta2;->g:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, 0x1

    .line 14
    const-string v0, ""

    .line 15
    .line 16
    :goto_0
    new-instance v1, Lka2;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lka2;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lhu2;->f:Lgn2;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, Lxb4;

    .line 27
    .line 28
    const/16 v2, 0x15

    .line 29
    .line 30
    iget-object v3, p0, Lhu2;->h:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lhu2;->i:Ljava/lang/String;

    .line 33
    .line 34
    invoke-direct {v0, v1, v3, v4, v2}, Lxb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lf74;->P1(Ldp2;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhu2;->f:Lgn2;

    .line 2
    .line 3
    sget-object v1, Lsd2;->k:Lsd2;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhu2;->f:Lgn2;

    .line 2
    .line 3
    sget-object v1, Lqd2;->k:Lqd2;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf74;->P1(Ldp2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
