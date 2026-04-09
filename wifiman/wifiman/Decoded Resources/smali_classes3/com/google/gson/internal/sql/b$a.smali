.class Lcom/google/gson/internal/sql/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/sql/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
    .locals 1

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/sql/Time;

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    new-instance p1, Lcom/google/gson/internal/sql/b;

    invoke-direct {p1, v0}, Lcom/google/gson/internal/sql/b;-><init>(Lcom/google/gson/internal/sql/b$a;)V

    move-object v0, p1

    :cond_0
    return-object v0
.end method
