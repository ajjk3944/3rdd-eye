.class public final LSc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSc/e$a;,
        LSc/e$b;
    }
.end annotation


# static fields
.field public static final e:LSc/e$a;


# instance fields
.field private final a:Lxa/o;

.field private final b:LYg/m;

.field private final c:Lkotlin/text/p;

.field private final d:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSc/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSc/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSc/e;->e:LSc/e$a;

    return-void
.end method

.method public constructor <init>(Lxa/o;)V
    .locals 1

    const-string v0, "productCatalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSc/e;->a:Lxa/o;

    new-instance p1, LSc/d;

    invoke-direct {p1}, LSc/d;-><init>()V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LSc/e;->b:LYg/m;

    new-instance p1, Lkotlin/text/p;

    const-string v0, "[0-9a-fA-F]{24}"

    invoke-direct {p1, v0}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LSc/e;->c:Lkotlin/text/p;

    invoke-direct {p0}, LSc/e;->r()Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LSc/e;->d:Lgg/i;

    return-void
.end method

.method public static synthetic c()LSc/e$b;
    .locals 1

    invoke-static {}, LSc/e;->s()LSc/e$b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lo7/f;
    .locals 1

    invoke-static {}, LSc/e;->k()Lo7/f;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic e(LSc/e;Lxa/a$d;)I
    .locals 0

    invoke-direct {p0, p1}, LSc/e;->m(Lxa/a$d;)I

    move-result p0

    return p0
.end method

