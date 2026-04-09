.class LK6/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/l0;


# direct methods
.method constructor <init>(LK6/l0;)V
    .locals 0

    iput-object p1, p0, LK6/l0$a;->a:LK6/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Lgg/s;
    .locals 0

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    invoke-virtual {p0, p1}, LK6/l0$a;->a(Lcom/polidea/rxandroidble3/exceptions/BleGattException;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
