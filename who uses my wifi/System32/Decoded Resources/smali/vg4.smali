.class public final Lvg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrh4;
.implements Lkf4;


# instance fields
.field public final f:Ljava/lang/Object;

.field public g:Lwt2;

.field public h:Llv2;

.field public final synthetic i:Lxg4;


# direct methods
.method public constructor <init>(Lxg4;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvg4;->i:Lxg4;

    .line 5
    .line 6
    iget-object v0, p1, Lpg4;->c:Lwt2;

    .line 7
    .line 8
    new-instance v1, Lwt2;

    .line 9
    .line 10
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    const/16 v2, 0xe

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v1, v0, v3, v2}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lvg4;->g:Lwt2;

    .line 21
    .line 22
    iget-object p1, p1, Lpg4;->d:Llv2;

    .line 23
    .line 24
    new-instance v0, Llv2;

    .line 25
    .line 26
    iget-object p1, p1, Llv2;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    const/16 v1, 0x12

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v0, p1, v3, v1, v2}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lvg4;->h:Llv2;

    .line 37
    .line 38
    iput-object p2, p0, Lvg4;->f:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a(Lkh4;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lvg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lvg4;->i:Lxg4;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1}, Lxg4;->v(Ljava/lang/Object;Lkh4;)Lkh4;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v1, v0}, Lxg4;->u(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lvg4;->g:Lwt2;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lwt2;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lkh4;

    .line 28
    .line 29
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v1, Lpg4;->c:Lwt2;

    .line 36
    .line 37
    new-instance v2, Lwt2;

    .line 38
    .line 39
    iget-object v0, v0, Lwt2;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    .line 43
    const/16 v3, 0xe

    .line 44
    .line 45
    invoke-direct {v2, v0, p1, v3}, Lwt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lvg4;->g:Lwt2;

    .line 49
    .line 50
    :cond_2
    iget-object v0, p0, Lvg4;->h:Llv2;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Llv2;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lkh4;

    .line 58
    .line 59
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    iget-object v0, v1, Lpg4;->d:Llv2;

    .line 66
    .line 67
    new-instance v1, Llv2;

    .line 68
    .line 69
    iget-object v0, v0, Llv2;->h:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 72
    .line 73
    const/16 v2, 0x12

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {v1, v0, p1, v2, v3}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, Lvg4;->h:Llv2;

    .line 80
    .line 81
    :cond_3
    const/4 p1, 0x1

    .line 82
    return p1
.end method

.method public final b(Lhh4;Lkh4;)V
    .locals 3

    .line 1
    iget-wide v0, p1, Lhh4;->c:J

    .line 2
    .line 3
    iget-object p2, p0, Lvg4;->i:Lxg4;

    .line 4
    .line 5
    iget-object v2, p0, Lvg4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, v0, v1, v2}, Lxg4;->w(JLjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-wide v0, p1, Lhh4;->d:J

    .line 11
    .line 12
    invoke-virtual {p2, v0, v1, v2}, Lxg4;->w(JLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(ILkh4;Lch4;Lhh4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lvg4;->a(Lkh4;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lvg4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Lvg4;->b(Lhh4;Lkh4;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p2, Ljr3;

    .line 16
    .line 17
    const/16 v0, 0x9

    .line 18
    .line 19
    invoke-direct {p2, p1, p3, p4, v0}, Ljr3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lwt2;->n(Lnp2;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final n(ILkh4;Lch4;Lhh4;I)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lvg4;->a(Lkh4;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lvg4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Lvg4;->b(Lhh4;Lkh4;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lr2;

    .line 16
    .line 17
    const/4 v5, 0x7

    .line 18
    move-object v2, p3

    .line 19
    move-object v3, p4

    .line 20
    move v4, p5

    .line 21
    invoke-direct/range {v0 .. v5}, Lr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lwt2;->n(Lnp2;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final o(ILkh4;Lch4;Lhh4;Ljava/io/IOException;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lvg4;->a(Lkh4;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lvg4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Lvg4;->b(Lhh4;Lkh4;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lde3;

    .line 16
    .line 17
    move-object v2, p3

    .line 18
    move-object v3, p4

    .line 19
    move-object v4, p5

    .line 20
    move v5, p6

    .line 21
    invoke-direct/range {v0 .. v5}, Lde3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lwt2;->n(Lnp2;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final p(ILkh4;Lhh4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lvg4;->a(Lkh4;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lvg4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {p0, p3, p2}, Lvg4;->b(Lhh4;Lkh4;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p2, Llv2;

    .line 16
    .line 17
    const/16 v0, 0x13

    .line 18
    .line 19
    invoke-direct {p2, p1, p3, v0}, Llv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lwt2;->n(Lnp2;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final r(ILkh4;Lch4;Lhh4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lvg4;->a(Lkh4;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lvg4;->g:Lwt2;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Lvg4;->b(Lhh4;Lkh4;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p2, Lpb3;

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    invoke-direct {p2, p1, p3, p4, v0}, Lpb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lwt2;->n(Lnp2;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
