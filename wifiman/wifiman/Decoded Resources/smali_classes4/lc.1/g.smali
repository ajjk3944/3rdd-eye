.class public final Llc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llc/e;
.implements Llc/d;


# instance fields
.field private final a:LFg/c;

.field private final b:LFg/a;

.field private final c:Lgg/i;

.field private final d:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LFg/c;->j2()LFg/c;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Llc/g;->a:LFg/c;

    invoke-static {}, LFg/a;->j2()LFg/a;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Llc/g;->b:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v1, Llc/g$c;->a:Llc/g$c;

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v3, "refCount(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Llc/g;->c:Lgg/i;

    invoke-virtual {v2}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v2, Llc/g$d;->a:Llc/g$d;

    invoke-virtual {v0, v2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Llc/g;->d:Lgg/i;

    return-void
.end method

.method public static final synthetic e(Llc/g;)LFg/c;
    .locals 0

    iget-object p0, p0, Llc/g;->a:LFg/c;

    return-object p0
.end method

.method public static final synthetic f(Llc/g;Llc/a;)Llc/d$a;
    .locals 0

    invoke-direct {p0, p1}, Llc/g;->h(Llc/a;)Llc/d$a;

    move-result-object p0

    return-object p0
.end method

.method private final h(Llc/a;)Llc/d$a;
    .locals 2

    new-instance v0, Llc/d$a;

    invoke-virtual {p1}, Llc/a;->a()I

    move-result v1

    invoke-virtual {p1}, Llc/a;->b()Landroid/content/Intent;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Llc/d$a;-><init>(ILandroid/content/Intent;)V

    return-object v0
.end method


# virtual methods
.method public a(Llc/a;)Lgg/z;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llc/g;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {p0, p1}, Llc/g;->g(Llc/a;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Llc/g$b;

    invoke-direct {v1, p1}, Llc/g$b;-><init>(Llc/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    const-string v0, "firstOrError(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Llc/g;->d:Lgg/i;

    return-object v0
.end method

.method public c(IILandroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, Llc/g;->b:LFg/a;

    new-instance v1, Llc/c;

    invoke-static {p1}, Llc/b;->a(I)I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p3, v2}, Llc/c;-><init>(IILandroid/content/Intent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public d()Lgg/i;
    .locals 1

    iget-object v0, p0, Llc/g;->c:Lgg/i;

    return-object v0
.end method

.method public g(Llc/a;)Lgg/b;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llc/g$a;

    invoke-direct {v0, p0, p1}, Llc/g$a;-><init>(Llc/g;Llc/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
