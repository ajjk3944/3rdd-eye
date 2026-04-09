.class final Lr/c0$k;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0;->Z(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lr/c0;

.field e:I


# direct methods
.method constructor <init>(Lr/c0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$k;->d:Lr/c0;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr/c0$k;->c:Ljava/lang/Object;

    iget p1, p0, Lr/c0$k;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr/c0$k;->e:I

    iget-object p1, p0, Lr/c0$k;->d:Lr/c0;

    invoke-static {p1, p0}, Lr/c0;->z(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
