.class final Lcom/ui/wmw/a$b$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b$a;->a(Ljava/lang/Integer;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lcom/ui/wmw/a;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lcom/ui/wmw/a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b$a$c;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, Lcom/ui/wmw/a$b$a$c;->b:Lcom/ui/wmw/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT8/b$d;)LDj/a;
    .locals 3

    const-string v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LT8/b$d$c;

    if-nez v0, :cond_3

    instance-of v0, p1, LT8/b$d$b;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LT8/b$d$a;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/ui/wmw/h;

    iget-object v1, p0, Lcom/ui/wmw/a$b$a$c;->b:Lcom/ui/wmw/a;

    invoke-virtual {v1}, Lcom/ui/wmw/a;->i()Lh9/a;

    move-result-object v1

    iget-object v2, p0, Lcom/ui/wmw/a$b$a$c;->b:Lcom/ui/wmw/a;

    invoke-static {v2}, Lcom/ui/wmw/a;->b(Lcom/ui/wmw/a;)Lh9/a;

    move-result-object v2

    check-cast p1, LT8/b$d$a;

    invoke-interface {p1}, LT8/b$d$a;->a()LT8/d;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/ui/wmw/h;-><init>(Lh9/a;Lh9/a;LT8/d;)V

    invoke-virtual {v0}, Lcom/ui/wmw/h;->e()Lgg/z;

    move-result-object p1

    const-class v0, Lcom/ui/wmw/k;

    invoke-virtual {p1, v0}, Lgg/z;->g(Ljava/lang/Class;)Lgg/z;

    move-result-object p1

    const-string v0, "cast(R::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wmw/a$b$a$c$a;->a:Lcom/ui/wmw/a$b$a$c$a;

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wmw/a$b$a$c;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wmw/g;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-direct {v1, v0}, Lcom/ui/wmw/WMWizard$a$a$a$b;-><init>(Lcom/ui/wmw/g;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/ui/wmw/WMWizard$a$a$b$c;->a:Lcom/ui/wmw/WMWizard$a$a$b$c;

    :goto_0
    invoke-virtual {p1, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/ui/wmw/a$b$a$c;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wmw/g;

    if-eqz v0, :cond_5

    new-instance v1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-direct {v1, v0}, Lcom/ui/wmw/WMWizard$a$a$a$b;-><init>(Lcom/ui/wmw/g;)V

    invoke-static {v1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v0

    goto :goto_4

    :cond_5
    :goto_2
    instance-of v0, p1, Lcom/ui/btle/v2/a$a$b$b;

    const-string v1, "just(...)"

    if-eqz v0, :cond_6

    sget-object p1, Lcom/ui/wmw/WMWizard$a$a$b$b;->a:Lcom/ui/wmw/WMWizard$a$a$b$b;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    instance-of v0, p1, Lcom/ui/btle/v2/a$a$b$c;

    if-nez v0, :cond_8

    instance-of v0, p1, Lcom/ui/btle/v2/a$a$b$a;

    if-nez v0, :cond_8

    instance-of v0, p1, Lcom/ui/btle/v2/a$a$b$d;

    if-nez v0, :cond_8

    instance-of p1, p1, Lcom/ui/btle/v2/a$a$b$e;

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    sget-object p1, Lcom/ui/wmw/WMWizard$a$a$b$a;->a:Lcom/ui/wmw/WMWizard$a$a$b$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    :goto_3
    sget-object p1, Lcom/ui/wmw/WMWizard$a$a$b$a;->a:Lcom/ui/wmw/WMWizard$a$a$b$a;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT8/b$d;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/a$b$a$c;->a(LT8/b$d;)LDj/a;

    move-result-object p1

    return-object p1
.end method
