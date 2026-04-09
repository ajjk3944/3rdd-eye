.class final LQ/h$a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/h$a;->g1(JJLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:J

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:LQ/h$a;

.field e:I


# direct methods
.method constructor <init>(LQ/h$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LQ/h$a$a;->d:LQ/h$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, LQ/h$a$a;->c:Ljava/lang/Object;

    iget p1, p0, LQ/h$a$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LQ/h$a$a;->e:I

    iget-object v0, p0, LQ/h$a$a;->d:LQ/h$a;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, LQ/h$a;->g1(JJLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
