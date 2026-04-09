.class final Lr/P$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/P;->b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lr/O$a;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lr/N;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lr/O$a;Ljava/lang/Object;Lr/N;)V
    .locals 0

    iput-object p1, p0, Lr/P$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lr/P$a;->b:Lr/O$a;

    iput-object p3, p0, Lr/P$a;->c:Ljava/lang/Object;

    iput-object p4, p0, Lr/P$a;->d:Lr/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lr/P$a;->a:Ljava/lang/Object;

    iget-object v1, p0, Lr/P$a;->b:Lr/O$a;

    invoke-virtual {v1}, Lr/O$a;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr/P$a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lr/P$a;->b:Lr/O$a;

    invoke-virtual {v1}, Lr/O$a;->i()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr/P$a;->b:Lr/O$a;

    iget-object v1, p0, Lr/P$a;->a:Ljava/lang/Object;

    iget-object v2, p0, Lr/P$a;->c:Ljava/lang/Object;

    iget-object v3, p0, Lr/P$a;->d:Lr/N;

    invoke-virtual {v0, v1, v2, v3}, Lr/O$a;->t(Ljava/lang/Object;Ljava/lang/Object;Lr/i;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/P$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
