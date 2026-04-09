.class public final Lyc4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lzt1;


# instance fields
.field public final f:Lya4;

.field public final g:Loa4;

.field public final h:Lsw1;

.field public final i:Ld13;

.field public final j:Luc4;

.field public final k:Lvc4;

.field public final l:Lwc4;

.field public final m:Lxc4;


# direct methods
.method public constructor <init>(Lya4;Loa4;Lpz;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyc4;->f:Lya4;

    .line 5
    .line 6
    iput-object p2, p0, Lyc4;->g:Loa4;

    .line 7
    .line 8
    new-instance p2, Lsw1;

    .line 9
    .line 10
    invoke-direct {p2}, Lsw1;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lyc4;->h:Lsw1;

    .line 14
    .line 15
    iget-object p2, p1, Lya4;->z:Landroid/os/Looper;

    .line 16
    .line 17
    invoke-virtual {p3, p2, p0}, Lpz;->p(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ld13;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lyc4;->i:Ld13;

    .line 22
    .line 23
    new-instance p2, Luc4;

    .line 24
    .line 25
    invoke-direct {p2, p0, p4}, Luc4;-><init>(Lyc4;I)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lyc4;->j:Luc4;

    .line 29
    .line 30
    new-instance p2, Lvc4;

    .line 31
    .line 32
    invoke-direct {p2, p0, p5}, Lvc4;-><init>(Lyc4;I)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lyc4;->k:Lvc4;

    .line 36
    .line 37
    new-instance p2, Lwc4;

    .line 38
    .line 39
    invoke-direct {p2, p0, p6}, Lwc4;-><init>(Lyc4;I)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lyc4;->l:Lwc4;

    .line 43
    .line 44
    new-instance p2, Lxc4;

    .line 45
    .line 46
    invoke-direct {p2, p0, p7}, Lxc4;-><init>(Lyc4;I)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, Lyc4;->m:Lxc4;

    .line 50
    .line 51
    iget-object p1, p1, Lya4;->t:Lmu2;

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lmu2;->a(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyc4;->j:Luc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Luc4;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyc4;->k:Lvc4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lvc4;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lyc4;->l:Lwc4;

    .line 12
    .line 13
    invoke-virtual {v0}, Lwc4;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lyc4;->m:Lxc4;

    .line 17
    .line 18
    invoke-virtual {v0}, Lxc4;->a()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p1, v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p1, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq p1, v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    iget-object p1, p0, Lyc4;->m:Lxc4;

    .line 18
    .line 19
    invoke-virtual {p1}, Lxc4;->a()V

    .line 20
    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    iget-object p1, p0, Lyc4;->l:Lwc4;

    .line 24
    .line 25
    invoke-virtual {p1}, Lwc4;->a()V

    .line 26
    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    iget-object p1, p0, Lyc4;->k:Lvc4;

    .line 30
    .line 31
    invoke-virtual {p1}, Lvc4;->a()V

    .line 32
    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    iget-object p1, p0, Lyc4;->j:Luc4;

    .line 36
    .line 37
    invoke-virtual {p1}, Luc4;->a()V

    .line 38
    .line 39
    .line 40
    return v0
.end method
