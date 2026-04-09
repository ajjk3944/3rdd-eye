.class final Lw/f$c$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/f;

.field final synthetic b:Lw/G;

.field final synthetic c:LIi/y0;

.field final synthetic d:Lw/p;


# direct methods
.method constructor <init>(Lw/f;Lw/G;LIi/y0;Lw/p;)V
    .locals 0

    iput-object p1, p0, Lw/f$c$a$a;->a:Lw/f;

    iput-object p2, p0, Lw/f$c$a$a;->b:Lw/G;

    iput-object p3, p0, Lw/f$c$a$a;->c:LIi/y0;

    iput-object p4, p0, Lw/f$c$a$a;->d:Lw/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    iget-object v0, p0, Lw/f$c$a$a;->a:Lw/f;

    invoke-static {v0}, Lw/f;->G2(Lw/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    mul-float v1, v0, p1

    iget-object v2, p0, Lw/f$c$a$a;->a:Lw/f;

    invoke-static {v2}, Lw/f;->H2(Lw/f;)Lw/A;

    move-result-object v2

    iget-object v3, p0, Lw/f$c$a$a;->d:Lw/p;

    invoke-virtual {v2, v1}, Lw/A;->B(F)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lw/A;->u(J)J

    move-result-wide v4

    sget-object v1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {v1}, Lx0/e$a;->b()I

    move-result v1

    invoke-interface {v3, v4, v5, v1}, Lw/p;->b(JI)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lw/A;->u(J)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lw/A;->A(J)F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    iget-object v1, p0, Lw/f$c$a$a;->c:LIi/y0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scroll animation cancelled because scroll was not consumed ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " < "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v1, p1, v2, v0, v2}, LIi/A0;->e(LIi/y0;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lw/f$c$a$a;->a(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
