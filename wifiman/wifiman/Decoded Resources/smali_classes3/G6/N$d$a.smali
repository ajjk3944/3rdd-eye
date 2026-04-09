.class public LG6/N$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/N$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:I

.field final b:Lcom/polidea/rxandroidble3/exceptions/BleGattException;


# direct methods
.method public constructor <init>(ILcom/polidea/rxandroidble3/exceptions/BleGattException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LG6/N$d$a;->a:I

    iput-object p2, p0, LG6/N$d$a;->b:Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LG6/N$d$a;->a:I

    return v0
.end method

.method public b()Lcom/polidea/rxandroidble3/exceptions/BleGattException;
    .locals 1

    iget-object v0, p0, LG6/N$d$a;->b:Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    return-object v0
.end method
