.class final Lx8/j$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$j;

    invoke-direct {v0}, Lx8/j$j;-><init>()V

    sput-object v0, Lx8/j$j;->a:Lx8/j$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;Ljava/util/List;)Ll9/a;
    .locals 7

    const-string/jumbo v0, "placeAddEnabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "places"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll9/a;

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    new-instance v2, LEe/g$a$a;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Ls9/d$b;

    const v5, 0x7f11026f

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v4, Ls9/d$a;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lx8/j$j$a;

    invoke-direct {v6, p2}, Lx8/j$j$a;-><init>(Ljava/util/List;)V

    invoke-direct {v4, v5, v6}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance v3, LEe/g$a$a$a$b;

    new-instance p1, Ls9/d$b;

    const v5, 0x7f11026d

    invoke-direct {p1, v5}, Ls9/d$b;-><init>(I)V

    invoke-direct {v3, p1}, LEe/g$a$a$a$b;-><init>(Ls9/d;)V

    :cond_1
    invoke-direct {v2, v0, v4, v3, p2}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;)V

    move-object v3, v2

    :cond_2
    invoke-direct {v1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lx8/j$j;->a(Ljava/lang/Boolean;Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
