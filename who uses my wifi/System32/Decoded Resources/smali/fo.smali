.class public final Lfo;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lhu0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lpy;


# direct methods
.method public synthetic constructor <init>(ILdy;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfo;->a:I

    iput-object p3, p0, Lfo;->b:Ljava/lang/Object;

    iput-object p2, p0, Lfo;->c:Lpy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Lfa0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lfo;->a:I

    const-string v0, "input"

    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lfo;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lfo;->c:Lpy;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lfo;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr21;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lr21;-><init>(Lfo;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lwy;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lwy;-><init>(Lfo;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, Leo;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Leo;-><init>(Lfo;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
