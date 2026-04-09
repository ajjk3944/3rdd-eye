.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LF4/d;)LV4/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(LF4/d;)LV4/a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LF4/d;)LV4/a;
    .locals 3

    new-instance v0, LW4/g;

    const-class v1, Lcom/google/firebase/f;

    invoke-interface {p0, v1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/f;

    const-class v2, LD4/a;

    invoke-interface {p0, v2}, LF4/d;->e(Ljava/lang/Class;)Lf5/b;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LW4/g;-><init>(Lcom/google/firebase/f;Lf5/b;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LF4/c;",
            ">;"
        }
    .end annotation

    const-class v0, LV4/a;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v1, "fire-dl"

    invoke-virtual {v0, v1}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    const-class v2, Lcom/google/firebase/f;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v2, LD4/a;

    invoke-static {v2}, LF4/q;->h(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v0, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v2, LW4/f;

    invoke-direct {v2}, LW4/f;-><init>()V

    invoke-virtual {v0, v2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    const-string v2, "22.1.0"

    invoke-static {v1, v2}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
