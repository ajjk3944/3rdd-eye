.class final Lx0/c$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/c;->R(JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:J

.field synthetic c:Ljava/lang/Object;

.field final synthetic d:Lx0/c;

.field e:I


# direct methods
.method constructor <init>(Lx0/c;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx0/c$b;->d:Lx0/c;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lx0/c$b;->c:Ljava/lang/Object;

    iget p1, p0, Lx0/c$b;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/c$b;->e:I

    iget-object p1, p0, Lx0/c$b;->d:Lx0/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lx0/c;->R(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
