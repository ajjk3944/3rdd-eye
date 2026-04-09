.class final LC/C$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/C;->m(IFLr/i;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:I

.field d:F

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:LC/C;

.field g:I


# direct methods
.method constructor <init>(LC/C;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LC/C$a;->f:LC/C;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, LC/C$a;->e:Ljava/lang/Object;

    iget p1, p0, LC/C$a;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LC/C$a;->g:I

    iget-object p1, p0, LC/C$a;->f:LC/C;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0, v1, p0}, LC/C;->m(IFLr/i;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
