.class final Lx0/c$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/c;->g1(JJLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:J

.field c:J

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:Lx0/c;

.field f:I


# direct methods
.method constructor <init>(Lx0/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx0/c$a;->e:Lx0/c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lx0/c$a;->d:Ljava/lang/Object;

    iget p1, p0, Lx0/c$a;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/c$a;->f:I

    iget-object v0, p0, Lx0/c$a;->e:Lx0/c;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lx0/c;->g1(JJLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