.method public static final synthetic f(LSc/e;Ls7/b;)Ljava/util/TreeSet;
    .locals 0

    invoke-direct {p0, p1}, LSc/e;->n(Ls7/b;)Ljava/util/TreeSet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LSc/e;Ls7/b;)J
    .locals 0

    invoke-direct {p0, p1}, LSc/e;->o(Ls7/b;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic h(LSc/e;Ly7/n;)Z
    .locals 0

    invoke-direct {p0, p1}, LSc/e;->p(Ly7/n;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(LSc/e;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, LSc/e;->q(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic j(LSc/e;Ljava/util/Set;Ljava/util/Set;Lwa/a;Lt7/f;)Lxa/a$d;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LSc/e;->t(Ljava/util/Set;Ljava/util/Set;Lwa/a;Lt7/f;)Lxa/a$d;

    move-result-object p0

    return-object p0
.end method

.method private static final k()Lo7/f;
    .locals 3

    sget-object v0, Lo7/f;->a:Lo7/f$b;

    invoke-virtual {v0}, Lo7/f$b;->a()Lo7/f$a;

    move-result-object v0

    new-instance v1, Lw7/e$a;

    invoke-direct {v1}, Lw7/e$a;-><init>()V

    sget-object v2, Lw7/b;->V1:Lw7/b;

    invoke-virtual {v1, v2}, Lw7/e$a;->c(Lw7/b;)Lw7/e$a;

    move-result-object v1

    sget-object v2, Lw7/b;->V2:Lw7/b;

    invoke-virtual {v1, v2}, Lw7/e$a;->c(Lw7/b;)Lw7/e$a;

    move-result-object v1

    invoke-virtual {v1}, Lw7/e;->b()Lu7/b;

    move-result-object v1

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Lo7/f$a;->a(Lu7/b;I)Lo7/f$a;

    move-result-object v0

    new-instance v1, Lw7/e$b;

    invoke-direct {v1}, Lw7/e$b;-><init>()V

    sget-object v2, Lw7/c;->V1:Lw7/c;

    invoke-virtual {v1, v2}, Lw7/e$b;->c(Lw7/c;)Lw7/e$b;

    move-result-object v1

    invoke-virtual {v1}, Lw7/e;->b()Lu7/b;

    move-result-object v1

    const/16 v2, 0x63

    invoke-virtual {v0, v1, v2}, Lo7/f$a;->a(Lu7/b;I)Lo7/f$a;

    move-result-object v0

    new-instance v1, Lw7/g;

    invoke-direct {v1}, Lw7/g;-><init>()V

    const/16 v2, 0x62

    invoke-virtual {v0, v1, v2}, Lo7/f$a;->a(Lu7/b;I)Lo7/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/f$a;->b()Lo7/f;

    move-result-object v0

    return-object v0
.end method

.method private final l()Lo7/f;
    .locals 1

    iget-object v0, p0, LSc/e;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo7/f;

    return-object v0
.end method

.method private final m(Lxa/a$d;)I
    .locals 0

    invoke-interface {p1}, Lua/a;->h0()Lua/b;

    move-result-object p1

    instance-of p1, p1, Lua/b$r$d;

    if-eqz p1, :cond_0

    const/16 p1, 0x64

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    :goto_0
    return p1
.end method

.method private final n(Ls7/b;)Ljava/util/TreeSet;
    .locals 4

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    const-class v1, Ly7/m;

    invoke-virtual {p1, v1}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly7/m;

    iget-object v2, p0, LSc/e;->c:Lkotlin/text/p;

    invoke-virtual {v1}, Ly7/m;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/text/p;->m(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ly7/m;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ly7/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final o(Ls7/b;)J
    .locals 4

    invoke-virtual {p1}, Ls7/b;->c()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr7/a;

    invoke-virtual {v0}, Lr7/a;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr7/a;

    invoke-virtual {v1}, Lr7/a;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_1
    const-wide/16 v0, 0x3a98

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unknown server type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v0

    move-wide v0, v2

    goto :goto_2

    :pswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf618

    add-long/2addr v0, v2

    :cond_3
    :goto_2
    return-wide v0

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final p(Ly7/n;)Z
    .locals 3

    invoke-virtual {p1}, Ly7/n;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UFP-UAP-B"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ly7/n;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BLE-B"

    invoke-static {p1, v0, v2}, Lkotlin/text/t;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method private final q(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "UFP-UAP-B"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v0, "Ubiquiti"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_2
    const-string v0, "BLE-B"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_3
    const-string v0, "Unifi-Protect-UAP-Bridge"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_4
    const-string v0, "BLE-Bridge"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    :goto_0
    const/4 v1, 0x1

    :cond_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3d7ecf85 -> :sswitch_4
        -0x3b963556 -> :sswitch_3
        0x3c5a430 -> :sswitch_2
        0x7782961e -> :sswitch_1
        0x7bd4448b -> :sswitch_0
    .end sparse-switch
.end method

.method private final r()Lgg/i;
    .locals 12

    new-instance v1, Lkotlin/jvm/internal/N;

    invoke-direct {v1}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/N;

    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/N;

    invoke-direct {v5}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/N;

    invoke-direct {v2}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/N;

    invoke-direct {v7}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/N;

    invoke-direct {v8}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-direct {p0}, LSc/e;->l()Lo7/f;

    move-result-object v0

    invoke-virtual {v0}, Lo7/f;->a()Lgg/i;

    move-result-object v9

    iget-object v0, p0, LSc/e;->a:Lxa/o;

    invoke-interface {v0}, Lxa/o;->b()Lgg/i;

    move-result-object v10

    new-instance v11, LSc/e$c;

    move-object v0, v11

    move-object v6, p0

    invoke-direct/range {v0 .. v8}, LSc/e$c;-><init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;LSc/e;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V

    invoke-static {v9, v10, v11}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    sget-object v1, LSc/e$d;->a:LSc/e$d;

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object v0

    sget-object v1, LSc/e$e;->a:LSc/e$e;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v8

    new-instance v9, LSc/c;

    invoke-direct {v9}, LSc/c;-><init>()V

    const-wide/16 v3, 0x3e8

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v2 .. v9}, Lgg/i;->c(JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    sget-object v1, LSc/e$f;->a:LSc/e$f;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    sget-object v1, LSc/e$g;->a:LSc/e$g;

    invoke-virtual {v0, v1}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object v0

    sget-object v1, LSc/e$h;->a:LSc/e$h;

    invoke-virtual {v0, v1}, Lgg/i;->p1(Lkg/n;)Lgg/i;

    move-result-object v0

    const-string v1, "retryWhen(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final s()LSc/e$b;
    .locals 1

    new-instance v0, LSc/e$b;

    invoke-direct {v0}, LSc/e$b;-><init>()V

    return-object v0
.end method

.method private final t(Ljava/util/Set;Ljava/util/Set;Lwa/a;Lt7/f;)Lxa/a$d;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v1

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt7/e;

    move-object v3, p2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly7/r;

    invoke-virtual {v2}, Lt7/e;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ly7/r;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p3, v5, v4}, Lwa/a;->e(Ljava/lang/String;Ljava/lang/String;)Lua/a;

    move-result-object v4

    check-cast v4, Lxa/a$d;

    if-eqz v4, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt7/e;

    invoke-virtual {v1}, Lt7/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object v1

    check-cast v1, Lxa/a$d;

    if-eqz v1, :cond_3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly7/r;

    invoke-virtual {p2}, Ly7/r;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object p2

    check-cast p2, Lxa/a$d;

    if-eqz p2, :cond_5

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz p4, :cond_7

    invoke-virtual {p4}, Lt7/f;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lua/a$d;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_7
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_8

    invoke-interface {p3, p1}, Lwa/a;->a(Ljava/lang/String;)Lua/a;

    move-result-object p1

    check-cast p1, Lxa/a$d;

    if-eqz p1, :cond_8

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    new-instance p1, LSc/e$i;

    invoke-direct {p1, p0}, LSc/e$i;-><init>(LSc/e;)V

    new-instance p2, LSc/e$j;

    invoke-direct {p2, p1}, LSc/e$j;-><init>(Ljava/util/Comparator;)V

    invoke-static {v0, p2}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxa/a$d;

    return-object p1
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LSc/e;->d:Lgg/i;

    return-object v0
.end method
