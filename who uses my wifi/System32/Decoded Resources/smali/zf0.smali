.class public abstract Lzf0;
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
    const-string v1, "DNSSEC NSEC3 Hash Algorithms"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lue0;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lzf0;->a:Lue0;

    .line 10
    .line 11
    const-string v1, "SHA-1"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lue0;->b(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
