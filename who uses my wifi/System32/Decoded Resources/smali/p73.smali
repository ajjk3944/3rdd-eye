.class public final synthetic Lp73;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lg4;

.field public final synthetic h:Lnx2;


# direct methods
.method public synthetic constructor <init>(Lg4;Lnx2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp73;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lp73;->g:Lg4;

    .line 4
    .line 5
    iput-object p2, p0, Lp73;->h:Lnx2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget v0, p0, Lp73;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp73;->g:Lg4;

    .line 7
    .line 8
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lq73;

    .line 11
    .line 12
    iget-object v0, v0, Lq73;->e:Ls73;

    .line 13
    .line 14
    iget-object v1, p0, Lp73;->h:Lnx2;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ls73;->d0(Lnx2;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lp73;->g:Lg4;

    .line 21
    .line 22
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lq73;

    .line 25
    .line 26
    iget-object v0, v0, Lq73;->d:Ls23;

    .line 27
    .line 28
    iget-object v1, p0, Lp73;->h:Lnx2;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ls23;->d0(Lnx2;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
