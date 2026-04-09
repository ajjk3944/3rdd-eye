.class final Lcom/marsounjan/icmp4a/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/marsounjan/icmp4a/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/marsounjan/icmp4a/b;


# direct methods
.method constructor <init>(Lcom/marsounjan/icmp4a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/marsounjan/icmp4a/b$a;->a:Lcom/marsounjan/icmp4a/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 5

    iget-object v0, p0, Lcom/marsounjan/icmp4a/b$a;->a:Lcom/marsounjan/icmp4a/b;

    invoke-virtual {v0}, Lcom/marsounjan/icmp4a/b;->d()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lcom/marsounjan/icmp4a/b$a;->a:Lcom/marsounjan/icmp4a/b;

    invoke-static {v3}, Lcom/marsounjan/icmp4a/b;->a(Lcom/marsounjan/icmp4a/b;)[B

    move-result-object v3

    iget-object v4, p0, Lcom/marsounjan/icmp4a/b$a;->a:Lcom/marsounjan/icmp4a/b;

    invoke-static {v4}, Lcom/marsounjan/icmp4a/b;->a(Lcom/marsounjan/icmp4a/b;)[B

    move-result-object v4

    array-length v4, v4

    rem-int v4, v2, v4

    aget-byte v3, v3, v4

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/marsounjan/icmp4a/b$a;->a()[B

    move-result-object v0

    return-object v0
.end method
