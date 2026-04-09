.class public final Lkb/l$c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/l$c;
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
    invoke-direct {p0}, Lkb/l$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(B)Lkb/l$c;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, Lkb/l$c;->HEADER:Lkb/l$c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object p1, Lkb/l$c;->BODY:Lkb/l$c;

    goto :goto_0

    :cond_1
    sget-object p1, Lkb/l$c;->INVALID:Lkb/l$c;

    :goto_0
    return-object p1
.end method
