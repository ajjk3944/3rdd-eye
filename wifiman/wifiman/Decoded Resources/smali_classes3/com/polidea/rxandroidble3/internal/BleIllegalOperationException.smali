.class public Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/UUID;II)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;->a:Ljava/util/UUID;

    iput p3, p0, Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;->b:I

    iput p4, p0, Lcom/polidea/rxandroidble3/internal/BleIllegalOperationException;->c:I

    return-void
.end method
