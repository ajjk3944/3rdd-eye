.class public abstract Ltd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-interface {v0}, Lth/d;->v()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RxStateMachine"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Ltd/c;->a:Ljava/lang/String;

    new-instance v0, Ltd/c$d;

    invoke-direct {v0, p0}, Ltd/c$d;-><init>(Ltd/c;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltd/c$f;

    invoke-direct {v1, p0}, Ltd/c$f;-><init>(Ltd/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ltd/c;->b:Lgg/i;

    return-void
.end method

.method public static synthetic a(Ltd/c;Lkotlin/jvm/internal/N;)Z
    .locals 0

    invoke-static {p0, p1}, Ltd/c;->i(Ltd/c;Lkotlin/jvm/internal/N;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Ltd/c;Ljava/lang/Object;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Ltd/c;->h(Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Lgg/i;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    new-instance v1, Ltd/c$a;

    invoke-direct {v1, p1, p0, v0}, Ltd/c$a;-><init>(Ljava/lang/Object;Ltd/c;Lkotlin/jvm/internal/N;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltd/c$b;

    invoke-direct {v1, p0}, Ltd/c$b;-><init>(Ltd/c;)V

    invoke-virtual {p1, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    new-instance v1, Ltd/c$c;

    invoke-direct {v1, p0, v0}, Ltd/c$c;-><init>(Ltd/c;Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, Ltd/b;

    invoke-direct {v1, p0, v0}, Ltd/b;-><init>(Ltd/c;Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v1}, Lgg/i;->m1(Lkg/d;)Lgg/i;

    move-result-object p1

    const-string v0, "repeatUntil(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final i(Ltd/c;Lkotlin/jvm/internal/N;)Z
    .locals 1

    iget-object p1, p1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ltd/c;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string v0, "reached final state}"

    invoke-virtual {p0}, Ltd/c;->d()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return p1
.end method


# virtual methods
.method protected abstract c()Ljava/lang/Object;
.end method

.method protected abstract d()Ljava/lang/String;
.end method

.method protected abstract e()Lgg/z;
.end method

.method public final f()Lgg/i;
    .locals 1

    iget-object v0, p0, Ltd/c;->b:Lgg/i;

    return-object v0
.end method

.method protected abstract g(Ljava/lang/Object;)Z
.end method

.method protected abstract j(Ljava/lang/Object;)Lgg/i;
.end method
