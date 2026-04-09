.class public abstract LMd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/kodein/di/DI$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lorg/kodein/di/DI$g;

    new-instance v4, LMd/a;

    invoke-direct {v4}, LMd/a;-><init>()V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "model.cloud"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lorg/kodein/di/DI$g;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, LMd/f;->a:Lorg/kodein/di/DI$g;

    return-void
.end method

.method public static synthetic a(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/console/a;
    .locals 0

    invoke-static {p0}, LMd/f;->i(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/console/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luj/j;)LNd/f;
    .locals 0

    invoke-static {p0}, LMd/f;->g(Luj/j;)LNd/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LMd/f;->f(Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;
    .locals 0

    invoke-static {p0}, LMd/f;->h(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luj/j;)LOd/c;
    .locals 0

    invoke-static {p0}, LMd/f;->j(Luj/j;)LOd/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lorg/kodein/di/DI$b;)LYg/J;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "$this$Module"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v2, LMd/f$d;

    invoke-direct {v2}, LMd/f$d;-><init>()V

    invoke-virtual {v2}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-static {v2}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, LNd/c;

    invoke-direct {v1, v2, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    new-instance v11, LMd/b;

    invoke-direct {v11}, LMd/b;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LMd/f$q;

    invoke-direct {v4}, LMd/f$q;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, LNd/f;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v1, v12}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$e;

    invoke-direct {v4}, LMd/f$e;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/c;

    invoke-direct {v1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    sget-object v4, LMd/f$a;->a:LMd/f$a;

    new-instance v5, Luj/g;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LMd/f$k;

    invoke-direct {v8}, LMd/f$k;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v8, Lorg/kodein/type/d;

    new-instance v10, LMd/f$l;

    invoke-direct {v10}, LMd/f$l;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v11, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;

    invoke-direct {v8, v10, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v8, v4}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v1, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$f;

    invoke-direct {v4}, LMd/f$f;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LNd/a;

    invoke-direct {v1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    sget-object v4, LMd/f$b;->a:LMd/f$b;

    new-instance v5, Luj/g;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    new-instance v7, Lorg/kodein/type/d;

    new-instance v8, LMd/f$m;

    invoke-direct {v8}, LMd/f$m;-><init>()V

    invoke-virtual {v8}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v8

    invoke-static {v8, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v8, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v8, Lorg/kodein/type/d;

    new-instance v10, LMd/f$n;

    invoke-direct {v10}, LMd/f$n;-><init>()V

    invoke-virtual {v10}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-static {v10}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v10, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-direct {v5, v6, v7, v8, v4}, Luj/g;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Lmh/p;)V

    invoke-interface {v1, v5}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$g;

    invoke-direct {v4}, LMd/f$g;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v4, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    sget-object v20, LMd/f$c;->a:LMd/f$c;

    new-instance v4, Luj/i;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v13

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v14

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v15

    new-instance v5, Lorg/kodein/type/d;

    new-instance v6, LMd/f$o;

    invoke-direct {v6}, LMd/f$o;-><init>()V

    invoke-virtual {v6}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LMd/f$p;

    invoke-direct {v7}, LMd/f$p;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v11}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v12, v4

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    invoke-direct/range {v12 .. v20}, Luj/i;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Lorg/kodein/type/q;Luj/o;ZLmh/p;)V

    invoke-interface {v1, v4}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$h;

    invoke-direct {v4}, LMd/f$h;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    invoke-direct {v1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    new-instance v11, LMd/c;

    invoke-direct {v11}, LMd/c;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LMd/f$r;

    invoke-direct {v4}, LMd/f$r;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v1, v12}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$i;

    invoke-direct {v4}, LMd/f$i;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LQd/e;

    invoke-direct {v1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    new-instance v11, LMd/d;

    invoke-direct {v11}, LMd/d;-><init>()V

    new-instance v12, Luj/u;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v4, LMd/f$s;

    invoke-direct {v4}, LMd/f$s;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v9, Lcom/ui/wifiman/model/ubiquiti/console/a;

    invoke-direct {v8, v4, v9}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v9, 0x0

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v1, v12}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    new-instance v1, Lorg/kodein/type/d;

    new-instance v4, LMd/f$j;

    invoke-direct {v4}, LMd/f$j;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LOd/a$a;

    invoke-direct {v1, v4, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v0, v1, v2, v2}, Lorg/kodein/di/DI$b;->d(Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)Lorg/kodein/di/DI$b$b;

    move-result-object v1

    new-instance v11, LMd/e;

    invoke-direct {v11}, LMd/e;-><init>()V

    new-instance v2, Luj/u;

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a$a;->c()Luj/q;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->b()Lorg/kodein/type/q;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Lorg/kodein/di/DI$a;->e()Z

    move-result v7

    new-instance v8, Lorg/kodein/type/d;

    new-instance v0, LMd/f$t;

    invoke-direct {v0}, LMd/f$t;-><init>()V

    invoke-virtual {v0}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v3, LOd/c;

    invoke-direct {v8, v0, v3}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    move-object v4, v2

    invoke-direct/range {v4 .. v11}, Luj/u;-><init>(Luj/q;Lorg/kodein/type/q;ZLorg/kodein/type/q;Luj/o;ZLmh/l;)V

    invoke-interface {v1, v2}, Lorg/kodein/di/DI$b$b;->a(Luj/e;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final g(Luj/j;)LNd/f;
    .locals 5

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNd/f;

    sget-object v1, Lcom/ui/sso/api/UiAccountApi$b;->a:Lcom/ui/sso/api/UiAccountApi$b$a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LMd/f$u;

    invoke-direct {v3}, LMd/f$u;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Landroid/content/Context;

    invoke-direct {v2, v3, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {v1, p0}, Lcom/ui/sso/api/UiAccountApi$b$a;->a(Landroid/content/Context;)Lcom/ui/sso/api/UiAccountApi$b;

    move-result-object p0

    invoke-direct {v0, p0}, LNd/f;-><init>(Lcom/ui/sso/api/UiAccountApi$b;)V

    return-object v0
.end method

.method private static final h(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;
    .locals 9

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;

    invoke-interface {p0}, Lrj/o2;->d()Lorg/kodein/di/DI;

    move-result-object v1

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v2

    new-instance v3, Lorg/kodein/type/d;

    new-instance v4, LMd/f$v;

    invoke-direct {v4}, LMd/f$v;-><init>()V

    invoke-virtual {v4}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, LLb/b;

    invoke-direct {v3, v4, v6}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLb/b;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v3

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LMd/f$w;

    invoke-direct {v7}, LMd/f$w;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v8, LNd/c;

    invoke-direct {v6, v7, v8}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {v3, v6, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LNd/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v6, Lorg/kodein/type/d;

    new-instance v7, LMd/f$x;

    invoke-direct {v7}, LMd/f$x;-><init>()V

    invoke-virtual {v7}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-static {v7}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, Llc/e;

    invoke-direct {v6, v7, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v6, v4}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llc/e;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/d;-><init>(Lorg/kodein/di/DI;LLb/b;LNd/c;Llc/e;)V

    return-object v0
.end method

.method private static final i(Luj/j;)Lcom/ui/wifiman/model/ubiquiti/console/a;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/a;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LMd/f$y;

    invoke-direct {v3}, LMd/f$y;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LNb/e;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNb/e;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LMd/f$z;

    invoke-direct {v5}, LMd/f$z;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lxa/o;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxa/o;

    invoke-direct {v0, v1, p0}, Lcom/ui/wifiman/model/ubiquiti/console/a;-><init>(LNb/e;Lxa/o;)V

    return-object v0
.end method

.method private static final j(Luj/j;)LOd/c;
    .locals 6

    const-string v0, "$this$singleton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOd/c;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object v1

    new-instance v2, Lorg/kodein/type/d;

    new-instance v3, LMd/f$A;

    invoke-direct {v3}, LMd/f$A;-><init>()V

    invoke-virtual {v3}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v3}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v5, LZc/f;

    invoke-direct {v2, v3, v5}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZc/f;

    invoke-interface {p0}, Lrj/n2;->g()Lrj/m2;

    move-result-object p0

    new-instance v2, Lorg/kodein/type/d;

    new-instance v5, LMd/f$B;

    invoke-direct {v5}, LMd/f$B;-><init>()V

    invoke-virtual {v5}, Lorg/kodein/type/o;->a()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-static {v5}, Lorg/kodein/type/s;->e(Ljava/lang/reflect/Type;)Lorg/kodein/type/i;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lfd/b;

    invoke-direct {v2, v5, v4}, Lorg/kodein/type/d;-><init>(Lorg/kodein/type/i;Ljava/lang/Class;)V

    invoke-interface {p0, v2, v3}, Lrj/o2;->e(Lorg/kodein/type/q;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfd/b;

    invoke-direct {v0, v1, p0}, LOd/c;-><init>(LZc/f;Lfd/b;)V

    return-object v0
.end method

.method public static final k()Lorg/kodein/di/DI$g;
    .locals 1

    sget-object v0, LMd/f;->a:Lorg/kodein/di/DI$g;

    return-object v0
.end method
