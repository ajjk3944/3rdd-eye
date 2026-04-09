.class final LC/C$d;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/C;->X(LC/C;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
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

.field final synthetic e:LC/C;

.field f:I


# direct methods
.method constructor <init>(LC/C;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LC/C$d;->e:LC/C;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LC/C$d;->d:Ljava/lang/Object;

    iget p1, p0, LC/C$d;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LC/C$d;->f:I

    iget-object p1, p0, LC/C$d;->e:LC/C;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, LC/C;->X(LC/C;Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
