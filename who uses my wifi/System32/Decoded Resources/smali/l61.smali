.class public final Ll61;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Lhl0;


# instance fields
.field public a:I

.field public b:Ltg0;

.field public c:Ltg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhl0;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhl0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll61;->d:Lhl0;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Ll61;
    .locals 1

    .line 1
    sget-object v0, Ll61;->d:Lhl0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhl0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll61;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ll61;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method
