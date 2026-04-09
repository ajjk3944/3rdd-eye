.class final LM/a$f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a$f;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lmh/a;

.field final synthetic c:Z


# direct methods
.method constructor <init>(JLmh/a;Z)V
    .locals 0

    iput-wide p1, p0, LM/a$f$a;->a:J

    iput-object p3, p0, LM/a$f$a;->b:Lmh/a;

    iput-boolean p4, p0, LM/a$f$a;->c:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj0/d;)Lj0/h;
    .locals 7

    invoke-virtual {p1}, Lj0/d;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, LM/a;->d(Lj0/d;F)Lm0/J0;

    move-result-object v0

    sget-object v1, Lm0/w0;->b:Lm0/w0$a;

    iget-wide v2, p0, LM/a$f$a;->a:J

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v1

    new-instance v2, LM/a$f$a$a;

    iget-object v3, p0, LM/a$f$a;->b:Lmh/a;

    iget-boolean v4, p0, LM/a$f$a;->c:Z

    invoke-direct {v2, v3, v4, v0, v1}, LM/a$f$a$a;-><init>(Lmh/a;ZLm0/J0;Lm0/w0;)V

    invoke-virtual {p1, v2}, Lj0/d;->p(Lmh/l;)Lj0/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj0/d;

    invoke-virtual {p0, p1}, LM/a$f$a;->a(Lj0/d;)Lj0/h;

    move-result-object p1

    return-object p1
.end method
