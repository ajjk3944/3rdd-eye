.class public final synthetic La33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lbu1;


# direct methods
.method public synthetic constructor <init>(Lbu1;I)V
    .locals 0

    .line 1
    iput p2, p0, La33;->f:I

    .line 2
    .line 3
    iput-object p1, p0, La33;->g:Lbu1;

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
    iget v0, p0, La33;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La33;->g:Lbu1;

    .line 7
    .line 8
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lt83;

    .line 11
    .line 12
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx23;

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, v2, v2}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lx23;->d0(Lnx2;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, La33;->g:Lbu1;

    .line 27
    .line 28
    iget-object v0, v0, Lbu1;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lt83;

    .line 31
    .line 32
    iget-object v0, v0, Lt83;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lx23;

    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {v1, v2, v2}, Lzt0;->Q(ILjava/lang/String;Lnx2;)Lnx2;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Lx23;->d0(Lnx2;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
