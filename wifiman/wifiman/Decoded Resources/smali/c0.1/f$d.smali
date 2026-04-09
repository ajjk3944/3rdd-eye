.class public final Lc0/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private final c:Lc0/h;

.field final synthetic d:Lc0/f;


# direct methods
.method public constructor <init>(Lc0/f;Ljava/lang/Object;)V
    .locals 1

    iput-object p1, p0, Lc0/f$d;->d:Lc0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc0/f$d;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc0/f$d;->b:Z

    invoke-static {p1}, Lc0/f;->b(Lc0/f;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    new-instance v0, Lc0/f$d$a;

    invoke-direct {v0, p1}, Lc0/f$d$a;-><init>(Lc0/f;)V

    invoke-static {p2, v0}, Lc0/j;->a(Ljava/util/Map;Lmh/l;)Lc0/h;

    move-result-object p1

    iput-object p1, p0, Lc0/f$d;->c:Lc0/h;

    return-void
.end method


# virtual methods
.method public final a()Lc0/h;
    .locals 1

    iget-object v0, p0, Lc0/f$d;->c:Lc0/h;

    return-object v0
.end method

.method public final b(Ljava/util/Map;)V
    .locals 2

    iget-boolean v0, p0, Lc0/f$d;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc0/f$d;->c:Lc0/h;

    invoke-interface {v0}, Lc0/h;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lc0/f$d;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc0/f$d;->a:Ljava/lang/Object;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Lc0/f$d;->b:Z

    return-void
.end method
