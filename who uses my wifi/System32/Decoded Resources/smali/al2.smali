.class public final Lal2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final synthetic a:I

.field public final b:Ll92;


# direct methods
.method public synthetic constructor <init>(Ll92;I)V
    .locals 0

    .line 1
    iput p2, p0, Lal2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lal2;->b:Ll92;

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
    .locals 3

    .line 1
    iget v0, p0, Lal2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lal2;->b:Ll92;

    .line 7
    .line 8
    iget-object v0, v0, Ll92;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lwo2;

    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lal2;->b:Ll92;

    .line 14
    .line 15
    iget-object v0, v0, Ll92;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lwo2;

    .line 18
    .line 19
    new-instance v1, Lup2;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v2, Lmd2;->g:Lld2;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Lzk2;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v2, Lmd2;->g:Lld2;

    .line 35
    .line 36
    invoke-direct {v1, v0, v2}, Lup2;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-object v1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
