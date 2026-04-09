.class final Lr/o0$e$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/o0$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/o0;

.field final synthetic b:F


# direct methods
.method constructor <init>(Lr/o0;F)V
    .locals 0

    iput-object p1, p0, Lr/o0$e$a$a;->a:Lr/o0;

    iput p2, p0, Lr/o0$e$a$a;->b:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lr/o0$e$a$a;->a:Lr/o0;

    invoke-virtual {v0}, Lr/o0;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lr/o0$e$a$a;->a:Lr/o0;

    iget v1, p0, Lr/o0$e$a$a;->b:F

    invoke-virtual {v0, p1, p2, v1}, Lr/o0;->x(JF)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lr/o0$e$a$a;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
