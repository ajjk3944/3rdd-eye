.class public final Li0/a;
.super Landroid/view/View$DragShadowBuilder;
.source "SourceFile"


# instance fields
.field private final a:LY0/d;

.field private final b:J

.field private final c:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LY0/d;JLmh/l;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroid/view/View$DragShadowBuilder;-><init>()V

    .line 3
    iput-object p1, p0, Li0/a;->a:LY0/d;

    .line 4
    iput-wide p2, p0, Li0/a;->b:J

    .line 5
    iput-object p4, p0, Li0/a;->c:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(LY0/d;JLmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Li0/a;-><init>(LY0/d;JLmh/l;)V

    return-void
.end method


# virtual methods
.method public onDrawShadow(Landroid/graphics/Canvas;)V
    .locals 12

    new-instance v0, Lo0/a;

    invoke-direct {v0}, Lo0/a;-><init>()V

    iget-object v1, p0, Li0/a;->a:LY0/d;

    iget-wide v2, p0, Li0/a;->b:J

    sget-object v4, LY0/t;->Ltr:LY0/t;

    invoke-static {p1}, Lm0/H;->b(Landroid/graphics/Canvas;)Lm0/n0;

    move-result-object p1

    iget-object v5, p0, Li0/a;->c:Lmh/l;

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v6

    invoke-virtual {v6}, Lo0/a$a;->a()LY0/d;

    move-result-object v7

    invoke-virtual {v6}, Lo0/a$a;->b()LY0/t;

    move-result-object v8

    invoke-virtual {v6}, Lo0/a$a;->c()Lm0/n0;

    move-result-object v9

    invoke-virtual {v6}, Lo0/a$a;->d()J

    move-result-wide v10

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object v6

    invoke-virtual {v6, v1}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v6, v4}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v6, p1}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v6, v2, v3}, Lo0/a$a;->l(J)V

    invoke-interface {p1}, Lm0/n0;->j()V

    invoke-interface {v5, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-virtual {v0}, Lo0/a;->B()Lo0/a$a;

    move-result-object p1

    invoke-virtual {p1, v7}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {p1, v8}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {p1, v9}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {p1, v10, v11}, Lo0/a$a;->l(J)V

    return-void
.end method

.method public onProvideShadowMetrics(Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 4

    iget-object v0, p0, Li0/a;->a:LY0/d;

    iget-wide v1, p0, Li0/a;->b:J

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->N0(F)F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x1(F)I

    move-result v1

    iget-wide v2, p0, Li0/a;->b:J

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->N0(F)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->x1(F)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Point;->set(II)V

    iget v0, p1, Landroid/graphics/Point;->x:I

    div-int/lit8 v0, v0, 0x2

    iget p1, p1, Landroid/graphics/Point;->y:I

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p2, v0, p1}, Landroid/graphics/Point;->set(II)V

    return-void
.end method
