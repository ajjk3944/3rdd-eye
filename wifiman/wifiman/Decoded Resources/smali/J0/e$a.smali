.class public final LJ0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ0/e;
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
    invoke-direct {p0}, LJ0/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    invoke-static {}, LJ0/e;->a()I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    invoke-static {}, LJ0/e;->b()I

    move-result v0

    return v0
.end method
