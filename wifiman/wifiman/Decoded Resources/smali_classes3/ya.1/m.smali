.class public final Lya/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lya/m$a;
    }
.end annotation


# static fields
.field public static final e:Lya/m$a;


# instance fields
.field private final a:Lza/d;

.field private final b:Lya/n;

.field private final c:Lcom/ui/uidb/UiDB;

.field private d:Lxa/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lya/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lya/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lya/m;->e:Lya/m$a;

    return-void
.end method

.method public constructor <init>(Lcom/ui/uidb/UiDB$b;Lokhttp3/OkHttpClient;Lza/d;Lya/n;)V
    .locals 8

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lya/m;->a:Lza/d;

    iput-object p4, p0, Lya/m;->b:Lya/n;

    sget-object v1, Lcom/ui/uidb/UiDB;->a:Lcom/ui/uidb/UiDB$a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v7}, Lcom/ui/uidb/UiDB$a;->b(Lcom/ui/uidb/UiDB$a;Lcom/ui/uidb/UiDB$b;ZLokhttp3/OkHttpClient;Lbb/b;ILjava/lang/Object;)Lcom/ui/uidb/UiDB;

    move-result-object p1

    iput-object p1, p0, Lya/m;->c:Lcom/ui/uidb/UiDB;

    return-void
.end method

