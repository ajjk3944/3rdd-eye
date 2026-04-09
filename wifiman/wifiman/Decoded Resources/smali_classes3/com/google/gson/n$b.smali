.class final enum Lcom/google/gson/n$b;
.super Lcom/google/gson/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/gson/n;-><init>(Ljava/lang/String;ILcom/google/gson/n$a;)V

    return-void
.end method


# virtual methods
.method public readNumber(Lw5/a;)Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lt5/g;

    invoke-virtual {p1}, Lw5/a;->t0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt5/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
