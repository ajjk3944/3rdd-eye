.class public final Lh44;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public f:Lj44;

.field public g:Lj44;

.field public h:I

.field public final synthetic i:Lk44;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Lk44;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh44;->j:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lh44;->i:Lk44;

    .line 10
    .line 11
    iget-object p2, p1, Lk44;->j:Lj44;

    .line 12
    .line 13
    iget-object p2, p2, Lj44;->i:Lj44;

    .line 14
    .line 15
    iput-object p2, p0, Lh44;->f:Lj44;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iput-object p2, p0, Lh44;->g:Lj44;

    .line 19
    .line 20
    iget p1, p1, Lk44;->i:I

    .line 21
    .line 22
    iput p1, p0, Lh44;->h:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh44;->b()Lj44;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final b()Lj44;
    .locals 3

    .line 1
    iget-object v0, p0, Lh44;->f:Lj44;

    .line 2
    .line 3
    iget-object v1, p0, Lh44;->i:Lk44;

    .line 4
    .line 5
    iget-object v2, v1, Lk44;->j:Lj44;

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    iget v1, v1, Lk44;->i:I

    .line 10
    .line 11
    iget v2, p0, Lh44;->h:I

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lj44;->i:Lj44;

    .line 16
    .line 17
    iput-object v1, p0, Lh44;->f:Lj44;

    .line 18
    .line 19
    iput-object v0, p0, Lh44;->g:Lj44;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh44;->f:Lj44;

    .line 2
    .line 3
    iget-object v1, p0, Lh44;->i:Lk44;

    .line 4
    .line 5
    iget-object v1, v1, Lk44;->j:Lj44;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lh44;->j:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh44;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lh44;->b()Lj44;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lj44;->k:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh44;->g:Lj44;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lh44;->i:Lk44;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lk44;->b(Lj44;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lh44;->g:Lj44;

    .line 13
    .line 14
    iget v0, v2, Lk44;->i:I

    .line 15
    .line 16
    iput v0, p0, Lh44;->h:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0
.end method
