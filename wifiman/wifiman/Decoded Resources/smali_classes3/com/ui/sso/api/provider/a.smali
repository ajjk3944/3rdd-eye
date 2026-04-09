.class public final Lcom/ui/sso/api/provider/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/sso/api/UiAccountApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/sso/api/provider/a$a;,
        Lcom/ui/sso/api/provider/a$b;,
        Lcom/ui/sso/api/provider/a$c;
    }
.end annotation


# static fields
.field public static final p:Lcom/ui/sso/api/provider/a$a;


# instance fields
.field private final a:Lcom/ui/sso/api/UiAccountApi$c;

.field private final b:Lcom/ui/sso/api/UiAccountApi$d;

.field private final c:Landroid/content/ContentResolver;

.field private final d:Lcom/ui/sso/api/provider/f;

.field private final e:LWa/a;

.field private final f:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

.field private final g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

.field private final h:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

.field private final i:Lcom/ui/sso/auth/UiAuthSerializer;

.field private final j:LIi/J;

.field private final k:LIi/J;

.field private final l:Lcom/ui/sso/api/provider/a$b$c;

.field private final m:LLi/g;

.field private final n:LLi/g;

.field private final o:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/sso/api/provider/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/sso/api/provider/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/sso/api/provider/a;->p:Lcom/ui/sso/api/provider/a$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/sso/api/UiAccountApi$c;Lcom/ui/sso/api/UiAccountApi$d;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;LWa/a;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;Lcom/ui/sso/auth/UiAuthSerializer;LIi/N;LIi/J;LIi/J;Lcom/ui/sso/api/provider/a$b$c;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    const-string/jumbo v14, "state"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "supportFile"

    invoke-static {v2, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "resolver"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "uri"

    invoke-static {v4, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "sdkVersion"

    invoke-static {v5, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "requestSerializer"

    invoke-static {v6, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "responseSerializer"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "cursorSerializer"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "authSerializer"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "externalScope"

    invoke-static {v10, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "dispatcherIO"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "dispatcherDefault"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v14, "notificationObserver"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/ui/sso/api/provider/a;->a:Lcom/ui/sso/api/UiAccountApi$c;

    iput-object v2, v0, Lcom/ui/sso/api/provider/a;->b:Lcom/ui/sso/api/UiAccountApi$d;

    iput-object v3, v0, Lcom/ui/sso/api/provider/a;->c:Landroid/content/ContentResolver;

    iput-object v4, v0, Lcom/ui/sso/api/provider/a;->d:Lcom/ui/sso/api/provider/f;

    iput-object v5, v0, Lcom/ui/sso/api/provider/a;->e:LWa/a;

    iput-object v6, v0, Lcom/ui/sso/api/provider/a;->f:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    iput-object v7, v0, Lcom/ui/sso/api/provider/a;->g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    iput-object v8, v0, Lcom/ui/sso/api/provider/a;->h:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    iput-object v9, v0, Lcom/ui/sso/api/provider/a;->i:Lcom/ui/sso/auth/UiAuthSerializer;

    iput-object v11, v0, Lcom/ui/sso/api/provider/a;->j:LIi/J;

    iput-object v12, v0, Lcom/ui/sso/api/provider/a;->k:LIi/J;

    iput-object v13, v0, Lcom/ui/sso/api/provider/a;->l:Lcom/ui/sso/api/provider/a$b$c;

    new-instance v1, Lcom/ui/sso/api/provider/a$s;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ui/sso/api/provider/a$s;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    invoke-static {v1}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object v1

    invoke-static {v1, v12}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v1

    sget-object v3, LLi/J;->a:LLi/J$a;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 p1, v3

    move-wide/from16 p2, v6

    move-wide/from16 p4, v8

    move/from16 p6, v4

    move-object/from16 p7, v5

    invoke-static/range {p1 .. p7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v4

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, p10

    move-object/from16 p3, v4

    move/from16 p4, v7

    move/from16 p5, v5

    move-object/from16 p6, v6

    invoke-static/range {p1 .. p6}, LWa/c;->b(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/g;

    move-result-object v1

    iput-object v1, v0, Lcom/ui/sso/api/provider/a;->m:LLi/g;

    new-instance v4, Lcom/ui/sso/api/provider/a$d;

    invoke-direct {v4, v2}, Lcom/ui/sso/api/provider/a$d;-><init>(Ldh/e;)V

    invoke-static {v1, v4}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object v4

    new-instance v5, Lcom/ui/sso/api/provider/a$n;

    invoke-direct {v5, v4}, Lcom/ui/sso/api/provider/a$n;-><init>(LLi/g;)V

    new-instance v4, Lcom/ui/sso/api/provider/a$e;

    invoke-direct {v4, p0, v2}, Lcom/ui/sso/api/provider/a$e;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    invoke-static {v5, v4}, LLi/i;->E(LLi/g;Lmh/p;)LLi/g;

    move-result-object v2

    invoke-static {v2}, LLi/i;->w(LLi/g;)LLi/g;

    move-result-object v2

    invoke-static {v2}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object v2

    invoke-static {v2, v12}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 p1, v3

    move-wide/from16 p2, v6

    move-wide/from16 p4, v8

    move/from16 p6, v4

    move-object/from16 p7, v5

    invoke-static/range {p1 .. p7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v10, v4, v5}, LWa/c;->a(LLi/g;LIi/N;LLi/J;I)LLi/g;

    move-result-object v2

    iput-object v2, v0, Lcom/ui/sso/api/provider/a;->n:LLi/g;

    new-instance v2, Lcom/ui/sso/api/provider/a$o;

    invoke-direct {v2, v1}, Lcom/ui/sso/api/provider/a$o;-><init>(LLi/g;)V

    new-instance v1, Lcom/ui/sso/api/provider/a$p;

    invoke-direct {v1, v2}, Lcom/ui/sso/api/provider/a$p;-><init>(LLi/g;)V

    invoke-static {v1}, LLi/i;->w(LLi/g;)LLi/g;

    move-result-object v1

    invoke-static {v1, v12}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-wide/from16 p2, v5

    move-wide/from16 p4, v7

    move/from16 p6, v2

    move-object/from16 p7, v4

    invoke-static/range {p1 .. p7}, LLi/J$a;->b(LLi/J$a;JJILjava/lang/Object;)LLi/J;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v5, 0x0

    move-object/from16 p1, v1

    move-object/from16 p2, p10

    move-object/from16 p3, v2

    move/from16 p4, v5

    move/from16 p5, v3

    move-object/from16 p6, v4

    invoke-static/range {p1 .. p6}, LWa/c;->b(LLi/g;LIi/N;LLi/J;IILjava/lang/Object;)LLi/g;

    move-result-object v1

    iput-object v1, v0, Lcom/ui/sso/api/provider/a;->o:LLi/g;

    return-void
.end method

.method public static final synthetic j(Lcom/ui/sso/api/provider/a;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/sso/api/provider/a;->u(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/auth/UiAuthSerializer;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->i:Lcom/ui/sso/auth/UiAuthSerializer;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->h:Lcom/ui/sso/api/provider/UiAccountProviderCursor$Serializer;

    return-object p0
.end method

.method public static final synthetic m(Lcom/ui/sso/api/provider/a;)LIi/J;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->j:LIi/J;

    return-object p0
.end method

.method public static final synthetic n(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/a$b$c;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->l:Lcom/ui/sso/api/provider/a$b$c;

    return-object p0
.end method

.method public static final synthetic o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->f:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    return-object p0
.end method

.method public static final synthetic p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->c:Landroid/content/ContentResolver;

    return-object p0
.end method

.method public static final synthetic q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->g:Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    return-object p0
.end method

.method public static final synthetic r(Lcom/ui/sso/api/provider/a;)LWa/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->e:LWa/a;

    return-object p0
.end method

.method public static final synthetic s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;
    .locals 0

    iget-object p0, p0, Lcom/ui/sso/api/provider/a;->d:Lcom/ui/sso/api/provider/f;

    return-object p0
.end method

.method private final u(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->j:LIi/J;

    new-instance v1, Lcom/ui/sso/api/provider/a$i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ui/sso/api/provider/a$i;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()LLi/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->n:LLi/g;

    return-object v0
.end method

.method public b(LNa/b;Ldh/e;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_UPDATE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/ui/sso/api/provider/d$b;

    invoke-virtual {p1}, LNa/b;->c()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LNa/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LNa/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LNa/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v0, v1, v2, p1}, Lcom/ui/sso/api/provider/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance v0, Lcom/ui/sso/api/provider/a$q;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ui/sso/api/provider/a$q;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    invoke-static {p1, v0, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/UUID;Ldh/e;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACCOUNT_DELETE:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/ui/sso/api/provider/d$a;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, p1}, Lcom/ui/sso/api/provider/d$a;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance v0, Lcom/ui/sso/api/provider/a$h;

    const/4 v9, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lcom/ui/sso/api/provider/a$h;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    invoke-static {p1, v0, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->INVALIDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/ui/sso/api/provider/d$d;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v6, p1, p2}, Lcom/ui/sso/api/provider/d$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance p2, Lcom/ui/sso/api/provider/a$m;

    const/4 v9, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v9}, Lcom/ui/sso/api/provider/a$m;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    invoke-static {p1, p2, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/util/UUID;Lcom/ui/sso/auth/a$a;Ldh/e;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v0}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/ui/sso/api/provider/d$c;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, p1, v0}, Lcom/ui/sso/api/provider/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v2

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance v0, Lcom/ui/sso/api/provider/a$j;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v10, p0

    move-object v11, p2

    invoke-direct/range {v1 .. v11}, Lcom/ui/sso/api/provider/a$j;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;Lcom/ui/sso/api/provider/a;Lcom/ui/sso/auth/a$a;)V

    invoke-static {p1, v0, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f()LLi/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->o:LLi/g;

    return-object v0
.end method

.method public g(Ljava/util/UUID;Lcom/ui/sso/auth/a;Ldh/e;)Ljava/lang/Object;
    .locals 11

    :try_start_0
    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->i:Lcom/ui/sso/auth/UiAuthSerializer;

    invoke-interface {v0, p2}, Lcom/ui/sso/auth/UiAuthSerializer;->a(Lcom/ui/sso/auth/a;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/ui/sso/auth/UiAuthSerializer$Error; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Lcom/ui/sso/api/provider/UiAccountProvider$b;->UPDATE_AUTH_TOKEN:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {v1}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/ui/sso/api/provider/d$e;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "toString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/ui/sso/auth/a;->b()Lcom/ui/sso/auth/a$a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/ui/sso/auth/a$a;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v7, p1, p2, v0}, Lcom/ui/sso/api/provider/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v4

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v5

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v3

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v9

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance p2, Lcom/ui/sso/api/provider/a$r;

    const/4 v10, 0x0

    move-object v2, p2

    invoke-direct/range {v2 .. v10}, Lcom/ui/sso/api/provider/a$r;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    invoke-static {p1, p2, p3}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;

    const-string/jumbo p2, "Failed to serialize given authentication"

    invoke-direct {p1, p2}, Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getState()Lcom/ui/sso/api/UiAccountApi$c;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->a:Lcom/ui/sso/api/UiAccountApi$c;

    return-object v0
.end method

.method public h(Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, Lcom/ui/sso/api/provider/a$l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/a$l;

    iget v1, v0, Lcom/ui/sso/api/provider/a$l;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/a$l;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/a$l;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/a$l;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/a$l;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/a$l;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result p1

    const/4 v2, 0x2

    if-lt p1, v2, :cond_4

    sget-object p1, Lcom/ui/sso/api/provider/UiAccountProvider$b;->GET_DEVICE_IDENTIFIERS:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v5

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v11

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v10

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance v2, Lcom/ui/sso/api/provider/a$k;

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v12}, Lcom/ui/sso/api/provider/a$k;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    iput v3, v0, Lcom/ui/sso/api/provider/a$l;->c:I

    invoke-static {p1, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "deviceIdentifiers are not supported since API v2. Current API version is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". App "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " needs to be updated."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i()Lcom/ui/sso/api/UiAccountApi$d;
    .locals 1

    iget-object v0, p0, Lcom/ui/sso/api/provider/a;->b:Lcom/ui/sso/api/UiAccountApi$d;

    return-object v0
.end method

.method public final t(Ldh/e;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p1, Lcom/ui/sso/api/provider/a$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/ui/sso/api/provider/a$g;

    iget v1, v0, Lcom/ui/sso/api/provider/a$g;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/ui/sso/api/provider/a$g;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/ui/sso/api/provider/a$g;

    invoke-direct {v0, p0, p1}, Lcom/ui/sso/api/provider/a$g;-><init>(Lcom/ui/sso/api/provider/a;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lcom/ui/sso/api/provider/a$g;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/ui/sso/api/provider/a$g;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result p1

    const/4 v2, 0x3

    if-lt p1, v2, :cond_4

    sget-object p1, Lcom/ui/sso/api/provider/UiAccountProvider$b;->ACQUIRE_OWNERSHIP:Lcom/ui/sso/api/provider/UiAccountProvider$b;

    invoke-virtual {p1}, Lcom/ui/sso/api/provider/UiAccountProvider$b;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->p(Lcom/ui/sso/api/provider/a;)Landroid/content/ContentResolver;

    move-result-object v6

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->s(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/f;

    move-result-object v7

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->r(Lcom/ui/sso/api/provider/a;)LWa/a;

    move-result-object v5

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->o(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v11

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->q(Lcom/ui/sso/api/provider/a;)Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;

    move-result-object v10

    invoke-static {p0}, Lcom/ui/sso/api/provider/a;->m(Lcom/ui/sso/api/provider/a;)LIi/J;

    move-result-object p1

    new-instance v2, Lcom/ui/sso/api/provider/a$f;

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v12}, Lcom/ui/sso/api/provider/a$f;-><init>(LWa/a;Landroid/content/ContentResolver;Lcom/ui/sso/api/provider/f;Ljava/lang/String;Lcom/ui/sso/api/provider/d;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Lcom/ui/sso/api/provider/UiAccountProviderMessageSerializer;Ldh/e;)V

    iput v3, v0, Lcom/ui/sso/api/provider/a$g;->c:I

    invoke-static {p1, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_4
    new-instance p1, Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/sso/api/UiAccountApi$c;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/ui/sso/api/provider/a;->getState()Lcom/ui/sso/api/UiAccountApi$c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/sso/api/UiAccountApi$c;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "acquireOwnership are not supported since API v3. Current API version is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ". App "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " needs to be updated."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;-><init>(Ljava/lang/String;)V

    throw p1
.end method
