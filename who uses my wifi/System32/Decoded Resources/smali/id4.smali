.class public final synthetic Lid4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lks2;
.implements Lvs2;
.implements Lng4;


# static fields
.field public static final synthetic g:Lid4;

.field public static final synthetic h:Lid4;


# instance fields
.field public final synthetic f:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lid4;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lid4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lid4;->g:Lid4;

    .line 9
    .line 10
    new-instance v0, Lid4;

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lid4;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lid4;->h:Lid4;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lid4;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, Lid4;->f:I

    .line 2
    new-instance v0, Lmr2;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lmr2;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    .line 4
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 6
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lbg4;

    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 9
    iget-object p1, p1, Lbg4;->a:Ljava/lang/String;

    const-string v0, "OMX.google"

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-string v0, "c2.android"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lid4;->f:I

    packed-switch v0, :pswitch_data_0

    .line 1
    check-cast p1, Lbd4;

    return-void

    .line 2
    :pswitch_0
    check-cast p1, Lbd4;

    return-void

    .line 3
    :pswitch_1
    check-cast p1, Lbd4;

    return-void

    .line 4
    :pswitch_2
    check-cast p1, Lbd4;

    return-void

    .line 5
    :pswitch_3
    check-cast p1, Lbd4;

    return-void

    .line 6
    :pswitch_4
    check-cast p1, Lbd4;

    return-void

    .line 7
    :pswitch_5
    check-cast p1, Lbd4;

    return-void

    .line 8
    :pswitch_6
    check-cast p1, Lbd4;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic e(Ljava/lang/Object;Lof4;)V
    .locals 0

    .line 1
    check-cast p1, Lbd4;

    .line 2
    .line 3
    return-void
.end method
