.class public final Leb/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/m;
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
    invoke-direct {p0}, Leb/m$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/o;Ljava/lang/String;ZJ)Lgg/z;
    .locals 8

    const-string/jumbo v0, "deviceClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/m;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v7}, Leb/m;-><init>(Leb/o;Ljava/lang/String;ZJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Leb/m;->c(Leb/m;)Lgg/z;

    move-result-object p1

    return-object p1
.end method
