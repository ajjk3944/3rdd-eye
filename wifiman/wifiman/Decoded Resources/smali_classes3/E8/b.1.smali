.class public final LE8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE8/a;


# instance fields
.field private final a:Lrd/b;

.field private final b:LFg/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lrd/b;)V
    .locals 5

    const-string/jumbo v0, "discovery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/b;->a:Lrd/b;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/b;->b:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/b;->c:Lgg/i;

    const-wide/16 v3, 0xbb8

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v4, p1}, Lgg/z;->U(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    sget-object v1, LE8/b$a;->a:LE8/b$a;

    invoke-virtual {p1, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v1, LE8/b$b;

    invoke-direct {v1, p0}, LE8/b$b;-><init>(LE8/b;)V

    invoke-virtual {p1, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v1, LE8/b$c;->a:LE8/b$c;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/b;->d:Lgg/i;

    sget-object v1, LE8/b$e;->a:LE8/b$e;

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object v1, LE8/b$f;->a:LE8/b$f;

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE8/b;->e:Lgg/i;

    return-void
.end method

.method public static final synthetic b(LE8/b;)Lgg/i;
    .locals 0

    iget-object p0, p0, LE8/b;->c:Lgg/i;

    return-object p0
.end method

.method public static final synthetic c(LE8/b;)Lrd/b;
    .locals 0

    iget-object p0, p0, LE8/b;->a:Lrd/b;

    return-object p0
.end method

.method public static final synthetic d(LE8/b;)LFg/a;
    .locals 0

    iget-object p0, p0, LE8/b;->b:LFg/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/b;
    .locals 2

    new-instance v0, LE8/b$d;

    invoke-direct {v0, p0}, LE8/b$d;-><init>(LE8/b;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getState()Lgg/i;
    .locals 1

    iget-object v0, p0, LE8/b;->e:Lgg/i;

    return-object v0
.end method
