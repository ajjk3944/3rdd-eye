.class public abstract Lqt;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lue0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lue0;

    .line 2
    .line 3
    const-string v1, "EDNS Flag"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lqt;->a:Lue0;

    .line 10
    .line 11
    const v1, 0xffff

    .line 12
    .line 13
    .line 14
    iput v1, v0, Lue0;->i:I

    .line 15
    .line 16
    const-string v1, "FLAG"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lue0;->g(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v1, 0x8000

    .line 22
    .line 23
    .line 24
    const-string v2, "do"

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lue0;->b(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
