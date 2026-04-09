.class public final synthetic Lhd4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lks2;
.implements Lnp2;


# static fields
.field public static final synthetic g:Lhd4;

.field public static final synthetic h:Lhd4;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhd4;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhd4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhd4;->g:Lhd4;

    .line 9
    .line 10
    new-instance v0, Lhd4;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lhd4;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lhd4;->h:Lhd4;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhd4;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lhd4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lji4;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    check-cast p1, Lbd4;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    check-cast p1, Lbd4;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    check-cast p1, Lbd4;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_3
    check-cast p1, Lbd4;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_4
    check-cast p1, Lbd4;

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_5
    check-cast p1, Lbd4;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_6
    check-cast p1, Lbd4;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_7
    check-cast p1, Lbd4;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_8
    check-cast p1, Lbd4;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
