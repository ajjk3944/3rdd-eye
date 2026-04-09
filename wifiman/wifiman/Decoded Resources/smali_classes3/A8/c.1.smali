.class public final LA8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUe/g;


# instance fields
.field private final a:LA8/z;

.field private final b:LFg/a;

.field private final c:LFg/a;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private f:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA8/z;)V
    .locals 4

    const-string/jumbo v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8/c;->a:LA8/z;

    sget-object p1, Le7/f$b;->a:Le7/f$b;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/c;->b:LFg/a;

    sget-object v1, Le7/g$a;->a:Le7/g$a;

    invoke-static {v1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, LA8/c;->c:LFg/a;

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/c;->d:Lgg/i;

    invoke-virtual {v1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/c;->e:Lgg/i;

    new-instance p1, LA8/b;

    invoke-direct {p1}, LA8/b;-><init>()V

    iput-object p1, p0, LA8/c;->f:Lmh/a;

    return-void
.end method

.method public static synthetic g()LYg/J;
    .locals 1

    invoke-static {}, LA8/c;->l()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final l()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Lh7/g;
    .locals 1

    invoke-virtual {p0}, LA8/c;->j()LA8/z;

    move-result-object v0

    return-object v0
.end method

.method public b(Le7/g;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/c;->c:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public c(IILdh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, LA8/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, LA8/c$a;-><init>(LA8/c;IILdh/e;)V

    invoke-static {v0, v1, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lm7/e;
    .locals 1

    invoke-virtual {p0}, LA8/c;->k()Lh7/a;

    move-result-object v0

    return-object v0
.end method

.method public e(Lmh/a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA8/c;->f:Lmh/a;

    return-void
.end method

.method public f(Le7/f;)V
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/c;->b:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()Lgg/i;
    .locals 1

    iget-object v0, p0, LA8/c;->d:Lgg/i;

    return-object v0
.end method

.method public final i()Lgg/i;
    .locals 1

    iget-object v0, p0, LA8/c;->e:Lgg/i;

    return-object v0
.end method

.method public j()LA8/z;
    .locals 1

    iget-object v0, p0, LA8/c;->a:LA8/z;

    return-object v0
.end method

.method public k()Lh7/a;
    .locals 1

    invoke-virtual {p0}, LA8/c;->j()LA8/z;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->E()Lh7/a;

    move-result-object v0

    return-object v0
.end method
