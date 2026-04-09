.class public final Lnf/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf/c;
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
    invoke-direct {p0}, Lnf/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnf/c;
    .locals 5

    new-instance v0, Lnf/c;

    sget-object v1, Lnf/g;->LATENCY:Lnf/g;

    new-instance v2, Ls9/d$c;

    const-string v3, ""

    invoke-direct {v2, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v4}, Lnf/c;-><init>(ZLnf/g;Ls9/d;Ls9/d;)V

    return-object v0
.end method
