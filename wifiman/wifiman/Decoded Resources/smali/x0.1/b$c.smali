.class final Lx0/b$c;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/b;->c(JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field final synthetic b:Lx0/b;

.field c:I


# direct methods
.method constructor <init>(Lx0/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lx0/b$c;->b:Lx0/b;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lx0/b$c;->a:Ljava/lang/Object;

    iget p1, p0, Lx0/b$c;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx0/b$c;->c:I

    iget-object p1, p0, Lx0/b$c;->b:Lx0/b;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lx0/b;->c(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
