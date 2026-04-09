.class final LSd/e$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e;-><init>(LDc/e;LLd/f;LSd/a;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e;


# direct methods
.method constructor <init>(LSd/e;)V
    .locals 0

    iput-object p1, p0, LSd/e$u;->a:LSd/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)LDj/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSd/e$b$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    if-nez v0, :cond_0

    sget-object p1, LSd/e$c$b$c;->a:LSd/e$c$b$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0}, LSd/e$b$a;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object p1, LSd/e$c$b$b;->a:LSd/e$c$b$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LSd/e$c$b$c;->a:LSd/e$c$b$c;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, LLd/e;->c()Lcom/ui/wifiman/model/ubiquiti/console/f;

    move-result-object v1

    invoke-virtual {v0}, LSd/e$b$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, LSd/e$b$a;->d()Linet/ipaddr/g;

    move-result-object v3

    invoke-virtual {v0}, LSd/e$b$a;->e()Lh9/a;

    move-result-object v4

    invoke-virtual {v0}, LSd/e$b$a;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LSd/e$b$a;->g()Ljava/util/Set;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lcom/ui/wifiman/model/ubiquiti/console/f;->a(Ljava/lang/String;Linet/ipaddr/g;Lh9/a;Ljava/lang/String;Ljava/util/Set;)Lgg/i;

    move-result-object p1

    new-instance v1, LSd/e$u$a;

    invoke-direct {v1, v0}, LSd/e$u$a;-><init>(LSd/e$b$a;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v1, LSd/e$c$b$a;->a:LSd/e$c$b$a;

    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    new-instance v1, LSd/e$u$b;

    iget-object v2, p0, LSd/e$u;->a:LSd/e;

    invoke-direct {v1, v2}, LSd/e$u$b;-><init>(LSd/e;)V

    invoke-virtual {p1, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v1, LSd/e$u$c;

    invoke-direct {v1, v0}, LSd/e$u$c;-><init>(LSd/e$b$a;)V

    invoke-virtual {p1, v1}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, LSd/e$u;->a(LYg/s;)LDj/a;

    move-result-object p1

    return-object p1
.end method
