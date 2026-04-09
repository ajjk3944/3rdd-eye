.class public final LS8/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/g;
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
    invoke-direct {p0}, LS8/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LS8/g;
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_3

    const/16 v0, 0x64

    if-le p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x5a

    if-lt p1, v0, :cond_1

    new-instance v0, LS8/g$b;

    invoke-direct {v0, p1}, LS8/g$b;-><init>(I)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x46

    if-lt p1, v0, :cond_2

    new-instance v0, LS8/g$c;

    invoke-direct {v0, p1}, LS8/g$c;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v0, LS8/g$d;

    invoke-direct {v0, p1}, LS8/g$d;-><init>(I)V

    :goto_0
    return-object v0

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method
