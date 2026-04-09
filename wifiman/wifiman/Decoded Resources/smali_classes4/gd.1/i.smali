.class public final synthetic Lgd/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgd/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p2, p0, Lgd/i;->b:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lgd/i;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v1, p0, Lgd/i;->b:I

    check-cast p1, Lgg/h;

    invoke-static {v0, v1, p1}, Lgd/h$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;ILgg/h;)V

    return-void
.end method
