.class final Lcom/ui/btle/v2/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/btle/v2/h;->a(Lgg/s;LZ8/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/btle/v2/h;


# direct methods
.method constructor <init>(Lcom/ui/btle/v2/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/h$a;->a:Lcom/ui/btle/v2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/d;)[B
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/v2/h$a;->a:Lcom/ui/btle/v2/h;

    invoke-virtual {v0, p1}, Lcom/ui/btle/v2/h;->c(Lcom/ui/btle/v2/d;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/d;

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/h$a;->a(Lcom/ui/btle/v2/d;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/ui/btle/v2/f;->a([B)Lcom/ui/btle/v2/f;

    move-result-object p1

    return-object p1
.end method
