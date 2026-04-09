.class final Lp8/i$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/l;


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
        Lp8/i$h$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lp8/i;


# direct methods
.method constructor <init>(Lp8/i;)V
    .locals 0

    iput-object p1, p0, Lp8/i$h;->a:Lp8/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LCc/a;)LMe/f;
    .locals 0

    invoke-static {p0}, Lp8/i$h;->d(LCc/a;)LMe/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LCc/a;)LMe/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lp8/l;->a(LCc/a;)LMe/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, Ljava/lang/Boolean;

    check-cast p6, Ljava/lang/Boolean;

    check-cast p7, Lde/p;

    check-cast p8, La8/a;

    invoke-virtual/range {p0 .. p8}, Lp8/i$h;->c(Ljava/lang/Boolean;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lde/p;La8/a;)Lp8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Boolean;Ljava/util/Set;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lde/p;La8/a;)Lp8/i$b;
    .locals 6

    const-string/jumbo v0, "bluetoothEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "results"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "locationPermission"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "bluetoothPermission"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "locationEnabled"

    invoke-static {p6, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "listConfig"

    invoke-static {p7, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "devices"

    invoke-static {p8, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p7}, Lde/p;->d()Lfc/a;

    move-result-object p3

    sget-object v0, Lp8/i$h$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/4 v0, 0x2

    if-eq p3, v0, :cond_1

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    iget-object p3, p0, Lp8/i$h;->a:Lp8/i;

    invoke-static {p3}, Lp8/i;->E0(Lp8/i;)Ljava/util/Comparator;

    move-result-object p3

    :goto_0
    move-object v4, p3

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p3, p0, Lp8/i$h;->a:Lp8/i;

    invoke-static {p3}, Lp8/i;->F0(Lp8/i;)Ljava/util/Comparator;

    move-result-object p3

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lp8/i$h;->a:Lp8/i;

    invoke-static {p3}, Lp8/i;->H0(Lp8/i;)Ljava/util/Comparator;

    move-result-object p3

    goto :goto_0

    :goto_1
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-ge p3, v0, :cond_3

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_3

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$c;->a:LLe/a$a$c;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto/16 :goto_4

    :cond_3
    if-ge p3, v0, :cond_4

    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_4

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$b;->a:LLe/a$a$b;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto/16 :goto_4

    :cond_4
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_5

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$d;->a:LLe/a$a$d;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto/16 :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$a;->a:LLe/a$a$a;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto/16 :goto_4

    :cond_6
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$e;->a:LLe/a$a$e;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto/16 :goto_4

    :cond_7
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance p3, Lkotlin/jvm/internal/N;

    invoke-direct {p3}, Lkotlin/jvm/internal/N;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    iget-object p4, p0, Lp8/i$h;->a:Lp8/i;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_8
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lwc/a;

    invoke-virtual {p5}, Lwc/a;->f()La8/b;

    move-result-object p6

    invoke-virtual {p8, p6}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, LCc/a$b;

    if-eqz p6, :cond_9

    goto :goto_3

    :cond_9
    invoke-static {p5}, Lzc/b;->a(Lwc/a;)LCc/a;

    move-result-object p6

    :goto_3
    iput-object p6, p3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p1, p6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {p4}, Lp8/i;->D0(Lp8/i;)Lq8/c;

    move-result-object p5

    invoke-virtual {p5}, Lk8/m;->e()Lmh/l;

    move-result-object p5

    iget-object p6, p3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {p5, p6}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    if-eqz p5, :cond_8

    iget-object p5, p3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-interface {v2, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Lp8/i$b$a;

    sget-object p2, LLe/a$a$g;->a:LLe/a$a$g;

    invoke-direct {p1, p2}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    goto :goto_4

    :cond_b
    new-instance p1, Lp8/i$b$c;

    sget-object v1, LLe/c;->BLUETOOTH:LLe/c;

    invoke-virtual {p7}, Lde/p;->e()Z

    move-result v3

    new-instance v5, Lp8/j;

    invoke-direct {v5}, Lp8/j;-><init>()V

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lp8/i$b$c;-><init>(LLe/c;Ljava/util/Collection;ZLjava/util/Comparator;Lmh/l;)V

    :goto_4
    return-object p1
.end method
