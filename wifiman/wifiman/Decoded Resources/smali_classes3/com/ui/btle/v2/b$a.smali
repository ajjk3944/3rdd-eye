.class final Lcom/ui/btle/v2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/b;->c(LZ8/a$a;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc9/a;


# direct methods
.method constructor <init>(Lc9/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/b$a;->a:Lc9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)LZ8/a;
    .locals 3

    const-string/jumbo v0, "sharedKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZ8/c;

    iget-object v1, p0, Lcom/ui/btle/v2/b$a;->a:Lc9/a;

    invoke-interface {v1}, Lc9/a;->b()S

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, LZ8/c;-><init>([BSLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/c$a;

    invoke-virtual {p1}, LZ8/c$a;->f()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/b$a;->a([B)LZ8/a;

    move-result-object p1

    return-object p1
.end method
