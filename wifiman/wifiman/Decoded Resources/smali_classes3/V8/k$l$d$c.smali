.class final LV8/k$l$d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$l$d;->a(LYg/s;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV8/k;


# direct methods
.method constructor <init>(LV8/k;)V
    .locals 0

    iput-object p1, p0, LV8/k$l$d$c;->a:LV8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/i;)V
    .locals 2

    const-string/jumbo v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV8/k$l$d$c;->a:LV8/k;

    invoke-static {v0}, LV8/k;->v(LV8/k;)LFg/a;

    move-result-object v0

    new-instance v1, Lcom/ui/btle/v2/a$a$a;

    invoke-direct {v1, p1}, Lcom/ui/btle/v2/a$a$a;-><init>(Lcom/ui/btle/v2/i;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/i;

    invoke-virtual {p0, p1}, LV8/k$l$d$c;->a(Lcom/ui/btle/v2/i;)V

    return-void
.end method
