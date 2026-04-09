.class public final synthetic Lpa4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lks2;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ldc4;


# direct methods
.method public synthetic constructor <init>(Ldc4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lpa4;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpa4;->g:Ldc4;

    return-void
.end method

.method public synthetic constructor <init>(Ldc4;I)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lpa4;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpa4;->g:Ldc4;

    return-void
.end method


# virtual methods
.method public final synthetic c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lpa4;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lpa4;->g:Ldc4;

    .line 4
    .line 5
    check-cast p1, Lzt1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, Lya4;->g0:I

    .line 11
    .line 12
    iget-object v0, v1, Ldc4;->a:Loz1;

    .line 13
    .line 14
    invoke-interface {p1}, Lzt1;->d()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    sget v0, Lya4;->g0:I

    .line 19
    .line 20
    iget-object v0, v1, Ldc4;->i:Lpj4;

    .line 21
    .line 22
    iget-object v0, v0, Lpj4;->i:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {p1}, Lzt1;->l()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
