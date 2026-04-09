.class public final synthetic Lkt2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly32;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Llt2;


# direct methods
.method public synthetic constructor <init>(Llt2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkt2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lkt2;->g:Llt2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 0

    .line 1
    iget p2, p0, Lkt2;->f:I

    .line 2
    .line 3
    check-cast p1, Lag2;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lkt2;->g:Llt2;

    .line 9
    .line 10
    iget-object p1, p1, Llt2;->b:Lzj2;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    iput-boolean p2, p1, Lzj2;->j:Z

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, Lkt2;->g:Llt2;

    .line 17
    .line 18
    iget-object p1, p1, Llt2;->b:Lzj2;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    iput-boolean p2, p1, Lzj2;->j:Z

    .line 22
    .line 23
    invoke-virtual {p1}, Lzj2;->a()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
