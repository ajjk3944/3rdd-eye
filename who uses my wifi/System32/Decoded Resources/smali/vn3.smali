.class public final Lvn3;
.super Ldn3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final transient i:Lxn3;

.field public final transient j:Lwn3;


# direct methods
.method public constructor <init>(Lxn3;Lwn3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvn3;->i:Lxn3;

    .line 5
    .line 6
    iput-object p2, p0, Lvn3;->j:Lwn3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lyq2;
    .locals 2

    .line 1
    iget-object v0, p0, Lvn3;->j:Lwn3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lxm3;->p(I)Lvm3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lvn3;->i:Lxn3;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxn3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final e()Lxm3;
    .locals 1

    .line 1
    iget-object v0, p0, Lvn3;->j:Lwn3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final g([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lvn3;->j:Lwn3;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lxm3;->g([Ljava/lang/Object;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Lvn3;->j:Lwn3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lxm3;->p(I)Lvm3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lvn3;->i:Lxn3;

    .line 2
    .line 3
    iget v0, v0, Lxn3;->k:I

    .line 4
    .line 5
    return v0
.end method
