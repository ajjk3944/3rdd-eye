.class final Lcom/ui/btle/v2/h$b;
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
.field final synthetic a:LZ8/a;


# direct methods
.method constructor <init>(LZ8/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/btle/v2/h$b;->a:LZ8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([B)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/btle/v2/h$b;->a:LZ8/a;

    invoke-virtual {v0, p1}, LZ8/a;->b([B)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/f;

    invoke-virtual {p1}, Lcom/ui/btle/v2/f;->f()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ui/btle/v2/h$b;->a([B)Lgg/D;

    move-result-object p1

    return-object p1
.end method
