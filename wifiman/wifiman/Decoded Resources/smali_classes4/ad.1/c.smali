.class public final Lad/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lad/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lad/a$a;
    .locals 0

    invoke-static {p0}, Lad/c;->c(Ljava/lang/Throwable;)Lad/a$a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/lang/Throwable;)Lad/a$a;
    .locals 2

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_0

    sget-object p0, Lad/a$a$a$a;->a:Lad/a$a$a$a;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_1

    sget-object p0, Lad/a$a$a$b;->a:Lad/a$a$a$b;

    :goto_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected error in dns resolver"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;ILandroid/net/Network;)Lgg/z;
    .locals 1

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lad/c$a;

    invoke-direct {v0, p3, p1}, Lad/c$a;-><init>(Landroid/net/Network;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Lad/c$b;->a:Lad/c$b;

    invoke-virtual {p1, p3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    int-to-long p2, p2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance p2, Lad/b;

    invoke-direct {p2}, Lad/b;-><init>()V

    invoke-virtual {p1, p2}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
