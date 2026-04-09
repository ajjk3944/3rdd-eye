.class LK6/Q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/Q;-><init>(LK6/l0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/Q;


# direct methods
.method constructor <init>(LK6/Q;)V
    .locals 0

    iput-object p1, p0, LK6/Q$a;->a:LK6/Q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 1

    instance-of v0, p1, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    invoke-virtual {p1}, Lcom/polidea/rxandroidble3/exceptions/BleGattException;->c()LH6/a;

    move-result-object p1

    sget-object v0, LH6/a;->l:LH6/a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LK6/Q$a;->a(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
