.class public abstract Lw01;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lnb;

.field public static final b:Lnb;

.field public static final c:Lnb;

.field public static final d:Lnb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lnb;-><init>(Lpz;Z)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw01;->a:Lnb;

    .line 9
    .line 10
    new-instance v0, Lnb;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v0, v1, v3}, Lnb;-><init>(Lpz;Z)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lw01;->b:Lnb;

    .line 17
    .line 18
    new-instance v0, Lnb;

    .line 19
    .line 20
    sget-object v1, Lpz;->m:Lpz;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lnb;-><init>(Lpz;Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lw01;->c:Lnb;

    .line 26
    .line 27
    new-instance v0, Lnb;

    .line 28
    .line 29
    invoke-direct {v0, v1, v3}, Lnb;-><init>(Lpz;Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lw01;->d:Lnb;

    .line 33
    .line 34
    return-void
.end method
