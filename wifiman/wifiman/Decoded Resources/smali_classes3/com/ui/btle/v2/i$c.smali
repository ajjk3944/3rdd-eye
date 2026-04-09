.class public final Lcom/ui/btle/v2/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/i;-><init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/d$a;

.field final synthetic b:Lcom/ui/btle/v2/i;


# direct methods
.method public constructor <init>(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/i;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/i$c;->a:Lcom/ui/btle/v2/d$a;

    iput-object p2, p0, Lcom/ui/btle/v2/i$c;->b:Lcom/ui/btle/v2/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/btle/v2/i$c;->a:Lcom/ui/btle/v2/d$a;

    iget-object v1, p0, Lcom/ui/btle/v2/i$c;->b:Lcom/ui/btle/v2/i;

    invoke-static {v1}, Lcom/ui/btle/v2/i;->d(Lcom/ui/btle/v2/i;)LZ8/a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ui/btle/v2/d$a;->a(LZ8/a;)Lgg/z;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
