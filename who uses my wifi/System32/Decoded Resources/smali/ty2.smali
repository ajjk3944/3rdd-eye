.class public final Lty2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Ltv2;


# instance fields
.field public final a:Lzy2;

.field public final b:Lorg/json/JSONObject;

.field public final c:Lga2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ltv2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ltv2;-><init>(IB)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lty2;->d:Ltv2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lzy2;Lorg/json/JSONObject;Lga2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lty2;->a:Lzy2;

    .line 5
    .line 6
    iput-object p2, p0, Lty2;->b:Lorg/json/JSONObject;

    .line 7
    .line 8
    iput-object p3, p0, Lty2;->c:Lga2;

    .line 9
    .line 10
    return-void
.end method
