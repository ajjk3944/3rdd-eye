.class final LJ/j$k;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->L(Ly0/G;ZLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field synthetic e:Ljava/lang/Object;

.field final synthetic f:LJ/j;

.field g:I


# direct methods
.method constructor <init>(LJ/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$k;->f:LJ/j;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, LJ/j$k;->e:Ljava/lang/Object;

    iget p1, p0, LJ/j$k;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LJ/j$k;->g:I

    iget-object p1, p0, LJ/j$k;->f:LJ/j;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, LJ/j;->c(LJ/j;Ly0/G;ZLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
