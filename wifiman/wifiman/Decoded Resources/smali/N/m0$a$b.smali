.class final LN/m0$a$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0$a;->R(JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LN/m0$a;

.field d:I


# direct methods
.method constructor <init>(LN/m0$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/m0$a$b;->c:LN/m0$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, LN/m0$a$b;->b:Ljava/lang/Object;

    iget p1, p0, LN/m0$a$b;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LN/m0$a$b;->d:I

    iget-object p1, p0, LN/m0$a$b;->c:LN/m0$a;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, LN/m0$a;->R(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
