.class final LId/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LId/d$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic b:LId/d;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;LId/d;)V
    .locals 0

    iput-object p1, p0, LId/d$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p2, p0, LId/d$b$a;->b:LId/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 3

    const-string v0, "errorStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LId/d$b$a$a;

    iget-object v1, p0, LId/d$b$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, LId/d$b$a;->b:LId/d;

    invoke-direct {v0, v1, v2}, LId/d$b$a$a;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;LId/d;)V

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LId/d$b$a;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
