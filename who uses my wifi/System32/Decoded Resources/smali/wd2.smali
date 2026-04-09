.class public final Lwd2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lyd2;


# direct methods
.method public synthetic constructor <init>(Lyd2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwd2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lwd2;->g:Lyd2;

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
    .locals 5

    .line 1
    iget v0, p0, Lwd2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwd2;->g:Lyd2;

    .line 7
    .line 8
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lee2;->g()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lwd2;->g:Lyd2;

    .line 17
    .line 18
    iget-object v1, v0, Lyd2;->v:Lee2;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-boolean v2, v0, Lyd2;->w:Z

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Lee2;->k()V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, v0, Lyd2;->w:Z

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 33
    .line 34
    invoke-virtual {v0}, Lee2;->f()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, Lwd2;->g:Lyd2;

    .line 39
    .line 40
    iget-object v1, v0, Lyd2;->v:Lee2;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {v1}, Lee2;->g()V

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 48
    .line 49
    invoke-virtual {v0}, Lee2;->i()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void

    .line 53
    :pswitch_2
    iget-object v0, p0, Lwd2;->g:Lyd2;

    .line 54
    .line 55
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v1, v0, Lee2;->j:Lde2;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    iput-boolean v2, v1, Lde2;->h:Z

    .line 63
    .line 64
    sget-object v2, Llf4;->l:Li63;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    const-wide/16 v3, 0xfa

    .line 70
    .line 71
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 72
    .line 73
    .line 74
    new-instance v1, Lbe2;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-direct {v1, v0, v3}, Lbe2;-><init>(Lee2;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void

    .line 84
    :pswitch_3
    iget-object v0, p0, Lwd2;->g:Lyd2;

    .line 85
    .line 86
    iget-object v0, v0, Lyd2;->v:Lee2;

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Lee2;->h()V

    .line 91
    .line 92
    .line 93
    :cond_5
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
