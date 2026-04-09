.class public final Lye/b$c$a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/b$c$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field synthetic a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lye/b$c$a;


# direct methods
.method public constructor <init>(Lye/b$c$a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lye/b$c$a$a;->c:Lye/b$c$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ldh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lye/b$c$a$a;->a:Ljava/lang/Object;

    iget p1, p0, Lye/b$c$a$a;->b:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lye/b$c$a$a;->b:I

    iget-object p1, p0, Lye/b$c$a$a;->c:Lye/b$c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lye/b$c$a;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
