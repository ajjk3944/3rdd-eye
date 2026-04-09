.class public final Lo7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Lo7/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lo7/f$a;
    .locals 1

    new-instance v0, Lo7/f$a;

    invoke-direct {v0}, Lo7/f$a;-><init>()V

    return-object v0
.end method
