.class public final LVa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVa/b$a;
    }
.end annotation


# static fields
.field public static final d:LVa/b$a;


# instance fields
.field private final b:LIi/J;

.field private final c:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LVa/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LVa/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LVa/b;->d:LVa/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LIi/J;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LVa/b;->b:LIi/J;

    new-instance p2, LVa/b$h;

    invoke-direct {p2, p1}, LVa/b$h;-><init>(Landroid/content/Context;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LVa/b;->c:LYg/m;

    return-void
.end method

.method public static final synthetic f(LVa/b;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-direct {p0}, LVa/b;->i()Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LVa/b;)Ljava/util/UUID;
    .locals 0

    invoke-direct {p0}, LVa/b;->j()Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method private final h()Ljava/util/UUID;
    .locals 2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    new-instance v1, LVa/b$b;

    invoke-direct {v1, v0}, LVa/b$b;-><init>(Ljava/util/UUID;)V

    invoke-static {v1}, LUa/a;->e(Lmh/a;)V

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final i()Landroid/content/SharedPreferences;
    .locals 1

    iget-object v0, p0, LVa/b;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private final j()Ljava/util/UUID;
    .locals 4

    invoke-direct {p0}, LVa/b;->h()Ljava/util/UUID;

    move-result-object v0

    invoke-direct {p0}, LVa/b;->i()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "id"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-object v0
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVa/b;->b:LIi/J;

    new-instance v1, LVa/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LVa/b$c;-><init>(LVa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LVa/b;->i()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string/jumbo v0, "localAccountOwner"

    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p2, LVa/b$g;

    invoke-direct {p2, p1}, LVa/b$g;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, LUa/a;->e(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVa/b;->b:LIi/J;

    new-instance v1, LVa/b$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LVa/b$e;-><init>(LVa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVa/b;->b:LIi/J;

    new-instance v1, LVa/b$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LVa/b$f;-><init>(LVa/b;Ljava/lang/String;Ldh/e;)V

    invoke-static {v0, v1, p2}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public e(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVa/b;->b:LIi/J;

    new-instance v1, LVa/b$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LVa/b$d;-><init>(LVa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
