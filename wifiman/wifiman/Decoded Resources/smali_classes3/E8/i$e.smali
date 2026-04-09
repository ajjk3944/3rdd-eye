.class final LE8/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/i;-><init>(Lgg/i;Ljava/lang/String;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/i;


# direct methods
.method constructor <init>(LE8/i;)V
    .locals 0

    iput-object p1, p0, LE8/i$e;->a:LE8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Linet/ipaddr/g;)LDj/a;
    .locals 3

    const-string/jumbo v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LE8/i$e;->a:LE8/i;

    invoke-static {v0}, LE8/i;->l(LE8/i;)LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v0

    iget-object v1, p0, LE8/i$e;->a:LE8/i;

    invoke-static {v1}, LE8/i;->m(LE8/i;)LDc/e;

    move-result-object v1

    invoke-interface {v1}, LDc/e;->b()Lgg/i;

    move-result-object v1

    new-instance v2, LE8/i$e$a;

    invoke-direct {v2, p1}, LE8/i$e$a;-><init>(Linet/ipaddr/g;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Linet/ipaddr/g;

    invoke-virtual {p0, p1}, LE8/i$e;->a(Linet/ipaddr/g;)LDj/a;

    move-result-object p1

    return-object p1
.end method
