.class public final Lfr2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lmc2;


# direct methods
.method public synthetic constructor <init>(Lmc2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfr2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfr2;->b:Lmc2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lfr2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfr2;->b:Lmc2;

    .line 7
    .line 8
    iget-object v0, v0, Lmc2;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lsb2;

    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lfr2;->b:Lmc2;

    .line 14
    .line 15
    iget-object v0, v0, Lmc2;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lsu1;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lfr2;->b:Lmc2;

    .line 21
    .line 22
    iget-object v0, v0, Lmc2;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lau2;

    .line 25
    .line 26
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    iget-object v0, p0, Lfr2;->b:Lmc2;

    .line 31
    .line 32
    iget-object v0, v0, Lmc2;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-static {v0}, Li41;->M(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
