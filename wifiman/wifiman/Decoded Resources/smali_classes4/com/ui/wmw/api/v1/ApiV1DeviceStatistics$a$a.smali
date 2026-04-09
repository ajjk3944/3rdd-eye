.class public final Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->access$getValues$cp()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
