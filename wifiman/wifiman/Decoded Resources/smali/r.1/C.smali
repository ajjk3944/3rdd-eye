.class public final Lr/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lr/s0;

.field private final b:LT/q0;

.field private c:Lr/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lr/s0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/C;->a:Lr/s0;

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/C;->b:LT/q0;

    return-void
.end method

.method public static final synthetic a(Lr/C;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lr/C;->c()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/C;->c:Lr/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lr/a;->k()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/C;->b:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/C;->b:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lr/C;Ljava/lang/Object;LIi/N;Lr/H;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x7

    const/4 p4, 0x0

    const/4 p5, 0x0

    invoke-static {p4, p4, p5, p3, p5}, Lr/j;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lr/h0;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lr/C;->f(Ljava/lang/Object;LIi/N;Lr/H;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d()Z
    .locals 2

    invoke-direct {p0}, Lr/C;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0}, Lr/C;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr/C;->c:Lr/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr/a;->p()Z

    move-result v0

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method public final f(Ljava/lang/Object;LIi/N;Lr/H;)Ljava/lang/Object;
    .locals 14

    move-object v6, p0

    invoke-direct {p0, p1}, Lr/C;->e(Ljava/lang/Object;)V

    iget-object v0, v6, Lr/C;->c:Lr/a;

    if-nez v0, :cond_0

    new-instance v0, Lr/a;

    iget-object v9, v6, Lr/C;->a:Lr/s0;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v0

    move-object v8, p1

    invoke-direct/range {v7 .. v13}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, v6, Lr/C;->c:Lr/a;

    goto :goto_0

    :cond_0
    move-object v7, v0

    :goto_0
    new-instance v8, Lr/C$a;

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lr/C$a;-><init>(Lr/a;Lr/C;Ljava/lang/Object;Lr/H;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p2

    move-object v3, v8

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    invoke-virtual {v7}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
