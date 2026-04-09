.class public final Lvj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/kodein/di/DI$b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field private final a:Lorg/kodein/type/q;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Boolean;

.field final synthetic d:Lvj/b;


# direct methods
.method public constructor <init>(Lvj/b;Lorg/kodein/type/q;Ljava/lang/Object;Ljava/lang/Boolean;)V
    .locals 1

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lvj/b$a;->d:Lvj/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lvj/b$a;->a:Lorg/kodein/type/q;

    iput-object p3, p0, Lvj/b$a;->b:Ljava/lang/Object;

    iput-object p4, p0, Lvj/b$a;->c:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public a(Luj/e;)V
    .locals 6

    const-string/jumbo v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvj/b$a;->b()Lvj/c;

    move-result-object v0

    new-instance v1, Lorg/kodein/di/DI$e;

    invoke-interface {p1}, Luj/e;->b()Lorg/kodein/type/q;

    move-result-object v2

    invoke-interface {p1}, Luj/e;->d()Lorg/kodein/type/q;

    move-result-object v3

    iget-object v4, p0, Lvj/b$a;->a:Lorg/kodein/type/q;

    iget-object v5, p0, Lvj/b$a;->b:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/kodein/di/DI$e;-><init>(Lorg/kodein/type/q;Lorg/kodein/type/q;Lorg/kodein/type/q;Ljava/lang/Object;)V

    iget-object v2, p0, Lvj/b$a;->d:Lvj/b;

    invoke-static {v2}, Lvj/b;->g(Lvj/b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lvj/b$a;->c:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, p1, v2, v3}, Lvj/c;->a(Lorg/kodein/di/DI$e;Luj/e;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public final b()Lvj/c;
    .locals 1

    iget-object v0, p0, Lvj/b$a;->d:Lvj/b;

    invoke-virtual {v0}, Lvj/b;->h()Lvj/c;

    move-result-object v0

    return-object v0
.end method
