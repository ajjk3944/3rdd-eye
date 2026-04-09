.class public final Lll2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lxb4;


# direct methods
.method public synthetic constructor <init>(Lxb4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lll2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lll2;->b:Lxb4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()La83;
    .locals 1

    .line 1
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 2
    .line 3
    iget-object v0, v0, Lxb4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La83;

    .line 6
    .line 7
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public b()Lh83;
    .locals 1

    .line 1
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 2
    .line 3
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lh83;

    .line 6
    .line 7
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lll2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 7
    .line 8
    iget-object v0, v0, Lxb4;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lh83;

    .line 11
    .line 12
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 17
    .line 18
    invoke-virtual {v0}, Lxb4;->G()Lc83;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_1
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 24
    .line 25
    iget-object v0, v0, Lxb4;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    iget-object v0, p0, Lll2;->b:Lxb4;

    .line 31
    .line 32
    iget-object v0, v0, Lxb4;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La83;

    .line 35
    .line 36
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
