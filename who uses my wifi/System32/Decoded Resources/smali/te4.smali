.class public final synthetic Lte4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lbi3;

.field public final synthetic h:Lle4;


# direct methods
.method public synthetic constructor <init>(Lbi3;Lle4;I)V
    .locals 0

    .line 1
    iput p3, p0, Lte4;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lte4;->g:Lbi3;

    .line 4
    .line 5
    iput-object p2, p0, Lte4;->h:Lle4;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lte4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lte4;->g:Lbi3;

    .line 7
    .line 8
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lef4;

    .line 11
    .line 12
    iget-object v0, v0, Lef4;->A0:Lwt2;

    .line 13
    .line 14
    iget-object v1, v0, Lwt2;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v2, Lee4;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    iget-object v4, p0, Lte4;->h:Lle4;

    .line 24
    .line 25
    invoke-direct {v2, v0, v4, v3}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lte4;->g:Lbi3;

    .line 33
    .line 34
    iget-object v0, v0, Lbi3;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lef4;

    .line 37
    .line 38
    iget-object v0, v0, Lef4;->A0:Lwt2;

    .line 39
    .line 40
    iget-object v1, v0, Lwt2;->g:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroid/os/Handler;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    new-instance v2, Lee4;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    iget-object v4, p0, Lte4;->h:Lle4;

    .line 50
    .line 51
    invoke-direct {v2, v0, v4, v3}, Lee4;-><init>(Lwt2;Ljava/lang/Object;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
