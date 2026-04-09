.class public final LBh/D$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBh/D;
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
    invoke-direct {p0}, LBh/D$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZZ)LBh/D;
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, LBh/D;->SEALED:LBh/D;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    sget-object p1, LBh/D;->ABSTRACT:LBh/D;

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    sget-object p1, LBh/D;->OPEN:LBh/D;

    goto :goto_0

    :cond_2
    sget-object p1, LBh/D;->FINAL:LBh/D;

    :goto_0
    return-object p1
.end method
