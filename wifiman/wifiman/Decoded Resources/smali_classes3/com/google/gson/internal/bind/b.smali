.class public final Lcom/google/gson/internal/bind/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/gson/internal/bind/b$a;
    }
.end annotation


# instance fields
.field private final a:Lt5/c;


# direct methods
.method public constructor <init>(Lt5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/b;->a:Lt5/c;

    return-void
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 3

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lt5/b;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lcom/google/gson/reflect/a;->b(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/gson/e;->l(Lcom/google/gson/reflect/a;)Lcom/google/gson/p;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/b;->a:Lt5/c;

    invoke-virtual {v2, p2}, Lt5/c;->b(Lcom/google/gson/reflect/a;)Lt5/j;

    move-result-object p2

    new-instance v2, Lcom/google/gson/internal/bind/b$a;

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/google/gson/internal/bind/b$a;-><init>(Lcom/google/gson/e;Ljava/lang/reflect/Type;Lcom/google/gson/p;Lt5/j;)V

    return-object v2
.end method
