.class public abstract Lh62;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Lus0;

.field public static final c:Lts0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lh62;->a:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    new-instance v0, Lus0;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lh62;->b:Lus0;

    .line 15
    .line 16
    sget-object v0, Lts0;->i:Lts0;

    .line 17
    .line 18
    sput-object v0, Lh62;->c:Lts0;

    .line 19
    .line 20
    return-void
.end method
