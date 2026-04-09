.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LF4/d;)La3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$2(LF4/d;)La3/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LF4/d;)La3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$1(LF4/d;)La3/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LF4/d;)La3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(LF4/d;)La3/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LF4/d;)La3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lc3/u;->g(Lc3/f;)La3/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$1(LF4/d;)La3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->h:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lc3/u;->g(Lc3/f;)La3/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$2(LF4/d;)La3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lc3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lc3/u;->c()Lc3/u;

    move-result-object p0

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p0, v0}, Lc3/u;->g(Lc3/f;)La3/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LF4/c;",
            ">;"
        }
    .end annotation

    const-class v0, La3/i;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v1

    const-string/jumbo v2, "fire-transport"

    invoke-virtual {v1, v2}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v4

    invoke-virtual {v1, v4}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    new-instance v4, LU4/c;

    invoke-direct {v4}, LU4/c;-><init>()V

    invoke-virtual {v1, v4}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v1

    invoke-virtual {v1}, LF4/c$b;->c()LF4/c;

    move-result-object v1

    const-class v4, LU4/a;

    invoke-static {v4, v0}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v4

    invoke-static {v4}, LF4/c;->c(LF4/A;)LF4/c$b;

    move-result-object v4

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v5

    invoke-virtual {v4, v5}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v4

    new-instance v5, LU4/d;

    invoke-direct {v5}, LU4/d;-><init>()V

    invoke-virtual {v4, v5}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v4

    invoke-virtual {v4}, LF4/c$b;->c()LF4/c;

    move-result-object v4

    const-class v5, LU4/b;

    invoke-static {v5, v0}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    invoke-static {v0}, LF4/c;->c(LF4/A;)LF4/c$b;

    move-result-object v0

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v3, LU4/e;

    invoke-direct {v3}, LU4/e;-><init>()V

    invoke-virtual {v0, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    const-string v3, "19.0.0"

    invoke-static {v2, v3}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v2

    filled-new-array {v1, v4, v0, v2}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
