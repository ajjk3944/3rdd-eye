.class final LH8/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/i;->C0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH8/i;


# direct methods
.method constructor <init>(LH8/i;)V
    .locals 0

    iput-object p1, p0, LH8/i$c;->a:LH8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v0, "component1(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    iget-object v0, p0, LH8/i$c;->a:LH8/i;

    invoke-static {v0}, LH8/i;->t0(LH8/i;)LFd/D;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LFd/D;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    iget-object v0, p0, LH8/i$c;->a:LH8/i;

    invoke-static {v0}, LH8/i;->u0(LH8/i;)Li8/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Li8/a$b;

    sget-object v3, Li8/a$b$n;->a:Li8/a$b$n;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v2}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    aput-object p1, v2, v4

    aput-object v0, v2, v1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LH8/i$c;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
