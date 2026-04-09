.class public final Lyw1;
.super Lpd2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyw1;->g:I

    .line 2
    invoke-direct {p0}, Lpd2;-><init>()V

    iput-object p1, p0, Lyw1;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwy0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyw1;->g:I

    .line 1
    iput-object p1, p0, Lyw1;->h:Ljava/lang/Object;

    invoke-direct {p0}, Lpd2;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 1

    .line 1
    iget v0, p0, Lyw1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lpd2;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lyw1;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lwy0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lwy0;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lpd2;->f:Lwq3;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lgp3;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyw1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
