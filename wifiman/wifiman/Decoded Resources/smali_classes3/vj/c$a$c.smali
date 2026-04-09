.class public final Lvj/c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
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
    invoke-direct {p0}, Lvj/c$a$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ZZ)Lvj/c$a;
    .locals 0

    if-nez p1, :cond_0

    sget-object p1, Lvj/c$a;->FORBID:Lvj/c$a;

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    sget-object p1, Lvj/c$a;->ALLOW_SILENT:Lvj/c$a;

    return-object p1

    :cond_1
    sget-object p1, Lvj/c$a;->ALLOW_EXPLICIT:Lvj/c$a;

    return-object p1
.end method
