.class public final Lcom/marsounjan/icmp4a/a$c$a$b;
.super Lcom/marsounjan/icmp4a/a$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/marsounjan/icmp4a/a$c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lkotlinx/coroutines/TimeoutCancellationException;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/TimeoutCancellationException;)V
    .locals 1

    const-string/jumbo v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/marsounjan/icmp4a/a$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/marsounjan/icmp4a/a$c$a$b;->a:Lkotlinx/coroutines/TimeoutCancellationException;

    return-void
.end method
