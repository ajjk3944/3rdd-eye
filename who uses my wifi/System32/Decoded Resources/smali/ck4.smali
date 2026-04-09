.class public final synthetic Lck4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lvq2;


# direct methods
.method public synthetic constructor <init>(Lvq2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lck4;->f:I

    iput-object p1, p0, Lck4;->g:Lvq2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvq2;Lt82;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Lck4;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lck4;->g:Lvq2;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    .line 1
    iget v0, p0, Lck4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lck4;->g:Lvq2;

    .line 7
    .line 8
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lmd1;

    .line 11
    .line 12
    iget-object v0, v0, Lmd1;->h:Lne1;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lck4;->g:Lvq2;

    .line 19
    .line 20
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lmd1;

    .line 23
    .line 24
    iget-object v0, v0, Lmd1;->h:Lne1;

    .line 25
    .line 26
    invoke-interface {v0}, Lne1;->h()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Lck4;->g:Lvq2;

    .line 31
    .line 32
    iget-object v0, v0, Lvq2;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lmd1;

    .line 35
    .line 36
    iget-object v0, v0, Lmd1;->h:Lne1;

    .line 37
    .line 38
    invoke-interface {v0}, Lne1;->d()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
