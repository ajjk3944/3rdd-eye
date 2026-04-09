.class public final LJc/c;
.super LJc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJc/c$a;
    }
.end annotation


# static fields
.field public static final g:LJc/c$a;


# instance fields
.field private final d:Lgg/y;

.field private final e:Ljava/lang/String;

.field private final f:LDc/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJc/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJc/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJc/c;->g:LJc/c$a;

    return-void
.end method

.method public constructor <init>(LJc/a$a;Lgg/y;)V
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LJc/a;-><init>()V

    iput-object p2, p0, LJc/c;->d:Lgg/y;

    const-string p2, "HostnameDiscovery"

    iput-object p2, p0, LJc/c;->e:Ljava/lang/String;

    invoke-virtual {p1}, LJc/a$a;->a()LDc/k;

    move-result-object p1

    iput-object p1, p0, LJc/c;->f:LDc/k;

    return-void
.end method

.method public static synthetic q(Ljava/lang/Throwable;)Ll9/a;
    .locals 0

    invoke-static {p0}, LJc/c;->r(Ljava/lang/Throwable;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Ljava/lang/Throwable;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public h()LDc/k;
    .locals 1

    iget-object v0, p0, LJc/c;->f:LDc/k;

    return-object v0
.end method

.method protected i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LJc/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method protected k()Lgg/y;
    .locals 1

    iget-object v0, p0, LJc/c;->d:Lgg/y;

    return-object v0
.end method

.method protected m(Linet/ipaddr/g;)Lgg/z;
    .locals 3

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJc/c$b;

    invoke-direct {v0, p1}, LJc/c$b;-><init>(Linet/ipaddr/g;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x12c

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance v0, LJc/b;

    invoke-direct {v0}, LJc/b;-><init>()V

    invoke-virtual {p1, v0}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "onErrorReturn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
