.class public final Lu8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field private final a:LFg/a;

.field private final b:Lgg/b;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lu8/d;->a:LFg/a;

    new-instance v1, Lu8/b;

    invoke-direct {v1}, Lu8/b;-><init>()V

    invoke-static {v1}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v1

    new-instance v2, Lu8/d$a;

    invoke-direct {v2, p0}, Lu8/d$a;-><init>(Lu8/d;)V

    invoke-virtual {v1, v2}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object v1

    new-instance v2, Lu8/c;

    invoke-direct {v2, p0}, Lu8/c;-><init>(Lu8/d;)V

    invoke-virtual {v1, v2}, Lgg/s;->A(Lkg/a;)Lgg/s;

    move-result-object v1

    invoke-virtual {v1}, Lgg/s;->r0()LBg/a;

    move-result-object v1

    invoke-virtual {v1}, LBg/a;->l1()Lgg/s;

    move-result-object v1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object v1

    invoke-virtual {v1}, Lgg/s;->f0()Lgg/b;

    move-result-object v1

    const-string/jumbo v2, "ignoreElements(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lu8/d;->b:Lgg/b;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lu8/d;->c:Lgg/i;

    return-void
.end method

.method public static synthetic c(Lu8/d;)V
    .locals 0

    invoke-static {p0}, Lu8/d;->g(Lu8/d;)V

    return-void
.end method

.method public static synthetic d(Lgg/t;)V
    .locals 0

    invoke-static {p0}, Lu8/d;->f(Lgg/t;)V

    return-void
.end method

.method public static final synthetic e(Lu8/d;)LFg/a;
    .locals 0

    iget-object p0, p0, Lu8/d;->a:LFg/a;

    return-object p0
.end method

.method private static final f(Lgg/t;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method private static final g(Lu8/d;)V
    .locals 1

    iget-object p0, p0, Lu8/d;->a:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lu8/d;->c:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/b;
    .locals 1

    iget-object v0, p0, Lu8/d;->b:Lgg/b;

    return-object v0
.end method
