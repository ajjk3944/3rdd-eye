.class public final Lnf/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf/b;
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
    invoke-direct {p0}, Lnf/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnf/b;
    .locals 4

    new-instance v0, Lnf/b;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    sget-object v2, Lff/a;->DOWN:Lff/a;

    new-instance v3, Lhf/h;

    invoke-direct {v3, v2, v1}, Lhf/h;-><init>(Lff/a;[F)V

    const/4 v1, 0x0

    invoke-direct {v0, v1, v3}, Lnf/b;-><init>(ZLhf/h;)V

    return-object v0

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method
