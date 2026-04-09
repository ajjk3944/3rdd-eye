.class public final Lod/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/b;


# instance fields
.field private final a:LWb/a;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>(LWb/a;)V
    .locals 1

    const-string v0, "floorplanDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod/c;->a:LWb/a;

    invoke-interface {p1}, LWb/a;->k()Lgg/i;

    move-result-object p1

    new-instance v0, Lod/c$d;

    invoke-direct {v0, p0}, Lod/c$d;-><init>(Lod/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lod/c;->b:Lgg/i;

    return-void
.end method

.method public static final synthetic g(Lod/c;LWb/d;)Lod/a;
    .locals 0

    invoke-direct {p0, p1}, Lod/c;->i(LWb/d;)Lod/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lod/c;)LWb/a;
    .locals 0

    iget-object p0, p0, Lod/c;->a:LWb/a;

    return-object p0
.end method

.method private final i(LWb/d;)Lod/a;
    .locals 7

    invoke-virtual {p1}, LWb/d;->c()J

    move-result-wide v1

    invoke-virtual {p1}, LWb/d;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LWb/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LWb/d;->f()J

    move-result-wide v5

    new-instance p1, Lod/a;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lod/a;-><init>(JLjava/lang/String;Ljava/lang/String;J)V

    return-object p1
.end method


# virtual methods
.method public a(J)Lgg/b;
    .locals 1

    new-instance v0, Lod/c$a;

    invoke-direct {v0, p0, p1, p2}, Lod/c$a;-><init>(Lod/c;J)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(JLjava/lang/String;)Lgg/b;
    .locals 1

    new-instance v0, Lod/c$f;

    invoke-direct {v0, p0, p1, p2, p3}, Lod/c$f;-><init>(Lod/c;JLjava/lang/String;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lod/c;->b:Lgg/i;

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lgg/z;
    .locals 8

    const-string v0, "gpx"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lod/c$e;

    move-object v1, v0

    move-object v2, p2

    move-object v3, p1

    move-wide v4, p3

    move-object v6, p0

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lod/c$e;-><init>(Ljava/lang/String;Ljava/lang/String;JLod/c;Ljava/lang/String;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public e(J)Lgg/i;
    .locals 1

    iget-object v0, p0, Lod/c;->a:LWb/a;

    invoke-interface {v0, p1, p2}, LWb/a;->d(J)Lgg/i;

    move-result-object p1

    new-instance p2, Lod/c$b;

    invoke-direct {p2, p0}, Lod/c$b;-><init>(Lod/c;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f(J)Lgg/i;
    .locals 1

    iget-object v0, p0, Lod/c;->a:LWb/a;

    invoke-interface {v0, p1, p2}, LWb/a;->i(J)Lgg/i;

    move-result-object p1

    sget-object p2, Lod/c$c;->a:Lod/c$c;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string p2, "observeOn(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
