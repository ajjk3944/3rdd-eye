.class public final Lc0/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/i;->e(Ljava/lang/String;Lmh/a;)Lc0/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/i;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lmh/a;


# direct methods
.method constructor <init>(Lc0/i;Ljava/lang/String;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lc0/i$a;->a:Lc0/i;

    iput-object p2, p0, Lc0/i$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lc0/i$a;->c:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lc0/i$a;->a:Lc0/i;

    invoke-static {v0}, Lc0/i;->d(Lc0/i;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lc0/i$a;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc0/i$a;->c:Lmh/a;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lc0/i$a;->a:Lc0/i;

    invoke-static {v1}, Lc0/i;->d(Lc0/i;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lc0/i$a;->b:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
