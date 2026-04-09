.class public final Lom2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Lmm2;


# direct methods
.method public synthetic constructor <init>(Lmm2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lom2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lom2;->b:Lmm2;

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
    iget v0, p0, Lom2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lom2;->b:Lmm2;

    .line 7
    .line 8
    invoke-virtual {v0}, Lmm2;->b()Lmm2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lom2;->b:Lmm2;

    .line 14
    .line 15
    iget-object v0, v0, Lmm2;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Li83;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lom2;->b:Lmm2;

    .line 21
    .line 22
    iget v0, v0, Lmm2;->g:I

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_2
    iget-object v0, p0, Lom2;->b:Lmm2;

    .line 30
    .line 31
    iget-object v0, v0, Lmm2;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroid/os/Bundle;

    .line 34
    .line 35
    return-object v0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
