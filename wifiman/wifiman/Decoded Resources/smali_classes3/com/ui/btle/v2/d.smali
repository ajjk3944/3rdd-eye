.class public final Lcom/ui/btle/v2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/btle/v2/d$a;,
        Lcom/ui/btle/v2/d$b;
    }
.end annotation


# instance fields
.field private final a:S

.field private final b:Lcom/ui/btle/v2/c;

.field private final c:[B


# direct methods
.method private constructor <init>(SLcom/ui/btle/v2/c;[B)V
    .locals 1

    const-string/jumbo v0, "protocol"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-short p1, p0, Lcom/ui/btle/v2/d;->a:S

    .line 4
    iput-object p2, p0, Lcom/ui/btle/v2/d;->b:Lcom/ui/btle/v2/c;

    .line 5
    iput-object p3, p0, Lcom/ui/btle/v2/d;->c:[B

    return-void
.end method

.method public synthetic constructor <init>(SLcom/ui/btle/v2/c;[BLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/ui/btle/v2/d;-><init>(SLcom/ui/btle/v2/c;[B)V

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/d;->c:[B

    return-object v0
.end method

.method public final b()Lcom/ui/btle/v2/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/btle/v2/d;->b:Lcom/ui/btle/v2/c;

    return-object v0
.end method

.method public final c()S
    .locals 1

    iget-short v0, p0, Lcom/ui/btle/v2/d;->a:S

    return v0
.end method
