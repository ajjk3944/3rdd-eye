.class public final Lkl;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/os/Bundle;

.field public final synthetic i:Lnl;


# direct methods
.method public synthetic constructor <init>(Lnl;Ljava/lang/String;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Lkl;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lkl;->i:Lnl;

    .line 4
    .line 5
    iput-object p2, p0, Lkl;->g:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lkl;->h:Landroid/os/Bundle;

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
    iget v0, p0, Lkl;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkl;->i:Lnl;

    .line 7
    .line 8
    iget-object v0, v0, Lnl;->g:Lil;

    .line 9
    .line 10
    iget-object v1, p0, Lkl;->g:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lkl;->h:Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Lil;->f(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lkl;->i:Lnl;

    .line 19
    .line 20
    iget-object v0, v0, Lnl;->g:Lil;

    .line 21
    .line 22
    iget-object v1, p0, Lkl;->g:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lkl;->h:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lil;->a(Landroid/os/Bundle;Ljava/lang/String;)V

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
