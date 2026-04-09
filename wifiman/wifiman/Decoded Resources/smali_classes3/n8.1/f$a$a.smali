.class final Ln8/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/f$a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/f$a;


# direct methods
.method constructor <init>(Ln8/f$a;)V
    .locals 0

    iput-object p1, p0, Ln8/f$a$a;->a:Ln8/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/b;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Linet/ipaddr/g;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ln8/f$a$a;->a:Ln8/f$a;

    invoke-static {p1}, Ln8/f$a;->d(Ln8/f$a;)LCc/n;

    move-result-object p1

    invoke-interface {p1}, LCc/n;->a()Lgg/i;

    move-result-object p1

    new-instance v1, Ln8/f$a$a$a;

    invoke-direct {v1, v0}, Ln8/f$a$a$a;-><init>(La8/b;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Ln8/f$a$a;->a:Ln8/f$a;

    invoke-static {v0}, Ln8/f$a;->d(Ln8/f$a;)LCc/n;

    move-result-object v0

    invoke-interface {v0}, LCc/n;->a()Lgg/i;

    move-result-object v0

    iget-object v1, p0, Ln8/f$a$a;->a:Ln8/f$a;

    invoke-static {v1}, Ln8/f$a;->e(Ln8/f$a;)LDc/e;

    move-result-object v1

    invoke-interface {v1}, LDc/e;->b()Lgg/i;

    move-result-object v1

    new-instance v2, Ln8/f$a$a$b;

    invoke-direct {v2, p1}, Ln8/f$a$a$b;-><init>(Linet/ipaddr/g;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "combineLatest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "no device id or IP available on device detail"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Ln8/f$a$a;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
