.class public abstract Lad/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lad/d;


# instance fields
.field private final a:Lad/a;

.field private final b:Ljava/util/Random;

.field private final c:Lgg/z;

.field private final d:Lgg/i;


# direct methods
.method public constructor <init>(Lad/a;LYc/c;)V
    .locals 2

    const-string v0, "dnsResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad/f;->a:Lad/a;

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lad/f;->b:Ljava/util/Random;

    new-instance p1, Lad/f$a;

    invoke-direct {p1, p0}, Lad/f$a;-><init>(Lad/f;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lad/f;->c:Lgg/z;

    invoke-interface {p2}, LYc/c;->e()Lgg/i;

    move-result-object p1

    new-instance p2, Lad/f$b;

    invoke-direct {p2, p0}, Lad/f$b;-><init>(Lad/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance p2, Lad/e;

    invoke-direct {p2}, Lad/e;-><init>()V

    sget-object v0, Lad/f$c;->a:Lad/f$c;

    invoke-virtual {p1, p2, v0}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    new-instance p2, Lad/f$d;

    invoke-direct {p2, p0}, Lad/f$d;-><init>(Lad/f;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lad/f;->d:Lgg/i;

    return-void
.end method

.method public static synthetic b()Ljava/util/LinkedList;
    .locals 1

    invoke-static {}, Lad/f;->g()Ljava/util/LinkedList;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(Lad/f;)Lad/a;
    .locals 0

    iget-object p0, p0, Lad/f;->a:Lad/a;

    return-object p0
.end method

.method public static final synthetic d(Lad/f;)Lgg/z;
    .locals 0

    iget-object p0, p0, Lad/f;->c:Lgg/z;

    return-object p0
.end method

.method public static final synthetic e(Lad/f;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lad/f;->f()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lad/f;->b:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final g()Ljava/util/LinkedList;
    .locals 1

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lad/f;->d:Lgg/i;

    return-object v0
.end method
