.class public Lcom/polidea/rxandroidble3/exceptions/BleConflictingNotificationAlreadySetException;
.super Lcom/polidea/rxandroidble3/exceptions/BleException;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Z


# direct methods
.method public constructor <init>(Ljava/util/UUID;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Characteristic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " notification already set to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    const-string/jumbo v1, "indication"

    goto :goto_0

    :cond_0
    const-string/jumbo v1, "notification"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/polidea/rxandroidble3/exceptions/BleException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/polidea/rxandroidble3/exceptions/BleConflictingNotificationAlreadySetException;->a:Ljava/util/UUID;

    iput-boolean p2, p0, Lcom/polidea/rxandroidble3/exceptions/BleConflictingNotificationAlreadySetException;->b:Z

    return-void
.end method
