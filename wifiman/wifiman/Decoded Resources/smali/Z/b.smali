.class public final LZ/b;
.super LZg/k;
.source "SourceFile"

# interfaces
.implements LW/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/b$a;
    }
.end annotation


# static fields
.field public static final e:LZ/b$a;

.field public static final f:I

.field private static final g:LZ/b;


# instance fields
.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private final d:LY/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZ/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZ/b;->e:LZ/b$a;

    const/16 v0, 0x8

    sput v0, LZ/b;->f:I

    new-instance v0, LZ/b;

    sget-object v1, La0/c;->a:La0/c;

    sget-object v2, LY/d;->d:LY/d$a;

    invoke-virtual {v2}, LY/d$a;->a()LY/d;

    move-result-object v2

    invoke-direct {v0, v1, v1, v2}, LZ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LY/d;)V

    sput-object v0, LZ/b;->g:LZ/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;LY/d;)V
    .locals 0

    invoke-direct {p0}, LZg/k;-><init>()V

    iput-object p1, p0, LZ/b;->b:Ljava/lang/Object;

    iput-object p2, p0, LZ/b;->c:Ljava/lang/Object;

    iput-object p3, p0, LZ/b;->d:LY/d;

    return-void
.end method

.method public static final synthetic v()LZ/b;
    .locals 1

    sget-object v0, LZ/b;->g:LZ/b;

    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)LW/f;
    .locals 3

    iget-object v0, p0, LZ/b;->d:LY/d;

    invoke-virtual {v0, p1}, LY/d;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LZg/b;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LZ/b;->d:LY/d;

    new-instance v1, LZ/a;

    invoke-direct {v1}, LZ/a;-><init>()V

    invoke-virtual {v0, p1, v1}, LY/d;->u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;

    move-result-object v0

    new-instance v1, LZ/b;

    invoke-direct {v1, p1, p1, v0}, LZ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LY/d;)V

    return-object v1

    :cond_1
    iget-object v0, p0, LZ/b;->c:Ljava/lang/Object;

    iget-object v1, p0, LZ/b;->d:LY/d;

    invoke-virtual {v1, v0}, LY/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, LZ/a;

    iget-object v2, p0, LZ/b;->d:LY/d;

    invoke-virtual {v1, p1}, LZ/a;->e(Ljava/lang/Object;)LZ/a;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, LY/d;->u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;

    move-result-object v1

    new-instance v2, LZ/a;

    invoke-direct {v2, v0}, LZ/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, LY/d;->u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;

    move-result-object v0

    new-instance v1, LZ/b;

    iget-object v2, p0, LZ/b;->b:Ljava/lang/Object;

    invoke-direct {v1, v2, p1, v0}, LZ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LY/d;)V

    return-object v1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LZ/b;->d:LY/d;

    invoke-virtual {v0, p1}, LY/d;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, LZ/c;

    iget-object v1, p0, LZ/b;->b:Ljava/lang/Object;

    iget-object v2, p0, LZ/b;->d:LY/d;

    invoke-direct {v0, v1, v2}, LZ/c;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    return-object v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, LZ/b;->d:LY/d;

    invoke-virtual {v0}, LZg/f;->size()I

    move-result v0

    return v0
.end method

.method public remove(Ljava/lang/Object;)LW/f;
    .locals 4

    iget-object v0, p0, LZ/b;->d:LY/d;

    invoke-virtual {v0, p1}, LY/d;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ/a;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p0, LZ/b;->d:LY/d;

    invoke-virtual {v1, p1}, LY/d;->v(Ljava/lang/Object;)LY/d;

    move-result-object p1

    invoke-virtual {v0}, LZ/a;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LZ/a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, LZ/a;

    invoke-virtual {v0}, LZ/a;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LZ/a;->c()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, LZ/a;->e(Ljava/lang/Object;)LZ/a;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, LY/d;->u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;

    move-result-object p1

    :cond_1
    invoke-virtual {v0}, LZ/a;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LZ/a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, LZ/a;

    invoke-virtual {v0}, LZ/a;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LZ/a;->d()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, LZ/a;->f(Ljava/lang/Object;)LZ/a;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, LY/d;->u(Ljava/lang/Object;Ljava/lang/Object;)LY/d;

    move-result-object p1

    :cond_2
    invoke-virtual {v0}, LZ/a;->b()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, LZ/a;->c()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_3
    iget-object v1, p0, LZ/b;->b:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v0}, LZ/a;->a()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, LZ/a;->d()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, LZ/b;->c:Ljava/lang/Object;

    :goto_1
    new-instance v2, LZ/b;

    invoke-direct {v2, v1, v0, p1}, LZ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LY/d;)V

    return-object v2
.end method
