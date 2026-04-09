.class public final Lv42;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lu9;
.implements Lrd2;
.implements Liq3;


# instance fields
.field public final synthetic f:Lpd2;


# direct methods
.method public constructor <init>(Lft2;Lpd2;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv42;->f:Lpd2;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lij;Lpd2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv42;->f:Lpd2;

    return-void
.end method

.method public synthetic constructor <init>(Lpd2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv42;->f:Lpd2;

    return-void
.end method


# virtual methods
.method public U(Lrh;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v0, "Connection failed."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lv42;->f:Lpd2;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public a()V
    .locals 2

    .line 1
    new-instance v0, Le62;

    .line 2
    .line 3
    const-string v1, "Cannot get Javascript Engine"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lv42;->f:Lpd2;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Lag2;

    .line 2
    .line 3
    iget-object v0, p0, Lv42;->f:Lpd2;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lk32;

    .line 8
    .line 9
    new-instance v2, Lof3;

    .line 10
    .line 11
    const/16 v3, 0x13

    .line 12
    .line 13
    invoke-direct {v2, v3, v0}, Lof3;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x7

    .line 17
    invoke-direct {v1, v0, v2}, Lk32;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "/video"

    .line 21
    .line 22
    invoke-interface {p1, v0, v1}, Lag2;->v0(Ljava/lang/String;Ly32;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Lag2;->P()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    new-instance p1, Lr13;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const-string v2, "Missing webview from video view future."

    .line 33
    .line 34
    invoke-direct {p1, v2, v1}, Lhx2;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "Failed to load media data due to video view load failure."

    .line 2
    .line 3
    invoke-static {v0}, Lgi2;->Z(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv42;->f:Lpd2;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
