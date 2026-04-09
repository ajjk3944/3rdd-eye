.class final Laj/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final b:Laj/d$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final synthetic a:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laj/d$a;

    invoke-direct {v0}, Laj/d$a;-><init>()V

    sput-object v0, Laj/d$a;->b:Laj/d$a;

    const-string v0, "kotlinx.serialization.json.JsonArray"

    sput-object v0, Laj/d$a;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Laj/r;->a:Laj/r;

    invoke-static {v0}, LWi/a;->h(LVi/b;)LVi/b;

    move-result-object v0

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object v0

    iput-object v0, p0, Laj/d$a;->a:LXi/f;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Laj/d$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0}, LXi/f;->c()Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0, p1}, LXi/f;->d(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0}, LXi/f;->e()I

    move-result v0

    return v0
.end method

.method public f(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0, p1}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public g(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0, p1}, LXi/f;->g(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0}, LXi/f;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h()LXi/m;
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0}, LXi/f;->h()LXi/m;

    move-result-object v0

    return-object v0
.end method

.method public i(I)LXi/f;
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0, p1}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    return-object p1
.end method

.method public isInline()Z
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0}, LXi/f;->isInline()Z

    move-result v0

    return v0
.end method

.method public j(I)Z
    .locals 1

    iget-object v0, p0, Laj/d$a;->a:LXi/f;

    invoke-interface {v0, p1}, LXi/f;->j(I)Z

    move-result p1

    return p1
.end method
