.class Lcom/google/gson/internal/bind/i$a;
.super Lcom/google/gson/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/gson/internal/bind/i;->b(Lcom/google/gson/e;Lcom/google/gson/reflect/a;)Lcom/google/gson/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/internal/bind/i;


# direct methods
.method constructor <init>(Lcom/google/gson/internal/bind/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$a;->a:Lcom/google/gson/internal/bind/i;

    invoke-direct {p0}, Lcom/google/gson/p;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lw5/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1}, Lw5/a;->F0()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Lw5/c;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p1}, Lw5/c;->b0()Lw5/c;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AnonymousOrNonStaticLocalClassAdapter"

    return-object v0
.end method
