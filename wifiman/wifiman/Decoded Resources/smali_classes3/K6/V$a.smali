.class LK6/V$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/V;->a(Lgg/s;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LK6/V;


# direct methods
.method constructor <init>(LK6/V;)V
    .locals 0

    iput-object p1, p0, LK6/V$a;->a:LK6/V;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/N$d$a;)Lgg/s;
    .locals 0

    invoke-virtual {p1}, LG6/N$d$a;->b()Lcom/polidea/rxandroidble3/exceptions/BleGattException;

    move-result-object p1

    invoke-static {p1}, Lgg/s;->L(Ljava/lang/Throwable;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG6/N$d$a;

    invoke-virtual {p0, p1}, LK6/V$a;->a(LG6/N$d$a;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
