.class final enum Lcom/google/gson/k$a;
.super Lcom/google/gson/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/gson/k;-><init>(Ljava/lang/String;ILcom/google/gson/k$a;)V

    return-void
.end method


# virtual methods
.method public serialize(Ljava/lang/Long;)Lcom/google/gson/g;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/gson/h;->a:Lcom/google/gson/h;

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/gson/j;

    invoke-direct {v0, p1}, Lcom/google/gson/j;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method
