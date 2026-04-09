.class public final Lxd2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lae2;


# direct methods
.method public synthetic constructor <init>(Lae2;III)V
    .locals 0

    .line 1
    iput p4, p0, Lxd2;->f:I

    .line 2
    .line 3
    iput p2, p0, Lxd2;->g:I

    .line 4
    .line 5
    iput p3, p0, Lxd2;->h:I

    .line 6
    .line 7
    iput-object p1, p0, Lxd2;->i:Lae2;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lxd2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxd2;->i:Lae2;

    .line 7
    .line 8
    check-cast v0, Lse2;

    .line 9
    .line 10
    iget-object v0, v0, Lse2;->l:Lee2;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget v1, p0, Lxd2;->g:I

    .line 15
    .line 16
    iget v2, p0, Lxd2;->h:I

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lee2;->j(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lxd2;->i:Lae2;

    .line 23
    .line 24
    check-cast v0, Lyd2;

    .line 25
    .line 26
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lxd2;->g:I

    .line 31
    .line 32
    iget v2, p0, Lxd2;->h:I

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lee2;->j(II)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
