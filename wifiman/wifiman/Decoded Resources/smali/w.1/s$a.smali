.class final Lw/s$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/s;->F1(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:Lw/s;

.field c:I


# direct methods
.method constructor <init>(Lw/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/s$a;->b:Lw/s;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw/s$a;->a:Ljava/lang/Object;

    iget p1, p0, Lw/s$a;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/s$a;->c:I

    iget-object p1, p0, Lw/s$a;->b:Lw/s;

    invoke-virtual {p1, p0}, Lw/s;->F1(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
