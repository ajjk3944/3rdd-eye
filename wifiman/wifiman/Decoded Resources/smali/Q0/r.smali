.class public final LQ0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ0/r$a;
    }
.end annotation


# static fields
.field public static final c:LQ0/r$a;

.field public static final d:I

.field private static final e:LQ0/u;

.field private static final f:LIi/K;


# instance fields
.field private final a:LQ0/g;

.field private b:LIi/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQ0/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ0/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ0/r;->c:LQ0/r$a;

    const/16 v0, 0x8

    sput v0, LQ0/r;->d:I

    new-instance v0, LQ0/u;

    invoke-direct {v0}, LQ0/u;-><init>()V

    sput-object v0, LQ0/r;->e:LQ0/u;

    sget-object v0, LIi/K;->M:LIi/K$a;

    new-instance v1, LQ0/r$c;

    invoke-direct {v1, v0}, LQ0/r$c;-><init>(LIi/K$a;)V

    sput-object v1, LQ0/r;->f:LIi/K;

    return-void
.end method

.method public constructor <init>(LQ0/g;Ldh/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LQ0/r;->a:LQ0/g;

    .line 3
    sget-object p1, LQ0/r;->f:LIi/K;

    .line 4
    invoke-static {}, LT0/l;->a()LIi/J;

    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    invoke-interface {p1, p2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    .line 6
    sget-object v0, LIi/y0;->O:LIi/y0$b;

    invoke-interface {p2, v0}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object p2

    check-cast p2, LIi/y0;

    invoke-static {p2}, LIi/S0;->a(LIi/y0;)LIi/A;

    move-result-object p2

    .line 7
    invoke-interface {p1, p2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object p1

    .line 8
    invoke-static {p1}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object p1

    iput-object p1, p0, LQ0/r;->b:LIi/N;

    return-void
.end method

.method public synthetic constructor <init>(LQ0/g;Ldh/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 9
    new-instance p1, LQ0/g;

    invoke-direct {p1}, LQ0/g;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 10
    sget-object p2, Ldh/j;->a:Ldh/j;

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2}, LQ0/r;-><init>(LQ0/g;Ldh/i;)V

    return-void
.end method


# virtual methods
.method public a(LQ0/S;LQ0/G;Lmh/l;Lmh/l;)LQ0/U;
    .locals 15

    move-object v0, p0

    invoke-virtual/range {p1 .. p1}, LQ0/S;->c()LQ0/k;

    move-result-object v1

    instance-of v1, v1, LQ0/q;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    sget-object v1, LQ0/r;->e:LQ0/u;

    invoke-virtual/range {p1 .. p1}, LQ0/S;->c()LQ0/k;

    move-result-object v3

    check-cast v3, LQ0/q;

    invoke-virtual {v3}, LQ0/q;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LQ0/S;->f()LQ0/A;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, LQ0/S;->d()I

    move-result v5

    invoke-virtual {v1, v3, v4, v5}, LQ0/u;->a(Ljava/util/List;LQ0/A;I)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, LQ0/r;->a:LQ0/g;

    move-object/from16 v7, p1

    move-object/from16 v10, p2

    move-object/from16 v4, p4

    invoke-static {v1, v7, v3, v10, v4}, LQ0/s;->a(Ljava/util/List;LQ0/S;LQ0/g;LQ0/G;Lmh/l;)LYg/s;

    move-result-object v1

    invoke-virtual {v1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    invoke-virtual {v1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    new-instance v1, LQ0/U$b;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v6, v3, v4, v2}, LQ0/U$b;-><init>(Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance v1, LQ0/f;

    iget-object v8, v0, LQ0/r;->a:LQ0/g;

    move-object v4, v1

    move-object/from16 v7, p1

    move-object/from16 v9, p3

    move-object/from16 v10, p2

    invoke-direct/range {v4 .. v10}, LQ0/f;-><init>(Ljava/util/List;Ljava/lang/Object;LQ0/S;LQ0/g;Lmh/l;LQ0/G;)V

    iget-object v9, v0, LQ0/r;->b:LIi/N;

    sget-object v11, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v12, LQ0/r$b;

    invoke-direct {v12, v1, v2}, LQ0/r$b;-><init>(LQ0/f;Ldh/e;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v10, 0x0

    invoke-static/range {v9 .. v14}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v2, LQ0/U$a;

    invoke-direct {v2, v1}, LQ0/U$a;-><init>(LQ0/f;)V

    return-object v2
.end method
