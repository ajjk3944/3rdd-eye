.class public final synthetic Lo73;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lg4;


# direct methods
.method public synthetic constructor <init>(Lg4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo73;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lo73;->g:Lg4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    .line 1
    iget v0, p0, Lo73;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo73;->g:Lg4;

    .line 7
    .line 8
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lq73;

    .line 11
    .line 12
    iget-object v0, v0, Lq73;->d:Ls23;

    .line 13
    .line 14
    invoke-virtual {v0}, Ls23;->e()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lo73;->g:Lg4;

    .line 19
    .line 20
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lq73;

    .line 23
    .line 24
    iget-object v0, v0, Lq73;->e:Ls73;

    .line 25
    .line 26
    invoke-virtual {v0}, Ls73;->e()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