.method public static synthetic d(Lcom/ui/uidb/UiDB$c;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lya/m;->s(Lcom/ui/uidb/UiDB$c;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lya/m;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lya/m;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lya/m;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lya/m;->u(Lya/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lya/m;->q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lya/m;->n(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lya/m;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lya/m;->o(Lya/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(LYa/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lya/m;->r(LYa/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lya/m;)Lza/d;
    .locals 0

    iget-object p0, p0, Lya/m;->a:Lza/d;

    return-object p0
.end method

.method private static final m()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Source [Remote] - storage load initiated"

    return-object v0
.end method

.method private static final n(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Remote] - storage load finished. Took "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lya/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lya/m;->b()Lxa/a$b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lxa/a$b;->b()Lbb/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbb/a;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Remote] - contains "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " products"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final q()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Source [Remote] - SYNC"

    return-object v0
.end method

.method private static final r(LYa/a;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Remote] - SYNC initiated (etag: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lcom/ui/uidb/UiDB$c;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/ui/uidb/UiDB$c;->d()Lbb/a;

    move-result-object p0

    invoke-virtual {p0}, Lbb/a;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Remote] - Remote fetch success. Received snapshot with "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " products"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final t()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Source [Remote] - SYNC - Not Changed"

    return-object v0
.end method

.method private static final u(Lya/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lya/m;->b()Lxa/a$b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lxa/a$b;->b()Lbb/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbb/a;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Source [Remote] - contains "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " products"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lya/m$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lya/m$d;

    iget v1, v0, Lya/m$d;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lya/m$d;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lya/m$d;

    invoke-direct {v0, p0, p1}, Lya/m$d;-><init>(Lya/m;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lya/m$d;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lya/m$d;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lya/m$d;->b:Ljava/lang/Object;

    check-cast v1, Lcom/ui/uidb/UiDB$c;

    iget-object v0, v0, Lya/m$d;->a:Ljava/lang/Object;

    check-cast v0, Lya/m;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ui/uidb/UiDB$Error$NotChanged; {:try_start_0 .. :try_end_0} :catch_2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lya/m$d;->a:Ljava/lang/Object;

    check-cast v2, Lya/m;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/ui/uidb/UiDB$Error$NotChanged; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-object v0, v2

    goto/16 :goto_5

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    new-instance p1, Lya/e;

    invoke-direct {p1}, Lya/e;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    invoke-virtual {p0}, Lya/m;->b()Lxa/a$b;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lbb/a$a;->b()LYa/a;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :catch_1
    move-object v0, p0

    goto :goto_5

    :cond_4
    :goto_1
    iget-object p1, p0, Lya/m;->b:Lya/n;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lya/n;->b()Lxa/a$b;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lxa/a$b;->a()Lbb/a$a;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lbb/a$a;->b()LYa/a;

    move-result-object p1

    goto :goto_2

    :cond_5
    move-object p1, v3

    :cond_6
    :goto_2
    new-instance v2, Lya/f;

    invoke-direct {v2, p1}, Lya/f;-><init>(LYa/a;)V

    invoke-static {v2}, LBa/a;->b(Lmh/a;)V

    iget-object v2, p0, Lya/m;->c:Lcom/ui/uidb/UiDB;

    iput-object p0, v0, Lya/m$d;->a:Ljava/lang/Object;

    iput v5, v0, Lya/m$d;->e:I

    invoke-interface {v2, p1, v0}, Lcom/ui/uidb/UiDB;->a(LYa/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lcom/ui/uidb/UiDB$Error$NotChanged; {:try_start_2 .. :try_end_2} :catch_1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p0

    :goto_3
    :try_start_3
    check-cast p1, Lcom/ui/uidb/UiDB$c;

    new-instance v5, Lya/g;

    invoke-direct {v5, p1}, Lya/g;-><init>(Lcom/ui/uidb/UiDB$c;)V

    invoke-static {v5}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v5

    new-instance v6, Lya/m$e;

    invoke-direct {v6, v2, p1, v3}, Lya/m$e;-><init>(Lya/m;Lcom/ui/uidb/UiDB$c;Ldh/e;)V

    iput-object v2, v0, Lya/m$d;->a:Ljava/lang/Object;

    iput-object p1, v0, Lya/m$d;->b:Ljava/lang/Object;

    iput v4, v0, Lya/m$d;->e:I

    invoke-static {v5, v6, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Lcom/ui/uidb/UiDB$Error$NotChanged; {:try_start_3 .. :try_end_3} :catch_0

    if-ne v0, v1, :cond_8

    return-object v1

    :cond_8
    move-object v1, p1

    move-object v0, v2

    :goto_4
    :try_start_4
    new-instance p1, Lxa/a$b;

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->c()Lbb/a$a;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ui/uidb/UiDB$c;->d()Lbb/a;

    move-result-object v1

    invoke-direct {p1, v2, v1}, Lxa/a$b;-><init>(Lbb/a$a;Lbb/a;)V

    invoke-virtual {v0, p1}, Lya/m;->p(Lxa/a$b;)V
    :try_end_4
    .catch Lcom/ui/uidb/UiDB$Error$NotChanged; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_6

    :catch_2
    :goto_5
    new-instance p1, Lya/h;

    invoke-direct {p1}, Lya/h;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    :goto_6
    new-instance p1, Lya/i;

    invoke-direct {p1, v0}, Lya/i;-><init>(Lya/m;)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public b()Lxa/a$b;
    .locals 1

    iget-object v0, p0, Lya/m;->d:Lxa/a$b;

    return-object v0
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lya/m$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lya/m$b;

    iget v1, v0, Lya/m$b;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lya/m$b;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lya/m$b;

    invoke-direct {v0, p0, p1}, Lya/m$b;-><init>(Lya/m;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lya/m$b;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lya/m$b;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v1, v0, Lya/m$b;->c:J

    iget-object v3, v0, Lya/m$b;->b:Ljava/lang/Object;

    check-cast v3, Lya/m;

    iget-object v0, v0, Lya/m$b;->a:Ljava/lang/Object;

    check-cast v0, Lya/m;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lya/j;

    invoke-direct {p1}, Lya/j;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p1

    new-instance v2, Lya/m$c;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lya/m$c;-><init>(Lya/m;Ldh/e;)V

    iput-object p0, v0, Lya/m$b;->a:Ljava/lang/Object;

    iput-object p0, v0, Lya/m$b;->b:Ljava/lang/Object;

    iput-wide v4, v0, Lya/m$b;->c:J

    iput v3, v0, Lya/m$b;->f:I

    invoke-static {p1, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v3, v0

    move-wide v1, v4

    :goto_1
    check-cast p1, Lxa/a$b;

    invoke-virtual {v3, p1}, Lya/m;->p(Lxa/a$b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    new-instance p1, Lya/k;

    invoke-direct {p1, v3, v4}, Lya/k;-><init>(J)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    new-instance p1, Lya/l;

    invoke-direct {p1, v0}, Lya/l;-><init>(Lya/m;)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public p(Lxa/a$b;)V
    .locals 0

    iput-object p1, p0, Lya/m;->d:Lxa/a$b;

    return-void
.end method
