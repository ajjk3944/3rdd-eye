.class LK6/A$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/A;-><init>(Ljava/lang/String;LP6/G;Lgg/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:LK6/A;


# direct methods
.method constructor <init>(LK6/A;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LK6/A$c;->b:LK6/A;

    iput-object p2, p0, LK6/A$c;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)Lcom/polidea/rxandroidble3/exceptions/BleException;
    .locals 0

    iget-object p1, p0, LK6/A$c;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;->a(Ljava/lang/String;)Lcom/polidea/rxandroidble3/exceptions/BleDisconnectedException;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LK6/A$c;->a(Ljava/lang/Boolean;)Lcom/polidea/rxandroidble3/exceptions/BleException;

    move-result-object p1

    return-object p1
.end method
