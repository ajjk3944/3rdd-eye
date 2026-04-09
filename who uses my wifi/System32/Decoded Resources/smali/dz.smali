.class public final Ldz;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final b:Ldz;


# instance fields
.field public final a:Lfr;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfr;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfr;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ldz;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Ldz;-><init>(Lfr;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, Ldz;->b:Ldz;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lfr;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldz;->a:Lfr;

    .line 5
    .line 6
    return-void
.end method
