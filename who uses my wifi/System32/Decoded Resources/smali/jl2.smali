.class public final synthetic Ljl2;
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
    iput p2, p0, Ljl2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ljl2;->g:Lg4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ljl2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljl2;->g:Lg4;

    .line 7
    .line 8
    iget-object v0, v0, Lg4;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lbu1;

    .line 11
    .line 12
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lt83;

    .line 15
    .line 16
    iget-object v0, v0, Lt83;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ls23;

    .line 19
    .line 20
    invoke-virtual {v0}, Ls23;->e()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    new-instance v0, Lhx2;

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    invoke-direct {v0, v1}, Lhx2;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Ljl2;->g:Lg4;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lg4;->s(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
