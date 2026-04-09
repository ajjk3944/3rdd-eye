.class final LO/h$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/h;->a(ZLmh/a;FFLT/l;II)LO/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO/g;

.field final synthetic b:Z

.field final synthetic c:Lkotlin/jvm/internal/K;

.field final synthetic d:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(LO/g;ZLkotlin/jvm/internal/K;Lkotlin/jvm/internal/K;)V
    .locals 0

    iput-object p1, p0, LO/h$a;->a:LO/g;

    iput-boolean p2, p0, LO/h$a;->b:Z

    iput-object p3, p0, LO/h$a;->c:Lkotlin/jvm/internal/K;

    iput-object p4, p0, LO/h$a;->d:Lkotlin/jvm/internal/K;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LO/h$a;->a:LO/g;

    iget-boolean v1, p0, LO/h$a;->b:Z

    invoke-virtual {v0, v1}, LO/g;->t(Z)V

    iget-object v0, p0, LO/h$a;->a:LO/g;

    iget-object v1, p0, LO/h$a;->c:Lkotlin/jvm/internal/K;

    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    invoke-virtual {v0, v1}, LO/g;->v(F)V

    iget-object v0, p0, LO/h$a;->a:LO/g;

    iget-object v1, p0, LO/h$a;->d:Lkotlin/jvm/internal/K;

    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    invoke-virtual {v0, v1}, LO/g;->u(F)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO/h$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
