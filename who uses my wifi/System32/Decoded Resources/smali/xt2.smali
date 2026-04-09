.class public final synthetic Lxt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkf1;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxt2;->f:I

    .line 2
    .line 3
    iput-object p2, p0, Lxt2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic i()V
    .locals 1

    .line 1
    iget v0, p0, Lxt2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxt2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lou2;

    .line 9
    .line 10
    iget-object v0, v0, Lou2;->c:Lgn2;

    .line 11
    .line 12
    invoke-virtual {v0}, Lgn2;->U1()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lxt2;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lgn2;

    .line 19
    .line 20
    invoke-virtual {v0}, Lgn2;->U1()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object v0, p0, Lxt2;->g:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lgn2;

    .line 27
    .line 28
    invoke-virtual {v0}, Lgn2;->U1()V

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
