.class public final Lcom/ui/wifiman/model/signalmapper/floorplan/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;,
        Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;
    }
.end annotation


# instance fields
.field private final a:F

.field private final b:Ljava/util/LinkedList;

.field private final c:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->a:F

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c:Ljava/util/LinkedList;

    return-void
.end method

.method private final f(FF)LW7/d;
    .locals 2

    new-instance v0, LW7/d;

    iget v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->a:F

    div-float/2addr p1, v1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    iget v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->a:F

    div-float/2addr p2, v1

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-direct {v0, p1, p2}, LW7/d;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public a(FFJLjava/lang/String;)V
    .locals 2

    const-string v0, "model"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->f(FF)LW7/d;

    move-result-object p1

    iget-object p2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c:Ljava/util/LinkedList;

    new-instance v1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;

    invoke-direct {v1, p1, p3, p4, p5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$a;-><init>(LW7/d;JLjava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public b(FFJLS8/l;)V
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    invoke-static {v1}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;->a()LW7/d;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->f(FF)LW7/d;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    invoke-static {p2}, LZg/v;->n(Ljava/util/List;)I

    move-result v1

    new-instance v2, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    invoke-direct {v2, p1, p3, p4, p5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;-><init>(LW7/d;JLS8/l;)V

    invoke-virtual {p2, v1, v2}, Ljava/util/LinkedList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;

    invoke-direct {v1, p1, p3, p4, p5}, Lcom/ui/wifiman/model/signalmapper/floorplan/b$b;-><init>(LW7/d;JLS8/l;)V

    invoke-virtual {p2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final c()Ljava/util/LinkedList;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->c:Ljava/util/LinkedList;

    return-object v0
.end method

.method public final d()Ljava/util/LinkedList;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->b:Ljava/util/LinkedList;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lcom/ui/wifiman/model/signalmapper/floorplan/b;->a:F

    return v0
.end method
