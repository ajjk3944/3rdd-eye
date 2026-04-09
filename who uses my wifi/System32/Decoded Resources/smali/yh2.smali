.class public final Lyh2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:I

.field public final b:Lth2;

.field public c:Lm73;

.field public d:Lb73;

.field public e:Lfp2;

.field public f:Lmm2;


# direct methods
.method public synthetic constructor <init>(Lth2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyh2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyh2;->b:Lth2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Lzh2;
    .locals 10

    .line 1
    iget-object v0, p0, Lyh2;->e:Lfp2;

    .line 2
    .line 3
    const-class v1, Lfp2;

    .line 4
    .line 5
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyh2;->f:Lmm2;

    .line 9
    .line 10
    const-class v1, Lmm2;

    .line 11
    .line 12
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lzh2;

    .line 16
    .line 17
    new-instance v4, Ltv2;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v4, v0, v1}, Ltv2;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, Lyh2;->e:Lfp2;

    .line 25
    .line 26
    iget-object v6, p0, Lyh2;->f:Lmm2;

    .line 27
    .line 28
    new-instance v7, Lf23;

    .line 29
    .line 30
    const/16 v0, 0x19

    .line 31
    .line 32
    invoke-direct {v7, v0}, Lf23;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v8, p0, Lyh2;->c:Lm73;

    .line 36
    .line 37
    iget-object v9, p0, Lyh2;->d:Lb73;

    .line 38
    .line 39
    iget-object v3, p0, Lyh2;->b:Lth2;

    .line 40
    .line 41
    invoke-direct/range {v2 .. v9}, Lzh2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 42
    .line 43
    .line 44
    return-object v2
.end method

.method public b()Lji2;
    .locals 10

    .line 1
    iget-object v0, p0, Lyh2;->e:Lfp2;

    .line 2
    .line 3
    const-class v1, Lfp2;

    .line 4
    .line 5
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyh2;->f:Lmm2;

    .line 9
    .line 10
    const-class v1, Lmm2;

    .line 11
    .line 12
    invoke-static {v0, v1}, Li41;->P(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lji2;

    .line 16
    .line 17
    new-instance v4, Ltv2;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v4, v0, v1}, Ltv2;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    iget-object v5, p0, Lyh2;->e:Lfp2;

    .line 25
    .line 26
    iget-object v6, p0, Lyh2;->f:Lmm2;

    .line 27
    .line 28
    new-instance v7, Lf23;

    .line 29
    .line 30
    const/16 v0, 0x19

    .line 31
    .line 32
    invoke-direct {v7, v0}, Lf23;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v8, p0, Lyh2;->c:Lm73;

    .line 36
    .line 37
    iget-object v9, p0, Lyh2;->d:Lb73;

    .line 38
    .line 39
    iget-object v3, p0, Lyh2;->b:Lth2;

    .line 40
    .line 41
    invoke-direct/range {v2 .. v9}, Lji2;-><init>(Lth2;Ltv2;Lfp2;Lmm2;Lf23;Lm73;Lb73;)V

    .line 42
    .line 43
    .line 44
    return-object v2
.end method

.method public final bridge c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lyh2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyh2;->b()Lji2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lyh2;->a()Lzh2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
