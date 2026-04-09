.class final Lcom/ui/btle/v2/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/b$d;->a()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/v2/b$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/b$d$a;

    invoke-direct {v0}, Lcom/ui/btle/v2/b$d$a;-><init>()V

    sput-object v0, Lcom/ui/btle/v2/b$d$a;->a:Lcom/ui/btle/v2/b$d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/a$a;)LT8/b$d;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LT8/b$d;

    if-eqz v0, :cond_0

    check-cast p1, LT8/b$d;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "BTLEv2 state must extend BTLEState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/b$d$a;->a(Lcom/ui/btle/v2/a$a;)LT8/b$d;

    move-result-object p1

    return-object p1
.end method
