.class final LO9/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO9/d$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls9/a$b;

.field final synthetic b:Lm0/w0;

.field final synthetic c:Lf0/c;

.field final synthetic d:LC0/h;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:F


# direct methods
.method constructor <init>(Ls9/a$b;Lm0/w0;Lf0/c;LC0/h;Ljava/lang/String;F)V
    .locals 0

    iput-object p1, p0, LO9/d$a$a;->a:Ls9/a$b;

    iput-object p2, p0, LO9/d$a$a;->b:Lm0/w0;

    iput-object p3, p0, LO9/d$a$a;->c:Lf0/c;

    iput-object p4, p0, LO9/d$a$a;->d:LC0/h;

    iput-object p5, p0, LO9/d$a$a;->e:Ljava/lang/String;

    iput p6, p0, LO9/d$a$a;->f:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/d;LV6/f$b;LT/l;I)V
    .locals 10

    const-string v0, "$this$let"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$unused$var$"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x6

    if-nez p2, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p4, p2

    :cond_1
    and-int/lit16 p2, p4, 0x83

    const/16 v0, 0x82

    if-ne p2, v0, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, -0x1

    const-string/jumbo v0, "com.ui.core.ui.img.UiGlideImageLoader.GlideImage.<anonymous>.<anonymous>.<anonymous> (UiGlideImageLoader.kt:112)"

    const v1, -0x1c29d289

    invoke-static {v1, p4, p2, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p2, p0, LO9/d$a$a;->a:Ls9/a$b;

    const/4 p4, 0x0

    invoke-static {p2, p3, p4}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v0

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, p2}, Lz/d;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object p1, p0, LO9/d$a$a;->b:Lm0/w0;

    const p2, 0x29af0710

    invoke-interface {p3, p2}, LT/l;->U(I)V

    if-nez p1, :cond_5

    iget-object p1, p0, LO9/d$a$a;->a:Ls9/a$b;

    invoke-static {p1, p3, p4}, Lta/c;->h(Ls9/a;LT/l;I)Lm0/w0;

    move-result-object p1

    :cond_5
    move-object v5, p1

    invoke-interface {p3}, LT/l;->J()V

    iget-object v2, p0, LO9/d$a$a;->c:Lf0/c;

    iget-object v3, p0, LO9/d$a$a;->d:LC0/h;

    iget-object v4, p0, LO9/d$a$a;->e:Ljava/lang/String;

    iget v6, p0, LO9/d$a$a;->f:F

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, p3

    invoke-static/range {v0 .. v9}, LS6/g;->b(Ljava/lang/Object;Landroidx/compose/ui/e;Lf0/c;LC0/h;Ljava/lang/String;Lm0/w0;FLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/d;

    check-cast p2, LV6/f$b;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LO9/d$a$a;->a(Lz/d;LV6/f$b;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
