.class final LD8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/c;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/c;


# direct methods
.method constructor <init>(LD8/c;)V
    .locals 0

    iput-object p1, p0, LD8/c$c;->a:LD8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/f;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string/jumbo v2, "host"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LD8/c$c;->a:LD8/c;

    invoke-static {v2, p1}, LD8/c;->t0(LD8/c;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, LD8/c$c;->a:LD8/c;

    invoke-static {v2}, LD8/c;->r0(LD8/c;)Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;

    move-result-object v2

    invoke-interface {v2, p1}, Lcom/ui/wifiman/model/network/hosts/NetworkHost$Manager;->a(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    sget-object v2, LD8/c$c$a;->a:LD8/c$c$a;

    invoke-virtual {p1, v2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->M()Lgg/b;

    move-result-object p1

    iget-object v2, p0, LD8/c$c;->a:LD8/c;

    invoke-static {v2}, LD8/c;->s0(LD8/c;)Li8/a;

    move-result-object v2

    new-array v3, v1, [Li8/a$b;

    sget-object v4, Li8/a$b$n;->a:Li8/a$b$n;

    aput-object v4, v3, v0

    invoke-interface {v2, v3}, Li8/a;->a([Li8/a$b;)Lgg/b;

    move-result-object v2

    const/4 v3, 0x2

    new-array v3, v3, [Lgg/f;

    aput-object p1, v3, v0

    aput-object v2, v3, v1

    invoke-static {v3}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LD8/c$c;->a(Ljava/lang/String;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
