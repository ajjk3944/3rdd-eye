.class public final Lcd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcd/d$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/marsounjan/icmp4a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/marsounjan/icmp4a/a;

    invoke-direct {v0}, Lcom/marsounjan/icmp4a/a;-><init>()V

    iput-object v0, p0, Lcd/d;->a:Lcom/marsounjan/icmp4a/a;

    return-void
.end method

.method public static synthetic b(Lcd/a$b;)V
    .locals 0

    invoke-static {p0}, Lcd/d;->e(Lcd/a$b;)V

    return-void
.end method

.method public static synthetic c()Lcd/a$d;
    .locals 1

    invoke-static {}, Lcd/d;->d()Lcd/a$d;

    move-result-object v0

    return-object v0
.end method

.method private static final d()Lcd/a$d;
    .locals 3

    new-instance v0, Lcd/a$d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v1}, Lcd/a$d;-><init>(Linet/ipaddr/g;IILcd/a$c;)V

    return-object v0
.end method

.method private static final e(Lcd/a$b;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IcmpPing ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] - completed"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcd/a$b;Ljava/lang/Integer;IJJLandroid/net/Network;)Lgg/i;
    .locals 13

    move-object v0, p1

    const-string v1, "destination"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcd/a$b$a;

    if-eqz v1, :cond_0

    move-object v1, p0

    iget-object v2, v1, Lcd/d;->a:Lcom/marsounjan/icmp4a/a;

    move-object v3, v0

    check-cast v3, Lcd/a$b$a;

    invoke-virtual {v3}, Lcd/a$b$a;->a()Linet/ipaddr/e;

    move-result-object v3

    invoke-virtual {v3}, Linet/ipaddr/e;->g()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getHost(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-wide/16 v5, 0x0

    move-object v4, p2

    move/from16 v7, p3

    move-wide/from16 v8, p4

    move-object/from16 v10, p8

    invoke-static/range {v2 .. v12}, Lcom/marsounjan/icmp4a/Icmp$a;->a(Lcom/marsounjan/icmp4a/Icmp;Ljava/lang/String;Ljava/lang/Integer;JIJLandroid/net/Network;ILjava/lang/Object;)LLi/g;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v3}, LQi/i;->c(LLi/g;Ldh/i;ILjava/lang/Object;)Lgg/i;

    move-result-object v2

    sget-object v3, Lcd/d$b;->a:Lcd/d$b;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    sget-object v3, Lcd/d$c;->a:Lcd/d$c;

    invoke-virtual {v2, v3}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/d$d;

    move-wide/from16 v5, p4

    invoke-direct {v3, v5, v6}, Lcd/d$d;-><init>(J)V

    invoke-virtual {v2, v3}, Lgg/i;->n1(Lkg/n;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/b;

    invoke-direct {v3}, Lcd/b;-><init>()V

    sget-object v5, Lcd/d$e;->a:Lcd/d$e;

    invoke-virtual {v2, v3, v5}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object v2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/d$f;

    invoke-direct {v3, p1}, Lcd/d$f;-><init>(Lcd/a$b;)V

    invoke-virtual {v2, v3}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/d$g;

    invoke-direct {v3, p1}, Lcd/d$g;-><init>(Lcd/a$b;)V

    invoke-virtual {v2, v3}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/d$h;

    invoke-direct {v3, p1}, Lcd/d$h;-><init>(Lcd/a$b;)V

    invoke-virtual {v2, v3}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object v2

    new-instance v3, Lcd/c;

    invoke-direct {v3, p1}, Lcd/c;-><init>(Lcd/a$b;)V

    invoke-virtual {v2, v3}, Lgg/i;->a0(Lkg/a;)Lgg/i;

    move-result-object v0

    const-string v2, "doOnComplete(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    move-object v1, p0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
