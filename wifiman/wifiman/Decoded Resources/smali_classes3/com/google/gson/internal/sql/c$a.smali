.class Lcom/google/gson/internal/sql/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/sql/c;
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
    .locals 2

    invoke-virtual {p2}, Lcom/google/gson/reflect/a;->c()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/sql/Timestamp;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    const-class p2, Ljava/util/Date;

    invoke-virtual {p1, p2}, Lcom/google/gson/e;->m(Ljava/lang/Class;)Lcom/google/gson/p;

    move-result-object p1

    new-instance p2, Lcom/google/gson/internal/sql/c;

    invoke-direct {p2, p1, v1}, Lcom/google/gson/internal/sql/c;-><init>(Lcom/google/gson/p;Lcom/google/gson/internal/sql/c$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
