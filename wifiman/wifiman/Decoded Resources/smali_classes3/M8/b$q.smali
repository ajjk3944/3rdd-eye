.class final LM8/b$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$q;

    invoke-direct {v0}, LM8/b$q;-><init>()V

    sput-object v0, LM8/b$q;->a:LM8/b$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LEe/g;
    .locals 9

    const-string/jumbo v0, "general"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, LEe/g$a$a;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string/jumbo v3, "general"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance p1, LEe/g;

    invoke-direct {p1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LM8/b$q;->a(Ljava/util/List;)LEe/g;

    move-result-object p1

    return-object p1
.end method
