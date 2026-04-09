.class public abstract Lse3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lf64;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lj74;->h:Lj74;

    .line 2
    .line 3
    sget-object v1, Lj74;->j:Lj74;

    .line 4
    .line 5
    invoke-static {}, Lqe3;->R()Lqe3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lf64;

    .line 10
    .line 11
    invoke-direct {v3, v0, v1, v2}, Lf64;-><init>(Lj74;Lj74;Lqe3;)V

    .line 12
    .line 13
    .line 14
    sput-object v3, Lse3;->a:Lf64;

    .line 15
    .line 16
    return-void
.end method
