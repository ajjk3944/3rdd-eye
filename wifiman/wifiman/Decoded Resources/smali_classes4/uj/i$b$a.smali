.class final Luj/i$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj/i$b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Luj/i;

.field final synthetic b:Luj/b;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Luj/i;Luj/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Luj/i$b$a;->a:Luj/i;

    iput-object p2, p0, Luj/i$b$a;->b:Luj/b;

    iput-object p3, p0, Luj/i$b$a;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Luj/p;
    .locals 5

    iget-object v0, p0, Luj/i$b$a;->a:Luj/i;

    invoke-static {v0}, Luj/i;->m(Luj/i;)Luj/o;

    move-result-object v0

    new-instance v1, Luj/i$b$a$a;

    iget-object v2, p0, Luj/i$b$a;->a:Luj/i;

    iget-object v3, p0, Luj/i$b$a;->b:Luj/b;

    iget-object v4, p0, Luj/i$b$a;->c:Ljava/lang/Object;

    invoke-direct {v1, v2, v3, v4}, Luj/i$b$a$a;-><init>(Luj/i;Luj/b;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Luj/o;->a(Lmh/a;)Luj/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Luj/i$b$a;->a()Luj/p;

    move-result-object v0

    return-object v0
.end method
