.class final LV8/k$l$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$l$d$a;->a(Lc9/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;

.field final synthetic b:Lcom/ui/btle/v2/d$a;

.field final synthetic c:Lcom/ui/btle/v2/d$b;

.field final synthetic d:Lc9/a;

.field final synthetic e:LG6/N;


# direct methods
.method constructor <init>(LV8/k;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LG6/N;)V
    .locals 0

    iput-object p1, p0, LV8/k$l$d$a$a;->a:LV8/k;

    iput-object p2, p0, LV8/k$l$d$a$a;->b:Lcom/ui/btle/v2/d$a;

    iput-object p3, p0, LV8/k$l$d$a$a;->c:Lcom/ui/btle/v2/d$b;

    iput-object p4, p0, LV8/k$l$d$a$a;->d:Lc9/a;

    iput-object p5, p0, LV8/k$l$d$a$a;->e:LG6/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZ8/a;)Lcom/ui/btle/v2/i;
    .locals 7

    const-string/jumbo v0, "encryptionInstance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LV8/k$l$d$a$a;->a:LV8/k;

    iget-object v2, p0, LV8/k$l$d$a$a;->b:Lcom/ui/btle/v2/d$a;

    iget-object v3, p0, LV8/k$l$d$a$a;->c:Lcom/ui/btle/v2/d$b;

    iget-object v4, p0, LV8/k$l$d$a$a;->d:Lc9/a;

    iget-object v0, p0, LV8/k$l$d$a$a;->e:LG6/N;

    invoke-static {v1, v0}, LV8/k;->y(LV8/k;LG6/N;)LT8/b$c;

    move-result-object v6

    move-object v5, p1

    invoke-static/range {v1 .. v6}, LV8/k;->E(LV8/k;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)Lcom/ui/btle/v2/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/a;

    invoke-virtual {p0, p1}, LV8/k$l$d$a$a;->a(LZ8/a;)Lcom/ui/btle/v2/i;

    move-result-object p1

    return-object p1
.end method
