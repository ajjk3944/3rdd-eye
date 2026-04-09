.class final Lp8/i$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp8/i$m$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lp8/i;


# direct methods
.method constructor <init>(Lp8/i;)V
    .locals 0

    iput-object p1, p0, Lp8/i$m;->a:Lp8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LCc/a;)LMe/f;
    .locals 0

    invoke-static {p0}, Lp8/i$m;->d(LCc/a;)LMe/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LCc/a;)LMe/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lp8/l;->b(LCc/a;)LMe/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Lde/v;

    check-cast p5, La8/a;

    invoke-virtual/range {p0 .. p5}, Lp8/i$m;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lde/v;La8/a;)Lp8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lde/v;La8/a;)Lp8/i$b;
    .locals 6

    const-string/jumbo v0, "networkDiscoveryResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "hasNetwork"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "listConfig"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p2, "devices"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Lde/v;->c()Lfc/b;

    move-result-object p2

    sget-object v0, Lp8/i$m$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lp8/i$m;->a:Lp8/i;

    invoke-static {p2}, Lp8/i;->H0(Lp8/i;)Ljava/util/Comparator;

    move-result-object p2

    :goto_0
    move-object v4, p2

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p2, p0, Lp8/i$m;->a:Lp8/i;

    invoke-static {p2}, Lp8/i;->G0(Lp8/i;)Ljava/util/Comparator;

    move-result-object p2

    goto :goto_0

    :goto_1
    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iget-object v1, p0, Lp8/i$m;->a:Lp8/i;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LDc/j;

    invoke-virtual {v3}, LDc/j;->u()La8/b;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p5, v5}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LCc/a$b;

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v3}, LDc/n;->a(LDc/j;)LCc/a;

    move-result-object v5

    :goto_3
    iput-object v5, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p2, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lp8/i;->K0(Lp8/i;)Lr8/c;

    move-result-object v3

    invoke-virtual {v3}, Lk8/m;->e()Lmh/l;

    move-result-object v3

    iget-object v5, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {v3, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_5

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$f;->a:LLe/a$a$f;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto :goto_4

    :cond_5
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lp8/i$b$b;->a:Lp8/i$b$b;

    goto :goto_4

    :cond_6
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$g;->a:LLe/a$a$g;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto :goto_4

    :cond_7
    new-instance p1, Lp8/i$b$c;

    sget-object v1, LLe/c;->LAN:LLe/c;

    invoke-virtual {p4}, Lde/v;->d()Z

    move-result v3

    new-instance v5, Lp8/k;

    invoke-direct {v5}, Lp8/k;-><init>()V

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lp8/i$b$c;-><init>(LLe/c;Ljava/util/Collection;ZLjava/util/Comparator;Lmh/l;)V

    :goto_4
    return-object p1
.end method
