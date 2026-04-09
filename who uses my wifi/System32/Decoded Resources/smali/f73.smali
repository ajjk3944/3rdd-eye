.class public final Lf73;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lmc2;


# direct methods
.method public synthetic constructor <init>(Lmc2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf73;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lf73;->b:Lmc2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lf73;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lfa2;

    .line 7
    .line 8
    new-instance v0, Lg73;

    .line 9
    .line 10
    new-instance v1, Lh93;

    .line 11
    .line 12
    iget-object v2, p1, Lfa2;->o:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lh93;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Lg73;-><init>(Lfa2;Lf93;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lf73;->b:Lmc2;

    .line 21
    .line 22
    iput-object v0, p1, Lmc2;->j:Ljava/lang/Object;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    check-cast p1, Lmy2;

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    .line 29
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const-string p1, "Failed to get a cache key, reverting to legacy flow."

    .line 33
    .line 34
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lg73;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iget-object v1, p0, Lf73;->b:Lmc2;

    .line 41
    .line 42
    invoke-virtual {v1}, Lmc2;->x()Lg93;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {p1, v0, v2}, Lg73;-><init>(Lfa2;Lf93;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v1, Lmc2;->j:Ljava/lang/Object;

    .line 50
    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
