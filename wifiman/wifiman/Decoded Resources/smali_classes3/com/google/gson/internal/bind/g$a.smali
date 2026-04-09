.class Lcom/google/gson/internal/bind/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/g;->f(Lcom/google/gson/o;)Lcom/google/gson/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/internal/bind/g;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/bind/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/g$a;->a:Lcom/google/gson/internal/bind/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 0

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/google/gson/internal/bind/g$a;->a:Lcom/google/gson/internal/bind/g;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
