.class final LFc/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFc/d;-><init>(LFc/a$a;Lle/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LFc/d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFc/d$c;

    invoke-direct {v0}, LFc/d$c;-><init>()V

    sput-object v0, LFc/d$c;->a:LFc/d$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, LFc/d$c;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LFc/d$c;->b(Ljava/util/List;)La8/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)La8/a;
    .locals 4

    const-string v0, "signals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La8/a;

    invoke-direct {v0}, La8/a;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lle/i;

    invoke-virtual {v1}, Lle/i;->i()La8/b;

    move-result-object v2

    new-instance v3, LFc/e;

    invoke-direct {v3}, LFc/e;-><init>()V

    invoke-virtual {v0, v2, v3}, La8/a;->b(La8/b;Lmh/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
