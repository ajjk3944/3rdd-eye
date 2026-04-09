.class public final Lqm3;
.super Lfn3;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final l:Lqm3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lqm3;

    .line 2
    .line 3
    sget-object v1, Lxn3;->l:Lxn3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lfn3;-><init>(Lxn3;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lqm3;->l:Lqm3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final synthetic d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lfn3;->i:Lxn3;

    .line 2
    .line 3
    return-object v0
.end method
