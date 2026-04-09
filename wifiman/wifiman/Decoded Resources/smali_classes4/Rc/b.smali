.class public final LRc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRc/b$a;
    }
.end annotation


# instance fields
.field private final a:Lgg/i;


# direct methods
.method public constructor <init>(Lrd/b;)V
    .locals 1

    const-string v0, "app2AppSpeedtestDiscovery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lrd/b;->a()Lgg/i;

    move-result-object p1

    new-instance v0, LRc/b$b;

    invoke-direct {v0, p0}, LRc/b$b;-><init>(LRc/b;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LRc/b;->a:Lgg/i;

    return-void
.end method

.method public static final synthetic c(LRc/b;Lrd/b$a;)LRc/a$a;
    .locals 0

    invoke-direct {p0, p1}, LRc/b;->d(Lrd/b$a;)LRc/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lrd/b$a;)LRc/a$a;
    .locals 12

    invoke-virtual {p1}, Lrd/b$a;->b()Linet/ipaddr/g;

    move-result-object v1

    invoke-virtual {p1}, Lrd/b$a;->e()I

    move-result v2

    invoke-virtual {p1}, Lrd/b$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lrd/b$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lrd/b$a;->g()LS8/g;

    move-result-object v5

    invoke-virtual {p1}, Lrd/b$a;->f()Lrd/b$a$a;

    move-result-object v6

    invoke-virtual {p1}, Lrd/b$a;->f()Lrd/b$a$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lrd/b$a;->f()Lrd/b$a$a;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, LRc/b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    sget-object p1, LCc/b$b$c;->c:LCc/b$b$c;

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    sget-object p1, LCc/b$b$d;->c:LCc/b$b$d;

    goto :goto_1

    :cond_3
    sget-object p1, LCc/b$a$b;->b:LCc/b$a$b;

    goto :goto_1

    :cond_4
    sget-object p1, LCc/b$a$a;->b:LCc/b$a$a;

    :goto_1
    move-object v7, p1

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    new-instance p1, LRc/a$a;

    const-wide v10, 0x7fffffffffffffffL

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, LRc/a$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;LS8/g;Lrd/b$a$a;LCc/b;JJ)V

    return-object p1
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LRc/b;->a:Lgg/i;

    return-object v0
.end method
