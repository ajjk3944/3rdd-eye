.class final LT0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/n;


# instance fields
.field private a:LT/z1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/emoji2/text/f;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LT0/k;->c()LT/z1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LT0/k;->a:LT/z1;

    return-void
.end method

.method public static final synthetic b(LT0/k;LT/z1;)V
    .locals 0

    iput-object p1, p0, LT0/k;->a:LT/z1;

    return-void
.end method

.method private final c()LT/z1;
    .locals 4

    invoke-static {}, Landroidx/emoji2/text/f;->c()Landroidx/emoji2/text/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/emoji2/text/f;->g()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, LT0/p;

    invoke-direct {v0, v2}, LT0/p;-><init>(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    new-instance v2, LT0/k$a;

    invoke-direct {v2, v1, p0}, LT0/k$a;-><init>(LT/q0;LT0/k;)V

    invoke-virtual {v0, v2}, Landroidx/emoji2/text/f;->v(Landroidx/emoji2/text/f$f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()LT/z1;
    .locals 1

    iget-object v0, p0, LT0/k;->a:LT/z1;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/emoji2/text/f;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, LT0/k;->c()LT/z1;

    move-result-object v0

    iput-object v0, p0, LT0/k;->a:LT/z1;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {}, LT0/o;->a()LT0/p;

    move-result-object v0

    :goto_0
    return-object v0
.end method
