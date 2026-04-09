.class final Lcom/ui/btle/v2/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/i;-><init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/btle/v2/i$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/btle/v2/i$b;

    invoke-direct {v0}, Lcom/ui/btle/v2/i$b;-><init>()V

    sput-object v0, Lcom/ui/btle/v2/i$b;->a:Lcom/ui/btle/v2/i$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/d;)[B
    .locals 1

    const-string/jumbo v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->a()[B

    move-result-object p1

    invoke-static {p1}, LT8/d$a;->b([B)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/d;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/i$b;->a(Lcom/ui/btle/v2/d;)[B

    move-result-object p1

    invoke-static {p1}, LT8/d$a;->a([B)LT8/d$a;

    move-result-object p1

    return-object p1
.end method
