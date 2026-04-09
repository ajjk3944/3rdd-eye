.class Lcom/google/gson/internal/bind/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/h;->f(Lcom/google/gson/o;)Lcom/google/gson/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/o;


# direct methods
.method constructor <init>(Lcom/google/gson/o;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/h$a;->a:Lcom/google/gson/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 2

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Lcom/google/gson/internal/bind/h;

    iget-object v0, p0, Lcom/google/gson/internal/bind/h$a;->a:Lcom/google/gson/o;

    invoke-direct {p2, p1, v0, v1}, Lcom/google/gson/internal/bind/h;-><init>(Lcom/google/gson/e;Lcom/google/gson/o;Lcom/google/gson/internal/bind/h$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
