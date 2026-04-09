.class public Lvj/f;
.super Lvj/b;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI$f;


# instance fields
.field private final f:Ljava/util/List;

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 8

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Lvj/c;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x1

    move-object v1, v7

    move v3, p1

    invoke-direct/range {v1 .. v6}, Lvj/c;-><init>(ZZLjava/util/Map;Ljava/util/List;Ljava/util/List;)V

    const/4 p1, 0x0

    const-string v1, ""

    invoke-direct {p0, p1, v1, v0, v7}, Lvj/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lvj/c;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvj/f;->f:Ljava/util/List;

    sget-object p1, Lorg/kodein/di/DI;->e1:Lorg/kodein/di/DI$c;

    invoke-virtual {p1}, Lorg/kodein/di/DI$c;->b()Z

    move-result v0

    iput-boolean v0, p0, Lvj/f;->g:Z

    invoke-virtual {p1}, Lorg/kodein/di/DI$c;->a()Z

    move-result p1

    iput-boolean p1, p0, Lvj/f;->h:Z

    return-void
.end method


# virtual methods
.method public i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lvj/f;->f:Ljava/util/List;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lvj/f;->h:Z

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lvj/f;->g:Z

    return v0
.end method
