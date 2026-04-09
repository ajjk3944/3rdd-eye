.class public final Lza/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lza/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lza/b$a;,
        Lza/b$b;
    }
.end annotation


# static fields
.field public static final c:Lza/b$a;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Lbb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lza/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lza/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lza/b;->c:Lza/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lza/b;->a:Landroid/content/SharedPreferences;

    sget-object p1, Lbb/b;->a:Lbb/b$a;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lbb/b$a;->a(Z)Lbb/b;

    move-result-object p1

    iput-object p1, p0, Lza/b;->b:Lbb/b;

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lza/b;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lza/b;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lza/b;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method public static final synthetic e(Lza/b;)Lbb/b;
    .locals 0

    iget-object p0, p0, Lza/b;->b:Lbb/b;

    return-object p0
.end method

.method public static final synthetic f(Lza/b;Ljava/lang/String;)Lcom/ui/uidb/UiDB$b;
    .locals 0

    invoke-direct {p0, p1}, Lza/b;->h(Ljava/lang/String;)Lcom/ui/uidb/UiDB$b;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/lang/String;)Lcom/ui/uidb/UiDB$b;
    .locals 2

    const-string/jumbo v0, "production"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ui/uidb/UiDB$b;->PRODUCTION:Lcom/ui/uidb/UiDB$b;

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "stage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/ui/uidb/UiDB$b;->STAGE:Lcom/ui/uidb/UiDB$b;

    goto :goto_0

    :cond_1
    new-instance v0, Lza/a;

    invoke-direct {v0, p1}, Lza/a;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x2

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, v1}, LAa/a;->c(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method

.method private static final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Unkown environment \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/ui/uidb/UiDB$c;Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, Lza/b$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lza/b$d;-><init>(Lza/b;Lcom/ui/uidb/UiDB$c;Ldh/e;)V

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

.method public c(Ldh/e;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, Lza/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lza/b$c;-><init>(Lza/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/ui/uidb/UiDB$b;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lza/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string/jumbo p1, "stage"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string/jumbo p1, "production"

    :goto_0
    return-object p1
.end method
