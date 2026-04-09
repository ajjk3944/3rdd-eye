.class public abstract Lm01;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lia1;

.field public static final b:Lt5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lia1;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lia1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm01;->a:Lia1;

    .line 8
    .line 9
    new-instance v0, Lt5;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lt5;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lm01;->b:Lt5;

    .line 16
    .line 17
    return-void
.end method
