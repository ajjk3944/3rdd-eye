.class public final synthetic Lav2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lbv2;


# direct methods
.method public synthetic constructor <init>(Lbv2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lav2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lav2;->g:Lbv2;

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
    .locals 3

    .line 1
    iget v0, p0, Lav2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lav2;->g:Lbv2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lbv2;->a()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lav2;->g:Lbv2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lbv2;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    new-instance v0, Lav2;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-object v2, p0, Lav2;->g:Lbv2;

    .line 22
    .line 23
    invoke-direct {v0, v2, v1}, Lav2;-><init>(Lbv2;I)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v2, Lbv2;->c:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
