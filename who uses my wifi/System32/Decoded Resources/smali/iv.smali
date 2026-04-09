.class public final Liv;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:C

.field public final c:D

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;CDLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liv;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-char p2, p0, Liv;->b:C

    .line 7
    .line 8
    iput-wide p3, p0, Liv;->c:D

    .line 9
    .line 10
    iput-object p5, p0, Liv;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Liv;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public static a(CLjava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    mul-int/lit8 p0, p0, 0x1f

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    add-int/2addr p1, p0

    .line 8
    mul-int/lit8 p1, p1, 0x1f

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    add-int/2addr p0, p1

    .line 15
    return p0
.end method


# virtual methods
.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Liv;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Liv;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-char v2, p0, Liv;->b:C

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Liv;->a(CLjava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
