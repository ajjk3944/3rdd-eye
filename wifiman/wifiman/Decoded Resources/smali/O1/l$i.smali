.class final LO1/l$i;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/l;->t(LO1/l$b$b;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:LO1/l;

.field f:I


# direct methods
.method constructor <init>(LO1/l;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LO1/l$i;->e:LO1/l;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LO1/l$i;->d:Ljava/lang/Object;

    iget p1, p0, LO1/l$i;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LO1/l$i;->f:I

    iget-object p1, p0, LO1/l$i;->e:LO1/l;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, LO1/l;->j(LO1/l;LO1/l$b$b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
