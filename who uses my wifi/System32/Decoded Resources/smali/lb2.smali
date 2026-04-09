.class public final Llb2;
.super Leb2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:I

.field public final g:Lum;

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lum;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Llb2;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Leb2;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Llb2;->g:Lum;

    .line 7
    .line 8
    iput-object p2, p0, Llb2;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method private final B3(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private final C3(I)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Lnx2;)V
    .locals 1

    .line 1
    iget v0, p0, Llb2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb2;->g:Lum;

    .line 7
    .line 8
    check-cast v0, Lbx2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lnx2;->b()Lu70;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lbx2;->q(Lu70;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Llb2;->g:Lum;

    .line 21
    .line 22
    check-cast v0, Lbx2;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lnx2;->b()Lu70;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Lbx2;->q(Lu70;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    .line 1
    iget v0, p0, Llb2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb2;->g:Lum;

    .line 7
    .line 8
    check-cast v0, Lbx2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Llb2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lpb2;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lbx2;->r(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Llb2;->g:Lum;

    .line 23
    .line 24
    check-cast v0, Lbx2;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Llb2;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lhb2;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lbx2;->r(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final t(I)V
    .locals 0

    .line 1
    iget p1, p0, Llb2;->f:I

    .line 2
    .line 3
    return-void
.end method
