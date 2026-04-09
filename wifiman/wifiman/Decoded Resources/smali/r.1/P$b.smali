.class final Lr/P$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/P;->b(Lr/O;Ljava/lang/Object;Ljava/lang/Object;Lr/s0;Lr/N;Ljava/lang/String;LT/l;II)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/O;

.field final synthetic b:Lr/O$a;


# direct methods
.method constructor <init>(Lr/O;Lr/O$a;)V
    .locals 0

    iput-object p1, p0, Lr/P$b;->a:Lr/O;

    iput-object p2, p0, Lr/P$b;->b:Lr/O$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, Lr/P$b;->a:Lr/O;

    iget-object v0, p0, Lr/P$b;->b:Lr/O$a;

    invoke-virtual {p1, v0}, Lr/O;->f(Lr/O$a;)V

    iget-object p1, p0, Lr/P$b;->a:Lr/O;

    iget-object v0, p0, Lr/P$b;->b:Lr/O$a;

    new-instance v1, Lr/P$b$a;

    invoke-direct {v1, p1, v0}, Lr/P$b$a;-><init>(Lr/O;Lr/O$a;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Lr/P$b;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
