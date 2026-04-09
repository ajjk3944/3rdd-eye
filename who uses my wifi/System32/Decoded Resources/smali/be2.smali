.class public final Lbe2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lee2;


# direct methods
.method public synthetic constructor <init>(Lee2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbe2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe2;->g:Lee2;

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
    .locals 3

    .line 1
    iget v0, p0, Lbe2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lbe2;->g:Lee2;

    .line 10
    .line 11
    const-string v2, "firstFrameRendered"

    .line 12
    .line 13
    invoke-virtual {v1, v2, v0}, Lee2;->c(Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    new-array v0, v0, [Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p0, Lbe2;->g:Lee2;

    .line 21
    .line 22
    const-string v2, "surfaceDestroyed"

    .line 23
    .line 24
    invoke-virtual {v1, v2, v0}, Lee2;->c(Ljava/lang/String;[Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    const/4 v0, 0x0

    .line 29
    new-array v0, v0, [Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, Lbe2;->g:Lee2;

    .line 32
    .line 33
    const-string v2, "surfaceCreated"

    .line 34
    .line 35
    invoke-virtual {v1, v2, v0}, Lee2;->c(Ljava/lang/String;[Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
