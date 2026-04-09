.class final Lx/g$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/g;->c(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:Lx/g;

.field c:I


# direct methods
.method constructor <init>(Lx/g;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx/g$c;->b:Lx/g;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lx/g$c;->a:Ljava/lang/Object;

    iget p1, p0, Lx/g$c;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx/g$c;->c:I

    iget-object p1, p0, Lx/g$c;->b:Lx/g;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v0, p0}, Lx/g;->c(Lw/v;FLmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
